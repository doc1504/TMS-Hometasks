public class FindWorker {

    public String finding (Director director, String workerName){

        for(Employee employee : director.employees){

            if (employee.getName() != null){
                if (employee.getName().equals(workerName)){
                    System.out.println("Found");
                    break;
                }else {
                    System.out.println("Not Found");
                }
            }
        }
        return workerName;
    }
}
