/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Partidas;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import javax.swing.JFileChooser;
/**
 *
 * @author Taynara Garcia Teixeira
 */
public class ControllerArquivoPartidas extends ControllerArquivoBinario {
    private List<Partidas> partidas = new ArrayList<>();
    private int countIdPartida = 0;
    //private Partidas partida = new Partidas();
    
    
    public ControllerArquivoPartidas() {
        // Define o arquivo padrão para armazenar os dados das partidas
        if (arquivo == null) {
            arquivo = new File(System.getProperty("user.dir") + File.separator + "partidas.obj");
        }
    }
    
    public void inicializarCountId() {
        if (!partidas.isEmpty()) {
            countIdPartida = partidas.get(partidas.size() - 1).getId();
        } else {
            countIdPartida = 0; //Reinicia para zero se a lista estiver vazia
        }
    }
    
    public void lerPartidas() {
        /*if (arquivo == null) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Selecione o arquivo de partidas");

            if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                arquivo = fileChooser.getSelectedFile();
            } else {
                System.err.println("Nenhum arquivo selecionado.");
                return;
            }
        }*/
        
        try{
            if (!ler()) {
                System.err.println("Erro ao abrir o arquivo.");
                partidas = new ArrayList<>();
                return;
            }
            Object binario = getBinario();
            if (binario instanceof List) {
                partidas = (List<Partidas>) binario;
            } else {
                partidas = new ArrayList<>();
            }
            inicializarCountId();
        } catch (ClassCastException e) {
            System.err.println("O arquivo não contém uma lista válida de partidas. " + e.getMessage());
            partidas = new ArrayList<>();
        }  
    }

    public void gravarPartida(Partidas novaPartida) {
        /*if (arquivo == null) { //verifica se o arquivo foi definido
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Selecione onde salvar o arquivo");

            if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                File seleciona = fileChooser.getSelectedFile();
                arquivo = seleciona; 
            } else {
                System.err.println("Arquivo não selecionado. Operação cancelada.");
                return;
            }
        } */
        
        lerPartidas();
        novaPartida.setId(++countIdPartida);      
        partidas.add(novaPartida);
        setBinario(partidas);
        
        if (escrever(false)) {
            System.out.println("Partida salva com sucesso no arquivo " + arquivo.getName());
        } else {
            System.err.println("Erro ao salvar partida.");
        }
    }
    
    // Busca jogador ou campeão pelo ID
    public Partidas buscarPartidas(int id) {
        lerPartidas();
        for (Partidas partd : partidas) {
            if (partd.getId() == id) {
                return partd;
            }
        }
        return null;
    }
    
    // Busca jogador ou campeão pelo Nome
    public List<Partidas> buscarPartidas(String nome) {
        lerPartidas();
        List<Partidas> resultados = new ArrayList<>();
        for (Partidas partida : partidas) {
            if (partida.getJogador().equalsIgnoreCase(nome) || partida.getCampeao().equalsIgnoreCase(nome)) {
                resultados.add(partida);
            }
        }
        return resultados;
    }

    public List<Partidas> listaPartidas() {
        lerPartidas();
        return partidas;
    }

    public void atualizarPartida(Partidas partidaAtualizada) {
        lerPartidas();
        
        for (int i = 0; i < partidas.size(); i++) {
            if (partidas.get(i).getId() == partidaAtualizada.getId()) {
                partidas.set(i, partidaAtualizada);
                break;
            }
        }
        
        setBinario(partidas);
        if (escrever(false)) { // Salva no arquivo já definido
            System.out.println("Partida atualizada com sucesso no arquivo: " + arquivo.getAbsolutePath());
        } else {
            System.err.println("Erro ao salvar alterações da partida.");
        }
    }

    public void removePartida(int id) {
        lerPartidas();
        
        Partidas partida = buscarPartidas(id);
        if (partida != null) {
            partidas.remove(partida);
            setBinario(partidas);
            escrever(false);
        }
    }
}
