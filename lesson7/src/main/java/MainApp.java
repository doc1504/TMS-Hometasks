public class MainApp {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Ivan", "Socolov", 5);
        Worker worker2 = new Worker("Maria", "Orlova", 7);
        Worker worker3 = new Worker("Olga", "Vasiluk", 3);
        Director director = new Director("Alexandr", "Sidorov", 10);
        Director directorNext = new Director("Anna", "Hanna", 10);
        Worker worker4 = new Worker("Petr", "Kruglov", 4);

        String worker1String = worker1.toString();
        System.out.println(worker1String);
        String worker2String = worker2.toString();
        System.out.println(worker2String);
        String worker3String = worker3.toString();
        System.out.println(worker3String);
        String directorString = director.toString();
        System.out.println(directorString);

        director.addEmployee(worker1);
        director.addEmployee(worker2);

        String directorString1 = director.toString();
        System.out.println(directorString1);

        directorNext.addEmployee(worker4);
        director.addEmployee(directorNext);
        String directorString2 = director.toString();
        System.out.println(directorString2);

        FindWorker findWorker = new FindWorker();
        String finding = findWorker.finding(director, "Ivan");
        System.out.println(finding);

    }
}
