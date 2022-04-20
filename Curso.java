import java.util.List;
import java.util.ArrayList;

/**
 * Escreva a descrição da classe Curso aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Curso
{
    private String nome;
    private Professor coordenador;
    private List<Professor> professores = new ArrayList<Professor>();
    private List<Turma> turmas = new ArrayList<Turma>();
    private List<Aluno> egressos = new ArrayList<Aluno>();
    private List<Aluno> alunos = new ArrayList<Aluno>();;
    
    public Curso(String nome, Professor coordenador) {
        this.nome = nome;
        this.coordenador = coordenador;
    }
    
    void listarAlunos() {
        for(Aluno aluno : this.alunos) aluno.imprimirAluno();
    }
    
    void listarProfessores() {
        for(Professor professor : this.professores) professor.imprimirProfessor();
    }
    
    void matricularAluno(Aluno aluno) {
        this.alunos.add(aluno);
        for(Turma turma : this.turmas) turma.matricular(aluno);
    }
    
    void removerAluno(Aluno aluno) {
       this.alunos.remove(aluno);
       for(Turma turma : this.turmas) turma.removerAluno(aluno);
    }
    
    void addProfessor(Professor professor) {
        this.professores.add(professor);
    }
    
    void removeProfessor(Professor professor) {
        this.professores.remove(professor);
    }
    
    void addTurma(Turma turma) {
        this.turmas.add(turma);
    }
    
    void removeTurma(Turma turma) {
        this.turmas.remove(turma);
    }

    void imprimirCurso() {
        System.out.println("Nome do curso: " + this.nome);

        System.out.println("Coordenador: ");
        this.coordenador.imprimirProfessor();

        System.out.println("Professores: ");
        for(Professor professor : this.professores) professor.imprimirProfessor();

        System.out.println("Turmas: ");
        for(Turma turma : this.turmas) turma.mostrarAlunosENotas();

        System.out.println("Egressos: ");
        for(Aluno aluno : this.egressos) aluno.imprimirAluno();

        System.out.println("Alunos do curso: ");
        for(Aluno aluno : this.alunos) aluno.imprimirAluno();
    }
}
