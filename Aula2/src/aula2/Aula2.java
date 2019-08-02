package aula2;

public class Aula2 {
    public static void main (String[] args) {
        Caneta c1 = new Caneta();
        
        //Aplicando valores aos atributos
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        
        //Chamando os metodos para mostrar o Estado da caneta
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        System.out.println("");
        Caneta c2 = new Caneta();
        c2.modelo = "Bic";
        c2.cor = "Preta";
        c2.carga = 30;
        c2.status();
        c2.destampar();
        c2.rabiscar();
        
        
    }
}