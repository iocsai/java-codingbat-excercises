package codingbat;

import java.util.Arrays;

/**
 *
 * @author Ócsai István
 */
public class ArrayMethods {
    
    /**
     * Given an array of ints, return true if 6 appears as either the first or 
     * last element in the array. The array will be length 1 or more.
     * @param nums
     * @return 
     */
    public boolean firstLast6(int[] nums) {
       return (nums[0] == 6 || nums[nums.length - 1] == 6); 
    }
    
    /**
     * Given an array of ints, return true if the array is length 1 or more, 
     * and the first element and the last element are equal.
     * @param nums
     * @return 
     */
    public boolean sameFirstLast(int[] nums) {
       return (nums.length > 0 && nums[0] == nums[nums.length - 1]);
    }
    
    /**
     * Return an int array length 3 containing the first 3 digits of 
     * pi, {3, 1, 4}.
     * @return 
     */
    public int[] makePi() {
       return new int []{3, 1, 4}; 
    }
    
    /**
     * Given 2 arrays of ints, a and b, return true if they have the same 
     * first element or they have the same last element. 
     * Both arrays will be length 1 or more.
     * @param a
     * @param b
     * @return 
     */
    public boolean commonEnd(int[] a, int[] b) {
       return (a[0] == b[0] || a[a.length -1] == b[b.length -1]); 
    }
    
    /**
     * Given an array of ints length 3, return the sum of all the elements.
     * @param nums
     * @return 
     */
    public static int sumArray(int[] nums) {
        int sum = 0;
        for (int elem : nums) {
            sum += elem;
        }
        return sum;
    }
    
    /**
     * Given an array of ints length 3, return an array with the elements 
     * "rotated left" so {1, 2, 3} yields {2, 3, 1}
     * @param nums
     * @return 
     */
    public int[] rotateLeft3(int[] nums) {
        int[] result = new int[nums.length];
        result[result.length -1] = nums[0];
        if (nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
                result [i - 1] = nums[i];
            }
        }
        return result;
                //new int[] {nums[1], nums[2], nums[0]};
    }
    
    /**
     * Given an array of ints length 3, return a new array with the elements 
     * in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
     * @param nums
     * @return 
     */
    public int[] reverse3(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = nums.length - 1, j = 0; j < result.length; i--, j++) {
            result[j] = nums[i];
        }
        return result;
    }
    
    /**
     * Given an array of ints length 3, figure out which is larger, the first 
     * or last element in the array, and set all the other elements to be that
     * value. Return the changed array.
     * @param nums
     * @return 
     */
    public int[] maxEnd3(int[] nums) {
        int[] result = new int[nums.length];
        int newElem = Math.max(nums[0], nums[nums.length - 1]);
        for (int i = 0; i < result.length; i++) {
            result[i] = newElem;
        }
        return result;
    }
    
    /**
     * Given an array of ints, return the sum of the first 2 elements in the 
     * array. If the array length is less than 2, just sum up the elements 
     * that exist, returning 0 if the array is length 0.
     * @param nums
     * @return 
     */
    public int sum2(int[] nums) {
        int sum = 0;
        if (nums.length >= 1) {
            sum += nums[0];
        }
        if (nums.length > 1) {
            sum += nums[1];
        }
        return sum;
    }
    
    /**
     * Given 2 int arrays, a and b, each length 3, return a new array length 2
     * containing their middle elements.
     * @param a
     * @param b
     * @return 
     */
    public int[] middleWay(int[] a, int[] b) {
        return new int []{a[a.length / 2], b[b.length / 2]};
    }
    
    /**
     * Given an array of ints, return a new array length 2 containing the first
     * and last elements from the original array. 
     * The original array will be length 1 or more.
     * @param nums
     * @return 
     */
    public int[] makeEnds(int[] nums) {
        return new int[]{nums[0], nums[nums.length - 1]};
    }
    
    /**
     * Given an int array length 2, return true if it contains a 2 or a 3.
     * @param nums
     * @return 
     */
    public boolean has23(int[] nums) {
        if (nums.length > 0) {
            for (int elem : nums) {
                if (elem == 2 || elem == 3) {
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * Given an int array length 2, return true if it does not contain a 2 or 3.
     * @param nums
     * @return 
     */
    public boolean no23(int[] nums) {
        return !has23(nums);
    }
    
    
    /**
     * Given an int array, return a new array with double the length where its
     * last element is the same as the original array, and all the other
     * elements are 0. The original array will be length 1 or more. 
     * Note: by default, a new int array contains all 0's.
     * @param nums
     * @return 
     */
    public int[] makeLast(int[] nums) {
        int[] result = new int[nums.length * 2];
        result[result.length - 1] = nums[nums.length - 1];
        return result;
    }
    
    /**
     * Given an int array, return true if the array contains 2 twice, or 
     * 3 twice. The array will be length 0, 1, or 2.
     * @param nums
     * @return 
     */
    public boolean double23(int[] nums) {
        return (nums.length == 2 && (nums[0] == 2 && nums[1] == 2 ||
                nums[0] == 3 && nums[1] == 3));
    }
    
    /**
     * Given an int array length 3, if there is a 2 in the array immediately
     * followed by a 3, set the 3 element to 0. Return the changed array.
     * @param nums
     * @return 
     */
    public int[] fix23(int[] nums) {
       int[] result = new int[nums.length];
       result[0] = nums[0];
        for (int i = 0; i < result.length - 1; i++) {
            result[i + 1] = (nums[i] == 2 && nums[i + 1] == 3)
                    ? 0 : nums[i + 1];
        }
       return result;
    }
    
    /**
     * Start with 2 int arrays, a and b, of any length.
     * Return how many of the arrays have 1 as their first element.
     * @param a
     * @param b
     * @return 
     */
    public int start1(int[] a, int[] b) {
        return start1(a, 1) + start1(b, 1);
    }
    
    /**
     * Return 1 if the array have num as its first element.
     * @param a
     * @param n
     * @return 
     */
    public int start1(int[] a, int n) {
        return (a.length > 0 && a[0] == n) ? 1 : 0;
    }
    
    /**
     * Start with 2 int arrays, a and b, each length 2. Consider the sum of the
     * values in each array. Return the array which has the largest sum. 
     * In event of a tie, return a.
     * @param a
     * @param b
     * @return 
     */
    public int[] biggerTwo(int[] a, int[] b) {
        return (sumArray(a) >= sumArray(b)) ? a : b;
    }

    /**
     * Given an array of ints of even length, return a new array length 2 
     * containing the middle two elements from the original array. 
     * The original array will be length 2 or more.
     * @param nums
     * @return 
     */
    public int[] makeMiddle(int[] nums) {
        return new int[]{nums[(nums.length / 2) - 1], nums[(nums.length / 2)]};
    }
    
    /**
     * Given 2 int arrays, each length 2, return a new array length 4 
     * containing all their elements.
     * @param a
     * @param b
     * @return 
     */
    public int[] plusTwo(int[] a, int[] b) {
        int[] result = Arrays.copyOf(a, a.length + b.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
    }
    
    /**
     * Given an array of ints, swap the first and last elements in the array. 
     * Return the modified array. The array length will be at least 1.
     * @param nums
     * @return 
     */
    public int[] swapEnds(int[] nums) {
        int[] result = Arrays.copyOf(nums, nums.length);
        if (result.length > 1) {
            result[0] += result[result.length -1];
            result[result.length -1] = result[0] - result[result.length -1];
            result[0] -= result[result.length -1];
        }
        return result;
    }
    
    /**
     * Given an array of ints of odd length, return a new array length 3 
     * containing the elements from the middle of the array. 
     * The array length will be at least 3.
     * @param nums
     * @return 
     */
    public int[] midThree(int[] nums) {
        int middle = (nums.length / 2);
        return new int[]{nums[middle - 1], nums[middle], nums[middle + 1]};
    }
    
    /**
     * Given an array of ints of odd length, look at the first, last, 
     * and middle values in the array and return the largest. 
     * The array length will be a least 1.
     * @param nums
     * @return 
     */
    public int maxTriple(int[] nums) {
        int max = Math.max(nums[0], nums[nums.length - 1]);
        return Math.max(max, nums[nums.length / 2]);
    }
    
    /**
     * Given an int array of any length, return a new array of its first 
     * 2 elements. 
     * If the array is smaller than length 2, use whatever elements are present.
     * @param nums
     * @return 
     */
    public int[] frontPiece(int[] nums) {
        return Arrays.copyOf(nums, Math.min(2, nums.length));
    }

    /**
     * We'll say that a 1 immediately followed by a 3 in an array is 
     * an "unlucky" 1. Return true if the given array contains an unlucky 1 
     * in the first 2 or last 2 positions in the array.
     * @param nums
     * @return 
     */
    public boolean unlucky1(int[] nums) {
        return nums.length > 1 && (unluckyNums(nums, 0, 1) 
                || unluckyNums(nums, nums.length - 2, nums.length -2));
    }

    private boolean unluckyNums(int[] nums, int firstElem, int lastElem) {
        for (int i = firstElem; i <= lastElem; i++) {
            if (nums[i] == 1 && nums[i + 1] == 3) return true;
        }
        return false;
    }
    
    /**
     * Given 2 int arrays, a and b, return a new array length 2 containing,
     * as much as will fit, the elements from a followed by the elements from b.
     * The arrays may be any length, including 0, but there will be 2 or more 
     * elements available between the 2 arrays.
     * @param a
     * @param b
     * @return 
     */
    public int[] make2(int[] a, int[] b) {
        int[] result = Arrays.copyOf(a, Math.min(a.length + b.length, 2));
        if (a.length < 2) {
            for (int i = a.length; i < result.length; i++) {
                result[i] = b[i - a.length];
            }
        }
        return result;
    }
    
    int[] concatArray(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0;
        for (int x : a) { c[i] = x; i ++; }
        for (int x : b) { c[i] = x; i ++; }
        return c;
    }
    
    /**
     * Given 2 int arrays, a and b, of any length, return a new array with 
     * the first element of each array. 
     * If either array is length 0, ignore that array.
     * @param a
     * @param b
     * @return 
     */
    public int[] front11(int[] a, int[] b) {
        if (a.length == 0 && b.length == 0) {return new int[]{};}
        if (a.length == 0) {return new int[]{b[0]};}
        if (b.length == 0) {return new int[]{a[0]};}
        return new int[]{a[0], b[0]};
    }
    
    /**
     * Return the number of even ints in the given array.
     * Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
     * @param nums
     * @return 
     */
    public int countEvens(int[] nums) {
        int count = 0;
        for (int elem : nums) {
            if (elem % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    
    /**
     * Given an array length 1 or more of ints, return the difference between
     * the largest and smallest values in the array. 
     * Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return
     * the smaller or larger of two values.
     * @param nums
     * @return 
     */
    public int bigDiff(int[] nums) {
       return getLargest(nums) - getSmallest(nums);
    }

    private int getSmallest(int[] nums) {
        int min = nums[0];
        for (int elem : nums) {
            min = Math.min(min, elem);
        }
        return min;
    }

    private int getLargest(int[] nums) {
        int max = nums[0];
        for (int elem : nums) {
            max = Math.max(max, elem);
        }
        return max;
    }

    /**
     * Return the "centered" average of an array of ints, which we'll say is
     * the mean average of the values, except ignoring the largest and smallest
     * values in the array. If there are multiple copies of the smallest value,
     * ignore just one copy, and likewise for the largest value.
     * Use int division to produce the final average.
     * You may assume that the array is length 3 or more.
     * @param nums
     * @return 
     */
    public int centeredAverage(int[] nums) {
        return (getSum(nums) - getLargest(nums) - getSmallest(nums)) 
                / (nums.length - 2);
    }

    private int getAverage(int[] nums) {
        return getSum(nums) / nums.length;
    }

    private int getSum(int[] nums) {
        int sum = 0;
        for (int elem : nums) {
            sum += elem;
        }
        return sum;
    }
        
    /**
     * Return the sum of the numbers in the array, returning 0 for an empty
     * array. Except the number 13 is very unlucky, so it does not count and
     * numbers that come immediately after a 13 also do not count.
     * @param nums
     * @return 
     */
    public int sum13(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++;
            } else {
                sum += nums[i];
            }
        }
        return sum;
    }
    
    /**
     * Return the sum of the numbers in the array, except ignore sections of
     * numbers starting with a 6 and extending to the next 7 (every 6 will be 
     * followed by at least one 7). Return 0 for no numbers.
     * @param nums
     * @return 
     */
    public int sum67(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == 7) {
                        i = j;
                        break;
                    }
                }
            } else {
                sum += nums[i];
            }
        }
        return sum;
    }
    
    /**
     * Given an array of ints, return true if the array contains a 2 next to
     * a 2 somewhere.
     * @param nums
     * @return 
     */
    public boolean has22(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Given an array of ints, return true if the array contains 
     * no 1's and no 3's.
     * @param nums
     * @return 
     */
    public boolean lucky13(int[] nums) {
        for (int elem : nums) {
            if (elem == 1 || elem == 3) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Given an array of ints, return true if the sum of all the 2's in the
     * array is exactly 8.
     * @param nums
     * @return 
     */
    public boolean sum28(int[] nums) {
        return sumIf(nums, 2) == 8;
    }

    private int sumIf(int[] nums, int i) {
        int sum = 0;
        for (int elem : nums) {
            sum += elem == i ? i : 0;
        }
        return sum;
    }
    
    /**
     * Given an array of ints, return true if the number of 1's is greater than
     * the number of 4's.
     * @param nums
     * @return 
     */
    public boolean more14(int[] nums) {
        return countNum(nums, 1) > countNum(nums, 4);
    }

    private int countNum(int[] nums, int i) {
        int count = 0;
        for (int elem : nums) {
            if (elem == i) {
                count++;
            }
        }
        return count;
    }
    
    /**
     * Given a number n, create and return a new int array of length n,
     * containing the numbers 0, 1, 2, ... n-1. The given n may be 0, in which
     * case just return a length 0 array. You do not need a separate
     * if-statement for the length-0 case; the for-loop should naturally
     * execute 0 times in that case, so it just works.
     * The syntax to make a new int array is: new int[desired_length] 
     * @param n
     * @return 
     */
    public int[] fizzArray(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i;
        }
        return result;
    }
    
    /**
     * Given an array of ints, return true if every element is a 1 or a 4.
     * @param nums
     * @return 
     */
    public boolean only14(int[] nums) {
        for (int elem : nums) {
            if (elem != 1 && elem != 4) {
                return false;
            }
        }
        return true;
    }

    /**
     * Given a number n, create and return a new string array of length n,
     * containing the strings "0", "1" "2" .. through n-1. N may be 0, in
     * which case just return a length 0 array. Note: String.valueOf(xxx)
     * will make the String form of most types.
     * The syntax to make a new string array is: new String[desired_length] 
     * @param n
     * @return 
     */
    public String[] fizzArray2(int n) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = String.valueOf(i);
        }
        return result;
    }

    /**
     * Given an array of ints, return true if it contains no 1's or it
     * contains no 4's.
     * @param nums
     * @return 
     */
    public boolean no14(int[] nums) {
        return !(arrayConts(nums, 1) && arrayConts(nums, 4));
    }

    private boolean arrayConts(int[] nums, int i) {
        for (int elem : nums) {
            if (elem == i) {
                return true;
            }
        }
        return false;
    }

    /**
     * We'll say that a value is "everywhere" in an array if for every pair of
     * adjacent elements in the array, at least one of the pair is that value.
     * Return true if the given value is everywhere in the array.
     * @param nums
     * @param val
     * @return 
     */
    public boolean isEverywhere(int[] nums, int val) {
        int[] adjacentPair = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            adjacentPair[0] = nums[i];
            adjacentPair[1] = nums[i + 1];
            if (!arrayConts(adjacentPair, val)) return false;
        }
        return true;
    }
    
    /**
     * Given an array of ints, return true if the array contains a 2 next to
     * a 2 or a 4 next to a 4, but not both.
     * @param nums
     * @return 
     */
    public boolean either24(int[] nums) {
        boolean two = false, four = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (isEqual(nums[i], nums[i + 1], 2)) {
                two = true;
            }
            if (isEqual(nums[i], nums[i + 1], 4)) {
                four = true;
            }
        }
        return xor(two, four);
    }
    
    private boolean isEqual(int num1, int num2, int value) {
        return num1 == value && num2 == value;
    }

    private boolean xor(boolean first, boolean second) {
        return (first && !second) || (!first && second);
    }
    
    /**
     * Given arrays nums1 and nums2 of the same length, for every element
     * in nums1, consider the corresponding element in nums2
     * (at the same index). Return the count of the number of times that
     * the two elements differ by 2 or less, but are not equal.
     * @param nums1
     * @param nums2
     * @return 
     */
    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] != nums2[i] && Math.abs(nums1[i] - nums2[i]) <= 2) {
                count++;
            }
        }
        return count;
    }
    
    /**
     * Given an array of ints, return true if the array contains two 7's next
     * to each other, or there are two 7's separated by one element,
     * such as with {7, 1, 7}.
     * @param nums
     * @return 
     */
    public boolean has77(int[] nums) {
        return isNeighbors(nums, 7, 1) || isNeighbors(nums, 7, 2);
    }

    private boolean isNeighbors(int[] nums, int value, int degree) {
        for (int i = 0; i < nums.length - degree; i++) {
            if (nums[i] == value && nums[i + degree] == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * Given an array of ints, return true if there is a 1 in the array with
     * a 2 somewhere later in the array.
     * @param nums
     * @return 
     */
    public boolean has12(int[] nums) {
        if (arrayConts(nums, 1)) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == 1) {
                    int[] part = new int[nums.length - i - 1];
                    for (int j = i + 1, k = 0; j < nums.length; j++) {
                        part[k++] = nums[j];
                    }
                    return arrayConts(part, 2);
                }
            }
        }
        return false;
    }
    
    /**
     * Given an array of ints, return true if the array contains either 3 even
     * or 3 odd values all next to each other.
     * @param nums
     * @return 
     */
    public boolean modThree(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if ((nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && 
                    nums[i + 2] % 2 == 0) ||
                (nums[i] % 2 == 1 && nums[i + 1] % 2 == 1 && 
                    nums[i + 2] % 2 == 1)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Given an array of ints, return true if the value 3 appears in the array
     * exactly 3 times, and no 3's are next to each other.
     * @param nums
     * @return 
     */
    public boolean haveThree(int[] nums) {
        if (countNum(nums, 3) == 3) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == 3 && nums[i + 1] == 3) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    /**
     * Given an array of ints, return true if every 2 that appears in the array
     * is next to another 2.
     * @param nums
     * @return 
     */
    public boolean twoTwo(int[] nums) {
        boolean result = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                result = (i > 0 && nums[i - 1] == 2) || 
                        (i < nums.length - 1 && nums[i + 1] == 2);
            }
        }
        return result;
    }
    
    /**
     * Return true if the group of N numbers at the start and end of the array
     * are the same. For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are
     * the same for n=0 and n=2, and false for n=1 and n=3. You may assume that
     * n is in the range 0..nums.length inclusive.
     * @param nums
     * @param len
     * @return 
     */
    public boolean sameEnds(int[] nums, int len) {
        boolean result = true;
        int[] begin = Arrays.copyOf(nums, len);
        int[] end = copyEndOfArray(nums, len);
        for (int i = 0; i < end.length; i++) {
            result = begin[i] == end[i];
        }
        return result;
    }

    private int[] copyEndOfArray(int[] nums, int len) {
        int[] result = new int[len];
        for (int i = 0; i < result.length; i++) {
            result[i] = nums[nums.length - len + i];
        }
        return result;
    }
    
    /**
     * Return true if the array contains, somewhere, three increasing adjacent
     * numbers like .... 4, 5, 6, ... or 23, 24, 25.
     * @param nums
     * @return 
     */
    public boolean tripleUp(int[] nums) {
        int[] copy = Arrays.copyOf(nums, nums.length);
        while (copy.length > 2) {
            int[] triple = Arrays.copyOf(copy, 3);
            if ((triple[2] - triple[1] == 1) 
                    && (triple[1] - triple[0] == 1)) {
                return true;
            }
            copy = Arrays.copyOfRange(copy, 1, copy.length);
        }
        return false;
    }
    
    /**
     * Given start and end numbers, return a new array containing the sequence
     * of integers from start up to but not including end, so start=5 and
     * end=10 yields {5, 6, 7, 8, 9}. The end number will be greater or equal
     * to the start number. Note that a length-0 array is valid.
     * @param start
     * @param end
     * @return 
     */
    public int[] fizzArray3(int start, int end) {
        int[] result = new int[end - start];
        for (int i = 0; i < result.length; i++) {
            result[i] = start++;
        }
        return result;
    }
    
    /**
     * Return an array that is "left shifted" by one -- so {6, 2, 5, 3}
     * returns {2, 5, 3, 6}. You may modify and return the given array,
     * or return a new array.
     * @param nums
     * @return 
     */
    public int[] shiftLeft(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            result[i - 1] = nums[i];
        }
        if (nums.length > 0) {
            result[result.length - 1] = nums[0];
        }
        return result;
    }
    
    /**
     * For each multiple of 10 in the given array, change all the values
     * following it to be that multiple of 10, until encountering another
     * multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.
     * @param nums
     * @return 
     */
    public int[] tenRun(int[] nums) {
        int[] result = new int[nums.length];
        int value = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                value = nums[i];
            }
            result[i] = value < 0 ? nums[i] : value;
        }
        return result;
    }
    
    /**
     * Given a non-empty array of ints, return a new array containing the
     * elements from the original array that come before the first 4 in the
     * original array. The original array will contain at least one 4.
     * Note that it is valid in java to create an array of length 0.
     * @param nums
     * @return 
     */
    public int[] pre4(int[] nums) {
        int[] result = new int[indexOf(nums, 4)];
        int i = 0;
        while (nums[i] != 4) {
            result[i] = nums[i++];
        }
        return result;
    }
    
    private int indexOf(int[] nums, int value) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value) {
                return i;
            }
        }
        return -1;
    }
    
    /**
     * Given a non-empty array of ints, return a new array containing the
     * elements from the original array that come after the last 4 in the
     * original array. The original array will contain at least one 4.
     * Note that it is valid in java to create an array of length 0.
     * @param nums
     * @return 
     */
    public int[] post4(int[] nums) {
        return reverse(pre4(Arrays.copyOf(reverse(nums), nums.length)));
    }

    private int[] reverse(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[result.length - i - 1] = nums[i];
        }
        return result;
    }
    
    /**
     * We'll say that an element in an array is "alone" if there are values
     * before and after it, and those values are different from it. Return a
     * version of the given array where every instance of the given value
     * which is alone is replaced by whichever value to its left or right
     * is larger.
     * @param nums
     * @param val
     * @return 
     */
    public int[] notAlone(int[] nums, int val) {
        if (nums.length < 2) {return nums;}
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length - 1; i++) {
            result[i] = (nums[i] == val && isAlone(nums, i))
                    ? Math.max(nums[i - 1], nums[i + 1]) : nums[i];
            System.out.print((nums[i] == val && isAlone(nums, i)) + "\t");
        }
        result[nums.length - 1] = nums[nums.length - 1];
        return result;
    }

    private boolean isAlone(int[] nums, int index) {
        if (index == 0) {
            return nums[index] != nums[index + 1];
        }
        if (index == nums.length - 1) {
            return nums[index] != nums[index - 1];
        }
        return nums[index] != nums[index - 1] && 
                nums[index] != nums[index + 1];
    }
    
    /**
     * Return an array that contains the exact same numbers as the given array,
     * but rearranged so that all the zeros are grouped at the start of the
     * array. The order of the non-zero numbers does not matter.
     * So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return the
     * given array or make a new array.
     * @param nums
     * @return 
     */
    public int[] zeroFront(int[] nums) {
        int[] result = new int[nums.length];
        int zero = countNum(nums, 0);
        Arrays.fill(result, 0, zero, 0);
        for (int elem : nums) {
            if (elem != 0) {
                result[zero++] = elem;
            }
        }
        return result;
    }
    
    /**
     * Return a version of the given array where all the 10's have been removed.
     * The remaining elements should shift left towards the start of the array
     * as needed, and the empty spaces a the end of the array should be 0.
     * So {1, 10, 10, 2} yields {1, 2, 0, 0}.
     * You may modify and return the given array or make a new array.
     * @param nums
     * @return 
     */
    public int[] withoutTen(int[] nums) {
        if (countNum(nums, 10) == 0) {
            return nums;
        }
        int[] result = new int[nums.length];
        int zero = 0;
        for (int elem : nums) {
            if (elem != 10) {
                result[zero++] = elem;
            }
        }
        Arrays.fill(result, zero + 1, result.length, 0);
        return result;
    }

    /**
     * Return a version of the given array where each zero value in the array
     * is replaced by the largest odd value to the right of the zero in the
     * array. If there is no odd value to the right of the zero, leave the zero
     * as a zero.
     * @param nums
     * @return 
     */
    public int[] zeroMax(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] != 0 ? nums[i] : largestNextOdd(nums, i);
        }
        return result;
    }

    private int largestNextOdd(int[] nums, int start) {
        int result = 0;
        for (int i = start; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                result = Math.max(result, nums[i]);
            }
        }
        return result;
    }
    
    /**
     * Return an array that contains the exact same numbers as the given array,
     * but rearranged so that all the even numbers come before all the odd
     * numbers. Other than that, the numbers can be in any order. You may
     * modify and return the given array, or make a new array.
     * @param nums
     * @return 
     */
    public int[] evenOdd(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;
        for (int elem : nums) {
            if (elem % 2 == 0) {
                result[index++] = elem;
            }
        }
        for (int elem : nums) {
            if (elem % 2 == 1) {
                result[index++] = elem;
            }
        }
        return result;
    }
    
    /**
     * This is slightly more difficult version of the famous FizzBuzz problem
     * which is sometimes given as a first problem for job interviews.
     * (See also: FizzBuzz Code.)
     * Consider the series of numbers beginning at start and running up to
     * but not including end, so for example start=1 and end=5 gives the
     * series 1, 2, 3, 4. 
     * Return a new String[] array containing the string form of these numbers,
     * except for multiples of 3, use "Fizz" instead of the number,
     * for multiples of 5 use "Buzz", and
     * for multiples of both 3 and 5 use "FizzBuzz".
     * In Java, String.valueOf(xxx) will make the String form of an int or
     * other type. This version is a little more complicated than the usual
     * version since you have to allocate and index into an array instead of
     * just printing, and we vary the start/end instead of just
     * always doing 1..100.
     * @param start
     * @param end
     * @return 
     */
    public String[] fizzBuzz(int start, int end) {
        String[] result = new String[end - start--];
        int i = 0;
        while (++start < end) {
            if (start % 3 == 0) {
                if (start % 5 == 0) {
                    result[i++] = "FizzBuzz";
                } else {
                    result[i++] = "Fizz";
                }
            } else if (start % 5 == 0) {
                result[i++] = "Buzz";
            } else {
                result[i++] = String.valueOf(start);
            }
            //start++;
        }
        return result;
    }

    /**
     * Consider the leftmost and righmost appearances of some value in an array.
     * We'll say that the "span" is the number of elements between the two
     * inclusive. A single value has a span of 1. Returns the largest span
     * found in the given array. (Efficiency is not a priority.)
     * @param nums
     * @return 
     */
    public int maxSpan(int[] nums) {
        int result = 0;
        for (int first = 0; first < nums.length; first++) {
            int last = lastIndexOf(nums, nums[first]);
            result = Math.max(result, last - first + 1);
        }
        return result;
    }
    
    private int lastIndexOf(int[] nums, int value) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == value) {
                return i;
            }
        }
        return -1;
    }
    
    /**
     * Return an array that contains exactly the same numbers as the given
     * array, but rearranged so that every 3 is immediately followed by a 4.
     * Do not move the 3's, but every other number may move. The array contains
     * the same number of 3's and 4's, every 3 has a number after it that is
     * not a 3, and a 3 appears in the array before any 4.
     * @param nums
     * @return 
     */
    public int[] fix34(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result, Integer.MIN_VALUE);
        int four = countNum(nums, 4);
        int[] rest = new int[nums.length - four - countNum(nums, 3)];
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                result[i] = 3;
                if (four-- > 0) {
                    result[i + 1] = 4;
                }
            } else if (nums[i] != 4) {
                rest[j++] = i;
            }
        }
        for (int i = 0, j = 0; i < result.length; i++) {
            if (result[i] == Integer.MIN_VALUE) {
                result[i] = nums[rest[j++]];
            }
        }
        return result;
    }
    
    /**
     * Return an array that contains exactly the same numbers as the given
     * array, but rearranged so that every 4 is immediately followed by a 5.
     * Do not move the 4's, but every other number may move. The array contains
     * the same number of 4's and 5's, and every 4 has a number after it that
     * is not a 4.
     * In this version, 5's may appear anywhere in the original array.
     * @param nums
     * @return 
     */
    public int[] fix45(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result, Integer.MIN_VALUE);
        int five = countNum(nums, 5);
        int[] rest = new int[nums.length - five - countNum(nums, 4)];
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                result[i] = 4;
                if (five-- > 0) {
                    result[i + 1] = 5;
                }
            } else if (nums[i] != 5) {
                rest[j++] = i;
            }
        }
        for (int i = 0, j = 0; i < result.length; i++) {
            if (result[i] == Integer.MIN_VALUE) {
                result[i] = nums[rest[j++]];
            }
        }
        return result;
    }

    /**
     * Given a non-empty array, return true if there is a place to split
     * the array so that the sum of the numbers on one side is equal to
     * the sum of the numbers on the other side.
     * @param nums
     * @return 
     */
    public boolean canBalance(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (getSum(Arrays.copyOf(nums, i)) == 
                    getSum(Arrays.copyOfRange(nums, i, nums.length))) {
                return true;
            }
        }
        return false;
    }
     
     /**
      * Given two arrays of ints sorted in increasing order, outer and inner,
      * return true if all of the numbers in inner appear in outer.
      * The best solution makes only a single "linear" pass of both arrays,
      * taking advantage of the fact that both arrays are already in sorted order.
      * @param outer
      * @param inner
      * @return 
      */
    public boolean linearIn(int[] outer, int[] inner) {
        int counts = 0;
        for (int elem : inner) {
            if (arrayConts(outer, elem)) {
                counts++;
            }
        }
        return counts == inner.length;
    }
    
    /**
     * Given n>=0, create an array length n*n with the following pattern, shown
     * here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1}
     * (spaces added to show the 3 groups).
     * @param n
     * @return 
     */
    public int[] squareUp(int n) {
        int[] result = new int[n * n];
        int index = 0, row = n;
        while (row > 0) {
            int value = 1;
            while (value <= row) {
                result[index++] = value++;
            }
            row--;
            index = (n - row) * n;
        }
        return reverse(result);
    }

    /**
     * Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   
     * ... 1, 2, 3 .. n} (spaces added to show the grouping). 
     * Note that the length of the array will be 1 + 2 + 3 ... + n,
     * which is known to sum to exactly n*(n + 1)/2.
     * @param n
     * @return 
     */
    public int[] seriesUp(int n) {
        int[] result = new int[n * (n + 1) / 2];
        int index = 0, row = 0;
        while (row++ < n) {
            int value = 1;
            while (value <= row) {
                result[index++] = value++;
            }
        }
        return result;
    }
    
    /**
     * We'll say that a "mirror" section in an array is a group of contiguous
     * elements such that somewhere in the array, the same group appears in
     * reverse order. For example, the largest mirror section in
     * {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part).
     * Return the size of the largest mirror section found in the given array.
     * @param nums
     * @return 
     */
    public int maxMirror(int[] nums) {
        if (nums.length < 2) {return nums.length;}
        int count = 0;
        for (int i = 1; i <= nums.length; i++) {
            for (int j = 0; j <= nums.length - i; j++) {
                int[] begin = Arrays.copyOfRange(nums, j, j + i);
                for (int k = 0; k <= nums.length - i; k++) {
                    int[] end = Arrays.copyOfRange(nums, k, k + i);
                    System.out.println(Arrays.toString(begin) + Arrays.toString(end));
                    if (isMirror(begin, end)) {
                        count = begin.length;
                    }
                }
            }
        }
        return count;
    }

    private boolean isMirror(int[] begin, int[] end) {
        for (int i = 0; i < begin.length; i++) {
            if (begin[i] != end[end.length - 1 -i]) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Say that a "clump" in an array is a series of 2 or more adjacent
     * elements of the same value.
     * Return the number of clumps in the given array.
     * @param nums
     * @return 
     */
    public int countClumps(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
                while (++i < nums.length - 1 && nums[i] == nums[i + 1]) {}
            }
        }
        return count;
    }
}