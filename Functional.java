package codingbat;

import java.util.List;

/**
 *
 * @author Ócsai István
 */
public class Functional {
    
    /**
     * Given a list of integers, return a list where each integer is multiplied
     * by 2.
     * @param nums
     * @return 
     */
    public List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        return nums;
    }
    
    /**
     * Given a list of integers, return a list where each integer is multiplied
     * with itself.
     * @param nums
     * @return 
     */
    public List<Integer> square(List<Integer> nums) {
        nums.replaceAll(n -> n * n);
        return nums;
    }
    
    /**
     * Given a list of strings, return a list where each string has "*" added
     * at its end.
     * @param strings
     * @return 
     */
    public List<String> addStar(List<String> strings) {
        strings.replaceAll(str -> str + "*");
        return strings;
    }
    
    /**
     * Given a list of strings, return a list where each string is replaced
     * by 3 copies of the string concatenated together.
     * @param strings
     * @return 
     */
    public List<String> copies3(List<String> strings) {
        strings.replaceAll(str -> str + str + str);
        return strings;
    }
    
    /**
     * Given a list of strings, return a list where each string has "y" added
     * at its start and end.
     * @param strings
     * @return 
     */
    public List<String> moreY(List<String> strings) {
        strings.replaceAll(str -> "y" + str + "y");
        return strings;
    }

    /**
     * Given a list of integers, return a list where each integer is added to
     * 1 and the result is multiplied by 10.
     * @param nums
     * @return 
     */
    public List<Integer> math1(List<Integer> nums) {
        nums.replaceAll(num -> (num + 1) * 10);
        return nums;
    }
    
    /**
     * Given a list of non-negative integers, return an integer list of the
     * rightmost digits. 
     * @param nums
     * @return 
     */
    public List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(num -> num % 10);
        return nums;
    }
    
    /**
     * Given a list of strings, return a list where each string is converted
     * to lower case.
     * @param strings
     * @return 
     */
    public List<String> lower(List<String> strings) {
        strings.replaceAll(str -> str.toLowerCase());
        return strings;
    }
    
    /**
     * Given a list of strings, return a list where each string has all its
     * "x" removed.
     * @param strings
     * @return 
     */
    public List<String> noX(List<String> strings) {
        strings.replaceAll(str -> str.replaceAll("x", ""));
        return strings;
    }
    
    /**
     * Given a list of integers, return a list of the integers, omitting any
     * that are less than 0.
     * @param nums
     * @return 
     */
    public List<Integer> noNeg(List<Integer> nums) {
        nums.removeIf(n -> n < 0);
        return nums;
    }
    
    /**
     * Given a list of non-negative integers, return a list of those numbers
     * except omitting any that end with 9. 
     * @param nums
     * @return 
     */
    public List<Integer> no9(List<Integer> nums) {
        nums.removeIf(n -> n % 10 == 9);
        return nums;
    }
    
    /**
     * Given a list of integers, return a list of those numbers, omitting any
     * that are between 13 and 19 inclusive.
     * @param nums
     * @return 
     */
    public List<Integer> noTeen(List<Integer> nums) {
        nums.removeIf(n -> n >= 13 && n <= 19);
        return nums;
    }
    
    /**
     * Given a list of strings, return a list of the strings, omitting any
     * string length 4 or more.
     * @param strings
     * @return 
     */
    public List<String> noLong(List<String> strings) {
        strings.removeIf(str -> str.length() >= 4);
        return strings;
    }
    
    /**
     * Given a list of strings, return a list of the strings, omitting any
     * string that contains a "z".
     * @param strings
     * @return 
     */
    public List<String> noZ(List<String> strings) {
        strings.removeIf(str -> str.contains("z"));
        return strings;
    }
    
    /**
     * Given a list of strings, return a list of the strings, omitting any
     * string length 3 or 4.
     * @param strings
     * @return 
     */
    public List<String> no34(List<String> strings) {
        strings.removeIf(str -> str.length() == 4 || str.length() == 3);
        return strings;
    }
    
    /**
     * Given a list of strings, return a list where each string has "y" added
     * at its end, omitting any resulting strings that contain "yy" as a
     * substring anywhere.
     * @param strings
     * @return 
     */
    public List<String> noYY(List<String> strings) {
        strings.replaceAll(str -> str + "y");
        strings.removeIf(str -> str.contains("yy"));
        return strings;
    }
    
    /**
     * Given a list of non-negative integers, return a list of those numbers
     * multiplied by 2, omitting any of the resulting numbers that end in 2.
     * @param nums
     * @return 
     */
    public List<Integer> two2(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        nums.removeIf(n -> n % 10 == 2);
        return nums;
    }
    
    /**
     * Given a list of integers, return a list of those numbers squared and the
     * product added to 10, omitting any of the resulting numbers that end
     * in 5 or 6.
     * @param nums
     * @return 
     */
    public List<Integer> square56(List<Integer> nums) {
        nums.replaceAll(n -> (n * n) + 10);
        nums.removeIf(n -> n % 10 == 5 || n % 10 == 6);
        return nums;
    }
}