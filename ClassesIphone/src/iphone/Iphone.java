package com.dio.iphone;

import iphone.aparelhoTelefonico.aparelhoTelefonicoInterface;
import iphone.navegadorNaInternet.navegadorInterface;
import iphone.reprodutorMusical.reprodutorMusicalInterface;


public class Iphone implements aparelhoTelefonicoInterface, navegadorInterface, reprodutorMusicalInterface {


  @Override
  public void tocar() {
    System.out.println("Tocando a música");
  }

  @Override
  public void pausar() {
    System.out.println("Pausando a música");
  }

  @Override
  public void selecionarMusica(String nome) {
    System.out.println("Selecionando a música: "+ nome);
  }

  @Override
  public void ligar(int numero) {
    System.out.println("Ligando para " + numero);
  }

  @Override
  public void atender() {
    System.out.println("Atendendo a ligação");
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Iniciando correio de voz");
  }

  @Override
  public void exibirPagina() {
    System.out.println("Exibindo a página");
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("Adicionando uma nova aba à página");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Atualizando a página");
  }
}
