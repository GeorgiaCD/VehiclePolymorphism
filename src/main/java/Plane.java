public class Plane extends Vehicle implements IFly{

    private int numberOfWigs;

    public Plane(int numberOfWheels, int numberOfSeats, int engineSize, int year,int inputNumberOfWigs ) {
        super(numberOfWheels, numberOfSeats, engineSize, year);
        this.numberOfWigs = inputNumberOfWigs;
    }


    @Override
    public String move(){
        return "Im taking off";
    }

    @Override
    public String stop(){
        return "Im landing";
    }

//  @Overloading
    public String stop(boolean isThisAnEmergency ){
        if(isThisAnEmergency == true){
        return "Im emergency landing in the sea!!!";}
        else {return "Im landing on land!";}
    }

    //interface method
    public String fly(int distance){
        return "The plane has flew " + distance + "m";
    }
}
