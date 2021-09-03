package br.fatec.taroTI.entidades;

public class Naipe {
    public String nome;
    public String caminho;

    Naipe (int n) {
        switch(n) {
            case 1:
                nome = "Backend";
                caminho = "ouros/";
                break;
            case 2:
                nome = "Frontend";
                caminho = "paus/";
                break;
            case 3:
                nome = "Devops";
                caminho = "copos/";
                break;
            case 4:
                nome = "Data Science";
                caminho = "espadas/";
                break;
            default:
                nome = "Fullstack";
                caminho = "maior/";
                break;
        }
    }

    @Override
    public String toString() {
        return nome;
    }
}
