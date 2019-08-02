package aula7; //E aula 8
public class Aula7{
    public static void main (String[] args){
        Lutador l[] = new Lutador[6];
        int i;
        
        l[0] = new Lutador("Carlos Herinque", "Brasileiro", 22, 1.80f, 74.8f, 14, 11, 2, 1);
        l[1] = new Lutador("Murhamed Isha", "Iraniano", 28, 1.73f, 95.2f, 19, 14, 2, 3);
        l[2] = new Lutador("Yemi Ajala", "Nigeriano", 30, 2.05f, 80.4f, 15, 12, 2, 1);
        l[3] = new Lutador("Özden ",  "Russo", 20, 1.68f, 68.40f, 15, 13, 0, 2);
        l[4] = new Lutador("Christofer", "Americano", 31, 1.98f, 119.3f, 12, 5, 4, 3);
        l[5] = new Lutador("Diego Alves", "Mexicano", 35, 1.65f, 57.8f, 18, 12, 2, 4);
        /*for (i = 0; i<6; i++){
            l[i].status();
        }*/
        
        Luta UEC01 = new Luta();
        
        UEC01.marcar(l[4], l[1]);
        UEC01.lutar();
        
        System.out.println("Depois da luta");
        l[4].apresentar();
        l[1].apresentar();
        
        
    }
}
