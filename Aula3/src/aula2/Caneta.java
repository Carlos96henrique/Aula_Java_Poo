package aula2;
public class Caneta {
    
        //Atributos da classe caneta
        //Estudando visibilidade do objetos
       public String modelo;
       public String cor;
       private float ponta;
       protected int carga;
       private boolean tampada;
       
       //Métidos da classe caneta
       public void status(){
           System.out.println("Modelo: " + this.modelo);
           System.out.println("Uma caneta " + this.cor);
           System.out.println("Ponta " + this.ponta);
           System.out.println("Carga " + this.carga);
           System.out.println("está tampada? " + this.tampada);
           
       }
       protected void rabiscar() {
           if (this.tampada == true) {
               System.out.println("Erro, você não pode rabiscar");
           }
           else {
               System.out.println("Estou Rabiscando");
           }
       }
       public void tampar() {
           this.tampada = true;
       }
       public void destampar() {
           this.tampada = false;
       }
}
