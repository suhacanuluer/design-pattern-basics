package creational.prototype.wargame.utils;

public class RandomUtils {
    public static int getRandBetweenNumbers(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static int getRandUpToNumber(int num) {
        return (int)(Math.random() * num);
    }
}
