import java.lang.Math;


/**
 * Escreva a descrição da classe Data aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Data
{
    private int dia;
    private int mes;
    private int ano;
    
    public Data(int dia, int mes, int ano)
    {
        this.mes = mes > 12 ? 12 : mes;
        this.dia = dia > 31 ? 31 : dia;
        this.ano = ano;
    }
    
    public void imprimirData() {
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
    }
    
    public int calcularDiferencaAno(Data data) {
        return Math.abs((this.calculateNumDias() - data.calculateNumDias()) / 365);
    }
    
    public int getDia() {
        return this.dia;
    }
    
    public int getMes() {
        return this.mes;
    }
    
    public int getAno() {
        return this.ano;
    }
    
    public int calculateNumDias() {
        return this.dia + (this.mes * 30) + (this.ano * 365);
    }
}
