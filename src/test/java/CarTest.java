import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    Car audi;
    Car ford;

    @BeforeEach
    public void setUp(){

        audi = new Car(4,5, 2, 2014, false, true);
        ford = new Car(4,5, 2, 2014, true, true);
    }

    // getters test
    @Test
    public void getNumberOfWheels(){
        assertThat(audi.getNumberOfWheel()).isEqualTo(4);
    }

    @Test
    public void getNumberOfSeats(){
        assertThat(audi.getNumberOfSeats()).isEqualTo(5);
    }

    @Test
    public void getEngineSize(){
        assertThat(audi.getEngineSize()).isEqualTo(2);
    }


    @Test
    public void getYear(){
        assertThat(audi.getYear()).isEqualTo(2014);
    }


    @Test
    public void getHeatedSeats(){
        assertThat(audi.hasHeatedSeats()).isEqualTo(false);
    }

    @Test
    public void getBluetooth(){
        assertThat(audi.hasBluetooth()).isEqualTo(true);
    }


    @Test
    public void getHeatedSeatsStatus(){
        assertThat(audi.getHeatedSeatsStatus()).isEqualTo(false);
    }

    @Test
    public void getBluetoothStatus(){
        audi.turnOnBluetooth();
        assertThat(audi.getBluetoothStatus()).isEqualTo(true);
    }


    //inherited methods test
    // abstract move test
    // inherited stop test

    @Test
    public void canMove(){
        assertThat(audi.move()).isEqualTo("I moved");
    }


    @Test
    public void canStop(){
        assertThat(audi.stop()).isEqualTo("I stopped");
    }



    // IDrive interface methods test
    // drive method
    @Test
    public void canDrive(){
        assertThat(audi.drive(2)).isEqualTo("The car has driven 2m");
    }

    @Test
    public void canTurnOnSeats(){
        ford.turnOnHeatedSeats();
        assertThat(ford.getHeatedSeatsStatus()).isEqualTo(true);
    }
}
