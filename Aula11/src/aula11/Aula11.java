package aula11;
public class Aula11{
    public static void main (String[] args){
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();
        Professor p1 = new Professor();
        AlunoTecnico at1 = new AlunoTecnico();
        
        /*v1.setNome("João");
        v1.setIdade(23);
        v1.setSexo("Masculino");*/
        
        /*a1.setNome("Felipe");
        a1.setIdade(18);
        a1.setSexo("Masculino");
        a1.setMatricula(1000001);
        a1.setCurso("ADS");
        a1.pagarMensalidade();
        //System.out.println(v1.toString());
        */        
        b1.setNome("Vivane");
        b1.setIdade(17);
        b1.setSexo("Feminino");
        b1.setMatricula(10000002);
        b1.setCurso("ADM");
        b1.setBolsa(355.98f);
        b1.pagarMensalidade();
        b1.renovarBolsa();
        
        at1.setNome("Carlos");
        at1.setIdade(23);
        at1.setSexo("Masculino");
        at1.setMatricula(1000000003);
        at1.setCurso("ADS");
        at1.setRegistro(89120354);
        at1.praticar();
    }
}