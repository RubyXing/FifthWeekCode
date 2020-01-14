import com.Clients;
import com.Messages;
import com.SWtest;
import com.Servers;


public class Laucher3 {
    public static void main(String[] args) {
        Messages me = new Messages();
        Servers ser = new Servers(me);
        Clients cli = new Clients(me);

        cli.start();
        ser.start();


    }
}
