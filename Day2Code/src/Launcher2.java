import com.SoldOut;
import com.Ticketer;

import java.util.concurrent.locks.ReentrantLock;

public class Launcher2 {


    public static void main(String[] args) {
        Ticketer tick = new Ticketer(100);
        Ticketer tick2 = new Ticketer(100);

        ReentrantLock reen = new ReentrantLock();
        SoldOut so1 = new SoldOut(tick);
        SoldOut so2 = new SoldOut(tick);
        SoldOut so3 = new SoldOut(tick2);


        so1.start();
        so2.start();
        so3.start();
    }
}
