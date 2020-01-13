import com.SoldOut;
import com.Ticketer;

public class Launcher2 {


    public static void main(String[] args) {
        Ticketer tick = new Ticketer(100);
        SoldOut so1 = new SoldOut(tick);
        SoldOut so2 = new SoldOut(tick);

        so1.start();
        so2.start();
    }
}
