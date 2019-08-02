package aula7; //E aula 8 
//Importando biblioteca para números randomicos
import java.util.Random;
//Classe de agregação
public class Luta {
    //Atributos
    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada;
    
    //Metodos especiais
    
    public void setDesafiante(Lutador des){
        this.desafiante = des;
    }
    public Lutador getDesafiante(){
        return this.desafiante;
    }
    public void setDesafiado(Lutador des){
        this.desafiado = des;
    }
    public Lutador getDsafiado(){
        return this.desafiado;
    }
    public void setRounds(int qdtrounds){
        this.rounds = qdtrounds;
    }
    public int getRounds(){
        return this.rounds;
    }
    public void setAprovada(boolean ap){
        this.aprovada = ap;
    }
    public boolean getAprovada(){
        return this.aprovada;
    }
    
    //Metodos publicos
    public void marcar(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.setDesafiado(l1);
            this.setDesafiante(l2);
            this.setAprovada(true);
            System.out.println("Luta aprovada");
        }
        else {
            this.setDesafiante(null);
            this.setDesafiado(null);
            this.setAprovada(false);
        }   
    }
    public void lutar(){
        if (getAprovada() == true){
            System.out.println("Vamos começar a luta.");
            System.out.println("Do meu lado direito temos o disafiante ");
            this.desafiante.apresentar();
            System.out.println("Do meu lado esquerdo temos o desafiado ");            
            this.desafiado.apresentar();
            this.desafiante.setNumLutas(this.desafiante.getNumLutas() + 1);
            this.desafiado.setNumLutas(this.desafiado.getNumLutas() + 1);
            Random resultado = new Random();
            int vencedor = resultado.nextInt(3);
           switch(vencedor){
                case 0:
                    System.out.println("Empate!");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                break;
                case 1:
                    System.out.println("Vitoria" + this.desafiado.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                break;
                case 3:
                    System.out.println("Vitoria" + this.desafiado.getNome());
                    this.desafiante.perderLuta();
                    this.desafiado.ganharLuta();
                break;
            }
        } 
        else {
            System.out.println("Esta luta não foi aprovada.");
        }
    }
}
