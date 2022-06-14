package entidades;

import java.util.List;

public class turma {
    private String nome;
    private curso curso;
    private turnosEnum turno;
    private professor professor;
    private List<aluno> alunos;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public curso getCurso() {
        return curso;
    }
    public void setCurso(curso curso) {
        this.curso = curso;
    }
    public turnosEnum getTurno() {
        return turno;
    }
    public void setTurno(turnosEnum turno) {
        this.turno = turno;
    }
    public professor getProfessor() {
        return professor;
    }
    public void setProfessor(professor professor) {
        this.professor = professor;
    }
    public List<aluno> getAlunos() {
        return alunos;
    }
    public void setAlunos(List<aluno> alunos) {
        this.alunos = alunos;
    }



    
}
