/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author Taynara Garcia Teixeira
 */
public class ControllerArquivoBinario extends ControllerArquivo {
    //protected String binario = null;
    private ObjectInputStream leitor = null;
    private ObjectOutputStream escritor = null;

    /**
     * @return the binario
     *//*
    public String getBinario() {
        return binario;
    }

    /**
     * @param binario the binario to set
     *//*
    public void setBinario(String binario) {
        this.binario = binario;
    }
    */
   
    @Override
    public boolean ler() {
        if (arquivo == null || !arquivo.exists()) {
            return false;
        }       
        try {
            leitor = new ObjectInputStream(new FileInputStream(arquivo));
            Object conteudo = leitor.readObject();
            if(conteudo instanceof List){
                setBinario((List<?>) conteudo);
            }
            leitor.close();
            return true;
        } catch (ClassNotFoundException erro) {
            //erro.printStackTrace();
            System.err.println("Erro: Classe não encontrada." + erro.getMessage());
            return false;
        } catch (IOException erro) {
            System.err.println("Erro ao ler arquivo binário." + erro.getMessage());
            return false;
        }
    }

    @Override
    public boolean escrever(boolean append) {
        if (arquivo != null) {
            try {
                escritor = new ObjectOutputStream(new FileOutputStream(arquivo, append)){
                    @Override
                    protected void writeStreamHeader() throws IOException {
                        if (!append) {
                            super.writeStreamHeader();
                        }
                    }
                };
                escritor.writeObject(getBinario());
                escritor.close();
                return true;
            } catch (IOException erro) {
                System.err.println("Erro ao escrever arquivo binário." + erro.getMessage());
                return false;
            }
        }
        return false;
    }

    /*
     * metodo para ser usado na criação de escritores binarios
     * quando for necessario escrever varios objetos em um mesmo
     * arquivo considerando multiplas execuções da aplicação. 
     */
    public static ObjectOutputStream CriaEscritorObjeto(File arquivo) {
        ObjectOutputStream out = null;
        try {
            if (arquivo.exists()) {
                FileOutputStream fos = new FileOutputStream(arquivo, true);
                out = new ObjectOutputStream(fos) {

                    @Override
                    protected void writeStreamHeader() throws IOException{
                        // do not write a header
                    }
                };
            } else {
                FileOutputStream fos = new FileOutputStream(arquivo);
                out = new ObjectOutputStream(fos);
            }
        } catch (IOException erro) {
            System.out.println("Erro ao criar arquivo. " + erro.getMessage());
        }
        return out;
    }
    
    /**
     * Lista de objetos para leitura/escrita no arquivo.
     */
    private List<?> binario;

    public List<?> getBinario() {
        return binario;
    }

    public void setBinario(List<?> binario) {
        this.binario = binario;
    }
}
