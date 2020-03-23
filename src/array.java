import java.util.ArrayList;

public class array {
    public static void main(String[] args) {

        ArrayList<Integer> arrlist = new ArrayList<Integer>(5);
        arrlist.add(15);
        arrlist.add(20);
        arrlist.add(25);

        for (Integer number : arrlist) {
            System.out.println("Number = " + number);
        }
        int retval = arrlist.size();
        System.out.println("Størrelse av list er = " + retval);

        try{
            System.out.println("Hentet element er"+" "+arrlist.get(0));
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Inedx is out of bound");
        }

    }
}
