import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sample004 {
    public static void main(String[] args) throws Exception {
        int seibetu;
        String namae = "";

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("お名前は？：");
        namae = bufferedReader.readLine();

        System.out.println("性別は？：");
        System.out.println("1：男性");
        System.out.println("2：女性");
        seibetu = Integer.parseInt(bufferedReader.readLine());

        if( seibetu == 1 ) {
            System.out.println(namae + "くん、こんにちは！");
        } else if( seibetu == 2 ) {
            System.out.println(namae + "ちゃん、こんにちは！");
        }
    }
}
