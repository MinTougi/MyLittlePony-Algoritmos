Mini jogo sobre Pôneis

Este é um sitema que simula um mini jogo sobre pôneis, nele, o usuário pode adicionar, listar, filtrar e interagir com os pôneis cadastrados.

Funcionalidades:
1. Adicionar um Novo Pônei
Permite ao usuário adicionar um novo pônei ao sistema, selecionando características como: ID, nome, tipo, cor da pele, olhos e crina, tipo de crina, tipo de penteado e gênero do pônei.

2. Listar Pôneis
Exibe uma lista simples contendo os IDs e nomes de todos os pôneis cadastrados no sistema até o momento.

3. Listar Características de um Pônei
Permite ao usuário informar o nome de um pônei específico e exibir todas as suas características.

4. Filtrar Pôneis por Tipo
Permite filtrar os pôneis cadastrados com base no tipo (terrestre, pegasus, unicórnio ou alicórnio) informado pelo usuário.

5. Interagir com os Pôneis
Oferece opções para interagir com um pônei específico, incluindo ações como alimentar, divertir e banhar, onde o usuário informa o nome do pônei com o qual deseja interagir.

6. Procurar Pônei por ID
Permite ao usuário buscar um pônei pelo seu ID específico e exibir todas as suas informações detalhadas.

7. Contar Pôneis por Gênero
Exibe a contagem total de pôneis cadastrados por gênero, categorizados como masculino, feminino ou sem gênero.

8. Excluir Pônei
Permite ao usuário excluir um pônei do sistema informando seu nome. 

Estrutura do Código
Main.java: Ponto de entrada do programa, que controla a interface com o usuário, exibe o menu de opções e chama os métodos correspondentes de acordo com a escolha do usuário.

UserInterface.java: Gerencia a exibição do menu principal, onde o usuário seleciona as operações desejadas.

InteracaoService.java: Oferece métodos para interagir com os pôneis, como alimentar, divertir e banhar, além de mostrar as opções de interação disponíveis.

PoneiService.java: Contém a lógica de negócios relacionada aos pôneis, incluindo métodos para adicionar, listar, filtrar, procurar, contar e excluir pôneis, além de métodos auxiliares para operações específicas.

Ponei.java: Representa a classe de entidade Ponei, que possui atributos como ID, nome, tipo, cores da pele, olhos e crina, tipo de crina, tipo de penteado e gênero. Define getters e setters para acessar e modificar esses atributos, além de um método toString() para exibir todas as informações do pônei de maneira formatada.
