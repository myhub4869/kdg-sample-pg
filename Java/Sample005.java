import java.util.Random;

public class Sample005 {
    public static void main(String[] args) {
        Random random = new Random();

        int money = random.nextInt(100);
        int love = random.nextInt(100);
        int health = random.nextInt(100);
        int total = (money + love + health) / 3;

        System.out.println("金運: "+money);
        System.out.println("恋愛運: "+love);
        System.out.println("健康運: "+health);
        System.out.println("総合運: "+total);
    }
}
