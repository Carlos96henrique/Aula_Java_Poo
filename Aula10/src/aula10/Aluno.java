package aula10;
public class Aluno extends Pessoas{
    private int matricula;
    private String curso;  

    public void cancelaCurso(){
        
    }
    
    public void setMatricula( int matricula){
        this.matricula = matricula;
    }
    public int getMatricula(){
        return this.matricula;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
    public String getCurso(){
        return this.curso;
    }
}