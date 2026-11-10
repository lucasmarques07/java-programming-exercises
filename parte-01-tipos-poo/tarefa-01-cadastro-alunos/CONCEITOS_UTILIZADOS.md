# Conceitos utilizados – Tarefa 01: Cadastro de alunos

## Tipos de dados

O programa utiliza os tipos `String` para nome e curso, `int` para idade, `double` para altura, primeira nota e segunda nota, e `boolean` para indicar se o aluno está matriculado.

## Programação orientada a objetos e encapsulamento

A classe `Aluno` está organizada no pacote `model.entities`, com atributos `private`, construtor, *getters* e *setters*. A classe `Main` fica no pacote `application` e utiliza o objeto `Aluno`.

## Métodos e condição de aprovação

O método `calcularMedia()` calcula a média aritmética das duas notas usando `(nota1 + nota2) / 2.0`. O método `exibirDados()` mostra os dados e a média. O método `verificarAprovacao()` retorna `true` se a média for maior ou igual a 6. A classe `Main` utiliza `if/else` para apresentar o resultado.

## Entrada e saída de dados

A classe `Main` utiliza `Scanner` para receber as informações pelo teclado e `System.out.println()` para exibi-las no terminal. Para altura e notas, `Double.parseDouble()` permite digitar ponto ou vírgula como separador decimal.
