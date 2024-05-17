package creationalpattern.singleton;

public enum Printer {
    //enum accurate thread safe, when 2 threads try creating instance.
    INSTANCE;

    private Printer() {}

    public static Printer getInstance() {
        return INSTANCE;
    }

    public void print() {
        System.out.println("Printer class");
    }
}
