import java.util.Scanner;

class UserInterface {

    Scanner leitor = new Scanner(System.in);
    Ponei ponei = new Ponei();

    //constante do menu
    final String MENU = """
            \n========== Menu ===========
            1 - Novo pônei
            2 - Listar pôneis
            3 - Listar características do pônei
            4 - Filtrar pôneis por tipo
            5 - Interagir com o pônei
            6 - Procurar pônei por ID
            7 - Contar pôneis por gênero
            8 - Excluir pônei
            0 - Sair
            """;

    //Método para exibir o menu principal 
    public int mostrarMenu(Scanner leitor) {
        System.out.println(MENU);
        int opcao = leitor.nextInt();//lê a escolha do usuario
        leitor.nextLine();
        return opcao;//retorna a opção escolhida
    }
}
