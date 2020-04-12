package aula11;
public class Aluno extends Pessoa{
    protected int matricula;
    protected String curso;
    
    public void pagarMensalidade(){
        System.out.println("Aluno:\n" + this.nome + "\nmatricula: " + this.matricula + "\nefetuando pagamento de mensalidade.");
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public int getMatricula(){
        return this.matricula;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
}