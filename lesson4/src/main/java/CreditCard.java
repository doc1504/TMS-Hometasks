public class CreditCard {

    int accNumb;
    int accSum;

    public CreditCard(int accNumb, int accSum){
        this.accNumb = accNumb;
        this.accSum = accSum;
    }

    public int incr(int value1) {
        int result1 = accSum + value1;
        accSum = accSum + value1;
        return result1;
    }
    public int decr(int value2) {
        int result2 = accSum - value2;
        accSum = accSum - value2;
        return result2;
    }
    public void count() {
        System.out.println("Номер счета " + accNumb + " " + "Текущая сумма " + accSum );
    }
}
