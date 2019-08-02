package aula6;
public class ControleRemoto implements Controlador {
    
    //Atributos 
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //Métodos 
    
    public ControleRemoto(){
        this.setVolume(50);
        this.setTocando(false);
        this.setLigado(false);
    }
    
    private void setVolume(int volume){
        this.volume = volume;
    }
    private int getVolume(){
        return this.volume;
    }
    
    private void setTocando(boolean tocando){
        this.tocando = tocando;
    }
    private boolean getTocando(){
        return this.tocando;
    }
    private void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    private boolean getLigado(){
        return this.ligado;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        int i;
        
        if (this.getLigado()) {
            System.out.println("---MENU---");
            System.out.println("Ligado " + this.getLigado());
            System.out.println("Tocando " + this.getTocando());
            System.out.println("Volume: " + this.getVolume());
            for (i=0; i<= this.getVolume(); i+=10) {
                System.out.print("|");
            }
            System.out.println("");
        }
        else {
            System.out.println("Aparelho desligado!");
        }
    }
    
    //Esses são os métodos de cotrole da interface e seus comandos
    @Override
    public void fecharMenu() {
        if (this.getLigado()) {
            System.out.println("Menu fechado!");
        }
        else{
            System.out.println("Aparelho desligado.");
        }
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        }
        else{
            System.out.println("Não é possivel aumentar o volume estando desligado.");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        }
        else{
            System.out.println("Não é possivel diminuir o volume estando desligado.");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }
    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        }
    }
}
