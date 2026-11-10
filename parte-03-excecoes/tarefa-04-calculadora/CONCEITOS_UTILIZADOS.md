# Conceitos utilizados – Tarefa 04: Calculadora com tratamento de exceções

## Programação orientada a objetos e encapsulamento

A classe `Calculadora` possui dois atributos privados do tipo `double`. O construtor recebe os números, e os *getters* e *setters* permitem consultar e alterar seus valores.

## Métodos e condicionais

Os métodos `somar()`, `subtrair()`, `multiplicar()` e `dividir()` realizam as operações. Na classe `Main`, `Scanner` recebe os valores e uma estrutura `if/else` escolhe a operação.

## Exceção personalizada

`DomainException`, localizada no pacote `model.exceptions`, herda de `RuntimeException` e representa erros de domínio, como divisão por zero e operação inexistente. A instrução `throw` lança essa exceção e o bloco `catch` exibe sua mensagem. `InputMismatchException` trata entradas numéricas inválidas.

## try, catch e finally

O `try` contém o processamento sujeito a erros, os blocos `catch` tratam as exceções e o `finally` fecha o `Scanner` e informa o encerramento do programa.
