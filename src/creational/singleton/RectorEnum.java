package creational.singleton;

public enum RectorEnum implements RectorService{
    INSTANCE;

    public void work() {
        System.out.println("rector working");
    }
}
