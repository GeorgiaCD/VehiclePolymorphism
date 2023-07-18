import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MuseumTest {
    Museum museum;
    Car audi;
    Plane plane;

    @BeforeEach
    void setUp(){
        museum = new Museum("Vehicle Museum");

    }

    // no vehicles at the start
    @Test
    public void vehiclesStartCount(){
        assertThat(museum.countVehicles()).isEqualTo(0);
    }

    // can count add vehicles
    @Test
    public void vehiclesCount(){
        audi = new Car(4,5, 2, 2014, false, true);
        plane = new Plane(4,5, 2, 2014, 4);
        museum.addVehicles(audi);
        museum.addVehicles(plane);
        assertThat(museum.countVehicles()).isEqualTo(2);
    }
}
