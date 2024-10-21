package creational.abstractfactory.factory;

import creational.abstractfactory.button.Button;
import creational.abstractfactory.button.MacOsButton;
import creational.abstractfactory.checkbox.CheckBox;
import creational.abstractfactory.checkbox.MacOsCheckbox;

public class MacOsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOsCheckbox();
    }
}
