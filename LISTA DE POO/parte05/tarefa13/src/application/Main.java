/*
 * Lucas Marques Almeida - 0024283
 * Roberto Carlos Martins - 0023293
 */

package application;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.entities.Aluno;

public class Main {

    public static void main(String[] args) {
        JFrame janela = new JFrame("Cadastro de Alunos");
        janela.setSize(450, 220);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setLayout(new GridLayout(4, 2, 10, 10));

        JTextField campoNome = new JTextField();
        JTextField campoIdade = new JTextField();
        String[] cursos = {"Análise e Desenvolvimento de Sistemas", "Ciência da Computação", "Engenharia de Software", "Sistemas de Informação"};
        JComboBox<String> campoCurso = new JComboBox<>(cursos);
        JButton botaoSalvar = new JButton("Salvar");

        janela.add(new JLabel("Nome:"));
        janela.add(campoNome);
        janela.add(new JLabel("Idade:"));
        janela.add(campoIdade);
        janela.add(new JLabel("Curso:"));
        janela.add(campoCurso);
        janela.add(new JLabel(""));
        janela.add(botaoSalvar);

        botaoSalvar.addActionListener(e -> {
            try {
                String nome = campoNome.getText().trim();
                int idade = Integer.parseInt(campoIdade.getText().trim());
                String curso = (String) campoCurso.getSelectedItem();

                if (nome.isEmpty() || idade <= 0) {
                    JOptionPane.showMessageDialog(janela, "Informe um nome e uma idade válidos.");
                } else {
                    Aluno aluno = new Aluno(nome, idade, curso);
                    JOptionPane.showMessageDialog(janela, aluno.exibirDados());
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(janela, "Idade inválida. Digite um número inteiro.");
            }
        });

        janela.setVisible(true);
    }
}
