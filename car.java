/**
 * car
 */
public class car {

    @Override
    public String toString() {
        return "car [model=" + model + ", weight=" + weight + ", location=" + location + "]";
    }

    private String model;
    private int weight;
    private String location;

    public car(String model, int weight) {
        this.model = model;
        this.weight = weight;

    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public String getLocation() {
        return location;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}

class bus extends car {

    public bus(String model, int weight) {
        super(model, weight);

    }

}

class truck extends car {

    public truck(String model, int weight) {
        super(model, weight);
    }

}