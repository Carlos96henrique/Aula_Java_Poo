package aula4;
public class Aula4{
    public static void main (String[] args){
        //Utilizando construtor 
        Caneta c1 = new Caneta("Bic", "Preta", 0.3f);
        Caneta c2 = new Caneta("Faber", "Azul", 0.5f);
        c1.status();
        c2.setModelo ("Bic Cristal");
        /*Não é possivel acessar um metodo diretamente se ele não é publico
        apenas pelos metodos acessores
        */
        //c1.ponta = 0.5f; isso da erro
        //c1.modelo = "Bic cristal"; isso da erro
        c2.setPonta (0.5f); //Jeito certo
        System.out.println("Tenho uma caneta " + c2.getModelo() + " de ponta " + c2.getPonta());
    }
}