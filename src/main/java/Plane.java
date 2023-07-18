public class Plane extends Vehicle {
        private int numberOfWigs;

        public Plane(int numberOfWheels, int numberOfSeats, int engineSize, int year,int inputNumberOfWigs ) {
            super(numberOfWheels, numberOfSeats, engineSize, year);
            this.numberOfWigs = inputNumberOfWigs;
        }


    @Override
    public String move(){
        return "...";
    }

    @Override
    public String stop(){
        return "...";
    }

}
