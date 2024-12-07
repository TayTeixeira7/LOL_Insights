/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Jogador;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
/**
 *
 * @author Taynara Garcia Teixeira
 */
public class ControllerArquivoTextoJogador extends ControllerArquivoTexto {
    private List<Jogador> jogadores = new ArrayList<>();
    private Jogador jogador = new Jogador();
    private int countIdJogador = 0;
    
    
    public void inicializarCountId() {
        if (!jogadores.isEmpty()) {
            countIdJogador = jogadores.get(jogadores.size() - 1).getId();
        } else {
            countIdJogador = 0; //Reinicia para zero se a lista estiver vazia
        }
    }

    public void lerJogador(int idJogador) {
        setArquivo("Abrir");
        if (!ler()) {
            System.err.println("Erro ao abrir o arquivo ou arquivo inexistente.");
            return;
        }
        String aux = getTexto();
        if (aux == null || aux.isEmpty()) {
            System.err.println("O arquivo está vazio.");
            return;
        }
        
        StringTokenizer linhas = new StringTokenizer(aux, "\n");
        jogadores.clear();
        
        while (linhas.hasMoreTokens()){
            String linha = linhas.nextToken();
            StringTokenizer tokens = new StringTokenizer(linha, ";");
            
            if (tokens.countTokens() == 5){
                Jogador jogador = new Jogador();
                jogador.setId(Integer.valueOf(tokens.nextToken()));
                jogador.setNome(tokens.nextToken());
                jogador.setNivel(Integer.valueOf(tokens.nextToken()));
                jogador.setRanking(tokens.nextToken());
                jogador.setNumVitorias(Integer.valueOf(tokens.nextToken()));
                jogadores.add(jogador); //adicionar à lista
            }else {
                System.err.println("Formato inválido: " + linha);
            }
        }
        /*//busca o campeão desejado pelo id
        Jogador encontrado = buscarJogador(idJogador);
        if (encontrado != null) {
            setJogador(encontrado);
        } else {
            System.err.println("Jogador não encontrado no arquivo.");
        }*/
        
        inicializarCountId(); //atualiza o contador de IDs
    }
    
    public void gravaJogador(Jogador novoJogador) {
        lerJogador(-1);
        novoJogador.setId(++countIdJogador); //atribui um ID único para cada jogador
        
        jogadores.add(novoJogador);
        
        StringBuilder sb = new StringBuilder();
        for (Jogador j : jogadores) {
            sb.append(j.getId()).append(";")
              .append(j.getNome()).append(";")
              .append(j.getNivel()).append(";")
              .append(j.getRanking()).append(";")
              .append(j.getNumVitorias()).append(";\n");
        }
        setTexto(sb.toString());
        setArquivo("Salvar");
        if(getArquivo() != null){
            escrever(false);
        }else{
            System.err.println("Nenhum arquivo selecionado");
        }    
    }
  
    // Busca por ID ou Nome
    public Jogador buscarJogador(int id) {
        for (Jogador jogador : jogadores) {
            if (jogador.getId() == id) {
                return jogador;
            }
        }
        return null;
    }
    
    public Jogador buscarJogador(String nome) {
        for (Jogador jogador : jogadores) {
            if (jogador.getNome().equalsIgnoreCase(nome)) {
                return jogador;
            }
        }
        return null;
    }
    
    public List<Jogador> listaJogadores() {
        return jogadores;
    }

    public void atualizaJogador(Jogador jogadorAtualizado) {
        lerJogador(-1); //recarrega a lista de jogadores a partir do arquivo txt
        
        for (int i = 0; i < jogadores.size(); i++) {
            if (jogadores.get(i).getId() == jogadorAtualizado.getId()) {
                jogadores.set(i, jogadorAtualizado);
                break;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (Jogador j : jogadores) {
            sb.append(j.getId()).append(";")
            .append(j.getNome()).append(";")
            .append(j.getNivel()).append(";")
            .append(j.getRanking()).append(";")
            .append(j.getNumVitorias()).append(";\n");
        }
        setTexto(sb.toString());
        //setArquivo("Salvar");
        escrever(false); //Sobrescreve o arquivo com os novos dados   
    }

    public void removeJogador(int id) {
        Jogador jogador = buscarJogador(id);
        if (jogador != null) {
            jogadores.remove(jogador);
            
            StringBuilder sb = new StringBuilder();
            for (Jogador j : jogadores) {
                sb.append(j.getId()).append(";")
                  .append(j.getNome()).append(";")
                  .append(j.getNivel()).append(";")
                  .append(j.getRanking()).append(";")
                  .append(j.getNumVitorias()).append(";\n");
            }
            setTexto(sb.toString());
            escrever(false); //vai reescrever o arquivo com a lista atualizada
        }
    }


    public Jogador getJogador() {
        return jogador;
    }
    
    public List<Jogador> getJogadores() {
        return jogadores;
    }
    
    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }
    
    public void setJogador(String nome, int nivel, String ranking, int numVitorias, int id) {
        this.jogador.setNome(nome);
        this.jogador.setNivel(nivel);
        this.jogador.setRanking(ranking);
        this.jogador.setNumVitorias(numVitorias);
        this.jogador.setId(id);
    }
    
}
