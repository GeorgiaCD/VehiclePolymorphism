import java.util.ArrayList;

public class Museum {

    private String name;
    private ArrayList<Vehicle> vehicles;

    public Museum(String name){
        this.name = name;
        this.vehicles = new ArrayList<>();
    }

    public int countVehicles(){
        return vehicles.size();
    }

    public void addVehicles(Vehicle newVehicle){
        this.vehicles.add(newVehicle);
    }



}

