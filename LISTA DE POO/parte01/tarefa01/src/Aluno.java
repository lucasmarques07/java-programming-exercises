/*
 * Lucas Marques Almeida - 0024283
 * Roberto Carlos Martins - 0023293
 */

public class Aluno {

    private String nome;
    private int idade;
    private double altura;
    private boolean matriculado;
    private double notaFinal;
    private String curso;

    public Aluno(String nome, int idade, double altura, boolean matriculado, double notaFinal, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.matriculado = matriculado;
        this.notaFinal = notaFinal;
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

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
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
        System.out.println("Nota final: " + notaFinal);
        System.out.println("Curso: " + curso);
    }

    public boolean verificarAprovacao() {
        return notaFinal >= 6;
    }
}
