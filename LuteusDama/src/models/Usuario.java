package models;

import java.sql.SQLException;

public class Usuario extends Pessoa{
    
    // Atributos
    private String senha;
    private int vitorias;
    private int derrotas;
    
    // Construtor(es)
    public Usuario() {
    }
    
    public Usuario(String nome, String email, String senha) {
        this.senha = senha;
        this.vitorias = vitorias = 0;
        this.derrotas = derrotas = 0;
    }
    
    // Métodos 
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
 }
