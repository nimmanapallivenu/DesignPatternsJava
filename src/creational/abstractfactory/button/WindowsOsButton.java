package creational.abstractfactory.button;

public class WindowsOsButton implements Button {

    @Override
    public void paint() {
        System.out.println("Windows Os Button");
    }
}

