package extendsHomework;

/**
 * Package: extendsHomework
 * Description:
 *
 * @Author ENZO
 * @Create 2024��4��16�� 14:03
 */
public class DepositCard {
    private String id;
    private double balance;

    public DepositCard() {
    }

    public DepositCard(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double money) {
        if (money < 0) {
            System.out.println("ȡ�����Ϊ������");
            return;
        } else if (money > balance) {
            System.out.println("���㣡");
            return;
        } else {
            balance -= money;
        }
    }

    public void save(double money) {
        if (money < 0) {
            System.out.println("������Ϊ������");
            return;
        }
        balance += money;
    }

    @Override
    public String toString() {
        return "DepositCard{" +
                "id='" + id + '\'' +
                ", balance=" + balance +
                '}';
    }
}
