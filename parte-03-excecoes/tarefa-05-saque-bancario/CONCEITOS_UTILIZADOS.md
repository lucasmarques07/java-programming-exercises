# Conceitos utilizados – Tarefa 05: Sistema de saque bancário

## Programação orientada a objetos

A classe `ContaBancaria` possui um atributo privado `saldo`, inicializado pelo construtor. O método `getSaldo()` permite consultar o saldo e o método `sacar()` verifica as condições antes de descontar o valor.

## Exceções personalizadas

A classe `DomainException`, no pacote `model.exceptions`, herda de `RuntimeException` e é utilizada para impedir saques negativos. A classe `SaldoInsuficienteException` herda de `Exception` e representa a tentativa de sacar um valor maior que o saldo disponível.

## throw e throws

O comando `throw` lança uma exceção quando uma regra é violada. A declaração `throws SaldoInsuficienteException` informa que `sacar()` pode lançar essa exceção verificada, que precisa ser tratada ou propagada pelo código que chama o método. `DomainException`, por ser não verificada, não precisa aparecer no `throws`.

## try e catch

A classe `Main` usa `Scanner` para receber os dados e blocos `try/catch` para apresentar mensagens amigáveis quando o saque não é permitido. O saldo é exibido após a tentativa de saque.
