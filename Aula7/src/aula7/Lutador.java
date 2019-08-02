package aula7; //E aula 8
public class Lutador {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int numlutas;
    private int vitorias;
    private int derrotas;
    private int empates;

    //Metodo construtor
    public Lutador(String nome, String nac, int ida, float al, float pe, int numlutas, int vi, int der, int emp){
        this.setNome(nome);
        this.setNacionalidade(nac);
        this.setIdade(ida);
        this.setAltura(al);
        this.setPeso(pe);
        this.setNumLutas(numlutas);
        this.setVitorias(vi);
        this.setDerrotas(der);
        this.setEmpates(emp);
    }

    //Metodos getters e setters
    public void setNome(String nome){
        this.nome = nome;
    }   
    public String getNome(){
        return this.nome;
    }
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }   
    public String getNacionalidade(){
        return this.nacionalidade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
    public float getAltura(){
        return this.altura;
    }
    public void setPeso(float peso){
       this.peso = peso;
       setCategoria();
       
    }
    public float getPeso(){
        return this.peso;
    }
    private void setCategoria(){
        if (this.peso < 52.2){
            this.categoria = "Invalido";
        }
        else if (this.peso <= 70.3){
            this.categoria = "Leve";
        }
        else if (this.peso <= 83.9){
            this.categoria = "Médio";
        }
        else if (this.peso<= 120.2){
            this.categoria = "Pesado";
        }
        else{
            this.categoria = "invalido";
        }
    }
    public String getCategoria(){
        return this.categoria;
    }
    public void setNumLutas(int numlutas){
        this.numlutas = numlutas;
    }
    public int getNumLutas(){
        return this.numlutas;
    }
    public void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }
    public int getVitorias(){
        return this.vitorias;
    }
    public void setDerrotas(int derrotas){
        this.derrotas = derrotas;
    }
    public int getDerrotas(){
        return this.derrotas;
    }
    public void setEmpates(int empates){ 
        this.empates = empates;
    }
    public int getEmpates(){
        return this.empates;
    }
    
    //Metodos do publicos
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    public void apresentar(){
        System.out.println("----Apresentando----");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Quantidade de Lutas: " + this.getNumLutas());
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("Derrotas: " + this.getDerrotas());
    }
    
    public void status(){
        //System.out.println("Status");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Categoria: Peso " + this.getCategoria());
        System.out.println("Quantidade de Lutas: " + this.getNumLutas());
    }
    
}
