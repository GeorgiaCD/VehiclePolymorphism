public class Car extends Vehicle implements IDrive {

    private boolean heatedSeats;
    private boolean bluetooth;
    private boolean heatedSeatsOn;
    private boolean bluetoothOn;

    public Car(int numberOfWheels, int numberOfSeats, int engineSize, int year, boolean heatedSeats, boolean bluetooth) {
        super(numberOfWheels, numberOfSeats, engineSize, year);
        this.heatedSeats = heatedSeats;
        this.bluetooth = bluetooth;
        this.heatedSeatsOn = false;
        this.bluetoothOn = false;
    }

    //add move method
     public String move(){ return "I moved";}

    //interface method
    public String drive(int distance){
        return "The car has driven " + distance + "m";
    }



    //getters
    public boolean hasHeatedSeats(){
        return this.heatedSeats;}

    public boolean hasBluetooth(){
        return this.bluetooth;}

    //
    public boolean getHeatedSeatsStatus(){
        return this.heatedSeatsOn;}

    public boolean getBluetoothStatus(){
        return this.bluetoothOn;}


    //setters
    public void turnOnHeatedSeats(){
        heatedSeatsOn = true;
    }

    public void turnOnBluetooth(){
        bluetoothOn = true;
    }




}
