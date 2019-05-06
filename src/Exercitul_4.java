public class Exercitul_4 {
    public static void main(String[] args) {
        int n = 9;
        int[] numere = { 1, 34, 25, 267, 12, 14, 87, 99, 198};
        int impare = 0, pare = 0;

        for (int i = 0; i < n; i++) {
            if(numere[i]%2==0)  {
                pare++;}
            else    {
                impare++;}
            }
        System.out.println("Sunt " + pare + " numere pare si " + impare + " numere impare.");
        }
    }

