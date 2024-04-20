package extendsHomework;

import java.util.Base64;

/**
 * Package: extendsHomework
 * Description:
 *
 * @Author ENZO
 * @Create 2024年4月16日 14:10
 */
public class CreditCard extends DepositCard {
    private double maxOverdraft;//当月最多可以透支额度
    private double overdraft;//本月已透支额度

    public CreditCard() {
    }

    public CreditCard(String id, double balance, double maxOverdraft, double overdraft) {
        super(id, balance);
        this.maxOverdraft = maxOverdraft;
        this.overdraft = overdraft;
    }

    public double getMaxOverdraft() {
        return maxOverdraft;
    }

    public void setMaxOverdraft(double maxOverdraft) {
        this.maxOverdraft = maxOverdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double money) {
        if (money > getBalance() + maxOverdraft - overdraft){
            System.out.println("超过可透支额度");
            return;
        }
        if(money <= getBalance()){
            super.withdraw(money);
            return;
        }
        overdraft += money - getBalance();
        setBalance(0);
    }

    @Override
    public void save(double money) {
        if(money < 0){
            System.out.println("存款金额不能为负数");
            return;
        }
        //偿还部分透支金额
        if(money <= overdraft){
            overdraft -= money;
            return;
        }
        //偿还所有透支金额，还有剩余
        setBalance(getBalance() + (money - overdraft));
        overdraft = 0;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "maxOverdraft=" + maxOverdraft +
                ", overdraft=" + overdraft +
                '}';
    }
}
