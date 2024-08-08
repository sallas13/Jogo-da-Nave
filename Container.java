import javax.swing.JFrame;

public class Container extends JFrame {

    public Container() {
        add(new Fase());
        setTitle("Meu jogo");
        setSize(736, 460);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setResizable(false);
        setVisible(true);
    }

    public static void main (String []args) {
        new Container();
    }
}