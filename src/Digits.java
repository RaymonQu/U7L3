import java.util.ArrayList;

public class Digits {
    /**
     * The list of digits from the number used to construct this object.
     * The digits appear in the list in the same order in which they appear in the original number.
     */
    private ArrayList<Integer> digitList;

    /**
     * Constructs a Digits object that represents num.
     * PRECONDITION: num >= 0
     */
    public Digits(int num) {
        digitList = new ArrayList<Integer>();
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        String number = num + "";
        int numlength = number.length();
        while (numlength != 0) {
            tempList.add(num % 10);
            num /= 10;
            numlength -= 1;
        }
        for (int i = tempList.size() - 1; i >= 0; i--) {
            digitList.add(tempList.get(i));
        }
    }

    // GETTER METHOD: added to enable test code (not provided in original FRQ)
    public ArrayList<Integer> getDigitList() {
        return digitList;
    }

    /**
     * Returns true if the digits in this Digits object are in strictly increasing order;
     * false otherwise.
     */
    public boolean isStrictlyIncreasing() {
        for (int i = 0; i < digitList.size(); i++) {
            if (i + 1 != digitList.size() && digitList.get(i + 1) <= digitList.get(i)) {
                return false;
            }
        }
        return true;
    }
}

