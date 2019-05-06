public class Exercitiul_10 {
    public static void main(String[] args) {
        int[] numere = {12, 3, 15, 23, 31, 67, 43, 15, 14};
        int sum = 0;
        int n = 0;

        while(n<=5) {
            for (int i = 0; i < numere.length; i++) {
                if (numere[i] % 2 == 0) {
                    sum = sum + numere[i];
                    n++;
                }
            }
        }

        if(n==5)    {
            System.out.println("Suma primelor 5 numere pare este " + sum);}
        else    {
            System.out.println("Nu s-au gasit 5 numere pare, dar suma primelor " + n + " este " + sum);}
        }
    }

