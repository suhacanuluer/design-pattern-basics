package creational.singleton.rector;

public class Test {
    public static void main(String[] args) {
        Rector rector1 = Rector.getInstance();
        Rector rector2 = Rector.getInstance();

        System.out.println(rector1 == rector2);
        rector1.work();
        rector2.work();

        RectorEnum.INSTANCE.work();
    }
}
