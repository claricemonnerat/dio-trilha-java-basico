package com.dio.iphone.aparelhotelefonico;

public abstract class aparelhoTelefonicoAbstrata implements aparelhoTelefonicoInterface {

  @Override
  public void ligar(int num) {
    System.out.println("Ligando para " + num);
  }

  @Override
  public void atender() {
    System.out.println("Atendendo a ligação");
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Correio de voz iniciado");
  }
}
