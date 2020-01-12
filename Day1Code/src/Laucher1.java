import com.ThradeDemo;
import homework1.BoyFriend;
import homework1.CreditCard;
import homework1.GirlFriend;
import homework1.Lovers;


public class Laucher1 {
    public static void main(String[] args) {
        CreditCard card=new CreditCard(1000);
        GirlFriend gl=new GirlFriend(card);
        BoyFriend bf=new BoyFriend(card);
        Lovers ls=new Lovers(card);
        Thread t1=new Thread(bf);
        Thread t2=new Thread(gl);
        ls.start();
        t1.start();
        t2.start();

    }
}

