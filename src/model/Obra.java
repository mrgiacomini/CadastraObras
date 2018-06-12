package model;

/**
 * @author mathe
 */

public class Obra implements java.io.Serializable {
    private static final long serialVersionUID = 1335421L;
    private String nome;
    private String fone;
    private int dia;
    private int mes;
    private int ano;
    private int tempoEstimado;
    private String tempoMedida;
    private String CPF;
    private String endereco;
    private String valorTotal;
    private Funcionario funcionario;

    public Obra(String nome, String fone, int dia, int mes, int ano, int tempoEstimado, 
            String tempoMedida, String CPF, String endereco,  String valorTotal, Funcionario func) {
        this.nome = nome;
        this.fone = fone;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.tempoEstimado = tempoEstimado;
        this.tempoMedida = tempoMedida;
        this.CPF = CPF;
        this.endereco = endereco;
        this.valorTotal = valorTotal;
        funcionario = func;
    }

       
    private Obra() {
    }
    
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
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

    public int getTempoEstimado() {
        return tempoEstimado;
    }

    public void setTempoEstimado(int tempoEstimado) {
        this.tempoEstimado = tempoEstimado;
    }

    public String getTempoMedida() {
        return tempoMedida;
    }

    public void setTempoMedida(String tempoMedida) {
        this.tempoMedida = tempoMedida;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
  


}
