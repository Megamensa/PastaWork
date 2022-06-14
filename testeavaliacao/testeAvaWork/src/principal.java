import java.util.ArrayList;
import java.util.List;

import entidades.aluno;
import entidades.curso;
import entidades.professor;
import entidades.turma;
import entidades.turnosEnum;

public class principal {

    public static void main(String[] args) {

        curso c = new curso();
        c.setCurso("Novos Talentos em TI");
        c.setDucacao(10);
        c.setInstituicao("Univille");

        professor p = new professor();
        p.setNome("João Moretti");

        aluno a1 = new aluno();
        a1.setNome ("Vivente 1");
        a1.setIdade(10);
        a1.setMatricula(101);
        a1.setTelefone(1111111111);
        a1.setEmail("101@univille.br");


        aluno a2 = new aluno();
        a2.setNome ("Vivente 2");
        a2.setIdade(20);
        a2.setMatricula(102);
        a2.setTelefone(2111111111);
        a2.setEmail("102@univille.br");


        aluno a3 = new aluno();
        a3.setNome ("Vivente 3");
        a3.setIdade(30);
        a3.setMatricula(103);
        a3.setTelefone(1111111);
        a3.setEmail("103@univille.br");


        aluno a4 = new aluno();
        a4.setNome ("Vivente 4");
        a4.setIdade(40);
        a4.setMatricula(104);
        a4.setTelefone(12345678);
        a4.setEmail("104@univille.br");

        turma t = new turma();
        t.setNome("The Best");
        t.setCurso(c);
        t.setProfessor(p);
        t.setTurno(turnosEnum.Noturno);

        List<aluno> alunos = new ArrayList<>();
        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);
        alunos.add(a4);

        
        t.setAlunos(alunos);





    }
    
}
