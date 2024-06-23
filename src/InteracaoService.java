import java.util.Scanner;

class InteracaoService {
    Scanner leitor = new Scanner(System.in);
    PoneiService poneiService = new PoneiService();

    final String INTERACAO = """
            1 - Divertir
            2 - Alimentar
            3 - Dar banho
            """;
    int opcao;

    public int mostrarInteracoes(Scanner leitor) {
        System.out.println(INTERACAO);
        opcao = leitor.nextInt();
        leitor.nextLine();
        return opcao;
    }

    public void interagirPonei() {
        System.out.println("Qual interação você gostaria de ter?");
        System.out.println(mostrarInteracoes(leitor));
    
        switch (opcao) {
            case 1 -> divertirPonei();
            case 2 -> alimentarPonei();
            case 3 -> banharPonei();
            default -> {
                System.out.println("Interação inválida");
                interagirPonei();
            }
        }
    }
    
    private void alimentarPonei() {
        System.out.print("Digite o nome do pônei: ");
        String nome = leitor.nextLine().trim();
        System.out.println("Você alimentou " + nome);
    }

    private void divertirPonei() {
        System.out.print("Digite o nome do pônei: ");
        String nome = leitor.nextLine().trim();
        System.out.println("Você divertiu " + nome);
    }

    private void banharPonei() {
        System.out.print("Digite o nome do pônei: ");
        String nome = leitor.nextLine().trim();
        System.out.println("Você deu banho em " + nome);
    }
}