// Implementação abstrata
package bridge;

interface Janela {

    void desenharJanela(String titulo);
    void desenharBotao(String titulo);
    
}

class JanelaWindows implements Janela {
 
    @Override
    public void desenharJanela(String titulo) {
        System.out.println(titulo + " - Janela Windows");
    }
 
    @Override
    public void desenharBotao(String titulo) {
        System.out.println(titulo + " - Botão Windows");
    }
 
}

class JanelaLinux implements Janela {
 
    @Override
    public void desenharJanela(String titulo) {
        System.out.println(titulo + " - Janela Linux");
    }
 
    @Override
    public void desenharBotao(String titulo) {
        System.out.println(titulo + " - Botão Linux");
    }
 
}

abstract class JanelaAbstrata {
 
    protected Janela janela;
 
    public JanelaAbstrata(Janela j) {
        janela = j;
    }
 
    public void desenharJanela(String titulo) {
        janela.desenharJanela(titulo);
    }
 
    public void desenharBotao(String titulo) {
        janela.desenharBotao(titulo);
    }
 
    public abstract void desenhar();
 
}

class JanelaDialogo extends JanelaAbstrata {
 
    public JanelaDialogo(Janela j) {
        super(j);
    }
 
    @Override
    public void desenhar() {
        desenharJanela("Janela de Diálogo");
        desenharBotao("Botão Sim");
        desenharBotao("Botão Não");
        desenharBotao("Botão Cancelar");
    }
 
}

class JanelaAviso extends JanelaAbstrata {
 
    public JanelaAviso(Janela j) {
        super(j);
    }
 
    @Override
    public void desenhar() {
        desenharJanela("Janela de Aviso");
        desenharBotao("Ok");
    }
 
}

public class BridgeExample {
    public static void main(String[] args) {
        JanelaAbstrata janela1 = new JanelaDialogo(new JanelaWindows());
        JanelaAbstrata janela2 = new JanelaAviso(new JanelaLinux());

        janela1.desenhar();
        janela2.desenhar();
    }
}
