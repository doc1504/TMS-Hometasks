public abstract class Employee {
    String name;
    String secondName;
    int experience;
    int basis = 1000;

    public Employee(String name, String secondName, int experience){
        this.name = name;
        this.secondName = secondName;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public int getSalary(){
        return basis * Position.WORKER.coefficient * experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", experience=" + experience +
                ", getSalary=" + getSalary() +
                '}';
    }
}

