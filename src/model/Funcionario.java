package model;

/**
 * @author mathe
 */

public class Funcionario implements java.io.Serializable {
    private static final long serialVersionUID = 1335421L;
    private int id;
    private String nome;
    private String CPF;
   
    private Funcionario() {
    }

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        CPF = cpf;
    }

    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   

}
