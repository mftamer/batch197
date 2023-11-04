package day15_dateandtime_enum_StringBuilder;
public enum MyClients {
    MR_ADAM(43,"brown","meat"),
    MISS_JANE(12,"dfsds","sfgdh"),
    MISS_MARRY(34,"sds","hfjj"),
    MR_JAKE(1,"sas","vfe");
    private final int age;
    private final String eyeColour;
    private  final String food;
    MyClients(int age, String eyeColour, String food){
        this.age= age;
        this.eyeColour= eyeColour;
        this.food = food;
    }
    public String getEyeColour() {
        return eyeColour;
    }
    public String getFood() {
        return food;
    }
    public int getAge() {
        return age;
    }
}