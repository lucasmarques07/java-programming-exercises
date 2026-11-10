# Conceitos utilizados – Tarefa 13: Cadastro de alunos com Java Swing

## Programação orientada a objetos

A classe `Aluno` representa o aluno com os atributos privados `nome`, `idade` e `curso`. O construtor recebe esses dados, os *getters* e *setters* permitem acessá-los e o método `exibirDados()` retorna as informações em uma `String`.

## Interface gráfica com Swing

A classe `Main` cria a janela com `JFrame`. Os componentes `JLabel` identificam os campos, `JTextField` recebe o nome e a idade, `JComboBox` permite selecionar o curso e `JButton` disponibiliza a ação de salvar. O `GridLayout` organiza os componentes na janela.

## Evento do botão e validação

O método `addActionListener()` determina o que acontece ao clicar em **Salvar**. O programa lê os campos, converte a idade com `Integer.parseInt()` e verifica se o nome e a idade são válidos. O bloco `try/catch` trata uma idade não numérica. Quando os dados são válidos, o programa cria um objeto `Aluno` e utiliza `JOptionPane.showMessageDialog()` para exibi-los.
