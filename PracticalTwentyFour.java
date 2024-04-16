  class A extends Thread {
    public void run() {
        int counter = 0;
        while (counter < 10) {
            System.out.println("HELLO, THIS IS CLASS A ");
            counter++;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);

            }
        }
    }
}

class B extends Thread {
    public void run() {
        int counter = 0;
        while (counter < 10) {
            System.out.println("HELLO, THIS IS CLASS B ");
            counter++;
        }
    }
}

class PracticalTwentyFour {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();

        objA.start();
        objB.start();

        int counter = 0;
        while (counter < 10) {
            System.out.println("HELLO, THIS IS CLASS C ");
            counter++;
        }
    }
}
