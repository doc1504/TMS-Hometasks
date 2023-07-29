import java.util.Arrays;

public class Director extends Employee {

    public Director(String name, String secondName, int experience) {
        super(name, secondName, experience);
    }

    @Override
    public Position getPosition() {
        return Position.DIRECTOR;
    }

    Employee[] employees = new Employee[10];

    public void addEmployee(Employee toAdd){
        for( int i = 0; i < employees.length; i++){
            if (employees[i] == null){
                employees[i] = toAdd;
                break;
            }
        }
    }
    public int getCount(){
        int result = 0;
        for(Employee employee : employees){
            if(employee != null){
                result = result+1;
            }
        }
        return result;
    }

    @Override
    public int getSalary() {
        return basis * Position.DIRECTOR.coefficient * experience * getCount();
    }

    @Override
    public String toString() {
        return "Director{" +
                "employees=" + Arrays.toString(employees) +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", experience=" + experience +
                '}';
    }
}
