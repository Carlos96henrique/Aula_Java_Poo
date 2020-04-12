package primeiroexercicio;
import javax.swing.JOptionPane;

public class PrimeiroExercicio{
    public static void main(String[] args){
        String primeironumero, segundonumero;
        
        int numero1, numero2, resultado;
        
        primeironumero = JOptionPane.showInputDialog("Digite primeiro número:");
        segundonumero = JOptionPane.showInputDialog("Digite o segundo número:");
        
        numero1 = Integer.parseInt(primeironumero);
        numero2 = Integer.parseInt(segundonumero);
        
        resultado = numero1 + numero2;
        
        JOptionPane.showMessageDialog(null, "Soma igual a: " + resultado,"Esses aspas não mostra nada", JOptionPane.PLAIN_MESSAGE);
        
    }
}