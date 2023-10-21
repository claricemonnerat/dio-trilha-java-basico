package com.dio.iphone.navegador;

public abstract class NavegadorAbstrata implements NavegadorInterface {

  @Override
  public void exibirPagina() {
    System.out.println("Exibindo a página pedida");
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
