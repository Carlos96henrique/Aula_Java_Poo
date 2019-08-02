package aula9;
public class Aula9{
    public static void main (String[] args){
        Pessoas p[] = new Pessoas[3];
        Livro l[] = new Livro[4];
        
        p[0] = new Pessoas("Carlos ", 20, "Masculino");
        p[1] = new Pessoas("Viviane", 18, "Feminina");
        
        l[0] = new Livro("A megera domada", "William Shakespeare", 300, p[1]);
        l[1] = new Livro("Fundamentos matemáticos para computação", "Judith", 800, p[0]);
        l[2] = new Livro("O magico de Oz", "Desconhecido", 200, p[1]);
        
        l[0].abrir();
        l[0].folhear(12);
        System.out.println(l[0].detalhes());
        l[0].avancarPagina();
        System.out.println(l[0].detalhes());
        l[1].abrir();
        l[1].folhear(512);
        System.out.println(l[1].detalhes());
        l[1].fechar();
        System.out.println(l[1].detalhes());
        
    }
}