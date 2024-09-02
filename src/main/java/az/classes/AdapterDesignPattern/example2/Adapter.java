package az.classes.AdapterDesignPattern.example2;

// Adapter class implementing the Target interface
// Target interfeysini həyata keçirən adapter classı
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        // Translate the request to the specificRequest of the adaptee
        adaptee.specificRequest();
    }
}
