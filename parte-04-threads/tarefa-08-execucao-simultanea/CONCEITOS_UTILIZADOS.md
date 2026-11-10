# Conceitos utilizados – Tarefa 08: Execução de tarefas simultâneas

## Threads e programação concorrente

Uma *thread* é uma linha de execução que permite realizar uma tarefa de forma concorrente com outras. Neste exercício, duas threads são iniciadas: uma exibe os números de 1 a 10 e a outra exibe as letras de A a J.

## Herança da classe Thread e sobrescrita de run()

As classes `ThreadNumeros` e `ThreadLetras` herdam de `Thread` por meio de `extends Thread`. Cada classe utiliza `@Override` para sobrescrever o método `run()`, que contém as instruções executadas pela respectiva thread.

## Inicialização com start()

A classe `Main` cria os objetos das duas threads e utiliza `start()` para iniciar suas execuções. O método `start()` permite que a JVM execute cada tarefa em sua própria thread; chamar `run()` diretamente não iniciaria uma nova thread.

## Laços e ordem de execução

As duas classes utilizam um laço `for` para exibir dez valores. Como a ordem de execução das threads depende do escalonamento da JVM e do sistema operacional, as mensagens podem aparecer intercaladas ou agrupadas. Não existe uma sequência fixa entre números e letras, embora cada thread preserve a ordem do seu próprio laço.
