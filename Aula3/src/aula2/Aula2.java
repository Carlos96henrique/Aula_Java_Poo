package aula2;

public class Aula2 {
    public static void main (String[] args) {
        Caneta c1 = new Caneta();
        //Testando visibilidade dos objetos
        c1.modelo = "Bic cristal";
        c1.cor = "Preta";
        //c1.ponta = 0.8f; esta linha da erro pois é um atributo privado
        c1.carga = 80;
        //c1.tampada = true;
        c1.tampar();
        c1.rabiscar();
        
        
        
   
        
        c1.status();
    }
}