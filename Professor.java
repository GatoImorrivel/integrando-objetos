
/**
 * Escreva a descrição da classe Professor aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Professor
{
    private String nome;
    private String especializacao;
    
    /**
     * COnstrutor para objetos da classe Professor
     */
    public Professor(String nome, String especializacao)
    {
        this.nome = nome;
        this.especializacao = especializacao;
    }
    
    public void imprimirProfessor() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Especializacao: " + this.especializacao);
    }
}
