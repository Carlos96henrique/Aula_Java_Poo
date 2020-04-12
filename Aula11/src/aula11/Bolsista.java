package aula11;
public class Bolsista extends Aluno{
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Aluno:\n" + this.nome + ",\nmatricula: " + this.matricula + "\nefetuando renovação de bolsa.");
    }
    
    public void setBolsa(float bolsa){
        this.bolsa = bolsa;
    }
    public float getBolsa(){
        return this.bolsa;
    }
    @Override
    public void pagarMensalidade(){
        System.out.println("Aluno:\n" + this.nome + "\nmatricula: " + this.matricula + "\nportador de bolsa de desconto de " + this.bolsa + "\nefetuando pagamento de mensalidade." );
    }
}