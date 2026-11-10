# Conceitos utilizados – Tarefa 11: Controle de acesso a uma conta bancária

## Programação orientada a objetos

A classe `ContaBancaria` possui o atributo privado `saldo`, inicializado pelo construtor. O método `getSaldo()` consulta o valor disponível, enquanto `sacar()` verifica se o valor solicitado é válido e se há saldo suficiente antes de descontá-lo.

## Threads e execução concorrente

A classe `SaqueThread` herda de `Thread` e sobrescreve o método `run()` para tentar sacar R$ 700,00. Na classe `Main`, duas threads recebem a mesma conta bancária, que começa com R$ 1.000,00, e são iniciadas com `start()`.

## Sincronização com synchronized

O método `sacar()` é `synchronized`, de modo que apenas uma thread por vez pode executar a verificação e o desconto nessa conta. Sem esse controle, as duas threads poderiam verificar o mesmo saldo antes de qualquer desconto e permitir saques incorretos. Com a sincronização, somente um dos saques de R$ 700,00 é realizado.

## Espera com join()

O método `join()` faz a execução principal aguardar as duas threads terminarem antes de mostrar o saldo final, que será de R$ 300,00. A ordem das mensagens das threads pode variar entre as execuções.
