
import java.util.Scanner;

public class primos {

    public static void main(String arg[]) {
        int n, i, j, cp, cn, c;
        int v[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantidad de primos");
        n = sc.nextInt();
        v=new int[n];
        cp = 0;
        cn = 2;
        j = 0;
        while (cp < n) {
            c = 0;
            i=1;
            while(i<= cn) {
                if (cn % i == 0) {
                    c = c + 1;
                }
              i++;  
            }
            if (c == 2) {
                v[j] = cn;
                j = j + 1;
                cp = cp + 1;
            }
            cn = cn + 1;
        }
        i=0;
        while(i < n) {
            System.out.println(" " + v[i]);
            i++;
        }
    }
}
