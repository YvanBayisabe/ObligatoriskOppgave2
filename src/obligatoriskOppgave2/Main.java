package obligatoriskOppgave2;

public class Main {

    static

    static void printRevers (int [] array, int index) {
        System.out.print(array[index] + " ");
        if (index ==0) {
            System.out.println();
            return;
        }
        printRevers(array, index-1);

    }



    static int pow(int base, int exponent) {
        if (exponent == 1) {
            return base;
        }
        return base * pow(base,exponent-1);
    }


    static int sum (int x){
        if (x ==0) {
            return x;
        }
        return x + sum (x-1);
    }

    public static void main (String []args) {
        System.out.println(sum(10));
        System.out.println(pow(5, 4));

        int[] array = {1,2,3,4,5};
        int[] array2 = {1,2,3};
        printRevers(array, array.length - 1);
        printRevers(array2, array2.length - 1);


    }

}
