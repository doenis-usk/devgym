import java.util.function.*;

public class JediDarkSideFight {
    public static void main(String[] args) {
        String luke = "useSaber";
        Supplier<String> yoda = () -> "useForce";

        UnaryOperator<String> fightEmpire = luke::concat;
        UnaryOperator<String> fightDarkSide = String::toUpperCase;

        BiFunction<UnaryOperator<String>, UnaryOperator<String>, Function<String, String>> attackDarkSide = Function::andThen;

        String finalAttack = attackDarkSide.apply(fightEmpire, fightDarkSide).apply(yoda.get());

        Consumer<String> consumeForce = System.out::println;
        consumeForce.accept(finalAttack);
    }
}
