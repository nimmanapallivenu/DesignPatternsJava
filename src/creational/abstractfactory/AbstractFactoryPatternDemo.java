package creational.abstractfactory;

import creational.abstractfactory.button.Button;
import creational.abstractfactory.checkbox.CheckBox;
import creational.abstractfactory.factory.GUIFactory;
import creational.abstractfactory.factory.MacOsFactory;
import creational.abstractfactory.factory.WindowsOsFactory;

//Abstract Factory is a creational design pattern,
//which solves the problem of
//creating entire product families without
//specifying their concrete classes.
public class AbstractFactoryPatternDemo {

    private static App configurationApp() {
        App app;
        GUIFactory guiFactory;
        String osName = System.getProperty("os.name").toLowerCase();
        if ("mac".equals(osName)) {
            guiFactory = new MacOsFactory();
        } else {
            guiFactory = new WindowsOsFactory();
        }
        app = new App(guiFactory);
        return app;
    }

    public static void main(String[] args) {
        App app = configurationApp();
        app.paint();
    }
}


class App {
    private Button button;
    private CheckBox checkbox;

    public App(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}















