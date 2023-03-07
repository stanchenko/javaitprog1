package lesson17;

public class Main {
    public static void main(String[] args) {
//        Computer comp = new Computer();
//        comp.i7.start();
//        comp.kingston.start();
//        comp.kingston.shutDown();

        new Computer() {
            void superComp () {
                this.i7.start();
                this.kingston.start();
            }
        };
        Computer server = new Computer();

    }
}
