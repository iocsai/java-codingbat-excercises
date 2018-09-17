package codingbat;

/**
 *
 * @author Ócsai István
 */
public class Recursion {
    
    /**
     * Given n of 1 or more, return the factorial of n, which is n * (n-1) *
     * (n-2) ... 1. Compute the result recursively (without loops).
     * @param n
     * @return 
     */
    public int factorial(int n) {
        if (n == 1) {
            return n;
        } else {
            return n * factorial(n - 1);
        }
    }
    
    /**
     * We have a number of bunnies and each bunny has two big floppy ears.
     * We want to compute the total number of ears across all the bunnies
     * recursively (without loops or multiplication).
     * @param bunnies
     * @return 
     */
    public int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        } else {
            return 2 + bunnyEars(bunnies - 1);
        }
    }

    /**
     * The fibonacci sequence is a famous bit of mathematics, and it happens
     * to have a recursive definition. The first two values in the sequence are
     * 0 and 1 (essentially 2 base cases). Each subsequent value is the sum of
     * the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8,
     * 13, 21 and so on. Define a recursive fibonacci(n) method that returns
     * the nth fibonacci number, with n=0 representing the start of the sequence.
     * @param n
     * @return 
     */
    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n <= 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    
    /**
     * We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
     * (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll
     * say have 3 ears, because they each have a raised foot. Recursively
     * return the number of "ears" in the bunny line 1, 2, ... n
     * (without loops or multiplication).
     * @param bunnies
     * @return 
     */
    public int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
            return 0;
        } else {
            return 2 + ((bunnies - 1) % 2) + bunnyEars2(bunnies - 1);
        }
    }
    
    /**
     * We have triangle made of blocks. The topmost row has 1 block, the next
     * row down has 2 blocks, the next row has 3 blocks, and so on.
     * Compute recursively (no loops or multiplication) the total number of
     * blocks in such a triangle with the given number of rows.
     * @param rows
     * @return 
     */
    public int triangle(int rows) {
        if (rows == 0) {
            return 0;
        } else {
            return rows + triangle(rows -1);
        }
    }
    
    /**
     * Given a non-negative int n, return the sum of its digits recursively
     * (no loops). Note that mod (%) by 10 yields the rightmost digit
     * (126 % 10 is 6), while divide (/) by 10 removes the rightmost
     * digit (126 / 10 is 12).
     * @param n
     * @return 
     */
    public int sumDigits(int n) {
        if (n / 10 == 0) {
            return n;
        } else {
            return (n % 10) + sumDigits(n / 10);
        }
    }
    
    /**
     * Given a non-negative int n, return the count of the occurrences of 7 as
     * a digit, so for example 717 yields 2. (no loops).
     * Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
     * while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
     * @param n
     * @return 
     */
    public int count7(int n) {
        if (n / 10 == 0) {
            return n % 10 == 7 ? 1 : 0;
        } else {
            return n % 10 == 7 ? 1 + count7(n / 10): count7(n / 10);
        }
    }
    
    /**
     * Given a non-negative int n, compute recursively (no loops) the count of
     * the occurrences of 8 as a digit, except that an 8 with another 8
     * immediately to its left counts double, so 8818 yields 4.
     * Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
     * while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
     * @param n
     * @return 
     */
    public int count8(int n) {
        if (n / 10 == 0) {
            return n % 10 == 8 ? 1 : 0;
        }
        if (n % 10 == 8) {
            return ((n / 10) % 10 == 8) ? 
                    2 + count8(n / 10) : 1 + count8(n / 10);
        } else {
            return count8(n / 10);
        }
    }
    
    /**
     * Given base and n that are both 1 or more, compute recursively (no loops)
     * the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
     * @param base
     * @param n
     * @return 
     */
    public int powerN(int base, int n) {
        if (n == 1) {
            return base;
        } else {
            return base * powerN(base, n - 1);
        }
    }
    
    /**
     * Given a string, compute recursively (no loops) the number of lowercase
     * 'x' chars in the string.
     * @param str
     * @return 
     */
    public int countX(String str) {
        if (str.length() == 0) {
            return 0;
        } else {
            return (str.charAt(0) == 'x') ? 1 + countX(str.substring(1)) :
                    countX(str.substring(1));
        }
    }
    
    /**
     * Given a string, compute recursively (no loops) the number of times
     * lowercase "hi" appears in the string.
     * @param str
     * @return 
     */
    public int countHi(String str) {
        if (str.length() <= 1) {
            return 0;
        } else {
            return (str.startsWith("hi")) ? 
                    1 + countHi(str.substring(2)) :
                    countHi(str.substring(1));
        }
    } 
    
    /**
     * Given a string, compute recursively (no loops) a new string where all
     * the lowercase 'x' chars have been changed to 'y' chars.
     * @param str
     * @return 
     */
    public String changeXY(String str) {
        if (str.length() == 0) {
            return str;
        } else {
            return (str.startsWith("x")) ?
                    "y" + changeXY(str.substring(1)) :
                    str.charAt(0) + changeXY(str.substring(1));
        }
    }
    
    /**
     * Given a string, compute recursively (no loops) a new string where all
     * appearances of "pi" have been replaced by "3.14".
     * @param str
     * @return 
     */
    public String changePi(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            return (str.startsWith("pi")) ?
                    "3.14" + changePi(str.substring(2)) :
                    str.charAt(0) + changePi(str.substring(1));
        }
    }
    
    /**
     * Given a string, compute recursively a new string where all the 'x' chars
     * have been removed.
     * @param str
     * @return 
     */
    public String noX(String str) {
        if (str.length() == 0) {
            return str;
        } else {
            return (str.startsWith("x")) ?
                    noX(str.substring(1)) :
                    str.charAt(0) + noX(str.substring(1));
        }
    }
    
    /**
     * Given an array of ints, compute recursively if the array contains a 6.
     * We'll use the convention of considering only the part of the array that
     * begins at the given index. In this way, a recursive call can pass
     * index+1 to move down the array. The initial call will pass in index as 0.
     * @param nums
     * @param index
     * @return 
     */
    public boolean array6(int[] nums, int index) {
        if (nums.length == index) {
            return false;
        }
        if (nums[index++] == 6) {
            return true;
        } else {
            return array6(nums, index);
        }
    }
    
    /**
     * Given an array of ints, compute recursively the number of times that the
     * value 11 appears in the array. We'll use the convention of considering
     * only the part of the array that begins at the given index. In this way,
     * a recursive call can pass index+1 to move down the array.
     * The initial call will pass in index as 0.
     * @param nums
     * @param index
     * @return 
     */
    public int array11(int[] nums, int index) {
        if (nums.length == index) {
            return 0;
        } else {
            return (nums[index++] == 11) ? 1 + array11(nums, index) :
                    array11(nums, index);
        }
    }
    
    /**
     * Given an array of ints, compute recursively if the array contains
     * somewhere a value followed in the array by that value times 10.
     * We'll use the convention of considering only the part of the array that
     * begins at the given index. In this way, a recursive call can pass index+1
     * to move down the array. The initial call will pass in index as 0.
     * @param nums
     * @param index
     * @return 
     */
    public boolean array220(int[] nums, int index) {
        if (nums.length <= index + 1) {
            return false;
        } 
        if (nums[index++] * 10 == nums[index]) {
            return true;
        } else {
            return array220(nums, index);
        }
    }
    
    /**
     * Given a string, compute recursively a new string where all the adjacent
     * chars are now separated by a "*".
     * @param str
     * @return 
     */
    public String allStar(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            return str.charAt(0) + "*" + allStar(str.substring(1));
        }
    }
    
    /**
     * Given a string, compute recursively a new string where identical chars
     * that are adjacent in the original string are separated from each other
     * by a "*".
     * @param str
     * @return 
     */
    public String pairStar(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            return (str.charAt(0) == str.charAt(1)) ?
                    str.charAt(0) + "*" + pairStar(str.substring(1)) :
                    str.charAt(0) + pairStar(str.substring(1));
        }
    }
    
    /**
     * Given a string, compute recursively a new string where all the lowercase
     * 'x' chars have been moved to the end of the string.
     * @param str
     * @return 
     */
    public String endX(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            return (str.charAt(0) == 'x') ?
                    endX(str.substring(1)) + "x" :
                    str.charAt(0) + endX(str.substring(1));
        }
    }
    
    /**
     * We'll say that a "pair" in a string is two instances of a char separated
     * by a char. So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA"
     * contains 3 pairs -- 2 for A and 1 for x. Recursively compute the number
     * of pairs in the given string.
     * @param str
     * @return 
     */
    public int countPairs(String str) {
        if (str.length() <= 2) {
            return 0;
        } else {
            return (str.charAt(0) == str.charAt(2)) ?
                    1 + countPairs(str.substring(1)) :
                    countPairs(str.substring(1));
        }
    }
    
    /**
     * Count recursively the total number of "abc" and "aba" substrings that
     * appear in the given string.
     * @param str
     * @return 
     */
    public int countAbc(String str) {
        if (str.length() <= 2) {
            return 0;
        }
        if (str.startsWith("abc")) {
            return 1 + countAbc(str.substring(3));
        } else if (str.startsWith("aba")) {
            return 1 + countAbc(str.substring(2));
        } else {
            return countAbc(str.substring(1));
        }
    }
    
    /**
     * Given a string, compute recursively (no loops) the number of "11"
     * substrings in the string. The "11" substrings should not overlap.
     * @param str
     * @return 
     */
    public int count11(String str) {
        if (str.length() < 2) {
            return 0;
        } else {
            return (str.startsWith("11")) ?
                    1 + count11(str.substring(2)) :
                    count11(str.substring(1));
        }
    }
    
    /**
     * Given a string, return recursively a "cleaned" string where adjacent
     * chars that are the same have been reduced to a single char.
     * So "yyzzza" yields "yza".
     * @param str
     * @return 
     */
    public String stringClean(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            return (str.charAt(0) == str.charAt(1)) ?
                    stringClean(str.substring(1)) :
                    str.charAt(0) + stringClean(str.substring(1));
        }
    }
    
    /**
     * Given a string, compute recursively the number of times lowercase "hi"
     * appears in the string, however do not count "hi" that have an 'x'
     * immedately before them.
     * @param str
     * @return 
     */
    public int countHi2(String str) {
        if (str.length() < 2) {
            return 0;
        }
        if (str.startsWith("x")) {
            return (str.charAt(1) != 'x') ?
                    countHi2(str.substring(2)) :
                    countHi2(str.substring(1));
        }
        if (str.startsWith("hi")) {
            return 1 + countHi2(str.substring(2));
        }
        return countHi2(str.substring(1));
    }
    
    /**
     * Given a string that contains a single pair of parenthesis, compute
     * recursively a new string made of only of the parenthesis and their
     * contents, so "xyz(abc)123" yields "(abc)".
     * @param str
     * @return 
     */
    public String parenBit(String str) {
        if (str.length() < 2) {
            return "";
        } else {
            return (str.startsWith("(")) ?
                    str.substring(0, str.indexOf(")") + 1) + 
                        parenBit(str.substring(str.indexOf(")") + 1)) :
                    parenBit(str.substring(1));
        }
    }
    
    /**
     * Given a string, return true if it is a nesting of zero or more pairs of
     * parenthesis, like "(())" or "((()))". Suggestion: check the first and
     * last chars, and then recur on what's inside them.
     * @param str
     * @return 
     */
    public boolean nestParen(String str) {
        if (str.length() == 0) {
            return true;
        }
        if (str.startsWith("(") && str.endsWith(")")) {
            return nestParen(str.substring(1, str.length() - 1));
        }
        return false;
    }

    /**
     * Given a string and a non-empty substring sub, compute recursively the
     * number of times that sub appears in the string, without the sub strings
     * overlapping.
     * @param str
     * @param sub
     * @return 
     */
    public int strCount(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        } else {
            return (str.startsWith(sub)) ?
                    1 + strCount(str.substring(sub.length()), sub) :
                    strCount(str.substring(1), sub);
        }
    }
    
    /**
     * Given a string and a non-empty substring sub, compute recursively if at
     * least n copies of sub appear in the string somewhere, possibly with
     * overlapping. N will be non-negative.
     * @param str
     * @param sub
     * @param n
     * @return 
     */
    public boolean strCopies(String str, String sub, int n) {
        return n <= strCountOverlap(str, sub);
    }

    /**
     * Given a string and a non-empty substring sub, compute recursively the
     * number of times that sub appears in the string, possibly with
     * overlapping.
     * @param str
     * @param sub
     * @return 
     */
    public int strCountOverlap(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        } else {
            return (str.startsWith(sub)) ?
                    1 + strCount(str.substring(1), sub) :
                    strCount(str.substring(1), sub);
        }
    }
    
    /**
     * Given a string and a non-empty substring sub, compute recursively the
     * largest substring which starts and ends with sub and return its length.
     * @param str
     * @param sub
     * @return 
     */
    public int strDist(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        }
        if (str.startsWith(sub)) {
            if (str.endsWith(sub)) {
                return str.lastIndexOf(sub) - str.indexOf(sub) + sub.length();
            } else {
                return strDist(str.substring(0, str.length() - 1), sub);
            }
        } else {
            return strDist(str.substring(1), sub);
        }
    }
    
    /**
     * Given an array of ints, is it possible to choose a group of some of the
     * ints, such that the group sums to the given target? This is a classic
     * backtracking recursion problem. Once you understand the recursive
     * backtracking strategy in this problem, you can use the same pattern for
     * many problems to search a space of choices. Rather than looking at the
     * whole array, our convention is to consider the part of the array
     * starting at index start and continuing to the end of the array.
     * The caller can specify the whole array simply by passing start as 0.
     * No loops are needed -- the recursive calls progress down the array. 
     * @param start
     * @param nums
     * @param target
     * @return 
     */
    public boolean groupSum(int start, int[] nums, int target) {
        if (nums.length <= start) {
            return target == 0;
        }
        if (groupSum(start + 1, nums, target - nums[start])) {
            return true;
        }
        return groupSum(start + 1, nums, target);
    }
    
    /**
     * Given an array of ints, is it possible to choose a group of some of the
     * ints, beginning at the start index, such that the group sums to the
     * given target? However, with the additional constraint that all 6's must
     * be chosen. (No loops needed.)
     * @param start
     * @param nums
     * @param target
     * @return 
     */
    public boolean groupSum6(int start, int[] nums, int target) {
        if (nums.length <= start) {
            return target == 0;
        }
        if (nums[start] == 6) {
            target -= 6;
        }
        if (groupSum6(start + 1, nums, target - nums[start])) {
            return true;
        }
        return groupSum6(start + 1, nums, target);
    }
    
    /**
     * Given an array of ints, is it possible to choose a group of some of the
     * ints, such that the group sums to the given target with this additional
     * constraint: If a value in the array is chosen to be in the group,
     * the value immediately following it in the array must not be chosen.
     * (No loops needed.)
     * @param start
     * @param nums
     * @param target
     * @return 
     */
    public boolean groupNoAdj(int start, int[] nums, int target) {
        if (nums.length <= start) {
            return target == 0;
        }
        if (groupNoAdj(start + 2, nums, target - nums[start])) {
            return true;
        }
        return groupNoAdj(start + 1, nums, target);
    }
    
    /**
     * Given an array of ints, is it possible to choose a group of some of the
     * ints, such that the group sums to the given target with these additional
     * constraints: all multiples of 5 in the array must be included in the
     * group. If the value immediately following a multiple of 5 is 1, it must
     * not be chosen. (No loops needed.)
     * @param start
     * @param nums
     * @param target
     * @return 
     */
    public boolean groupSum5(int start, int[] nums, int target) {
        if (nums.length <= start) {
            return target == 0;
        }
        if (nums[start] % 5 == 0) {
            target -= nums[start];
            if (nums.length < start && nums[start + 1] == 1) {
                start++;
            }
            if (start + 2 == nums.length && nums[nums.length - 1] == 1) {
                return target == 0;
            }
        }
        if (groupSum5(start + 1, nums, target - nums[start])) {
            return true;
        }
        return groupSum5(start + 1, nums, target);
    }
    
    /**
     * Given an array of ints, is it possible to choose a group of some of the
     * ints, such that the group sums to the given target, with this additional
     * constraint: if there are numbers in the array that are adjacent and the
     * identical value, they must either all be chosen, or none of them chosen.
     * For example, with the array {1, 2, 2, 2, 5, 2}, either all three 2's in
     * the middle must be chosen or not, all as a group.
     * (one loop can be used to find the extent of the identical values).
     * @param start
     * @param nums
     * @param target
     * @return 
     */
    public boolean groupSumClump(int start, int[] nums, int target) {
        altArray(nums);
        if (nums.length <= start) {
            return target == 0;
        }
        while (nums.length - 1 > start && nums[start] == nums[start + 1]
                || start > 0 && nums[start] == nums[start - 1]) {
            target -= nums[start];
            start++;
        }
        if (groupSumClump(start + 1, nums, target - nums[start])) {
            return true;
        }
        return groupSumClump(start + 1, nums, target);
    }
    
    private void altArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                nums[i-1] += nums[i];
                if (i+1 < nums.length && nums[i] != nums[i+1])
                    nums[i] = 0;
                else if (i == nums.length-1)
                nums[i] = 0;
            }
        }
    }
    
    /**
     * Given an array of ints, is it possible to divide the ints into two
     * groups, so that the sums of the two groups are the same. Every int must
     * be in one group or the other.
     * Write a recursive helper method that takes whatever arguments you like,
     * and make the initial call to your recursive helper from splitArray().
     * (No loops needed.)
     * @param nums
     * @return 
     */
    public boolean splitArray(int[] nums) {
        int index = 0, sum1 = 0, sum2 = 0;
        return splitArray(index, nums, sum1, sum2);
    }
    
    public boolean splitArray(int start, int[] nums, int sum1, int sum2) {
        if (nums.length <= start) {
            return sum1 == sum2;
        }
        if (splitArray(start + 1, nums, sum1 + nums[start], sum2)) {
            return true;
        }
        return splitArray(start + 1, nums, sum1, sum2 + nums[start]);
    }
    
    /**
     * Given an array of ints, is it possible to divide the ints into two
     * groups, so that the sum of one group is a multiple of 10, and the sum
     * of the other group is odd. Every int must be in one group or the other.
     * Write a recursive helper method that takes whatever arguments you like,
     * and make the initial call to your recursive helper from splitOdd10().
     * @param nums
     * @return 
     */
    public boolean splitOdd10(int[] nums) {
        int index = 0, sum1 = 0, sum2 = 0;
        return splitArray(nums, index, sum1, sum2);
    }
    
    public boolean splitArray(int[] nums, int index, int sum1, int sum2) {
        if (nums.length <= index) {
            return (sum1 % 10 == 0 && sum2 % 2 == 1)
                    || (sum2 % 10 == 0 && sum1 % 2 == 1);
        }
        return splitArray(nums, index + 1, sum1 + nums[index], sum2)
                || splitArray(nums, index + 1, sum1, sum2 + nums[index]);
    }
    
    /**
     * Given an array of ints, is it possible to divide the ints into two
     * groups, so that the sum of the two groups is the same, with these
     * constraints: all the values that are multiple of 5 must be in one group,
     * and all the values that are a multiple of 3 (and not a multiple of 5)
     * must be in the other. 
     * @param nums
     * @return 
     */
    public boolean split53(int[] nums) {
        int index = 0, sum1 = 0, sum2 = 0;
        return splitArray(sum1, sum2, nums, index);
    }
    
    public boolean splitArray(int sum1, int sum2, int[] nums, int index) {
        int value; 
        if (nums.length <= index) {
            return (sum1 == sum2);
        }
        value = nums[index];
        if (value % 5 == 0) {
            return splitArray(sum1 + value, sum2, nums, index + 1);
        } else if (value % 3 == 0) {
            return splitArray(sum1, sum2 + value, nums, index + 1);
        } else {
            return splitArray(sum1 + value, sum2, nums, index + 1)
                || splitArray(sum1, sum2 + value, nums, index + 1);
        }
    }
}