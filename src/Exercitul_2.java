public class Exercitul_2 {
    public static void main(String[] args) {
        int n = 57;
        int pasi = 1;
        while(n!=1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
            pasi++;
        }
        System.out.println(pasi);
        }
    }

