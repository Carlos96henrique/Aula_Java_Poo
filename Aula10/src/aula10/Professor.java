package aula10;
public class Professor extends Pessoas{
    private String especialidade;
    private float salario;
    
    public void RecberAumento(float aumento){
        this.salario = getSalario() + aumento;
    }
    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
    public String getEspecialidade(){
        return this.especialidade;
    }
    public void setSalario(float salario){
        this.salario = salario;
    }
    public float getSalario(){
        return this.salario;
    }
}