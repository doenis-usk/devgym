import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

public class OptionalChallenge3 {
    public static void main(String[] args) {
        Optional<String> value = Optional.of("d'oh");

        AtomicInteger dotQtd = new AtomicInteger(999);
        AtomicInteger eatMyShortsQtd = new AtomicInteger(500);

        // ifPresentOrElse​(Consumer<? super T> action, Runnable emptyAction)
        // というか第2引数はRunnableなの？
        // emptyAction.run()が呼ばれているけど、どういうことだろう？
        value.ifPresentOrElse(v -> dotQtd.incrementAndGet(), eatMyShortsQtd::incrementAndGet);

        // つまりは以下と同じだよね。
        // 自動でRunnableにくるんでくれるのかな。
//        value.ifPresentOrElse(v -> dotQtd.incrementAndGet(), new Runnable() {
//            @Override
//            public void run() {
//                eatMyShortsQtd.incrementAndGet();
//            }
//        });
        System.out.println(value.get() + (dotQtd.get() + eatMyShortsQtd.get()));
    }
}
