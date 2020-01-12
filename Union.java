
public enum Union {
    And("И"),
    What("Что"),
    This("это"),
    How(", как"),
    Only("только"),
    Maybe(",может быть,"),
    If(",если");

    private String world;

    Union(String world){
        this.world = world;
    }

    public String getWorld(){
        return this.world;
    }
}