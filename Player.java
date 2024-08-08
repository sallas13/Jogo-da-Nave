import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.Timer;

public class Player implements ActionListener{

    private int x, y;
    private int dx, dy;
    private Image imagem;
    private int altura, largura;
    private List <Tiro> tiros;
    private boolean isVisivel, isTurbo, isStart, isRestart;
    private Timer timer;

    public Player() {
        this.x = 184;
        this.y = 184;
        isStart = false;
        isVisivel = true;
        isTurbo = false;
        isRestart = false;

        tiros = new ArrayList<Tiro>();

        timer = new Timer(5000, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     if(isStart == true) {
        start();     
        isStart = false;   
     }   
     if(isTurbo == true){
        turbo();
        isTurbo = false;
     }

     if(isTurbo == false) {
        load();
     }
     if(isRestart == true) {
        restart();
     }
    }

    public void load() {
        ImageIcon referencia = new ImageIcon("res//nave.png");
        imagem = referencia.getImage();
        
        altura = imagem.getHeight(null);
        largura = imagem.getWidth(null);
    }

    public void update() {
        x += dx;
        y += dy;
    }

    public void start() {
        isStart = true;
    }

    public void tiroSimples() {
        this.tiros.add(new Tiro(x + largura, y + (altura / 2)));
    }

    public void turbo() {
        if(isStart == true) {
            isTurbo = true;
            ImageIcon referencia = new ImageIcon("res//nave2.png");
            imagem = referencia.getImage();
        }
    }

    public void restart() {
        isRestart = true;
        this.x = 184;
        this.y = 184;
        isStart = true;
    }
    
    public Rectangle getBounds() {
        return new Rectangle(x, y, largura, altura);
    }
 
    public void keyPressed(KeyEvent tecla) {
        int codigo = tecla.getKeyCode();

        if(codigo == KeyEvent.VK_ENTER) {
            start();
        }
        if(codigo == KeyEvent.VK_SPACE) {
            turbo();
        }
        if(codigo == KeyEvent.VK_A) {
            if(isTurbo == false) {
                tiroSimples();
            }
        }
        if(codigo == KeyEvent.VK_R) {
            restart();
        }
        if(codigo == KeyEvent.VK_UP) {
            dy = -3;
        }
        if(codigo == KeyEvent.VK_DOWN){
            dy = 3;
        }
        if(codigo == KeyEvent.VK_LEFT){
            dx = -3;
        }
        if(codigo == KeyEvent.VK_RIGHT){
            dx = 3;
        }

    }

    public void keyRelease(KeyEvent tecla) {
        int codigo = tecla.getKeyCode();

        if(codigo == KeyEvent.VK_UP) {
            dy = 0;
        }
        if(codigo == KeyEvent.VK_DOWN){
            dy = 0;
        }
        if(codigo == KeyEvent.VK_LEFT){
            dx = 0;
        }
        if(codigo == KeyEvent.VK_RIGHT){
            dx = 0;
        }

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Image getImagem() {
        return imagem;
    }

    public void setImagem(Image imagem) {
        this.imagem = imagem;
    }

    public List<Tiro> getTiros() {
        return tiros;
    }

    public boolean isVisivel() {
        return isVisivel;
    }

    public void setVisivel(boolean isVisivel) {
        this.isVisivel = isVisivel;
    }

    public boolean isTurbo() {
        return isTurbo;
    }

    public void setTurbo(boolean isTurbo) {
        this.isTurbo = isTurbo;
    }

    public boolean isStart() {
        return isStart;
    }

    public void setStart(boolean isStart) {
        this.isStart = isStart;
    }
    public boolean isRestart() {
        return isStart;
    }

    public void setRestart (boolean isStart) {
        this.isRestart = isRestart;
    }

}