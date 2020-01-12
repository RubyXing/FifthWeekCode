package homework1;/*
 * @author Xingqilin
 *
 */

import static java.lang.Thread.sleep;

public class BoyFriend implements Runnable {
    CreditCard bcard;

    public BoyFriend(CreditCard bcard) {
        this.bcard = bcard;
    }

    @Override
    public String toString() {
        return "BoyFriend{" +
                "bcard=" + bcard +
                '}';
    }

    public CreditCard getBcard() {
        return bcard;
    }

    public void setBcard(CreditCard bcard) {
        this.bcard = bcard;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                synchronized (CreditCard.class) {
                    bcard.setCmoney(bcard.getCmoney() + 200);
                    System.out.println(toString());
                    sleep(200);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
