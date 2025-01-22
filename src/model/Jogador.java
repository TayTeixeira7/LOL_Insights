/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Taynara Garcia Teixeira
 */
public class Jogador implements java.io.Serializable{
    private static long serialVersionUID = 3L;
    protected int id;
    protected String nome;
    protected int nivel;
    protected String ranking;
    protected int numVitorias;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the ranking
     */
    public String getRanking() {
        return ranking;
    }

    /**
     * @param ranking the ranking to set
     */
    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    /**
     * @return the numVitorias
     */
    public int getNumVitorias() {
        return numVitorias;
    }

    /**
     * @param numVitorias the numVitorias to set
     */
    public void setNumVitorias(int numVitorias) {
        this.numVitorias = numVitorias;
    }
    
    
    
}


