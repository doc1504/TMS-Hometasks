public class Main {

    public static void main(String[] args) {

        CreditCard card1 = new CreditCard(56835656,5000);
        CreditCard card2 = new CreditCard(45873429,10000);
        CreditCard card3 = new CreditCard(34873547,25000);

        card1.count();
        card2.count();
        card3.count();

        card1.incr(600);
        card1.count();

        card2.incr(5000);
        card2.count();

        card3.decr(10000);
        card3.count();
    }
}
