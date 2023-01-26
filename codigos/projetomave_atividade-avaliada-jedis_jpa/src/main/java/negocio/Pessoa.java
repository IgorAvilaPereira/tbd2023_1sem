/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import javax.persistence.Column;

/**
 *
 * @author iapereira
 */
public class Pessoa {
    private String id;
    private String nome;
    private String sobrenome;

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    
    public String toString(){
        return this.nome+";"+this.sobrenome;
    }

    public String getNome() {
        return this.nome;
    }
    
}
