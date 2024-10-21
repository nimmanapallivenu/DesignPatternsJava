package creational.builder.components;

public class Engine {
    private double volume;
    private double mileage;
    private boolean started;

    public Engine(double volume,double mileage){
        this.volume = volume;
        this.mileage = mileage;
    }

    public void on(){
        started= true;
    }

    public void off(){
        this.started= false;
    }

    public void go(double mileage){
        if(started){
            this.mileage +=mileage;
        }else{
            System.out.println("Canno't go(), you must start engine first!...");
        }
    }

    public double getMileage(){
        return mileage;
    }

    public double getVolume(){
        return volume;
    }
}
