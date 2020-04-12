package aula11;
public class AlunoTecnico extends Aluno{
    private int registroProfissional;
    
    public void praticar(){
        System.out.println("Aluno Técnico:" + this.nome + "\nmatricula:" + this.matricula + "\nregistro profissional:" + this.registroProfissional + "\nestá em atuação.");
    }
    
    public void setRegistro(int registro){
        this.registroProfissional = registro;
    }
    public int getRegistro(){
        return this.registroProfissional;
    }
    
}