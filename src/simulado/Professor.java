package simulado;

public class Professor {

    private String nome;
    private int idade;
    private float salario;
    private int tmpServico;
    
    public Professor(){
    }

    public Professor(String nome, int idade, float salario, int tmpServico) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.tmpServico = tmpServico;
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

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int gettmpServico() {
        return tmpServico;
    }

    public void setTmpServico(int tmpServico) {
        this.tmpServico = tmpServico;
    }
    
    void calcularBonificacao(){
        float bonificacao;
        if (tmpServico >= 2){
           bonificacao = ( salario * 12 )*1.10f;
            System.out.println("A bonificação é: " + bonificacao);
        }
    }
    
    
}
