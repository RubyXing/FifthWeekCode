package homework1;/*
 * @author Xingqilin
 *
 */

public class  CreditCard {
    private  double cmoney;

    @Override
    public String toString() {
        return "CreditCard{" +
                "cmoney=" + cmoney +
                '}';
    }

    public CreditCard() {
    }

    public CreditCard(double cmoney) {
        this.cmoney = cmoney;
    }

    public double getCmoney() {
        return cmoney;
    }

    public  void setCmoney(double cmoney) {
        this.cmoney = cmoney;
    }
}
