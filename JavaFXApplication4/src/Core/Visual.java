package Core;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.effect.Light;
import javafx.scene.effect.Lighting;
import javafx.scene.paint.Color;

/**
 * Created by Mummitrollet on 09.07.2016.
 */
public class Visual {

    private GraphicsContext gc;
    private int size = 60;

    public Visual(GraphicsContext gc) {

        this.gc = gc;

        setColor(Color.WHITE);
    }

    public void setShapeSize(int size) {
        this.size = size;
    }

    public void spawnShape(int x, int y) {

        gc.setEffect(new Lighting());
        gc.setEffect(new Lighting(new Light.Distant(23.4, 34.9, Color.YELLOW)));
        gc.fillOval(x, y, size, size);

    }

    public void clearOld() {

        gc.clearRect(0, 0, gc.getCanvas().getHeight() * 100, gc.getCanvas().getWidth() * 100);
    }

    public void setColor(Color color) {

        gc.setFill(color);

    }

}
