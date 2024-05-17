package creationalpattern.singleton;

class Main {
    public static void main(String[] args) {
        var printer = Printer.getInstance();
        printer.print();
    }
}