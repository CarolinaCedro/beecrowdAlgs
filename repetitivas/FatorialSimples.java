package repetitivas;

import java.util.Scanner;

public class FatorialSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, fat;

        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            N *= (N - i);
        }
    }
}
