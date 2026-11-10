# Conceitos utilizados – Tarefa 04: Calculadora com tratamento de exceções

## Programação orientada a objetos e encapsulamento

A classe `Calculadora` possui dois atributos privados do tipo `double`: `numero1` e `numero2`. O construtor recebe esses valores ao criar o objeto. Os métodos *getters* e *setters* permitem consultar e alterar os atributos.

## Métodos e operações matemáticas

Os métodos `somar()`, `subtrair()`, `multiplicar()` e `dividir()` utilizam os atributos da classe para realizar as operações e retornam um resultado do tipo `double`.

## Entrada de dados e condicionais

A classe `Main` utiliza `Scanner` para receber os números e a operação. A estrutura `if`, `else if` e `else` determina qual método será executado conforme a opção informada.

## Tratamento de exceções

O bloco `try` reúne a leitura dos dados e a execução da operação. `InputMismatchException` trata valores digitados em formato incorreto, `ArithmeticException` trata divisão por zero e `IllegalArgumentException` trata uma operação inexistente. A instrução `throw` é utilizada para lançar exceções nessas situações.

## Bloco finally

O bloco `finally` é executado independentemente do resultado da operação. Ele fecha o `Scanner` e exibe uma mensagem de encerramento.
