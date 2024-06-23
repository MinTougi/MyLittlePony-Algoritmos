import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class PoneiService {

    //delcarando um scanner
    Scanner leitor = new Scanner(System.in);
    //declarando lista dos ponei
    private ArrayList<Ponei> poneis;
    
    public PoneiService() {
        this.poneis = new ArrayList<>();
    }
  
    //Método para adicionar um ponei
    public void adicionarPonei(Ponei ponei) {
        poneis.add(ponei);
        System.out.println("Pônei adicionado com sucesso!");
    }

    //Método para listar somente os IDs e nomes dos poneis
    public void listarPoneis() {
        // Verificar se a lista está vazia
        if (poneis.isEmpty()) {
        System.out.println("Não há poneis");
        return; // Sair do método se a lista estiver vazia
    }
        //loop para percorrer cada ponei da lista "poneis" 
        for (Ponei ponei : poneis) {
            //impressão dos IDs e nomes
            System.out.println("ID: " + ponei.getId() + ", Nome: " + ponei.getNome());
        }
    }

    //Método para listar todas as características dos poneis
    public void listarCaracteristicasPonei(Scanner leitor) {
        //Pede para o usuário selecionar um ponei
        System.out.println("Informe o nome do pônei que deseja listar as características:");
        //lê a escolha do usuário
        String nome = leitor.nextLine();
        //percorre pela lista de poneis
        for (Ponei ponei : poneis) {
            //se o nome do ponei for encontrado na lista, suas características serão impressas
            if (ponei.getNome().equalsIgnoreCase(nome)) {
                System.out.println(ponei);
                return;
            }
        }
        //se o nome não for encontrado na lista, o usuário será informado disto
        System.out.println("Pônei não encontrado.");
    }

    //Método para filtrar os poneis por tipo(terrestre, pegasus, unicórnio ou alicónio)
    public void filtrarPorTipo(Scanner leitor) {
        System.out.print("Digite o tipo de pônei que deseja filtrar: ");
        String tipo = leitor.nextLine();

        List<Ponei> poneisFiltrados = new ArrayList<>();
        for (Ponei ponei : poneis) {
            if (ponei.getTipo_ponei().equalsIgnoreCase(tipo)) {
                poneisFiltrados.add(ponei);
            }
        }

        if (!poneisFiltrados.isEmpty()) {
            System.out.println("Pôneis do tipo " + tipo + ":");
            for (Ponei ponei : poneisFiltrados) {
                System.out.println("ID: " + ponei.getId() + ", Nome: " + ponei.getNome());
            }
        } else {
            System.out.println("Nenhum pônei encontrado do tipo " + tipo + ".");
        }
    }
    
    //Método para encontrar o ponei pelo ID
    private Ponei encontrarPoneiPorId(int id) {
        return poneis.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

     // Método para encontrar o ponei pelo nome
     public Ponei encontrarPoneiPorNome(String nome) {
        String nomeFormatado = nome.trim().toLowerCase();
        return poneis.stream()
            .filter(p -> p.getNome().trim().toLowerCase().equals(nomeFormatado))
            .findFirst()
            .orElse(null);
    }

    //Método para procurar o ponei pelo ID
    public void procurarPoneiPorId() {
        //solicita ao usuário o ID do ponei
        System.out.println("Digite o ID do pônei: ");
        //lê o ID informado
        int id = leitor.nextInt();
        leitor.nextLine(); //limpa o buffer
        
        Ponei ponei = encontrarPoneiPorId(id);
        //se o ponei for diferente de null, suas características serão impressas
        if (ponei != null) {
            System.out.println(ponei);
        } else {
            //se não, o usuário será informado que o ponei não foi encontrado
            System.out.println("Pônei não encontrado.");
        }
    }

    //Método para contrar poneis por genero
    public void contarPoneisPorGenero() {
        //declarando as variaveis das opções possíveis
        int masculino = 0;
        int feminino = 0;
        int semGenero = 0;

        for (Ponei ponei : poneis) {
            switch (ponei.getGenero().toLowerCase()) {
                case "masculino" -> masculino++;
                case "feminino" -> feminino++;
                case "não binário" -> semGenero++;
            }
        }

        //imprimindo o total de poneis de cada genero possível
        System.out.println("Total por gênero:");
        System.out.println("Masculino: " + masculino);
        System.out.println("Feminino: " + feminino);
        System.out.println("Sem gênero: " + semGenero);
    }

    //método para excluir ponei
    public void excluirPonei(Scanner leitor) {
        System.out.println("Informe o nome do pônei que deseja excluir:");
        String nome = leitor.nextLine();
    
        do {
            try {
                for (Ponei ponei : poneis) {
                    if (ponei.getNome().equalsIgnoreCase(nome)) {
                        poneis.remove(ponei);
                        System.out.println("Pônei excluído com sucesso!");
                        return;
                    }
                }
                System.out.println("Pônei não encontrado. Digite novamente:");
                nome = leitor.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite o nome do pônei:");
                leitor.nextLine(); // Limpe a entrada incorreta
            }
        } while (true);
    }
    
}