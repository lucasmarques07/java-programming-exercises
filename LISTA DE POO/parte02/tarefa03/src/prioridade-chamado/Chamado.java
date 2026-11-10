/*
 * Lucas Marques Almeida - 0024283
 * Roberto Carlos Martins - 0023293
 */

public class Chamado {

    private String descricao;
    private Prioridade prioridade;

    public Chamado(String descricao, Prioridade prioridade) {
        this.descricao = descricao;
        this.prioridade = prioridade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public void exibirMensagem() {
        switch (prioridade) {
            case BAIXA:
                System.out.println("Atendimento sem urgência.");
                break;
            case MEDIA:
                System.out.println("Atendimento de prioridade média.");
                break;
            case ALTA:
                System.out.println("Atendimento prioritário.");
                break;
            case URGENTE:
                System.out.println("Atendimento imediato.");
                break;
        }
    }
}
