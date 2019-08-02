package aula5;

public class Aula5{
    public static void main (String[] args){
        ContaBanco p1 = new ContaBanco();
        ContaBanco p2 = new ContaBanco();
        
        p1.setDonoConta("Carlos Henrique");
        p1.setNumConta(32244000);
        p1.abrirConta("cc");
        p1.sacarConta(30.0f);
        p1.depositarConta(300.0f);
        p1.pagarMensal();
        p1.extratoConta();
 
        
        p2.setDonoConta("Salete Pereira");
        p2.setNumConta(40028922);
        p2.abrirConta("cp");
        p2.depositarConta(500.0f);
        p2.pagarMensal();
        p2.fecharConta();
        p2.extratoConta();
        
    }
}