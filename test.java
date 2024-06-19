import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        int n;

        Scanner inp = new Scanner(System.in);

        System.out.println("Lutfen Bir Sayi Giriniz :");
        n = inp.nextInt();

        for (int i = 1; i <= n; i*=2) {
            System.out.println(i);
        }
    }
}





