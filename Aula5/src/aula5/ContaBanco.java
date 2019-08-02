package aula5;
public class ContaBanco {
    public int numConta;
    protected String tipoConta;
    private String donoConta;
    private float saldoConta;
    private boolean statusConta;
    
    public void ContaBanco (){
        this.setSaldoConta(0);
        this.setStatusConta(false);
        /*ou this.saldoConta = 0;
             this.statusConta = false;
             mas é sempre preferivel usar o outro jeito. 
        */
    }
    
    public void extratoConta(){
        System.out.println("----------Conta Banco----------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Dono: " + this.getDonoConta());
        System.out.println("Tipo de Conta: " + this.getTipoConta());
        System.out.println("Saldo atual: " + this.getSaldoConta());
        System.out.println("Status: " + this.getStatusConta());
    }
    public void abrirConta(String t){
        this.setTipoConta(t);
        this.setStatusConta(true);
        if (t == "cc"){
            this.saldoConta = 50.00f; 
            System.out.println("Conta aberta com sucesso.");
        }
        else if (t == "cp"){
            this.saldoConta = 150.00f;
            System.out.println("Conta aberta com sucesso.");
        }
        else {
            System.out.println("Tipo de conta inválido.");
        }
    }   
    public void fecharConta(){
        if (this.saldoConta > 0f) {
            System.out.println("Não é possível encerrar a conta enquanto houver valores.");
        }
        else if(this.saldoConta < 0) {
            System.out.println("Não é possível encerrar a conta enquanto houver débitos.");
        }
        else{
            this.setStatusConta(false);
            System.out.println("Conta encerrada com sucesso");
        }
    }
    public void depositarConta(float v){
        if(this.getStatusConta()){
            this.setSaldoConta(this.getSaldoConta() + v);
            System.out.println("O valor de " + v + "R$ foi depositado com sucesso.");
        }
        else{
            System.out.println("Não é possível depositar.");
        }
    }
    public void sacarConta(float v){
        if (this.getStatusConta()) {
            if (this.getSaldoConta() >= v) {
                this.setSaldoConta(this.getSaldoConta() - v);
                System.out.println("O valor " + v + "R$ foi sacado com sucesso.");
            }
            else{
                System.out.println("Saldo insuficiente.");
            }
        }
        else{
            System.out.println("Não é possível sacar, conta bloqueada ou inexistente.");
        }
    }
    public void pagarMensal(){
        float v = 0f;
        switch (this.getTipoConta()) {
            case "cc":
                v = 12.0f;
                break;
            case "cp":
                v = 20.0f;
                break;
        }
        if (this.getStatusConta()) {
            if (this.saldoConta > v){
                this.setSaldoConta(this.getSaldoConta() - v);
            }
            else{
                System.out.println("Saldo insuficiente, favor verifficar.");
            }
        }
        else{
            System.out.println("Conta bloqueada ou inexistente.");
        }
    }
    public void setNumConta(int n){
        this.numConta = n;
    }
    public int getNumConta(){
        return this.numConta;
    }
    public void setTipoConta(String t){
        this.tipoConta = t;
    }
    public String getTipoConta(){
        return this.tipoConta;
    }
    public void setDonoConta(String d){
        this.donoConta = d;
    }
    public String getDonoConta(){
        return this.donoConta;
    }
    public void setSaldoConta(float s){
        this.saldoConta = s;
    }
    public float getSaldoConta(){
        return this.saldoConta;
    }
    public void setStatusConta(boolean st){
        this.statusConta = st;
    }
    public boolean getStatusConta(){
        return this.statusConta;
    }
}