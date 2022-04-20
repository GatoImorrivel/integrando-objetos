import java.util.List;
import java.util.ArrayList;

/**
 * Escreva a descrição da classe Turma aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Turma
{
    private List<Aluno> alunos = new ArrayList<Aluno>();
    private Professor professor;
    private String disciplina;
    
    public Turma(Professor professor, String disciplina)
    {
        this.professor = professor;
        this.disciplina = disciplina;
    }
    
    public void matricular(Aluno aluno) {
        this.alunos.add(aluno);
    }
    
    public void mostrarAlunosENotas() {
        System.out.println("Turma: " + disciplina);
        this.professor.imprimirProfessor();
        for(Aluno aluno : this.alunos) { 
            aluno.imprimirAluno();
        }
    }
    
    public void removerAluno(Aluno aluno) {
        this.alunos.remove(aluno);
    }
}
