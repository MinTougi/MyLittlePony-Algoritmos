import java.util.Scanner;

class InteracaoService {
    
    Scanner leitor = new Scanner(System.in);
    PoneiService poneiService = new PoneiService();

    //constante do menu interação
    final String INTERACAO = """
            1 - Divertir
            2 - Alimentar
            3 - Dar banho
            """;
    int opcao;

     //Método para exibir as opções de interação e obter a escolha do usuário
    public int mostrarInteracoes(Scanner leitor) {
        System.out.println(INTERACAO);
        opcao = leitor.nextInt();//le a opção escolhida pelo usuario
        leitor.nextLine();
        return opcao;
    }

    //Método principal para interagir com o pônei
    public void interagirPonei() {
        System.out.println("Qual interação você gostaria de ter?");
        System.out.println(mostrarInteracoes(leitor));
    
        switch (opcao) {
            //chama os métodos de interação
            case 1 -> divertirPonei();
            case 2 -> alimentarPonei();
            case 3 -> banharPonei();
            default -> {
                System.out.println("Interação inválida");
                interagirPonei();
            }
        }
    }

    //Métodos de interação
    //Método para alimentar o ponei
    private void alimentarPonei() {
        System.out.print("Digite o nome do pônei: ");
        String nome = leitor.nextLine().trim();
        System.out.println("Você alimentou " + nome);
    }

    //Método para divertir o ponei
    private void divertirPonei() {
        System.out.print("Digite o nome do pônei: ");
        String nome = leitor.nextLine().trim();
        System.out.println("Você divertiu " + nome);
    }

    //Método para banhar o ponei
    private void banharPonei() {
        System.out.print("Digite o nome do pônei: ");
        String nome = leitor.nextLine().trim();
        System.out.println("Você deu banho em " + nome);
    }
}