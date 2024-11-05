package patterns;

public class Dog extends Animal{

    public void digHole(){
        System.out.println("Hug a hole");
    }

    public Dog(){
        super();
        setSound("Bark");
    }

    public void changeVar(int ranNum){
        ranNum =12;
        System.out.println("RanNum in Method "+ ranNum);
    }

}
