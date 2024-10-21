package creational.abstractfactory.button;

public class MacOsButton implements Button {

    @Override
    public void paint() {
        System.out.println("Mac Os Button");
    }
}