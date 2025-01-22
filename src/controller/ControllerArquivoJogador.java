/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.File;
import model.Jogador;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
//import java.util.StringTokenizer;
/**
 *
 * @author Taynara Garcia Teixeira
 */
public class ControllerArquivoJogador extends ControllerArquivoBinario {
    private List<Jogador> jogadores = new ArrayList<>();
    private int countIdJogador = 0;
    
    public ControllerArquivoJogador() {
        // Define o arquivo padrão para armazenar dados de jogadores
        if (arquivo == null) {
            arquivo = new File(System.getProperty("user.dir") + File.separator + "jogadores.obj");
        }
    }
    
    public void inicializarCountId() {
        if (!jogadores.isEmpty()) {
            countIdJogador = jogadores.get(jogadores.size() - 1).getId();
        } else {
            countIdJogador = 0; //Reinicia para zero se a lista estiver vazia
        }
    }

    public void lerJogadores() { 
        /*if (arquivo == null) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Selecione o arquivo de jogadores");

            if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                arquivo = fileChooser.getSelectedFile();
            } else {
                System.err.println("Nenhum arquivo selecionado.");
                return;
            }
        }*/
        
        try {
            if (!ler()) {
                System.err.println("Erro ao carregar o arquivo.");
                jogadores = new ArrayList<>();
                return;
            }
            Object binario = getBinario();
            if (binario instanceof List) {
                jogadores = (List<Jogador>) binario;
            } else {
                jogadores = new ArrayList<>();
            }
            inicializarCountId(); //atualiza o contador de IDs
        } catch (ClassCastException e) {
            System.err.println("O arquivo não contém uma lista válida de jogadores. " + e.getMessage());
            jogadores = new ArrayList<>();
        }                     
    }
    
    public void gravaJogador(Jogador novoJogador) {
        /*if (arquivo == null) { //verifica se o arquivo foi definido
            JFileChooser fileChooser = new JFileChooser(System.getProperty("user.dir"));
            fileChooser.setDialogTitle("Selecione onde salvar o arquivo");

            if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                arquivo = fileChooser.getSelectedFile();
                //File seleciona = fileChooser.getSelectedFile();
                //arquivo = seleciona; //define o arquivo no controller
            } else {
                System.err.println("Arquivo não selecionado. Operação cancelada.");
                return;
            }
        }
        */        
        lerJogadores();
        novoJogador.setId(++countIdJogador); //atribui um ID único para cada jogador       
        jogadores.add(novoJogador);
        setBinario(jogadores);
        
        if (escrever(false)) {
            System.out.println("Jogador salvo com sucesso no arquivo " + arquivo.getName());
        } else {
            System.err.println("Erro ao salvar o jogador.");
        }
    }
  
    // Busca jogador pelo ID
    public Jogador buscarJogador(int id) {
        lerJogadores();
        for (Jogador jogador : jogadores) {
            if (jogador.getId() == id) {
                return jogador;
            }
        }
        return null;
    }
    
    // Busca jogador pelo Nome
    public Jogador buscarJogador(String nome) {
        lerJogadores();
        for (Jogador jogador : jogadores) {
            if (jogador.getNome().equalsIgnoreCase(nome)) {
                return jogador;
            }
        }
        return null;
    }
    
    public List<Jogador> listaJogadores() {
        lerJogadores();
        return jogadores;
    }

    public void atualizaJogador(Jogador jogadorAtualizado) {
        /*if (arquivo == null || !arquivo.exists()) { // Verifica se o arquivo está definido
            System.err.println("Erro: Arquivo não definido ou inexistente.");
            return;
        }*/

        lerJogadores();
        
        for (int i = 0; i < jogadores.size(); i++) {
            if (jogadores.get(i).getId() == jogadorAtualizado.getId()) {
                jogadores.set(i, jogadorAtualizado); // Atualiza o jogador na lista
                break;
            }
        }     

        setBinario(jogadores);
        if (escrever(false)) { // Salva no arquivo já definido
            System.out.println("Jogador atualizado com sucesso no arquivo: " + arquivo.getAbsolutePath());
        } else {
            System.err.println("Erro ao salvar alterações no jogador.");
        }
        //escrever(false); //Sobrescreve o arquivo com os novos dados   
    }

    public void removeJogador(int id) {
        lerJogadores();
        
        Jogador jogador = buscarJogador(id);
        if (jogador != null) {
            jogadores.remove(jogador);
            setBinario(jogadores);
            escrever(false); //vai reescrever o arquivo com a lista atualizada
        }
    }
}
   
