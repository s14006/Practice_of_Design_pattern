package Decorator;

/**
 * Created by kabotya on 15/06/24.
 */
public class DecoratorMain {

    public DecoratorMain() {


        Decorator.Display b1 = new Decorator.StringDisplay("Hello, world.");
        Decorator.Display b2 = new SideBorder(b1, '#');
        Decorator.Display b3 = new FullBorder(b2);

        b1.show();
        b2.show();
        b3.show();

        Decorator.Display b4 =
                new SideBorder(
                        new FullBorder(
                                new FullBorder(
                                        new SideBorder(
                                                new FullBorder(
                                                        new Decorator.StringDisplay("こんにちは")
                                                ),
                                                '*'
                                        )
                                )
                        ),
                        '/'
                );

        b4.show();
    }
}
