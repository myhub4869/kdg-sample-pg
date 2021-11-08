import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sample003 {
    public static void main(String[] args) throws Exception {
        String namae = "";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("お名前は？：");
        namae = bufferedReader.readLine();
        System.out.println(namae + "さん、こんにちは！");
    }
}
