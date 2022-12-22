package business;

import entidades.Aluno;
import entidades.Turma;

import java.util.Collections;
import java.util.List;

public class Sistema {
    public static <T extends Aluno> void incluirAlunos(Turma turma, List<T> alunos) {
        for (T aluno : alunos) {
            turma.getAlunos().add(aluno);
        }
        Collections.sort(turma.getAlunos());
    }

}
