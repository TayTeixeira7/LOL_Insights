/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Campeao;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
/**
 *
 * @author Taynara Garcia Teixeira
 */
public class ControllerArquivoTextoCampeao extends ControllerArquivoTexto {
    private List<Campeao> campeoes = new ArrayList<>();
    private Campeao campeao = new Campeao();

    
    public void lerCampeao() {
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
        campeoes.clear(); 

        while (linhas.hasMoreTokens()) {
            String linha = linhas.nextToken();
            StringTokenizer tokens = new StringTokenizer(linha, ";");

            if (tokens.countTokens() == 4) {
                Campeao campeao = new Campeao();
                campeao.setNome(tokens.nextToken());
                campeao.setFuncao(tokens.nextToken());
                campeao.setDificuldade(tokens.nextToken());
                campeao.setHabilidade(tokens.nextToken());
                campeoes.add(campeao);
            } else {
                System.err.println("Formato inválido! " + linha);
            }
        }
        /*//busca o campeão desejado pelo nome
        Campeao encontrado = buscarCampeao(nomeCampeao);
        if (encontrado != null) {
            setCampeao(encontrado);
        } else {
            System.err.println("Campeão não encontrado no arquivo.");
        }*/
    }

    public void gravarCampeao(Campeao novoCampeao) {
        lerCampeao();
        campeoes.add(novoCampeao);
        
        StringBuilder sb = new StringBuilder();
        for (Campeao c : campeoes) {
            sb.append(c.getNome()).append(";")
              .append(c.getFuncao()).append(";")
              .append(c.getDificuldade()).append(";")
              .append(c.getHabilidade()).append(";\n");
        }
        setTexto(sb.toString());
        setArquivo("Salvar");
        if(getArquivo() != null){
            escrever(false);
        }else{
            System.err.println("Nenhum arquivo selecionado");
        }
    }

    // Busca por Nome
    public Campeao buscarCampeao(String nome) {
        for (Campeao campeao : campeoes) {
            if (campeao.getNome().equalsIgnoreCase(nome)) {
                return campeao;
            }
        }
        return null;
    }
    
    public List<Campeao> listaCampeoes() {
        return campeoes;
    }


    public void atualizarCampeao(Campeao campeaoAtualizado) {
        lerCampeao();
        
        for (int i = 0; i < campeoes.size(); i++) {
            if (campeoes.get(i).getNome().equalsIgnoreCase(campeaoAtualizado.getNome())) {
                campeoes.set(i, campeaoAtualizado);
                break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Campeao c : campeoes) {
            sb.append(c.getNome()).append(";")
              .append(c.getFuncao()).append(";")
              .append(c.getDificuldade()).append(";")
              .append(c.getHabilidade()).append("\n");
        }
        setTexto(sb.toString());  
        escrever(false);  
}


    public void removerCampeao(String nome) {
        Campeao campeao = buscarCampeao(nome);
        if (campeao != null) {
            campeoes.remove(campeao);
            
            StringBuilder sb = new StringBuilder();
            for (Campeao c : campeoes) {
                sb.append(c.getNome()).append(";")
                  .append(c.getFuncao()).append(";")
                  .append(c.getDificuldade()).append(";")
                  .append(c.getHabilidade()).append("\n");
            }
            setTexto(sb.toString());  
            escrever(false); 
        }
    }

    public Campeao getCampeao() {
        return campeao;
    }
    
    public List<Campeao> getCampeoes() {
        return campeoes;
    }
    
    public void setCampeao(Campeao campeao) {
        this.campeao = campeao;
    }
    
    public void setCampeao(String nome, String funcao, String dificuldade, String habilidade) {
        this.campeao.setNome(nome);
        this.campeao.setFuncao(funcao);
        this.campeao.setDificuldade(dificuldade);
        this.campeao.setHabilidade(habilidade);
    }
}
