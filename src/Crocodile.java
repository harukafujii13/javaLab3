import children.Rapitile;

public class Crocodile extends Rapitile {

    
    
    public Crocodile() {
        super(1.5d, 1000.0d, "Raptile", "Cold-blooded", "Dry skin", "Vertebrae", "Hard-shelled eggs");
    }

    public String showInfo(){
        return
        "==================\n" +
        "Crocodile\n" +
        "==================\n" + 
        "height = " +getHeight() + "\n" +
        "weigth = " +getWeight() + "\n" +
        "animalType = " +getAnimalType() + "\n" +
        "bloodType = " + getBloodType() + "\n" +
        "skinType = " +getSkinType() + "\n" +
        "skeletalStructure = " +getSkeletalStructure() + "\n" +
        "eggType = " +getEggType();
    }

}
