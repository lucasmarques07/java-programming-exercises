# Conceitos utilizados – Tarefa 02: Sistema de controle de produtos

## Tipos de dados

O programa utiliza `int` para o código e a quantidade em estoque, `double` para o preço e `String` para a descrição e a categoria do produto.

## Programação orientada a objetos e encapsulamento

A classe `Produto` representa um produto por meio de atributos e métodos. Os atributos são `private`, com *getters* e *setters* para consulta e alteração. O construtor recebe as informações necessárias para criar o objeto.

## Métodos e cálculo do estoque

O método `exibirDados()` mostra os dados do produto no terminal. O método `calcularValorTotalEstoque()` retorna o resultado da multiplicação do preço pela quantidade em estoque (`preco * quantidadeEstoque`).

## Entrada e saída de dados

A classe `Main` utiliza `Scanner` para ler as informações digitadas pelo usuário. Depois, cria um objeto `Produto` e utiliza `System.out.println` para exibir os dados e o valor total do estoque.
