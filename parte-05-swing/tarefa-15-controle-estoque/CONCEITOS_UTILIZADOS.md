# Conceitos utilizados – Tarefa 15: Sistema de controle de estoque

## Programação orientada a objetos

A classe `Produto` armazena o código, a descrição, o preço e a quantidade de um produto. O construtor recebe esses dados, e os métodos *getters* permitem consultá-los. `calcularValorTotal()` multiplica preço por quantidade e `exibirDados()` retorna as informações do produto.

## Interface gráfica com JOptionPane

A classe `Main` utiliza `JOptionPane.showInputDialog()` para apresentar um menu e receber dados, e `JOptionPane.showMessageDialog()` para exibir resultados. Isso permite criar uma interface simples sem montar uma janela com `JFrame` e botões.

## ArrayList, laços e switch

O `ArrayList<Produto>` guarda os produtos cadastrados durante a execução. O `while` mantém o menu disponível até a opção **Sair**, o `switch` seleciona a funcionalidade e o `for-each` percorre a lista para consultar, listar e somar valores.

## Validação de dados

Os métodos `Integer.parseInt()` e `Double.parseDouble()` convertem textos para números. O bloco `try/catch` trata valores digitados em formato inválido. O programa também verifica campos obrigatórios, valores negativos e códigos repetidos.
