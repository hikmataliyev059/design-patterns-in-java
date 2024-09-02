package az.classes.AdapterDesignPattern.example2;

// Client class that uses the Target interface
public class Client {
    private Target target;

    public Client(Target target) {
        this.target = target;
    }

    public void makeRequest() {
        target.request();
    }
}
