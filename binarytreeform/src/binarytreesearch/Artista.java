package binarytreesearch;

import java.util.Objects;

public class Artista implements Comparable<Artista>{
    private int posicao;
    private String nome;
    
    public Artista(int posicao, String nome){
        this.posicao = posicao;
        this.nome = nome;
    }
    
        public Artista(){

    }
    
    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int matricula) {
        this.posicao = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public int compareTo(Artista outro){
        return Integer.compare
           (this.posicao, outro.posicao);
    }
    @Override
    public String toString(){
            return " Posicao:"+this.posicao+ " Nome: " +this.nome;
    }
    
    
}
