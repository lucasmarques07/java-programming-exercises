# Conceitos utilizados – Tarefa 16: Sistema de gerenciamento de pedidos

## Tipos de dados e programação orientada a objetos

As classes `Cliente`, `Produto` e `Pedido` usam atributos dos tipos `int`, `double` e `String`, além de referências a outros objetos. Os construtores criam os objetos, e os métodos permitem consultar dados, calcular o total e exibir informações. O `GerenciadorPedidos` mantém três listas (`ArrayList`) para clientes, produtos e pedidos enquanto o programa está aberto.

## Enum – StatusPedido

O `enum StatusPedido` define três valores possíveis: `PENDENTE`, `EM_PROCESSAMENTO` e `CONCLUIDO`. Todo pedido começa como pendente, muda para em processamento quando uma thread é iniciada e fica concluído após o processamento.

## Exceções e validação

A classe personalizada `ValidacaoException` herda de `RuntimeException`, como a exceção de domínio utilizada na Parte III. Ela é lançada com `throw` para impedir cadastros vazios, preços inválidos, quantidades inválidas e pedidos com cliente ou produto inexistente. O `try/catch` da tela também trata erros de conversão com `NumberFormatException`.

## Threads e sincronização

A classe `ProcessadorPedido` herda de `Thread`, sobrescreve `run()` e é iniciada com `start()`. Cada pedido pendente é processado por uma thread diferente. `Thread.sleep(3000)` simula três segundos de trabalho. Os métodos `getStatus()` e `setStatus()` de `Pedido` usam `synchronized` para permitir a leitura e alteração seguras do status durante a execução concorrente.

## Interface gráfica com Swing

A classe `TelaPrincipal` utiliza `JOptionPane.showInputDialog()` e `JOptionPane.showMessageDialog()`, no mesmo estilo da Tarefa 15 e do exemplo de calculadora do professor. O `switch` seleciona cada funcionalidade do menu. A opção **Listar pedidos e status** mostra o andamento de todos os pedidos.

## Funcionamento

1. Cadastre pelo menos um cliente e um produto.
2. Crie dois ou mais pedidos escolhendo os códigos e a quantidade.
3. Consulte os pedidos: o status inicial será `PENDENTE`.
4. Escolha **Processar pedidos** para iniciar simultaneamente uma thread para cada pedido pendente.
5. Consulte os pedidos logo após iniciar e novamente depois de alguns segundos para ver os status `EM_PROCESSAMENTO` e `CONCLUIDO`.

Os cadastros ficam somente na memória e são perdidos ao fechar o programa, pois o enunciado não exige banco de dados ou armazenamento em arquivos.
