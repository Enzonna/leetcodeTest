package extendsHomework;

import java.util.Base64;

/**
 * Package: extendsHomework
 * Description:
 *
 * @Author ENZO
 * @Create 2024��4��16�� 14:10
 */
public class CreditCard extends DepositCard {
    private double maxOverdraft;//����������͸֧���
    private double overdraft;//������͸֧���

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
            System.out.println("������͸֧���");
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
            System.out.println("������Ϊ����");
            return;
        }
        //��������͸֧���
        if(money <= overdraft){
            overdraft -= money;
            return;
        }
        //��������͸֧������ʣ��
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
