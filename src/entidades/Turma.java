package entidades;

import java.util.ArrayList;
import java.util.List;

public class Turma<T extends Aluno> {
    private Professor professor;
    private List<T> alunos = new ArrayList<>();

    public Turma(Professor professor) {
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<T> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<T> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "professor=" + professor +
                ", alunos=" + alunos +
                '}';
    }
}
