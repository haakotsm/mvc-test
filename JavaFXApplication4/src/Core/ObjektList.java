package Core;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Mummitrollet on 09.07.2016.
 */
public class ObjektList {

    private final List<Objekt> objektList;
    private int amountObjekts;

    public ObjektList() {
        objektList = new LinkedList<>();
        amountObjekts = 0;
    }

    public void addObjekt(int x, int y) {
        objektList.add(new Objekt(x, y));
        amountObjekts++;
    }

    public void removeOjekt(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= amountObjekts) {
            throw new IndexOutOfBoundsException();
        }
        objektList.remove(index);
        amountObjekts--;
    }

    public void startObjekts() {
        if (!objektList.isEmpty()) {
            objektList.stream().forEach((o) -> {
                o.start();
            });
        } else {
            System.out.println("Nothing to start, create some objekts");
        }
    }

    public void killObjekts() {
        if (!objektList.isEmpty()) {
            objektList.stream().forEach((thread) -> {
                try {
                    thread.join();
                } catch (InterruptedException ex) {
                    Logger.getLogger(ObjektList.class.getName()).log(Level.SEVERE, null, ex);
                }
            });

        } else {
            System.out.println("Nothing to kill");
        }
        objektList.clear();
    }

    public int getAmountObjekts() {
        return amountObjekts;
    }

    public Objekt getObjekt(int index) {
        return objektList.get(index);
    }

}
