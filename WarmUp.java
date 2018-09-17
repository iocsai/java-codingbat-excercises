package codingbat;

/**
 *
 * @author Ócsai István
 */
public class WarmUp {
    
    /**
     * The parameter weekday is true if it is a weekday, and the parameter 
     * vacation is true if we are on vacation. We sleep in if it is not a 
     * weekday or we're on vacation. Return true if we sleep in.
     * @param weekday
     * @param vacation
     * @return 
     */
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
    
    /**
     * We have two monkeys, a and b, and the parameters aSmile and bSmile 
     * indicate if each is smiling. We are in trouble if they are both smiling 
     * or if neither of them is smiling. Return true if we are in trouble.
     * @param aSmile
     * @param bSmile
     * @return 
     */
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile == bSmile);
    }
    
    /**
     * Given two int values, return their sum. Unless the two values are 
     * the same, then return double their sum.
     * @param a
     * @param b
     * @return 
     */
    public int sumDouble(int a, int b) {
        int sum = a + b;
        return (a == b) ? 2 * sum : sum;
    }
    
    /**
     * Given an int n, return the absolute difference between n and 21, 
     * except return double the absolute difference if n is over 21.
     * @param n
     * @return 
     */
    public int diff21(int n) {
        int diff = Math.abs(21 - n);
        return (n > 21) ? 2 * diff : diff;
    }
    
    /**
     * We have a loud talking parrot. The "hour" parameter is the current hour 
     * time in the range 0..23. We are in trouble if the parrot is talking and 
     * the hour is before 7 or after 20. Return true if we are in trouble.
     * @param talking
     * @param hour
     * @return 
     */
    public boolean parrotTrouble(boolean talking, int hour) {
        return (talking && (hour < 7 || hour > 20));
    }
    
    /**
     * Given 2 ints, a and b, return true if one if them is 10 or 
     * if their sum is 10.
     * @param a
     * @param b
     * @return 
     */
    public boolean makes10(int a, int b) {
        return a == 10 || b == 10 || a + b == 10;
    }
    
    /**
     * Given an int n, return true if it is within 10 of 100 or 200. 
     * Note: Math.abs(num) computes the absolute value of a number.
     * @param n
     * @return 
     */
    public boolean nearHundred(int n) {
        return Math.abs(100 - n) <= 10 || Math.abs(200-n) <= 10;
    }
    
    /**
     * Given 2 int values, return true if one is negative and one is positive. 
     * Except if the parameter "negative" is true, then return true only 
     * if both are negative.
     * @param a
     * @param b
     * @param negative
     * @return 
     */
    public boolean posNeg(int a, int b, boolean negative) {
        return negative ? (a < 0 && b < 0) 
                : (a < 0 && b > 0) || (a > 0 && b < 0);
    }
    
    /**
     * Given a string, return a new string where "not " has been added to the 
     * front. However, if the string already begins with "not", return 
     * the string unchanged. Note: use .equals() to compare 2 strings.
     * @param str
     * @return 
     */
    public String notString(String str) {
        return (str.length() >= 3 && str.substring(0, 3).equals("not")) 
                ? str : "not " + str;
    }
    
    /**
     * Given a non-empty string and an int n, return a new string where the 
     * char at index n has been removed. The value of n will be a valid index 
     * of a char in the original string 
     * (i.e. n will be in the range 0..str.length()-1 inclusive).
     * @param str
     * @param n
     * @return 
     */
    public String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }
    
    /**Given a string, return a new string where the first and last chars 
     * have been exchanged.
     * @param str
     * @return 
     */
    public String frontBack(String str) {
        return str.length() > 1 ? str.substring(str.length() - 1) + 
                str.substring(1, str.length() - 1) + str.substring (0, 1) : str;
    }
    
    /**
     * Given a string, we'll say that the front is the first 3 chars of 
     * the string. If the string length is less than 3, the front is whatever 
     * is there. Return a new string which is 3 copies of the front.
     * @param str
     * @return 
     */
    public String front3(String str) {
        String front = str.length() < 3 ? str : str.substring(0, 3);
        return front + front + front;
    }
    
    /**
     * Given a string, take the last char and return a new string with the last
     * char added at the front and back, so "cat" yields "tcatt". 
     * The original string will be length 1 or more.
     * @param str
     * @return 
     */
    public String backAround(String str) {
        String lastChar = str.substring(str.length() - 1);
        return lastChar + str + lastChar;
    }
    
    /**
     * Return true if the given non-negative number is a multiple of 3 or 
     * a multiple of 5. Use the % "mod" operator
     * @param n
     * @return 
     */
    public boolean or35(int n) {
        return (n % 3 == 0) || (n % 5 == 0);
    }
    
    /**
     * Given a string, take the first 2 chars and return the string with the 2
     * chars added at both the front and back, so "kitten" yields "kikittenki". 
     * If the string length is less than 2, use whatever chars are there.
     * @param str
     * @return 
     */
    public String front22(String str) {
        String first = str.length() > 1 ? str.substring(0, 2) : str;
        return first + str + first;
    }
    
    /**
     * Given a string, return true if the string starts with "hi" and 
     * false otherwise.
     * @param str
     * @return 
     */
    public boolean startHi(String str) {
        return str.length() > 1 && str.substring(0, 2).equals("hi");
    }
    
    /**
     * Given two temperatures, return true if one is less than 0 and the other
     * is greater than 100.
     * @param temp1
     * @param temp2
     * @return 
     */
    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100);
    }
    
    /**
     * Given 2 int values, return true if either of them is in the range 10..20
     * inclusive.
     * @param a
     * @param b
     * @return 
     */
    public boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }
    
    /**
     * A number is "teen" if it is in the range 13..19 inclusive. Given 3 int 
     * values, return true if 1 or more of them are teen.
     * @param a
     * @param b
     * @param c
     * @return 
     */
    public boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }
    
    /**
     * A number is "teen" if it is in the range 13..19 inclusive. Given 2 int 
     * values, return true if one or the other is teen, but not both.
     * @param a
     * @param b
     * @return 
     */
    public boolean loneTeen(int a, int b) {
        return (isTeen(a) && !isTeen (b)) || (isTeen(b) && !isTeen (a));
    }

    /**
     * A number is "teen" if it is in the range 13..19 inclusive. 
     * Return true if the given int value is teen.
     * @param a
     * @return 
     */
    public boolean isTeen(int a) {
        return a >= 13 && a <= 19;
    }
    
    /**
     * Given a string, if the string "del" appears starting at index 1, return 
     * a string where that "del" has been deleted. Otherwise, return the string
     * unchanged.
     * @param str
     * @return 
     */
    public String delDel(String str) {
        return str.length() > 3 && str.substring(1, 4).equals("del") 
                ? str.substring(0, 1) + str.substring(4) : str;
    }
    
    /**
     * Return true if the given string begins with "mix", except the 'm' can be
     * anything, so "pix", "9ix" .. all count.
     * @param str
     * @return 
     */
    public boolean mixStart(String str) {
        return str.length() >= 3 && str.substring(1,3).equals("ix");
    }
    
    /**
     * Given a string, return a string made of the first 2 chars (if present), 
     * however include first char only if it is 'o' and include the second only
     * if it is 'z', so "ozymandias" yields "oz".
     * @param str
     * @return 
     */
    public String startOz(String str) {
        return (str.length() > 0 && str.substring(0, 1).equals("o") ? "o" : "")
            + (str.length() > 1 && str.substring(1, 2).equals("z") ? "z" : "");
    }
    
    /**
     * Given three int values, a b c, return the largest.
     * @param a
     * @param b
     * @param c
     * @return 
     */
    public int intMax(int a, int b, int c) {
        if(a > b) {
            if(a > c) {
                return a;
            }
        }
        if(b > c) {
            return b;
        }
        return c;
    }
    
    public int intMaxCodingBat(int a, int b, int c) {
        int max;
  
        // First check between a and b
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
  
        // Now check between max and c
        if (c > max) {
            max = c;
        }
  
        return max;
  
        // Could use the built in Math.max(x, y) function which selects 
        // the larger of two values.
    }
    
    /**
     * Given 2 int values, return whichever value is nearest to the value 10, 
     * or return 0 in the event of a tie. 
     * Note that Math.abs(n) returns the absolute value of a number.
     * @param a
     * @param b
     * @return 
     */
    public int close10(int a, int b) {
        int aDiff = Math.abs(a - 10), bDiff = Math.abs(b - 10);
        if(aDiff < bDiff) return a;
        if(bDiff < aDiff) return b;
        else return 0;
    }
    
    /**
     * Given 2 int values, return true if they are both in the range 30..40 
     * inclusive, or they are both in the range 40..50 inclusive.
     * @param a
     * @param b
     * @return 
     */
    public boolean in3050(int a, int b) {
        return (a >= 30 && a <= 40 && b >= 30 && b <= 40) 
                || (a >= 40 && a <= 50 && b >= 40 && b <= 50);
    }
    
    /**
     * Given 2 positive int values, return the larger value that is in the 
     * range 10..20 inclusive, or return 0 if neither is in that range.
     * @param a
     * @param b
     * @return 
     */
    public int max1020(int a, int b) {
        if(isInRange(a, 10, 20) && isInRange(b, 10, 20)) return Math.max(a, b);
        if(isInRange(a, 10, 20)) return a;
        if(isInRange(b, 10, 20)) return b;
        return 0;
    }

    /**
     * Given a positive int value, return true if the num value is in the range
     * lowerLimit..upperLimit inclusive, or return false if is not in that range.
     * @param num
     * @param lowerLimit
     * @param upperLimit
     * @return 
     */
    public boolean isInRange(int num, int lowerLimit, int upperLimit) {
        return (num >= lowerLimit && num <= upperLimit);
    }
    
    /**
     * Return true if the given string contains between 1 and 3 'e' chars.
     * @param str
     * @return 
     */
    public boolean stringE(String str) {
        int eCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                eCount++;
            }
        }
        return isInRange(eCount, 1, 3);
    }
    
    /**
     * Given two non-negative int values, return true if they have the same 
     * last digit, such as with 27 and 57. 
     * Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
     * @param a
     * @param b
     * @return 
     */
    public boolean lastDigit(int a, int b) {
        return (a % 10 == b % 10);
    }
    
    /**
     * Given a string, return a new string where the last 3 chars are now in 
     * upper case. If the string has less than 3 chars, uppercase whatever is 
     * there. 
     * Note that str.toUpperCase() returns the uppercase version of a string.
     * @param str
     * @return 
     */
    public String endUp(String str) {
        if (str.length() < 3) return str.toUpperCase();
        int cut = str.length() -3;
        return str.substring(0, cut) +
                str.substring(cut).toUpperCase();
    }
    
    /**
     * Given a non-empty string and an int N, return the string made starting 
     * with char 0, and then every Nth char of the string. So if N is 3, 
     * use char 0, 3, 6, ... and so on. N is 1 or more.
     * @param str
     * @param n
     * @return 
     */
    public String everyNth(String str, int n) {
        if(str.length() < 1 || n < 1) return str;
        String result = "";
        for (int i = 0; i < str.length(); i += n) {
            result += str.substring(i, i + 1);
        }
        return result;
    }
    
    /**
     * Given a string and a non-negative int n, return a larger string that is 
     * n copies of the original string.
     * @param str
     * @param n
     * @return 
     */
    public String stringTimes(String str, int n) {
        //if(str.length() < 1 || n < 1) return "";
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str;
        }
        return result;
    }
    
    /**
     * Given a string and a non-negative int n, we'll say that the front of 
     * the string is the first 3 chars, or whatever is there if the string is 
     * less than length 3. Return n copies of the front;
     * @param str
     * @param n
     * @return 
     */
    public String frontTimes(String str, int n) {
        String front = str.length() > 2 ? str.substring(0, 3) : str;
        return stringTimes(front, n);
    }
    
    /**
     * Count the number of "xx" in the given string. 
     * We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
     * @param str
     * @return 
     */
    public int countXX(String str) {
        // Solution notes: the loop is shortened to end at str.length() - 1
        // so we can pull out a length 2 substring without going out of bounds.
        int result = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) {
                result++;
            }
        }
        return result;
    }
    
    /**
     * Given a string, return true if the first instance of "x" in the string 
     * is immediately followed by another "x".
     * @param str
     * @return 
     */
    public boolean doubleX(String str) {
        //boolean isXX = false;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x') {
                return str.substring(i, i + 2).equals("xx");
            }
        }
        return false;
    }
    
    public boolean doubleXCodingBat(String str) {
        int i = str.indexOf("x");
        if (i == -1) return false; // no "x" at all

        // Is char at i+1 also an "x"?
        if (i + 1 >= str.length()) return false; // check i+1 in bounds?
        return str.substring(i + 1, i + 2).equals("x");
        
        // Another approach -- .startsWith() simplifies the logic
        // String x = str.substring(i);
        // return x.startsWith("xx");
    }
    
    public boolean doubleXCodingBatXX(String str) {
        //best solution
        int i = str.indexOf("x");
        if (i == -1) return false; // no "x" at all
        return str.substring(i).startsWith("xx");
    }
    
    /**
     * Given a string, return a new string made of every other char starting 
     * with the first, so "Hello" yields "Hlo".
     * @param str
     * @return 
     */
    public String stringBits(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            result += str.charAt(i);
        }
        return result;
    }
    
    /**
     * Given a non-empty string like "Code" return a string like "CCoCodCode".
     * @param str
     * @return 
     */
    public String stringSplosion(String str) {
        String result = "";
        for (int i = 1; i <= str.length(); i++) {
            result += str.substring(0, i);
        }
        return result;
    }
    
    /**
     * Given a string, return the count of the number of times that a substring
     * length 2 appears in the string and also as the last 2 chars of the 
     * string, so "hixxxhi" yields 1 (we won't count the end substring).
     * @param str
     * @return 
     */
    public int last2(String str) {
        int count = 0;
        if(str.length() > 1) {
            String end = str.substring(str.length() - 2);
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.substring(i, i + 2).equals(end)) {
                    count++;
                }
            }
        }
        return count;
    }
    
    /**
     * Given an array of ints, return the number of 9's in the array.
     * @param nums
     * @return 
     */
    public int arrayCount9(int[] nums) {
            int count = 0;
            for (int element : nums) {
                if (element == 9) count++;
            }
            return count;
    }
    
    /**
     * Given an array of ints, return true if one of the first 4 elements 
     * in the array is a 9. The array length may be less than 4.
     * @param nums
     * @return 
     */
    public boolean arrayFront9(int[] nums) {
        int lastIndex = nums.length < 4 ? nums.length : 4;
        for (int i = 0; i < lastIndex; i++) {
            if (nums[i] == 9) return true;
        }
        return false;
    }
    
    /**
     * Given an array of ints, return true if the sequence of numbers 1, 2, 3 
     * appears in the array somewhere.
     * @param nums
     * @return 
     */
    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Given 2 strings, a and b, return the number of the positions where they
     * contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3,
     * since the "xx", "aa", and "az" substrings appear in the same place 
     * in both strings.
     * @param a
     * @param b
     * @return 
     */
    public int stringMatch(String a, String b) {
        int count = 0;
        for (int i = 0; i < Math.min(a.length() - 1, b.length() - 1); i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                count++;
            }
        }
        return count;
    }
    
    /**
     * Given a string, return a version where all the "x" have been removed. 
     * Except an "x" at the very start or end should not be removed.
     * @param str
     * @return 
     */
    public String stringX(String str) {
        //if (str.length() < 1) return str;
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || i == str.length() - 1 || str.charAt(i) != 'x') {
                result += str.charAt(i);
            }
        }
        return result;
    }
    
    /**
     * Given a string, return a string made of the chars at indexes 0,1, 
     * 4,5, 8,9 ... so "kittens" yields "kien".
     * @param str
     * @return 
     */
    public String altPairs(String str) {
        String result = "";
        int[] indexes = {0, 1, 4, 5, 8, 9, 12, 13, 16, 17, 20, 21};
        int i = 0;
        while (indexes[i] < str.length()) {
            result += str.charAt(indexes[i++]);
        }
        return result;
    }
    
    public String altPairsCodingBat(String str) {
        String result = "";
  
        // Run i by 4 to hit 0, 4, 8, ...
        for (int i = 0; i < str.length(); i += 4) {
            // Append the chars between i and i+2
            int end = i + 2;
            if (end > str.length()) {
                end = str.length();
            }
            result += str.substring(i, end);
        }
  
        return result;
    }

    /*private void specArrayFill(int[] array, int neighbors, int base, 
            int difference) {
        array[0] = base;
        for (int i = 1; i < array.length; i++) {
            base++;
            if (i % neighbors == 0) {
                base += (difference - neighbors);
            }
            array[i] = base;
        }
    }*/
    
    /**
     * Suppose the string "yak" is unlucky. Given a string, return a version 
     * where all the "yak" are removed, but the "a" can be any char. 
     * The "yak" strings will not overlap.
     * @param str
     * @return 
     */
    public String stringYak(String str) {
        String result = "";
        for (int i = 0; i < str.length() - 2; i++) {
            if (i < str.length() - 2 &&
                    str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i += 2;
            } else
                result += str.charAt(i);
        }
        return result;
    }
    
    /**
     * Given an array of ints, return the number of times that two 6's are 
     * next to each other in the array. 
     * Also count instances where the second "6" is actually a 7.
     * @param nums
     * @return 
     */
    public int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6 && 
                    (nums[i + 1] == 6 || nums[i + 1] == 7)) {
                count++;
            }
        }
        return count;
    }
    
    /**
     * Given an array of ints, we'll say that a triple is a value appearing 
     * 3 times in a row in the array. 
     * Return true if the array does not contain any triples.
     * @param nums
     * @return 
     */
    public boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] &&
                    nums[i] == nums[i + 2]) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Given an array of ints, return true if it contains a 2, 7, 1 pattern: 
     * a value, followed by the value plus 5, followed by the value minus 1. 
     * Additionally the 271 counts even if the "1" differs by 2 or less from 
     * the correct value.
     * @param nums
     * @return 
     */
    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 1] == nums[i] + 5 &&
                    Math.abs(nums[i + 2] - (nums[i] - 1)) <= 2) {
                return true;
            }
        }
        return false;
    }
    
}
