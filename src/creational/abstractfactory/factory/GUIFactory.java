package creational.abstractfactory.factory;

import creational.abstractfactory.button.Button;
import creational.abstractfactory.checkbox.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}