public class Car extends Vehicle {
    private boolean heatedSeats;
    private boolean bluetooth;


    public Car(int numberOfWheels, int numberOfSeats, int engineSize, int year, boolean heatedSeats, boolean turnBluetoothOn) {
        super(numberOfWheels, numberOfSeats, engineSize, year);
        this.heatedSeats = heatedSeats;
        this.bluetooth = turnBluetoothOn;
    }

//    public void heatSeats(){
//        heatedSeats = true;
//    }

}
