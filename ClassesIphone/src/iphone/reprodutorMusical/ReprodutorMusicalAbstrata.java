package com.dio.iphone.reprodutormusical;

public abstract class ReprodutorMusicalAbstrata implements ReprodutorMusicalInterface {

  protected String nome;

  public ReprodutorMusicalAbstrata(String nome) {
    this.nome = nome;
  }

  @Override
  public void tocar() {
    System.out.println(nome + " tocando");
  }

  @Override
  public void pausar() {
    System.out.println(nome + " pausada!");
  }

  @Override
  public void selecionarMusica(String nome) {
    this.nome = nome;
    System.out.println(nome + " selecionada");
  }

  public String getNome() {
    return nome;
  }
}
