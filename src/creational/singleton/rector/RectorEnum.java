package creational.singleton.rector;

public enum RectorEnum implements RectorService{
    INSTANCE;

    public void work() {
        System.out.println("rector working");
    }
}
