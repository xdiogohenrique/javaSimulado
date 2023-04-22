package simulado;

public class AlunoPresencial extends Aluno{

    private int qtdAulas;
    private String periodo;

    public AlunoPresencial() {
    }
    
    public AlunoPresencial(int qtdAulas, String periodo) {
        this.qtdAulas = qtdAulas;
        this.periodo = periodo;
    }

    public int getQtdAulas() {
        return qtdAulas;
    }

    public void setQtdAulas(int qtdAulas) {
        this.qtdAulas = qtdAulas;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    
    
    
}
