package homework1;/*
 * @author Xingqilin
 *
 */

public class Lovers extends Thread {
    CreditCard lcrad;
    private Thread t;
    @Override
    public synchronized void start() {
        if (t == null) {
            t = new Thread (this, "Lovers");
            t.start ();
        }
    }

    @Override
    public void run() {
        try {for (int i=0;i<10;i++){
            synchronized (CreditCard.class){
            lcrad.setCmoney(lcrad.getCmoney()-60);
            System.out.println(toString());
            sleep(200);}}
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public CreditCard getLcrad() {
        return lcrad;
    }

    public void setLcrad(CreditCard lcrad) {
        this.lcrad = lcrad;
    }
    public Lovers(CreditCard lcrad){
        this.lcrad=lcrad;
    }

    @Override
    public String toString() {
        return "Lovers{" +
                "lcrad=" + lcrad +
                '}';
    }
}
