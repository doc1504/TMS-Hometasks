public class MainApp {

    public static void main(String[] args) {
        Phone phone1 = new Phone(5623835, "Samsung", 90);
        Phone phone2 = new Phone(3456899, "Nokia", 60);
        Phone phone3 = new Phone(4565434, "Apple", 100);

        phone1.doPrint();
        phone2.doPrint();;
        phone3.doPrint();

        phone1.receiveCall("Ivan");
        int phone1Number = phone1.getNumber();
        phone2.receiveCall("Marina");
        int phone2Number = phone2.getNumber();
        phone3.receiveCall("Olya");
        int phone3Number = phone3.getNumber();

        phone1.receiveCall("Andrey",4567854);

        System.out.println("Сообщение будет отправлено по номерам: ");
        Phone[] phones = new Phone[] {phone1,phone2,phone3};
        for (Phone phone : phones) {
            phone.sendMessage();
        }

    }
}
