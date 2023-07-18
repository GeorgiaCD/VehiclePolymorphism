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


    public String stop(){
            return "I stopped";
    }

// abstract method (maybe change the move as I only thought of two methods)
    public abstract String move();

    public int getNumberOfWheel(){
        return this.numberOfWheels;}

    public int getNumberOfSeats(){
        return this.numberOfSeats;}

    public int getEngineSize(){
        return this.engineSize;}

    public int getYear(){
        return this.year;}



}
