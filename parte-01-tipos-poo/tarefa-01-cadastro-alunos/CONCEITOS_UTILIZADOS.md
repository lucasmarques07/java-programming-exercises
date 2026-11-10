# Conceitos utilizados – Tarefa 01: Cadastro de alunos

## Tipos de dados

O programa utiliza os tipos `String` para nome e curso, `int` para idade, `double` para altura e nota final e `boolean` para indicar se o aluno está matriculado.

## Programação orientada a objetos e encapsulamento

A classe `Aluno` reúne os atributos e os métodos relacionados ao aluno. Os atributos são declarados como `private`, e os métodos *getters* e *setters* permitem consultar e alterar seus valores. O construtor recebe os dados no momento da criação do objeto.

## Métodos e condição de aprovação

O método `exibirDados()` apresenta as informações cadastradas. Já `verificarAprovacao()` retorna um valor `boolean` conforme a condição `notaFinal >= 6`. A classe `Main` utiliza `if/else` para mostrar se o aluno foi aprovado ou reprovado.

## Entrada e saída de dados

A classe `Main` utiliza `Scanner` para receber as informações pelo teclado e `System.out.print` e `System.out.println` para exibir mensagens no terminal.
