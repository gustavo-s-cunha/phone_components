import phones.iPhone.Iphone;

public class Main {
  public static void main(String[] args) {
    Iphone iphone = new Iphone();
    iphone.tocar();

    // funcionalidades do Reprodutor Musical
    iphone.tocar();
    iphone.selecionarMusica("Blind Guardian, Time Stands Still");
    iphone.pausar();

    // funcionalidades do Aparelho Telefônico
    iphone.ligar("(00)91234-5678");
    iphone.atender();
    iphone.iniciarCorreioVoz();

    // funcionalidades do Navegador na Internet
    iphone.exibirPagina("https://www.apple.com");
    iphone.adicionarNovaAba();
    iphone.atualizarPagina();
  }
}
