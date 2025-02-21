package src;

public class Thread_ThreadClass {

    public static void main(String[] args) {
        Thread thread= new NewThread();


        thread.start();
        }

        private static class NewThread extends Thread
        {
            @Override
            public void run(){
                System.out.println("We are now in thread"+ Thread.currentThread().getName());

            }
        }
}
