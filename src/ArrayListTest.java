import java.util.Arrays;
import java.util.ArrayList;

public class ArrayListTest
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jamal");
        names.add("Emily");
        names.add("Destiny");
        names.add("Mateo");

        for (int i = 0; i < names.size(); i++)
        {
            System.out.println(names.get(i));
        }
        //COMPLETE ME: print each name (again!) using enhanced for loop
        for (String str: names)
        {
            System.out.println(str);
        }
        //COMPLETE ME: print each name (a third time!) using a while loop
        int j = 0;
        while (j < names.size())
        {
            System.out.println(names.get(j));
            j++;
        }
        ArrayList<cat> catList = new ArrayList<cat>();
        catList.add(new cat("Patty"));
        catList.add(new cat("Keith"));
        catList.add(new cat("Jerry"));
        catList.add(new cat("Mary"));

        // COMPLETE ME: print each Cat’s name using a
        // standard for loop
        for (int i = 0; i < catList.size(); i++)
        {
            System.out.println(catList.get(i).getName());
        }
        // COMPLETE ME: print each Cat’s name using an
        // enhanced for loop
        for (cat curcat: catList)
        {
            System.out.println(curcat.getName());
        }


        Integer[] nums = {1, 2, 3, 4, 5, 6, 7};
        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(nums));


        for (int i = 0; i < numList.size(); i ++){
            if (i < numList.size() - 2) {
                numList.set(i, numList.get(i + 1) + numList.get(i + 2));
            }
        }
        System.out.println(numList);


    }

}
