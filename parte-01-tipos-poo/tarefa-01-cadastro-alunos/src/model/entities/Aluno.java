/*
 * Lucas Marques Almeida - 0024283
 * Roberto Carlos Martins - 0023293
 */

package model.entities;

public class Aluno {

    private String nome;
    private int idade;
    private double altura;
    private boolean matriculado;
    private double nota1;
    private double nota2;
    private String curso;

    public Aluno(String nome, int idade, double altura, boolean matriculado, double nota1, double nota2, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.matriculado = matriculado;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Matriculado: " + (matriculado ? "Sim" : "Não"));
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média final: " + calcularMedia());
        System.out.println("Curso: " + curso);
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2.0;
    }

    public boolean verificarAprovacao() {
        return calcularMedia() >= 6;
    }
}
