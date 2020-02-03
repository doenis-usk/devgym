import java.util.function.Consumer;
import java.util.function.Supplier;

public class JokerCrazinessChallenger {
    static int jokerCrazinesss = 0;

    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> jokerCrazinesss++;

        Consumer<Integer> consumer = (batmanAttack) ->
                System.out.println(batmanAttack + jokerCrazinesss++);

        System.out.println(jokerCrazinesss + supplier.get());
        consumer.accept(1);
    }
}
