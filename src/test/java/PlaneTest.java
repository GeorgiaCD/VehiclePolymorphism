import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PlaneTest {


    Plane airplane;

    @BeforeEach
    public void setUp(){
        airplane = new Plane(4,5, 2, 2014, 2);
    }

    // getters test
    @Test
    public void getNumberOfWheels(){
        assertThat(airplane.getNumberOfWheel()).isEqualTo(4);
    }




    // abstract move test

    @Test
    public void canMove(){
        assertThat(airplane.move()).isEqualTo("Im taking off");
    }

    // inherited stop test
    @Test
    public void canStop(){
        assertThat(airplane.stop()).isEqualTo("Im landing");
    }

    //stop method overloading test
    @Test
    public void canEmergencyStop(){
        assertThat(airplane.stop(true)).isEqualTo("Im emergency landing in the sea!!!");
    }



    // IFly interface methods test
    // fly method
    @Test
    public void canFly(){
        assertThat(airplane.fly(123456)).isEqualTo("The plane has flew 123456m");
    }




}
