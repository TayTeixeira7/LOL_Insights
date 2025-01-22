/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Campeao;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import javax.swing.JFileChooser;
//import java.util.StringTokenizer;
/**
 *
 * @author Taynara Garcia Teixeira
 */
public class ControllerArquivoCampeao extends ControllerArquivoBinario {
    private List<Campeao> campeoes = new ArrayList<>();
    //private Campeao campeao = new Campeao();

    
    public ControllerArquivoCampeao() {
        // Define o arquivo padrão para armazenar dados dos campeões
        if (arquivo == null) {
            arquivo = new File(System.getProperty("user.dir") + File.separator + "campeoes.obj");
        }
    }
    
    public void lerCampeoes() {
        try {
            if (!ler()) {
                System.err.println("Erro ao abrir o arquivo.");
                campeoes = new ArrayList<>();
                return;
            }
            Object binario = getBinario();
            if (binario instanceof List){
                campeoes = (List<Campeao>) binario;
            } else{
                campeoes = new ArrayList<>();
            }
        } catch (ClassCastException e) {
            System.err.println("O arquivo não contém uma lista válida de campeões. " + e.getMessage());
            campeoes = new ArrayList<>();
        }  
    }

    public void gravarCampeao(Campeao novoCampeao) {
        /*lerCampeao();
        if (arquivo == null) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Selecione onde salvar o arquivo");

            if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                File seleciona = fileChooser.getSelectedFile();
                arquivo = seleciona; 
            } else {
                System.err.println("Arquivo não selecionado. Operação cancelada.");
                return;
            }
        }*/     
        lerCampeoes();
        campeoes.add(novoCampeao);
        setBinario(campeoes);
        
        if (escrever(false)) {
            System.out.println("Campeão salvo com sucesso no arquivo " + arquivo.getName());
        } else {
            System.err.println("Erro ao salvar campeão.");
        }
    }

    // Busca campeão pelo Nome
    public Campeao buscarCampeao(String nome) {
        lerCampeoes();
        for (Campeao campeao : campeoes) {
            if (campeao.getNome().equalsIgnoreCase(nome)) {
                return campeao;
            }
        }
        return null;
    }
    
    public List<Campeao> listaCampeoes() {
        lerCampeoes();
        return campeoes;
    }


    public void atualizarCampeao(Campeao campeaoAtualizado) {
        lerCampeoes();
        
        for (int i = 0; i < campeoes.size(); i++) {
            if (campeoes.get(i).getNome().equalsIgnoreCase(campeaoAtualizado.getNome())) {
                campeoes.set(i, campeaoAtualizado);
                break;
            }
        }

        setBinario(campeoes);
        if (escrever(false)) { 
            System.out.println("Campeão atualizado com sucesso no arquivo: " + arquivo.getAbsolutePath());
        } else {
            System.err.println("Erro ao salvar alterações do campeão.");
        }
}

    public void removerCampeao(String nome) {
        lerCampeoes();
        
        Campeao campeao = buscarCampeao(nome);
        if (campeao != null) {
            campeoes.remove(campeao);
            setBinario(campeoes); 
            escrever(false); 
        }
    }
}
