package patterns;

public class WorkWithAnimals {
    public static void main(String[] args) {
        Dog fido = new Dog();
        fido.setName("Fido");
        System.out.println(fido.getName());
        fido.digHole();
        fido.setWeight(-1);
        // Java everything is pass by value
        int ranNum = 10;
        fido.changeVar(ranNum);
        System.out.println("RanNum After method call " + ranNum);

        // Java Objects Pass by Reference
        changeObjectName(fido);
        System.out.println("After name change : " + fido.getName());

    }

    public static void changeObjectName(Dog dog) {
        dog.setName("Marcus");
    }

}
