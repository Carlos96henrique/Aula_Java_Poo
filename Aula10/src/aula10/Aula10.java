package aula10;
public class Aula10{
    public static void main (String[] args){
        Pessoas p = new Pessoas();
        Aluno a = new Aluno();
        Professor pr = new Professor();
        Funcionario f = new Funcionario();
        
        p.setNome("Carlos");
        p.setSexo("M");
        p.setIdade(22);
        a.setNome("Viviane");
        a.setSexo("F");
        a.setIdade(17);
        pr.setNome("Andrea");
        pr.setSexo("F");
        pr.setIdade(40);
        f.setNome("Valmir");
        f.setSexo("M");
        f.setIdade(46);
        
        
        a.setCurso("Informática");
        pr.setSalario(2500.54f);
        f.setSetor("Jardineiro");
        
        System.out.println(p.toString());
        System.out.println(a.toString());
        System.out.println(pr.toString());
        System.out.println(f.toString());
        
    }
}
