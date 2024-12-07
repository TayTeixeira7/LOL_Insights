/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Partidas;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
/**
 *
 * @author Taynara Garcia Teixeira
 */
public class ControllerArquivoTextoPartidas extends ControllerArquivoTexto {
    private List<Partidas> partidas = new ArrayList<>();
    private Partidas partida = new Partidas();
    private int countIdPartida = 0;       

    
    public void inicializarCountId() {
        if (!partidas.isEmpty()) {
            countIdPartida = partidas.get(partidas.size() - 1).getId();
        } else {
            countIdPartida = 0; //Reinicia para zero se a lista estiver vazia
        }
    }
    
    public void lerPartida(int idPartida) {
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
        partidas.clear(); 

        while (linhas.hasMoreTokens()) {
            String linha = linhas.nextToken();
            StringTokenizer tokens = new StringTokenizer(linha, ";");

            if (tokens.countTokens() == 6) {
                Partidas ptd = new Partidas();
                ptd.setId(Integer.valueOf(tokens.nextToken()));
                ptd.setJogador(tokens.nextToken());
                ptd.setCampeao(tokens.nextToken());
                ptd.setPosicao(tokens.nextToken());
                ptd.setFuncao_part(tokens.nextToken());
                ptd.setTipo(tokens.nextToken());
                partidas.add(ptd);
            } else {
                System.err.println("Formato inválido! " + linha);
            }
        }
        inicializarCountId();
    }

    public void gravarPartida(Partidas novaPartida) {
        lerPartida(-1);
        novaPartida.setId(++countIdPartida);
        
        partidas.add(novaPartida);

        StringBuilder sb = new StringBuilder();
        for (Partidas p : partidas) {
            sb.append(p.getId()).append(";")
              .append(p.getJogador()).append(";")
              .append(p.getCampeao()).append(";")
              .append(p.getPosicao()).append(";")
              .append(p.getFuncao_part()).append(";")
              .append(p.getTipo()).append(";\n");
        }
        setTexto(sb.toString());
        setArquivo("Salvar");
        if(getArquivo() != null){
            escrever(false);
        }else{
            System.err.println("Nenhum arquivo selecionado");
        } 
    }
    
    // Busca por ID, Jogador ou Campeão
    public Partidas buscarPartidas(int id) {
        for (Partidas partd : partidas) {
            if (partd.getId() == id) {
                return partd;
            }
        }
        return null;
    }
    
    public List<Partidas> buscarPartidas(String nome) {
        List<Partidas> resultados = new ArrayList<>();
        for (Partidas partida : partidas) {
            if (partida.getJogador().equalsIgnoreCase(nome) || partida.getCampeao().equalsIgnoreCase(nome)) {
                resultados.add(partida);
            }
        }
        return resultados;
    }

    public List<Partidas> listaPartidas() {
        return partidas;
    }

    public void atualizarPartida(Partidas partidaAtualizada) {
        lerPartida(-1);
        
        for (int i = 0; i < partidas.size(); i++) {
            if (partidas.get(i).getId() == partidaAtualizada.getId()) {
                partidas.set(i, partidaAtualizada);
                break;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (Partidas p : partidas) {
            sb.append(p.getId()).append(";")
            .append(p.getJogador()).append(";")
            .append(p.getCampeao()).append(";")
            .append(p.getPosicao()).append(";")
            .append(p.getFuncao_part()).append(";")
            .append(p.getTipo()).append(";\n");
        }
        setTexto(sb.toString());
        escrever(false);
    }

    public void removePartida(int id) {
        Partidas partida = buscarPartidas(id);
        if (partida != null) {
            partidas.remove(partida);
            
            StringBuilder sb = new StringBuilder();
            for (Partidas p : partidas) {
                sb.append(p.getId()).append(";")
                .append(p.getJogador()).append(";")
                .append(p.getCampeao()).append(";")
                .append(p.getPosicao()).append(";")
                .append(p.getFuncao_part()).append(";")
                .append(p.getTipo()).append(";\n");
            }
            setTexto(sb.toString());
            escrever(false);
        }
    }

    // Métodos auxiliares para obter e configurar a partida atual
    public Partidas getPartida() {
        return partida;
    }

    public List<Partidas> getPartidas() {
        return partidas;
    }

    public void setPartida(Partidas partida) {
        this.partida = partida;
    }

    public void setPartida(String jogador, String campeao, String posicao, String funcao_part, String tipo, int id) {
        this.partida.setJogador(jogador);
        this.partida.setCampeao(campeao);
        this.partida.setPosicao(posicao);
        this.partida.setFuncao_part(funcao_part);
        this.partida.setTipo(tipo);
        this.partida.setId(id);
    }
}
