package com.dio.iphone.navegadorNaInternet;

public abstract class NavegadorAbstrata implements NavegadorInterface {

  @Override
  public void exibirPagina() {
    System.out.println("Página exibida");
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("Página adicionada");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Página atualizada");
  }
}
