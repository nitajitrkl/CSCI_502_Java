public class Locker {
    public Locker (double aValue, String aName){
        value = aValue;
        name = aName;
    }
    public double getValue() {
        return value;
    }

    public String getName(){
        return name;
    }

    private final double value;
    private final String name;
}
