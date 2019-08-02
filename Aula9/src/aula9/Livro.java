package aula9;
public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoas leitor;
    
    //Metodos Publicos
    public String detalhes(){
        return "Livro{" + "Titulo: " + titulo 
                + "\n, autor: " + autor 
                + "\n, Total de Paginas: " + totalPaginas 
                + "\n, Pagina Atual: " + pagAtual 
                + "\n, Abertos: " + aberto 
                + "\n, leitor: " + leitor.getNome() + "}";
    }
    
    //Metodos especiais 
    public Livro (String titulo, String autor, int totalPaginas, Pessoas leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setautor(String autor){
        this.autor = autor;
    }
    public String getAutor(){
        return this.autor;
    }
    public void setTotalPaginas(int paginas){
        this.totalPaginas = paginas;
    }
    public int getTotalPaginas(){
        return this.totalPaginas;
    }
    public void setPaginaAtual(int paginas){
        this.pagAtual = paginas;
    }
    public int getPaginaAtual(){
        return this.pagAtual;
    }
    public void setAberto(boolean aberto){
        this.aberto = aberto;
    }
    public boolean getAberto(){
        return this.aberto;
    }
    public void setLeitor(Pessoas leitor){
        this.leitor = leitor;
    }
    public Pessoas getLeitor(){
        return this.leitor;
    }
    //Implementação de interface
    @Override
    public void abrir(){
        this.aberto = true;
    }
    @Override
    public void fechar(){
        this.aberto = false;
        this.setPaginaAtual(0);
    }
    @Override
    public void folhear(int pagina){
        if (pagina > getTotalPaginas() || !getAberto()){
            System.out.println("Página inexistente.");
            this.pagAtual = 0;
        }
        else {
            this.pagAtual = pagina;
        }
    }
    @Override
    public void avancarPagina(){
        if (getPaginaAtual() == getTotalPaginas()){
            System.out.println("Fim do livro");
        }
        else{
            this.pagAtual = getPaginaAtual() + 1;
        }
        
    }
    @Override
    public void voltarPagina(){
        if (getPaginaAtual() < 0){
            System.out.println("Inicio do livro");
        }
        else{
            this.pagAtual = getPaginaAtual() - 1;
        }
    }
}