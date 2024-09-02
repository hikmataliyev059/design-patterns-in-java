package az.classes.AdapterDesignPattern.example2;

public class AdapterPatternDemo {

    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target adapter = new Adapter(adaptee);
        Client client = new Client(adapter);

        client.makeRequest();
    }
}
