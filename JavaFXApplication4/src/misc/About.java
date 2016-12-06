package misc;

import javafx.scene.control.Alert;

/**
 * Created by Mummitrollet on 09.07.2016.
 */
public class About {

    public About(){

    }

    public void info(){

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("MovingShape");
        alert.setContentText("random tekst");
        alert.showAndWait();
    }


}

