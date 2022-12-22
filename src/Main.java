import business.Sistema;
import entidades.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Turma<Aluno> turmaAluno = new Turma(new Professor("Kadu"));

        List<Aluno> alunos = Arrays.asList(new Aluno("João"), new Aluno("Rafael"), new Aluno("Jackson"));
        Sistema.incluirAlunos(turmaAluno, alunos);

        Turma<AlunoJS> turmaJS = new Turma(new Professor("Kadu"));

        List<AlunoJS> alunosJS = Arrays.asList(new AlunoJS("João"), new AlunoJS("Rafael"), new AlunoJS("Jackson"));
        Sistema.incluirAlunos(turmaJS, alunosJS);

        Turma<AlunoJava> turmaJava = new Turma(new Professor("Kadu"));

        List<Aluno> alunosJava = Arrays.asList(new AlunoJava("João"), new AlunoJava("Rafael"), new AlunoJava("Jackson"));
        Sistema.incluirAlunos(turmaJava, alunosJava);

        System.out.println(turmaAluno);
        System.out.println(turmaJS);
        System.out.println(turmaJava);
    }
}
