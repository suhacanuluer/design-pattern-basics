package creational.prototype.utils;

public class Utils {
    public static int getRand(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
