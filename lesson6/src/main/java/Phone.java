public class Phone {
    int number;
    String model;
    int weight;

    public Phone(int number, String model, int weight){
        this(60,"LG");
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model){
        this.number = number;
        this.model = model;
    }
    public Phone(){

    }

    public void doPrint(){
        System.out.println("Номер " + number + " Модель " + model + " Вес " + weight);
    }
    public void receiveCall(String callerName){
        System.out.println("Звонит " + callerName);
    }
    public void receiveCall(String callerName, int number){
        System.out.println("Вам звонит " + callerName + " номер телефона " + number);
    }
    public int getNumber() {
        System.out.println(number);
        return number;
    }
    public void sendMessage(int...numbers){
        System.out.println(number);
    }
}
