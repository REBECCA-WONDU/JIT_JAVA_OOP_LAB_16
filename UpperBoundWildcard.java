import java.util.ArrayList;

public class UpperBoundWildcard {


    private static Double add(ArrayList<? extends Number> num) {

        double sum=0.0;

        for(Number n:num)
        {
            sum = sum+n.doubleValue();
        }

        return sum;
    }

    public static void main(String[] args) {

        ArrayList<Integer> l1=new ArrayList<Integer>();
        l1.add(5);
        l1.add(21);
        System.out.println("displaying the sum= "+add(l1));

        ArrayList<Double> l2=new ArrayList<Double>();
        l2.add(7.0);
        l2.add(21.0);
        System.out.println("displaying the sum= "+add(l2));


    }

}
