import java.util.Scanner;

class UserInterface {
    Scanner leitor = new Scanner(System.in);
    Ponei ponei = new Ponei();

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

    public int mostrarMenu(Scanner leitor) {
        System.out.println(MENU);
        int opcao = leitor.nextInt();
        leitor.nextLine();
        return opcao;
    }
}
