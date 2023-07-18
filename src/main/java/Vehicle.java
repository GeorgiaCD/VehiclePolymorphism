public abstract class Vehicle {
    protected int numberOfWheels;
    protected int numberOfSeats;
    protected int engineSize;
    protected int year;

    public Vehicle(int numberOfWheels, int numberOfSeats, int engineSize, int year){
    this.numberOfWheels = numberOfWheels;
    this.numberOfSeats = numberOfSeats;
    this.engineSize   =  engineSize;
    this.year = year;
    }

    public String move(){
            return "I moved";
    }

    public String stop(){
            return "I stopped";
    }




}
