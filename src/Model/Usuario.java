/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.sql.Date;

/**
 *
 * @author Prog03
 */
public class Usuario {
    private int     id;
    private String  nome;
    private String  sobrenome;
    private String  login;
    private String  senha;
    private Date    dtNasci;

    public Usuario(int id, String nome, String sobrenome, String login, String senha) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.login = login;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDtNasci() {
        return dtNasci;
    }

    public void setDtNasci(Date dtNasci) {
        this.dtNasci = dtNasci;
    }
    
    
}
