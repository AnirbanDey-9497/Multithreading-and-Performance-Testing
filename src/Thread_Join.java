package src;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Thread_Join {

    public static void main(String[] args) {
        List<Long> inputNo= Arrays.asList(0L, 3435L, 35435L, 2324L, 4656L, 23L);

        List<FactorialThread> threads= new ArrayList<>();

        for (long input:inputNo)
        {
            threads.add(new FactorialThread(input));
        }

        for (Thread thread:threads)
        {
            thread.setDaemon(true);
            thread.start();
        }

        for (Thread thread:threads)
        {
            try {
                thread.join(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        for(int i=0; i<inputNo.size(); i++)
        {
            FactorialThread factorialThread=threads.get(i);
            if (factorialThread.isFinished()) {
                System.out.println("Factorial of " + inputNo.get(i) + " is: " + factorialThread.getResult());
            } else {
                System.out.println("Computation for " + inputNo.get(i) + " was not finished.");
            }
        }
    }

    public static class FactorialThread extends Thread
    {
        private long inputNumber;
        private BigInteger result= BigInteger.ZERO;

        private boolean isFinished=false;

        public  FactorialThread(long inputNumber)
        {
            this.inputNumber=inputNumber;
        }

        @Override
        public void run()
        {
            this.result=factorail(inputNumber);
            this.isFinished=true;
        }

        public  BigInteger factorail(long n)
        {
            BigInteger tempResult= BigInteger.ONE;

            for (long i=n; i>0; i--)
            {
                tempResult= tempResult.multiply(new BigInteger(Long.toString(i)));
            }
            return tempResult;
        }

        public boolean isFinished(){
            return isFinished;
        }

        public BigInteger getResult(){
            return result;
        }
    }
}
