import java.util.function.*;

public class BeerComparison {
    public static void main(String[] args) {
        Function<Integer, Predicate<Integer>> isGreaterThan = pivot -> number -> number > pivot;

        Supplier<Integer> moeSupplier = () -> {return 5;};
        Consumer<Object> homerConsumer = System.out::println;

        UnaryOperator<Integer> carlOperator = (c) -> Integer.valueOf(c);
        BinaryOperator<Integer> barneyOperator = Integer::sum;

        int beerSum = carlOperator.apply(5) + barneyOperator.apply(2, 2);

        System.out.println(moeSupplier.get());
        System.out.println(beerSum);
        homerConsumer.accept(isGreaterThan.apply(moeSupplier.get()).test(beerSum));
    }
}
