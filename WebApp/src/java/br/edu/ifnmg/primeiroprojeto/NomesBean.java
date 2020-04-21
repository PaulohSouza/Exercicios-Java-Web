package br.edu.ifnmg.primeiroprojeto;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

@SessionScoped
@ManagedBean
public class NomesBean implements Serializable{
    private String nome;
    private String Sobrenome;
    private String mensagem;
    
    public void dizerOla(){
        mensagem = "Olá" + nome + " " + Sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    
}


