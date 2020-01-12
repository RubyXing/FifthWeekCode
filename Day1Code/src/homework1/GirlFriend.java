package homework1;/*
 * @author Xingqilin
 *
 */

import static java.lang.Thread.sleep;

public class GirlFriend implements Runnable {
    CreditCard gcard;

    public GirlFriend(CreditCard gcard) {
        this.gcard = gcard;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "gcard=" + gcard +
                '}';
    }

    public CreditCard getGcard() {
        return gcard;
    }

    public void setGcard(CreditCard gcard) {
        this.gcard = gcard;
    }

    @Override
    public void run() {
        try {
            for (int i=0;i<10;i++){
            synchronized (CreditCard.class){
                gcard.setCmoney(gcard.getCmoney()-80);
                System.out.println(toString());
                sleep(200);
            }}
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
