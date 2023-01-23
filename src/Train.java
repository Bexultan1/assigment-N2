import java.util.ArrayList;


public class Train {
    private ArrayList<Vagon> vagons;
    private int maxVagon;
    private String name;
    private int id = 1;
    private ArrayList<Passenger> passengers;

    public ArrayList<Vagon> getVagons() {
        return vagons;
    }
    public Vagon getVagon(int index){
        return vagons.get(index);
    }

    public void setVagons(ArrayList<Vagon> vagons) {
        this.vagons = vagons;
        for(Vagon vagon: this.vagons){
            vagon.setId(id);
            id++;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxVagon() {
        return maxVagon;
    }

    public void setMaxVagon(int maxVagon) {
        this.maxVagon = maxVagon;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }
}
