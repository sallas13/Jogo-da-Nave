/*import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.Timer;

public class Keyboard implements ActionListener {
    
    private boolean isIniciar;

    public keyboard() {
        isIniciar = false;
    }

    public void iniciar() {
        isIniciar = true;
    }

    public void keyPressed(KeyEvent tecla) {
        int codigo = tecla.getKeyCode();

        if(codigo == KeyEvent.VK_ENTER) {
            iniciar();
        }
    }

    public void keyRelease(KeyEvent tecla) {
        int codigo = tecla.getKeyCode();
    }

    public boolean isIniciar() {
        return isIniciar;
    }

    public void setIniciar(boolean isIniciar) {
        this.isIniciar = isIniciar;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
*/