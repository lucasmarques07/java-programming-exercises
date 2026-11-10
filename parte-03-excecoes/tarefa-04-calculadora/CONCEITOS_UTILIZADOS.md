# Conceitos utilizados – Tarefa 04: Calculadora com tratamento de exceções

## Programação orientada a objetos e encapsulamento

A classe `Calculadora` pertence ao pacote `model.entities` e possui dois atributos privados do tipo `double`. O construtor recebe os números, e os *getters* e *setters* permitem consultar e alterar seus valores.

## Métodos e condicionais

Os métodos `somar()`, `subtrair()`, `multiplicar()` e `dividir()` realizam as operações. A classe `Main`, no pacote `application`, utiliza `Scanner` e `if/else` para escolher a operação.

## Exceção personalizada

`DomainException`, localizada no pacote `model.exceptions`, herda de `RuntimeException` e representa erros de domínio, como divisão por zero e operação inexistente. A instrução `throw` lança a exceção e o bloco `catch` exibe sua mensagem.

## try, catch e finally

O `try` contém o processamento sujeito a erros, os blocos `catch` tratam `DomainException` e `InputMismatchException`, e o `finally` fecha o `Scanner` e informa o encerramento.
