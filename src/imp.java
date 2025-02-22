package src;

public class imp {
    public static void main(String[] args) {
        SharedClass sharedClass = new SharedClass();

        Thread thread1 = new Thread(() -> sharedClass.method1());
        Thread thread2 = new Thread(() -> sharedClass.method2());

        thread1.start();
        thread2.start();
    }

    private static class SharedClass {
        int a = 0;
        int b = 0;

        public void method1() {
            int local1 = a;
            this.b = 1;
        }

        public void method2() {
            int local2 = b;
            this.a = 2;
        }
    }
}
