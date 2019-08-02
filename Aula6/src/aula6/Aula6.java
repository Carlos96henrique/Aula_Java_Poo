package aula6;

public class Aula6 {
    public static void main (String[] args){
        ControleRemoto c = new ControleRemoto();
        ControleRemoto c2 = new ControleRemoto();
        
        c.abrirMenu();
        c.ligar();
        c.play();
        c.fecharMenu();
        
    }
}