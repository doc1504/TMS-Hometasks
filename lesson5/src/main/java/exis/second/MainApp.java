package exis.second;

public class MainApp {
    public static void main(String[] args) {

        Print director = new Director();
        Print worker = new Worker();
        Print accountant = new Accountant();

        director.toPrint();

        worker.toPrint();

        accountant.toPrint();
    }
}
