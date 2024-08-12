import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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


        // Step 04
//        Random future1Sleep = new Random();
//        int randomNumber = future1Sleep.nextInt(10000 - 1000) + 1000;
//        Random future2Sleep = new Random();
//        int randomNumber2 = future2Sleep.nextInt(10000 - 1000) + 1000;
//
//                CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
//            try {
//
//                Thread.sleep(randomNumber);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            return "Hello, ";
//        });
//        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
//            try {
//
//                Thread.sleep(randomNumber2);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            return "World!";
//        });
//
//
//        try {
//            CompletableFuture<String> combinedFuture = future1.thenCombine(future2, (s1, s2) -> s1 + s2);
//            if (randomNumber + randomNumber2 > 10000) {
//                throw new Exception("Combined sleep time exceeds 10 seconds");
//
//            } else {
//                System.out.println(combinedFuture.get() + "\n" + "Completed after: " + (randomNumber + randomNumber2) / 1000 + " seconds.");
//            }
//        }
//        catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

        // Step 05**

        String data = "85671 34262 92143 50984 24515 68356 77247 12348 56789 98760";
        String[] numbers = data.split(" ");
        List<BigInteger> dataList = new ArrayList<>();


        //Method for parsing string
        CompletableFuture<Void> parseString
        for (String number : numbers) {
            dataList.add(BigInteger.valueOf(Long.parseLong(number)));
        }

        //Method for printing result
        CompletableFuture<Void> printFactorialResults
        for (int i = 0; i < dataList.size(); i++) {
            System.out.println(calculateFactorial(dataList.get(i)));
        }




//        CompletableFuture<List<BigInteger>> future5 = CompletableFuture.supplyAsync(() -> {
//            List dT = new ArrayList<>();
//                    dT = dataList.stream()
//                    .map(n -> {calculateFactorial(n); return n;})
//                    .toList();
//            return dT;
//        });






//        CompletableFuture<Void> factorials = CompletableFuture.supplyAsync(() -> calculateFactorial(dataList.get(0)))
//                        .thenApplyAsync()
//        factorials.thenAccept(result -> System.out.println(result));







    }

    // Step 05**


//public static List<BigInteger> getBigIntFromArray(List<BigInteger> dataList) {
//    CompletableFuture.runAsync(() -> {
//        List<BigInteger> factorialResults = Stream.of(dataList)
//                .map(Main::calculateFactorial())
//                .collect(Collectors.toList());
//
//        }
//    }


    private static BigInteger calculateFactorial(BigInteger num) {
        BigInteger result = BigInteger.ONE;
        for (BigInteger i = BigInteger.ONE; i.compareTo(num) <= 0; i = i.add(BigInteger.ONE)) {
            result = result.multiply(i);
        }
        return result;
    }

}
