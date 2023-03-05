package model;

import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {
    private List<Aluno> alunos;

    public AlunoDAO() {
        this.alunos = new ArrayList<>();
    }

    public void adicionar(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void atualizar(Aluno aluno) {
        int index = this.alunos.indexOf(aluno);
        if (index != -1) {
            this.alunos.set(index, aluno);
        }
    }

    public void remover(Aluno aluno) {
        this.alunos.remove(aluno);
    }

    public Aluno buscarPorId(int id) {
        return this.alunos.stream()
                .filter(aluno -> aluno.getIdAluno() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Aluno> listarTodos() {
        return this.alunos;
    }
}
