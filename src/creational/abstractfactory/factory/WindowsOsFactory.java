package creational.abstractfactory.factory;

import creational.abstractfactory.button.Button;
import creational.abstractfactory.button.WindowsOsButton;
import creational.abstractfactory.checkbox.CheckBox;
import creational.abstractfactory.checkbox.WindowOsCheckbox;

public class WindowsOsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsOsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowOsCheckbox();
    }
}
