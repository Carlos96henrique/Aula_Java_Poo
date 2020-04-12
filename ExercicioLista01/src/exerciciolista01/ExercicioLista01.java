package exerciciolista01;
import javax.swing.JOptionPane;

public class ExercicioLista01{
    public static void main(String[] args){
        String primeironumero, segundonumero;
        
        int numero1, numero2;
        
        primeironumero = JOptionPane.showInputDialog("Digite o primeiro número:");
        segundonumero = JOptionPane.showInputDialog("Digite o segundo número:");
        
        numero1 = Integer.parseInt(primeironumero);
        numero2 = Integer.parseInt(segundonumero);
        
        if (numero1 > numero2) {
            JOptionPane.showMessageDialog(null, "O maior número é " + numero1, "" , JOptionPane.PLAIN_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "O maior número é " + numero2, "",JOptionPane.PLAIN_MESSAGE);
        }
    }
}