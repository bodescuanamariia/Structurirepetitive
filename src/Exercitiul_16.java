    public class Exercitiul_16 {
        public static void main(String[] args) {
            int n = 127343;
            int m = n;
            int nrCifre = 0;
            int suma = 0;

            do {
                m = m/10;
                nrCifre = nrCifre + 1;
                }
            while(m!=0);

            if(nrCifre%2==0)  {
                for (int i = 0; i < nrCifre ; i++) {
                    if(i%2!=0)  {
                       suma = suma + n%10;}
                    n = n / 10;
                }
            } else  {
                for (int i = 0; i < nrCifre ; i++) {
                    if(i%2==0)  {
                        suma = suma + n%10;}
                    n = n / 10;
                }
            }
            System.out.println(suma);
        }
    }


