package children;

public class Rapitile {

    private String skinType;
    private String skeletalstructure;
    private String eggType;

    public Reptile() {
        super();
        this.skinType = "Dry Skin";
        this.skeletalStructure = "Vertebrae";
        this.eggType = "Soft-shelled Eggs";
    }

    public Reptile(double height, double weight, String animalType, String bloodType, String skinType,
            String skeletalStructure, String eggType) {
        super(height, weight, animalType, bloodType);
        this.skinType = skinType;
        this.skeletalStructure = skeletalStructure;
        this.eggType = eggType;
    }

    public String getSkinType() {
        return skinType;
    }

    public String getSkeletalStructure() {
        return skeletalStructure;
    }

    public String getEggType() {
        return eggType;
    }

}
