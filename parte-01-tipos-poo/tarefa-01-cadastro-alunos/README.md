# Tarefa 01 – Cadastro de alunos

## Objetivo

Desenvolver um programa Java para cadastrar os dados de um aluno e informar se ele foi aprovado com nota final maior ou igual a 6.

## Funcionalidades

- Receber nome, idade, altura, situação de matrícula, nota final e curso.
- Exibir os dados cadastrados.
- Informar aprovação ou reprovação de acordo com a nota final.

## Conceitos utilizados

- Tipos `String`, `int`, `double` e `boolean`.
- Programação orientada a objetos: classe, objeto, atributos privados e construtor.
- Encapsulamento com getters e setters.
- Métodos `exibirDados()` e `verificarAprovacao()`.
- Entrada de dados com `Scanner` e condição `if/else`.

## Como executar

No terminal, dentro da pasta `tarefa-01-cadastro-alunos`, execute:

```bash
javac -d out src/Aluno.java src/Main.java
java -cp out Main
```

Informe os dados solicitados. Utilize `true` ou `false` no campo de matrícula e ponto para os valores decimais (por exemplo, `1.75` e `8.5`).

## Evidências

Adicione à pasta `prints/` capturas reais da execução mostrando:

- Um cadastro de aluno aprovado.
- Um cadastro de aluno reprovado.

Os prints ainda precisam ser capturados pelos alunos.
