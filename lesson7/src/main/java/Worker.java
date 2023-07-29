public class Worker extends Employee {

    public Worker(String name, String secondName, int experience) {
        super(name, secondName, experience);
    }

    @Override
    public Position getPosition() {
        return Position.WORKER ;
    }
}
