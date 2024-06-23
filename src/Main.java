import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //chamando as classes necessárias
        Scanner leitor = new Scanner(System.in);
        PoneiService poneiService = new PoneiService();
        UserInterface userInterface = new UserInterface();
        InteracaoService interacaoService = new InteracaoService();

        // Listas dos atributos possíveis do objeto Ponei
        List<String> tipoPonei = List.of("Terrestre", "Pegasus", "Unicórnio", "Alicórnio");
        List<String> coresPele = List.of("Branco", "Preto", "Marrom", "Vermelho", "Laranja", "Amarelo", "Verde", "Azul",
                "Roxo", "Rosa");
        List<String> coresOlhos = List.of("Branco", "Preto", "Marrom", "Vermelho", "Laranja", "Amarelo", "Verde",
                "Azul", "Roxo", "Rosa");
        List<String> coresCrina = List.of("Branco", "Preto", "Marrom", "Vermelho", "Laranja", "Amarelo", "Verde",
                "Azul", "Roxo", "Rosa");
        List<String> tipoCrina = List.of("Lisa", "Ondulada", "Cacheada", "Crespa");
        List<String> listaPenteado = List.of("Solto", "Preso", "Coque", "Trança");
        List<String> listaGenero = List.of("Feminino", "Masculino", "Sem genero");

        //enquanto o programa rodar o menu continuara sendo mostrado
        while (true) {
            //chama o método para mostrar o menu e ler a opcao selecinada
            int opcao = userInterface.mostrarMenu(leitor);
            //se a opção for zero, quebra o código
            if (opcao == 0)
                break;

            //switch/case para o menu
            switch (opcao) {
                //chama o método para adicionar um ponei
                case 1 -> addPonei(leitor, poneiService, tipoPonei, coresPele, coresOlhos, coresCrina, tipoCrina,
                        listaPenteado, listaGenero);

                //chama o método para listar o ID e o nome de cada ponei criado
                case 2 -> poneiService.listarPoneis();

                //chama o métoido para listar todos os atributos do ponei
                case 3 -> poneiService.listarCaracteristicasPonei(leitor);

                //chama o método para filtrar os poneis por tipo
                case 4 -> poneiService.filtrarPorTipo(leitor);

                //chama o método para interagir com os poneis
                case 5 -> interacaoService.interagirPonei();

                //chama o método para procurar um ponei pelo seu ID
                case 6 -> poneiService.procurarPoneiPorId();

                //chama o método para mostrar quantos poneis tem por genero
                case 7 -> poneiService.contarPoneisPorGenero();

                //chama o método para exlcuir um ponei
                case 8 -> poneiService.excluirPonei(leitor);

                //sai do programa
                case 0 -> {
                    System.out.println("Até mais!");
                    return;
                }
                //caso o usuário selecione uma opção fora do menu
                default -> System.out.println("Por favor selecione uma opção válida");
            }
        }
    }

    
    //Método para adicionar um ponei e definir seus atributos 
    private static void addPonei(Scanner leitor, PoneiService poneiService, List<String> tipoPonei,
            List<String> coresPele, List<String> coresOlhos, List<String> coresCrina, List<String> tipoCrina,
            List<String> listaPenteado, List<String> listaGenero) {
        //solicita ao usuario o ID do ponei
        System.out.print("Id: "); //lê o ID informado
        Integer id = leitor.nextInt();
        leitor.nextLine(); 
        //solicitao ao usuario o nome do ponei
        System.out.print("Nome: ");
        String nome = leitor.nextLine();//lê o nome informado

        //chama o método para o usuário selecionar cada atributo do ponei de acordo com as opções nas listas criadas
        String tipo_ponei = escolherCaracteristica(leitor, "Escolha o tipo do pônei: ", tipoPonei);
        String cor_pele = escolherCaracteristica(leitor, "Escolha a cor da pele: ", coresPele);
        String cor_olhos = escolherCaracteristica(leitor, "Escolha a cor dos olhos: ", coresOlhos);
        String cor_crina = escolherCaracteristica(leitor, "Escolha a cor da crina: ", coresCrina);
        String tipo_crina = escolherCaracteristica(leitor, "Escolha o tipo da crina: ", tipoCrina);
        String tipo_penteado = escolherCaracteristica(leitor, "Escolha o penteado: ", listaPenteado);
        String genero = escolherCaracteristica(leitor, "Escolha o gênero: ", listaGenero);

        //cria um novo objeto ponei com as informações coletadas
        Ponei ponei = new Ponei(id, nome, tipo_ponei, cor_pele, cor_olhos, cor_crina, tipo_crina, tipo_penteado,
                genero);
        //adiciona um ponei ao serviço de poneis
        poneiService.adicionarPonei(ponei);
    }
 
    
    //Método para escolher as características do ponei
    private static String escolherCaracteristica(Scanner leitor, String mensagem, List<String> opcoes) {
        //inicializa a variável opcao com -1 para garantir que a condição do loop seja atendida
        int opcao = -1; 
        //o loop se repete enquanto a opç~~ao for inválida
        while (opcao < 0 || opcao >= opcoes.size()) {
            System.out.println(mensagem);
            //loop atraves das opções disponiveis
            for (int i = 0; i < opcoes.size(); i++) {
                System.out.println(i + " - " + opcoes.get(i));//exibe cada oção com seu indice
            }
            //lê a escolha do usuario
            opcao = leitor.nextInt();
            leitor.nextLine(); // Consumir a nova linha
            if (opcao < 0 || opcao >= opcoes.size()) {
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
        //retorna a opção selecionada pelo usuário
        return opcoes.get(opcao);
    }
}