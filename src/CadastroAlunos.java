import java.util.ArrayList;
import java.util.Scanner;

public class CadastroAlunos {
    static ArrayList<Aluno> alunos = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Mostrar todos os alunos");
            System.out.println("3 - Sair");

            int opcao = scanner.nextInt();

            if (opcao == 1) {
                cadastrarAluno();
            } else if (opcao == 2) {
                mostrarAlunos();
            } else if (opcao == 3) {
                continuar = false;
            } else {
                System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }

    static void cadastrarAluno() {
        scanner.nextLine(); // Limpar o buffer

        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade do aluno:");
        int idade = scanner.nextInt();

        scanner.nextLine(); // Limpar o buffer

        System.out.println("Digite o e-mail do aluno:");
        String email = scanner.nextLine();

        System.out.println("Digite o telefone do aluno:");
        String telefone = scanner.nextLine();

        Aluno aluno = new Aluno(nome, idade, email, telefone);
        alunos.add(aluno);

        System.out.println("Aluno cadastrado com sucesso!");
    }

    static void mostrarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("Lista de alunos:");
            for (Aluno aluno : alunos) {
                System.out.println("Nome: " + aluno.nome);
                System.out.println("Idade: " + aluno.idade);
                System.out.println("E-mail: " + aluno.email);
                System.out.println("Telefone: " + aluno.telefone);
                System.out.println();
            }
        }
    }
}
