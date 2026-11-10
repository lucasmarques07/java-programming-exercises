# Conceitos utilizados – Tarefa 03: Enumerações em Java

## Conceito de enum

Em Java, `enum` é utilizado para declarar um conjunto fixo de constantes. Dessa forma, um atributo pode receber apenas os valores definidos na enumeração, evitando o uso de textos livres para representar categorias, estados ou níveis.

## Exercício 1 – DiaSemana

O `enum DiaSemana` define os sete dias da semana. Na classe `Main`, uma variável do tipo `DiaSemana` recebe a constante `QUARTA` e seu valor é exibido com `System.out.println()`.

## Exercício 2 – CategoriaProduto

O `enum CategoriaProduto` define as categorias disponíveis. A classe `Produto` utiliza esse tipo no atributo `categoria`, mostrando como uma enumeração pode fazer parte dos dados de um objeto. São utilizados construtor, atributos privados, getters, setters e o método `exibirDados()`.

## Exercício 3 – StatusPedido

O `enum StatusPedido` representa as etapas possíveis de um pedido. A classe `Pedido` utiliza o status inicial `PENDENTE`, e os métodos `getStatus()` e `setStatus()` permitem consultar e alterar seu valor. O `Main` demonstra essas operações.

## Exercício 4 – NivelAcesso

O `enum NivelAcesso` representa três perfis de usuário. A classe `Main` utiliza `Scanner` para ler um nível, `valueOf()` para convertê-lo em uma constante do enum e `switch` para apresentar permissões de exemplo para cada perfil. Um `try/catch` trata a digitação de um nível inexistente.

## Exercício 5 – Prioridade

O `enum Prioridade` define os níveis de urgência de um chamado. A classe `Chamado` armazena sua descrição e prioridade, utilizando construtor, getters e setters. O método `exibirMensagem()` emprega `switch` para apresentar uma mensagem conforme o nível selecionado. A classe `Main` recebe os dados com `Scanner` e trata prioridades inválidas.
