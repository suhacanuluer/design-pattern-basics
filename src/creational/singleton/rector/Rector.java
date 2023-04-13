package creational.singleton.rector;

public class Rector {
    private static Rector rector = null;
    private String name;

    private Rector() {
        name = "Rector";
    }

    public static Rector getInstance() {
        if (rector == null) {
            rector = new Rector();
        }
        return rector;
    }

    public void work() {
        System.out.println(name + " working");
    }
}
