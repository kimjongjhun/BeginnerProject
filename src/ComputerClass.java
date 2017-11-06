class Computer {
    Computer() {
        System.out.println("Constructor of Computer class.");
    }

    void computer_method() {
        System.out.println("Power gone! Shut down your PC soon...");
    }

    public static void main(String[] args) {
        Computer my = new Computer();
        Laptop your = new Laptop();

        my.computer_method();
        your.laptop_method();
    }
}
// I don't get this one yet, too advanced. Multiple classes in the same program
// Why is it puting the computer class firs then laptop class then power gone! then 99% battery available.

class Laptop {
    Laptop() {
        System.out.println("Constructor of Laptop class.");
    }

    void laptop_method() {
        System.out.println("99% Battery available.");
    }
}