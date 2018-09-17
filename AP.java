package codingbat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Ócsai István
 */
public class AP {
    
    /**
     * Given an array of scores, return true if each score is equal or greater
     * than the one before. The array will be length 2 or more.
     * @param scores
     * @return 
     */
    public boolean scoresIncreasing(int[] scores) {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[i - 1]) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Given an array of scores, return true if there are scores of 100 next to
     * each other in the array. The array length will be at least 2.
     * @param scores
     * @return 
     */
    public boolean scores100(int[] scores) {
        if (scores.length < 3) {return arrayConts(scores, 100);}
        if (!arrayConts(scores, 100)) {
            return false;
        }
        for (int i = 1; i < scores.length - 1; i++) {
            if (scores[i] == 100 && scores[i - 1] != 100 && scores[i + 1] != 100) {
                return false;
            }
        }
        return true; 
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
     * Given an array of scores sorted in increasing order, return true if the
     * array contains 3 adjacent scores that differ from each other by at
     * most 2, such as with {3, 4, 5} or {3, 5, 5}.
     * @param scores
     * @return 
     */
    public boolean scoresClump(int[] scores) {
        for (int i = 0; i < scores.length - 2; i++) {
            if (Math.abs(scores[i] - scores[i + 2]) <= 2) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Given an array of scores, compute the int average of the first half and
     * the second half, and return whichever is larger. We'll say that the
     * second half begins at index length/2. The array length will be at least 2. 
     * @param scores
     * @return 
     */
    public int scoresAverage(int[] scores) {
        return Math.max(average(scores, 0, scores.length / 2),
                average(scores, scores.length / 2, scores.length));
    }
    
    /**
     * Computes the average of the elements between indexes start..end.
     * @param scores
     * @param start
     * @param end
     * @return 
     */
    int average(int[] scores, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += scores[i];
        }
        return sum / (end - start);
    }
    
    /**
     * Given an array of strings, return the count of the number of strings
     * with the given length.
     * @param words
     * @param len
     * @return 
     */
    public int wordsCount(String[] words, int len) {
        int count = 0;
        for (String word : words) {
            if (word.length() == len) {
                count++;
            }
        }
        return count;
    }
    
    /**
     *  Given an array of strings, return a new array containing the first
     * N strings. N will be in the range 1..length.
     * @param words
     * @param n
     * @return 
     */
    public String[] wordsFront(String[] words, int n) {
        return Arrays.copyOf(words, n);
    }
    
    /**
     * Given an array of strings, return a new List (e.g. an ArrayList) where
     * all the strings of the given length are omitted. 
     * @param words
     * @param len
     * @return 
     */
    public List wordsWithoutList(String[] words, int len) {
        List result = new ArrayList();
        for (String word : words) {
            if (word.length() != len) {
                result.add(word);
            }
        }
        return result;
    }
    
    /**
     * Given a positive int n, return true if it contains a 1 digit.
     * Note: use % to get the rightmost digit, and / to discard the rightmost digit.
     * @param n
     * @return 
     */
    public boolean hasOne(int n) {
        while (n > 0) {
            if (n % 10 == 1) {
                return true;
            }
            n /= 10;
        }
        return false;
    }
    
    /**
     * We'll say that a positive int divides itself if every digit in the
     * number divides into the number evenly. So for example 128 divides itself
     * since 1, 2, and 8 all divide into 128 evenly. We'll say that 0 does not
     * divide into anything evenly, so no number with a 0 digit divides itself. 
     * @param n
     * @return 
     */
    public boolean dividesSelf(int n) {
        int i = n;
        while (i > 0) {
            if (i % 10 == 0 || n % (i % 10) != 0) {
                return false;
            }
            i /= 10;
        }
        return true;
    }
    
    /**
     * Given an array of positive ints, return a new array of length "count"
     * containing the first even numbers from the original array.
     * The original array will contain at least "count" even numbers.
     * @param nums
     * @param count
     * @return 
     */
    public int[] copyEvens(int[] nums, int count) {
        int[] result = new int[count];
        int index = 0;
        for (int elem : nums) {
            if (elem % 2 == 0) {
                result[index++] = elem;
                if (--count == 0) {
                    return result;
                }
            }
        }
        return result;
    }
    
    /**
     * We'll say that a positive int n is "endy" if it is in the range 0..10
     * or 90..100 (inclusive). Given an array of positive ints, return a new
     * array of length "count" containing the first endy numbers from the
     * original array. Decompose out a separate isEndy(int n) method to test
     * if a number is endy. The original array will contain at least "count"
     * endy numbers.
     * @param nums
     * @param count
     * @return 
     */
    public int[] copyEndy(int[] nums, int count) {
        int[] result = new int[count];
        int index = 0;
        for (int elem : nums) {
            if (elem >= 0 && elem <= 10 || elem >= 90 && elem <= 100) {
                result[index++] = elem;
                if (--count == 0) {
                    return result;
                }
            }
        }
        return result;
    }
    
    /**
     * Given 2 arrays that are the same length containing strings, compare the
     * 1st string in one array to the 1st string in the other array, the 2nd to
     * the 2nd and so on. Count the number of times that the 2 strings are
     * non-empty and start with the same char. The strings may be any length,
     * including 0.
     * @param a
     * @param b
     * @return 
     */
    public int matchUp(String[] a, String[] b) {
        int count = 0;
        for (int i = 0; i < Math.min(a.length, b.length); i++) {
            if (a[i].length() != 0 && b[i].length() != 0 &&
                    a[i].charAt(0) == b[i].charAt(0)) {
                count++;
            }
        }
        return count;
    }
    
    /**
     * The "key" array is an array containing the correct answers to an exam,
     * like {"a", "a", "b", "b"}. the "answers" array contains a student's
     * answers, with "?" representing a question left blank. The two arrays
     * are not empty and are the same length. Return the score for this array
     * of answers, giving +4 for each correct answer, -1 for each incorrect
     * answer, and +0 for each blank answer.
     * @param key
     * @param answers
     * @return 
     */
    public int scoreUp(String[] key, String[] answers) {
        final int GOOD = 4, BAD = -1, BLANK = 0;
        int score = 0;
        for (int i = 0; i < key.length; i++) {
            if (!answers[i].equals("?")) {
                if (key[i].equals(answers[i])) {
                    score += GOOD;
                } else {
                    score += BAD;
                }
            } else {
                score += BLANK;
            }
        }
        return score;
    }
    
    /**
     * Given an array of strings, return a new array without the strings that
     * are equal to the target string. One approach is to count the occurrences
     * of the target string, make a new array of the correct length, and then
     * copy over the correct strings.
     * @param words
     * @param target
     * @return 
     */
    public String[] wordsWithout(String[] words, String target) {
        String[] result = new String[words.length - countNum(words, target)];
        int index = 0;
        for (String elem : words) {
            if (!elem.equals(target)) {
                result[index++] = elem;
            }
        }
        return result;
    }
    
    private int countNum(String[] words, String target) {
        int count = 0;
        for (String elem : words) {
            if (elem.equals(target)) {
                count++;
            }
        }
        return count;
    }
    
    /**
     * Given two arrays, A and B, of non-negative int scores. A "special" score
     * is one which is a multiple of 10, such as 40 or 90. Return the sum of
     * largest special score in A and the largest special score in B.
     * @param a
     * @param b
     * @return 
     */
    public int scoresSpecial(int[] a, int[] b) {
        return scoresSpecial(a) + scoresSpecial(b);
    }
    
    /**
     * Finds the largest special score in an array.
     * @param nums
     * @return 
     */
    public int scoresSpecial(int[] nums) {
        int result = 0;
        for (int elem : nums) {
            if (elem % 10 == 0) {
                result = Math.max(elem, result);
            }
        }
        return result;
    }
    
    /**
     * We have an array of heights, representing the altitude along a walking
     * trail. Given start/end indexes into the array, return the sum of the
     * changes for a walk beginning at the start index and ending at the end
     * index. For example, with the heights {5, 3, 6, 7, 2} and start=2, end=4
     * yields a sum of 1 + 5 = 6. The start end end index will both be valid
     * indexes into the array with start <= end.
     * @param heights
     * @param start
     * @param end
     * @return 
     */
    public int sumHeights(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += Math.abs(heights[i] - heights[i + 1]);
        }
        return sum;
    }
    
    /**
     * (A variation on the sumHeights problem.) We have an array of heights,
     * representing the altitude along a walking trail. Given start/end indexes
     * into the array, return the sum of the changes for a walk beginning at
     * the start index and ending at the end index, however increases in height
     * count double. For example, with the heights {5, 3, 6, 7, 2} and start=2,
     * end=4 yields a sum of 1*2 + 5 = 7. The start end end index will both be
     * valid indexes into the array with start <= end.
     * @param heights
     * @param start
     * @param end
     * @return 
     */
    public int sumHeights2(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += (heights[i] < heights[i + 1]) ?
                    2 * (heights[i + 1] - heights[i]) : 
                    heights[i] - heights[i + 1];
        }
        return sum;
    }
    
    /**
     * (A variation on the sumHeights problem.) We have an array of heights,
     * representing the altitude along a walking trail. Given start/end indexes
     * into the array, return the number of "big" steps for a walk starting at
     * the start index and ending at the end index. We'll say that step is big
     * if it is 5 or more up or down. The start end end index will both be
     * valid indexes into the array with start <= end.
     * @param heights
     * @param start
     * @param end
     * @return 
     */
    public int bigHeights(int[] heights, int start, int end) {
        int count = 0;
        for (int i = start; i < end; i++) {
            if (Math.abs(heights[i] - heights[i + 1]) >= 5) {
                count ++;
            }
        }
        return count;
    }
    
    /**
     * We have data for two users, A and B, each with a String name and an
     * int id. The goal is to order the users such as for sorting. Return -1
     * if A comes before B, 1 if A comes after B, and 0 if they are the same.
     * Order first by the string names, and then by the id numbers if the
     * names are the same.
     * Note: with Strings str1.compareTo(str2) returns an int value which is
     * negative/0/positive to indicate how str1 is ordered to str2
     * (the value is not limited to -1/0/1).
     * On the AP, there would be two User objects, but here the code simply
     * takes the two strings and two ints directly. The code logic is the same.
     * @param aName
     * @param aId
     * @param bName
     * @param bId
     * @return 
     */
    public int userCompare(String aName, int aId, String bName, int bId) {
        if (aName.compareTo(bName) < 0) {
            return -1;
        } else if (aName.compareTo(bName) > 0) {
            return 1;
        } else if (aId < bId) {
            return -1;
        } else if (aId > bId) {
            return 1;
        }
        return 0;
    }
    
    /**
     * Start with two arrays of strings, A and B, each with its elements in
     * alphabetical order and without duplicates. Return a new array containing
     * the first N elements from the two arrays. The result array should be in
     * alphabetical order and without duplicates. A and B will both have a
     * length which is N or more. The best "linear" solution makes a single
     * pass over A and B, taking advantage of the fact that they are in
     * alphabetical order, copying elements directly to the new array.
     * @param a
     * @param b
     * @param n
     * @return 
     */
    public String[] mergeTwo(String[] a, String[] b, int n) {
        String[] result = new String[n];
        int aIndex = 0, bIndex = 0, index = 0;
        while (index < n) {
            if (a[aIndex].compareTo(b[bIndex]) < 0) {
                result[index++] = a[aIndex++];
            } else if (a[aIndex].compareTo(b[bIndex]) > 0) {
                result[index++] = b[bIndex++];
            } else {
                result[index++] = a[aIndex++];
                bIndex++;
            }
        }
        return result;
    }
    
    /**
     * Start with two arrays of strings, a and b, each in alphabetical order,
     * possibly with duplicates. Return the count of the number of strings
     * which appear in both arrays. The best "linear" solution makes a single
     * pass over both arrays, taking advantage of the fact that they are in
     * alphabetical order.
     * @param a
     * @param b
     * @return 
     */
    public int commonTwo(String[] a, String[] b) {
        int count = 0, index = 0;
        String lastWord = "";
        for (int i = 0; i < a.length; i++) {
            while (index < b.length && b[index].compareTo(a[i]) <= 0) {
                if (b[index++].compareTo(a[i]) == 0) {
                    count += b[index - 1].compareTo(lastWord) != 0 ? 1 : 0;
                    lastWord = a[i];
                }
            }
        }
        return count;
    }
}