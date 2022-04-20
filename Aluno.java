
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

/**
 * Escreva a descrição da classe Aluno aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Aluno
{
    private String nome;
    private Data dataNascimento;
    private double[] notas;
    
    public Aluno(String nome, Data dataNascimento, double[] notas) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.notas = notas;
    }
    
    double calcularMedia() {
        double soma = 0;
        for(int i = 0; i < notas.length; i++) {
            soma += this.notas[i];
        }
        return soma / this.notas.length;
    }
    
    public void imprimirAluno() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        Data hoje = new Data(now.getDayOfMonth(), now.getMonth().getValue(), now.getYear());
        
        System.out.println("Nome: " + this.nome);
        System.out.print("Data de Nascimento: ");
        this.dataNascimento.imprimirData();
        System.out.println("Idade: " + this.dataNascimento.calcularDiferencaAno(hoje));
        System.out.println("Media: " + this.calcularMedia());
    }
}
