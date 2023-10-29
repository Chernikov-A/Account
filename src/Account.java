import javax.naming.InsufficientResourcesException;

public class Account implements InterfaceCard{
    protected double balance;

    public Account(double balance) throws IllegalArgumentException {
        if (balance >=0){
            this.balance = balance;
        }else {throw new IllegalArgumentException("Невозможно создать счёт с отрицательным значением!!!!");}

    }

    @Override
    public double getCurrent() {
        System.out.println("Баланс вашего счета: " + this.balance);
        return this.balance;
    }

    @Override
    public void put(double amount) throws  IllegalArgumentException {
            if (amount >= 0 ){
                balance += amount;
                System.out.println("Операция успешно прошла: " + balance);
            }else {
                throw new IllegalArgumentException("Невозможно внести отричательное число");
//
            }
    }

    @Override
    public void take(double amount) throws RuntimeException{

            if (this.balance < amount){
                throw new RuntimeException("Невозможно снять средств. " + "Ваш баланс: " + balance);
            }else {
                this.balance -= amount;
                System.out.println("Списание успешно прошло.\n Ваш текущий баланс: "+ amount);
            }

    }
}
