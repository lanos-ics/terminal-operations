import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class AppRunner {
    public static void main(String[] args) {

//        PaymentGateway pg = new CreditCardPayment();
//        PaymentGateway pg = new UpiPayment();
//        Checkout ck = new Checkout(pg);
//
//        ck.checkoutPayment(1256);

        Game game = new Contra();

        GamingConsole console = new GamingConsole(game);
        console.runGame();



    }
}
