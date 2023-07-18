public class Car extends Vehicle {
    private boolean heatedSeats;
    private boolean bluetooth;
    private boolean heatedSeatsOn;
    private boolean bluetoothOn;

    public Car(int numberOfWheels, int numberOfSeats, int engineSize, int year, boolean heatedSeats, boolean turnBluetoothOn) {
        super(numberOfWheels, numberOfSeats, engineSize, year);
        this.heatedSeats = heatedSeats;
        this.bluetooth = turnBluetoothOn;
        this.heatedSeatsOn = false;
        this.bluetoothOn = false;
    }

    public void turnOnHeatedSeats(){
        heatedSeatsOn = true;
    }

    public void turnOnBluetooth(){
        bluetoothOn = true;
    }

}
