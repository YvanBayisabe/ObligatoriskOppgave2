public class reverse {
    public static void main(String[] args) {
        Integer[] iray = {1, 2, 3, 4, 5};
        Character[] cray = {'a', 'd', 'h', 'a', 'n', 'e', 't'};
        Double[] douray = {1.5, 2.5, 3.5, 65.5, 99.99};
        String[] name = {"Adam", "Blue", "Ronan", "Kaz"};

        printAraay(iray);
        printAraay(cray);
        printAraay(douray);
        printAraay(name);
    }

   ;

        //reverse generic metode
        public static <T> void printAraay(T[] x) {
            for (int a = x.length - 1; a >= 0; a--)
                System.out.printf("%s ",x[a] );
            System.out.println();


        }

    }


