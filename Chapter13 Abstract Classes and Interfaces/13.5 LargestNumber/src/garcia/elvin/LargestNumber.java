package garcia.elvin;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class LargestNumber {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Number> list = new ArrayList<>();

        list.add(45); // Add an integer
        list.add(3445.53); // Add a double

        list.add(new BigInteger("3432323234344343101")); // Add a BigInt
        list.add(new BigDecimal("2.0909090989091343433344343"));

        System.out.println("The largest number is " + getLargestNumber(list));

    }

    public static Number getLargestNumber(ArrayList<Number> list) {
        if (list == null || list.size() == 0)
            return null;

        Number number = list.get(0);
        for (int i = 1; i < list.size(); i++)
            if (number.doubleValue() < list.get(i).doubleValue())
                number = list.get(i);
        return number;
    }
}
