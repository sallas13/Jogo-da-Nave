import java.awt.Image;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.ImageIcon;

public class Stars {
 
    private Image imagem;
    private int x, y;
    private int largura, altura;
    private boolean isVisivel;

    //private static final int LARGURA = 720;
    private static int VELOCIDADE = 3;

    public Stars(int x, int y) {
        this.x = x;
        this.y = y;
        isVisivel = true;
    }

    public void load() {
        ImageIcon referencia = new ImageIcon("res//estrela.png");
        imagem = referencia.getImage();

        this.largura = imagem.getWidth(null);
        this.altura = imagem.getHeight(null);
    }

    public void update() {
        
        if(this.x < 0) {
            this.x = largura;
            Random a = new Random();
            int m = a.nextInt(500);
            this.x = m + 736;
            Random r = new Random();
            int n = r.nextInt(460);
            this.y = n;
        } else {
                this.x -= VELOCIDADE;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isVisivel() {
        return isVisivel;
    }

    public void setVisivel(boolean isVisivel) {
        this.isVisivel = isVisivel;
    }

    public static int getVELOCIDADE() {
        return VELOCIDADE;
    }

    public static void setVELOCIDADE(int vELOCIDADE) {
        VELOCIDADE = vELOCIDADE;
    }

    public Image getImagem() {
        return imagem;
    }

    public void setImagem(Image imagem) {
        this.imagem = imagem;
    }
}
