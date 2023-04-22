package simulado;

public class Faculdade {
    
    private String nome;
    private String cnjp;
    //agregação 
    private Professor professor;
    private AlunoPresencial alunoPresencial; 

    public Faculdade() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnjp() {
        return cnjp;
    }

    public void setCnjp(String cnjp) {
        this.cnjp = cnjp;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public AlunoPresencial getAlunoPresencial() {
        return alunoPresencial;
    }

    public void setAlunoPresencial(AlunoPresencial alunoPresencial) {
        this.alunoPresencial = alunoPresencial;
    }

    public static void main(String[] args) {
        
        Faculdade unicsul = new Faculdade();
        unicsul.setNome("Universidade Cruzeiro do Sul");
        unicsul.setCnjp("000011/0000-10");
        
        AlunoPresencial maria = new AlunoPresencial(20, "Manhã");
        
        unicsul.setAlunoPresencial(maria);
        
        Professor professor = new Professor("Cleber", 40, 4000, 3);
        unicsul.setProfessor(professor);
        
        unicsul.getProfessor().calcularBonificacao();
        
    }
    
    
    
}
