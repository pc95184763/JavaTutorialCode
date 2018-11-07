package multithreading.createNewThread;

import java.util.concurrent.*;


public class CallableDemo {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<Double> future = executorService.submit(new PrintNumber());
        executorService.shutdown();
        while (!future.isDone()) {
            System.out.println("Thread Not finished!");
            System.out.println("Main thread do something else!");
        }
        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }


}

class PrintNumber implements Callable<Double> {

    @Override
    public Double call() throws Exception {
        Thread.sleep(5000);
        return Math.random();
    }
}