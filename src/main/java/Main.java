import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // Step 01
//        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            return "Hello, world!";
//        });
//        future.join();
//        future.thenAccept(result -> System.out.println(result));

//        // Step 02
//        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            return "Hello, ";
//        });
//        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            return "World!";
//        });
////        future1.join();
////        future2.join();
//        future1.get();
//        future2.get();
//
//        future1.thenAccept(result -> System.out.print(result));
//        future2.thenAccept(result -> System.out.println(result));
//
//        // Step 03
//
//
//        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            return "Hello, ";
//        });
//        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            return "World!";
//        });
//
//
//        CompletableFuture<String> combinedFuture = future1.thenCombine(future2, (s1, s2) -> s1 + s2);
//
//        System.out.println(combinedFuture.get());


        //Step 04
        Random future1Sleep = new Random();
        int randomNumber = future1Sleep.nextInt(10000 - 1000) + 1000;
        Random future2Sleep = new Random();
        int randomNumber2 = future2Sleep.nextInt(10000 - 1000) + 1000;

                CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            try {

                Thread.sleep(randomNumber);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello, ";
        });
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            try {

                Thread.sleep(randomNumber2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "World!";
        });


        try {
            CompletableFuture<String> combinedFuture = future1.thenCombine(future2, (s1, s2) -> s1 + s2);
            if (randomNumber + randomNumber2 > 10000) {
                throw new Exception("Combined sleep time exceeds 10 seconds");

            } else {
                System.out.println(combinedFuture.get() + "\n" + "Completed after: " + (randomNumber + randomNumber2) / 1000 + " seconds.");
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }










    }
}
