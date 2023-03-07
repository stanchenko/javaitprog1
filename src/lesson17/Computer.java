package lesson17;

public class Computer {
    class Processor {
        private boolean isStart = false;

        public void start () {
            isStart = true;
            System.out.println("i7 onStatus: " + isStart);
        }

        public void shutDown () {
            isStart = false;
            System.out.println("i7 onStatus: " + isStart);
        }
    }

    class RAM {
        private boolean isStart = false;

        public void start () {
            isStart = true;
            System.out.println("RAM onStatus: " + isStart);
        }

        public void shutDown () {
            isStart = false;
            System.out.println("RAM onStatus: " + isStart);
        }
    }

    Processor i7 = new Processor();
    RAM kingston = new RAM();
}
