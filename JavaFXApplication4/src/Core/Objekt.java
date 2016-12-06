package Core;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.shape.Circle;

/**
 *
 * @author Håkon
 */
public class Objekt extends Thread {

    private int x, y, speedX, speedY;
    private Circle circle;

    public Objekt(int initialX, int initialY) {
        x = initialX;
        y = initialY;
        speedX = (int) (Math.random() * 20) + 10;
        speedY = (int) (Math.random() * 20) + 10;
        circle = new Circle();
        
    }

    @Override
    public void run() {
        while (true) {
            x += speedX;
            y += speedY;

            try {
                Thread.sleep((long) (Math.random() * 500));
            } catch (InterruptedException ex) {
                Logger.getLogger(Objekt.class.getName()).log(Level.SEVERE, null, ex);
            }
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

    public int getSpeedX() {
        return speedX;
    }

    public void setSpeedX(int speedX) {
        this.speedX = speedX;
    }

    public int getSpeedY() {
        return speedY;
    }

    public void setSpeedY(int speedY) {
        this.speedY = speedY;
    }

}
