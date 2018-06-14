package model;

/**
 * @author mathe
 */

public class Pagamento implements java.io.Serializable {
    private static final long serialVersionUID = 1335421L;
    private int id;
    private String valor;
    private int dia;
    private int mes;
    private int ano;
    private Obra obra;
    
    private Pagamento() {
        
    }

    public Pagamento(String valor, Obra obra, int dia, int mes, int ano) {
        this.valor = valor;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.obra = obra;
    }
    
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
  


}
