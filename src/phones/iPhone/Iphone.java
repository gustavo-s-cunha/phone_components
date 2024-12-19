package phones.iPhone;

import interfaces.mediaPlayer.ReprodutorMusical;
import interfaces.navigator.NavegadorInternet;
import interfaces.telephone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
  // Métodos do ReprodutorMusical
  @Override
  public void tocar() {
    System.out.println("\nReproduzindo música...");
  }

  @Override
  public void pausar() {
    System.out.println("Música pausada.");
  }

  @Override
  public void selecionarMusica(String musica) {
    System.out.println("Música selecionanda:");
    System.out.println(musica);
  }

  // --------------------------------------------------
  // Métodos do AparelhoTelefonico
  @Override
  public void ligar(String numero) {
    System.out.println("Ligando para: " + numero);
  }

  @Override
  public void atender() {
    System.out.println("Atendendo chamada...");
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Iniciando correio de voz...");
  }

  // --------------------------------------------------
  // Métodos do Navigator
  @Override
  public void exibirPagina(String url) {
    System.out.println("Exibindo página: " + url);
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("Nova aba adicionada.");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Página atualizada.");
  }
}