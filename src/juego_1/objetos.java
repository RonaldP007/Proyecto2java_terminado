package juego_1;
// here we create practically the positions of everything
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

public class objetos {

    protected Image nadador;
    //positions of the swimmer
    private int X;
    public int Y;

    private int velocidad_X;

    private int limite_izquierda = 0;
    private int limite_derecha;
    private int limite_superior = 0;

    public objetos(int x, int y) {
        //initials positions
        this.X = x;
        this.Y = y;
        //swimmers`s images
        nadador = new ImageIcon(getClass().getResource("images3.jpg")).getImage();
    }

    //Jpanel dimensions
    public int LimitesX(int width) {
        limite_derecha = width - nadador.getWidth(null);

        return limite_derecha;

    }

    //recalculate the image to give you an impression of movement
    public int mover() {
        //new position
        X += velocidad_X;
        //control the the image does not pass away of the limits

        if (X > limite_derecha) {
            X = limite_derecha;

        }
        return X;

    }

    public int VelocidadX() {
        //this is the velocity
        velocidad_X = NumeroRandom(20);
        

        return velocidad_X;
    }

    public int vel() {
        return velocidad_X;
    }

    public void dibujar(Graphics g) {
        //this draw the lines of panel to separate the athletics
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(nadador, X, Y, null);
        g2.setColor(Color.black);
        g2.drawLine(0, 100, 700, 100);
        g2.setColor(Color.black);
        g2.drawLine(0, 200, 700, 200);
        g2.setColor(Color.black);
        g2.drawLine(0, 300, 700, 300);
        g2.setColor(Color.black);
        g2.drawLine(0, 400, 700, 400);
    }

    //returning the first number and the max number
    private int NumeroRandom(int Max) {
        return (int) (Math.random() * Max + 1);
    }

}
