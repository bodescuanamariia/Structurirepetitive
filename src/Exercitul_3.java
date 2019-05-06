public class Exercitul_3 {
    public static void main(String[] args) {
        int n = 7;
        int no = 7;
        int max = 0;
        int[] numere = {10, 56, 4, 44, 24, 74, 14};

        for (int i = 0; i < n; i++) {
            if(numere[i]%2==0)  {
                no--;}
                else {
                if (max < numere[i]) {
                    max = numere[i];
                }
            }

        }

        if(no==0)    {
            System.out.println("NO");}
            else    {
            System.out.println(max);}
        }
    }



