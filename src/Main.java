public class Main {
    public static void main(String[] args) {
       Account account = new Account(0);
       account.getCurrent();
       account.put(1000);
       account.getCurrent();
       account.take(2000);
    }
}