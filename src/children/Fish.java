package children;

public class Fish {

    private String habitat;
    private boolean withGills;

    public Fish(){
        super();
        this.habitat = "Sea water";
        this.withGills = true;
    }

    public Fish(double height, double weight, String animalType, String bloodType, String habitat, boolean withGills) {
        super(height, weight, animalType, bloodType);
        this.habitat = habitat;
        this.withGills = withGills;
    }

    public String getHabitat() {
        return habitat;
    }

    public boolean isWithGills() {
        return withGills;
    }
    
}
