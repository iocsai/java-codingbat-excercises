package codingbat;

/**
 *
 * @author Ócsai István
 */
public class Strings {
    
    /**
     * Given a string name, e.g. "Bob", return a greeting of the form 
     * "Hello Bob!".
     * @param name
     * @return 
     */
    public String helloName(String name) {
        return "Hello " + name + "!";
    }
    
    /**
     * Given two strings, a and b, return the result of putting them together 
     * in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
     * @param a
     * @param b
     * @return 
     */
    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }
    
    /**
     * The web is built with HTML strings like "<i>Yay</i>" which draws Yay 
     * as italic text. In this example, the "i" tag makes <i> and </i> which 
     * surround the word "Yay". Given tag and word strings, create the HTML 
     * string with tags around the word, e.g. "<i>Yay</i>".
     * @param tag
     * @param word
     * @return 
     */
    public String makeTags(String tag, String word) {
        String frontTag = "<" + tag + ">";
        String endTag = "</" + tag + ">";
        return frontTag + word + endTag;
    }
    
    /**
     * Given an "out" string length 4, such as "&lt;&lt;&gt;&gt;", and a word, return a 
     * new string where the word is in the middle of the out string, 
     * e.g. "&lt;&lt;word&gt;&gt;". Note: use str.substring(i, j) to extract the String 
     * starting at index i and going up to but not including index j.
     * @param out
     * @param word
     * @return 
     */
    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2);
    }
    
    /**
     * Given a string, return a new string made of 3 copies of the last 2 chars
     * of the original string. The string length will be at least 2.
     * @param str
     * @return 
     */
    public String extraEnd(String str) {
        if (str.length() < 2) return "";
        String end = str.substring(str.length() - 2);
        return end + end + end;
    }
    
    /**
     * Given a string, return the string made of its first two chars, so the 
     * String "Hello" yields "He". If the string is shorter than length 2, 
     * return whatever there is, so "X" yields "X", and the empty string "" 
     * yields the empty string "". 
     * Note that str.length() returns the length of a string.
     * @param str
     * @return 
     */
    public String firstTwo(String str) {
        return str.length() < 2 ? str : str.substring(0, 2);
    }

    /**
     * Given a string of even length, return the first half. 
     * So the string "WooHoo" yields "Woo".
     * @param str
     * @return 
     */
    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }
    
    /**
     * Given a string, return a version without the first and last char, 
     * so "Hello" yields "ell". The string may be any length, including 0.
     * @param str
     * @return 
     */
    public String withoutEnd(String str) {
        return str.length() >= 2 ? str.substring(1, str.length() - 1) : "";
    }

    /**
     * Given 2 strings, a and b, return a string of the form short+long+short, 
     * with the shorter string on the outside and the longer string on the 
     * inside. The strings will not be the same length, 
     * but they may be empty (length 0).
     * @param a
     * @param b
     * @return 
     */
    public String comboString(String a, String b) {
        return (b.length() < a.length()) ? b + a + b : a + b + a;
    }
    
    /**
     * Given 2 strings, return their concatenation, except omit the first char
     * of each. The strings will be at least length 1.
     * @param a
     * @param b
     * @return 
     */
    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }
    
    /**
     * Given a string, return a "rotated left 2" version where the first 2 
     * chars are moved to the end. The string length will be at least 2.
     * @param str
     * @return 
     */
    public String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    /**
     * Given a string, return a "rotated right 2" version where the last 2 
     * chars are moved to the start. The string length will be at least 2.
     * @param str
     * @return 
     */
    public String right2(String str) {
        return str.substring(str.length() - 2) + 
                str.substring(0, str.length() - 2);
    }
    
    /**
     * Given a string, return a string length 1 from its front, unless front is
     * false, in which case return a string length 1 from its back. 
     * The string will be non-empty.
     * @param str
     * @param front
     * @return 
     */
    public String theEnd(String str, boolean front) {
        if (str.length() < 2) return str;
        return front ? str.substring(0, 1) : str.substring(str.length() - 1);
    }
    
    /**
     * Given a string of even length, return a string made of the middle two 
     * chars, so the string "string" yields "ri". 
     * The string length will be at least 2.
     * @param str
     * @return 
     */
    public String middleTwo(String str) {
        return (str.length() >= 2) ? 
                str.substring((str.length() / 2) - 1, (str.length() / 2) + 1) :
                str;
    }
    
    /**
     * Given a string, return true if it ends in "ly".
     * @param str
     * @return 
     */
    public boolean endsLy(String str) {
        return (str.length() >= 2) && 
                str.substring(str.length() - 2).equals("ly");
    }
    
    /**
     * Given a string and an int n, return a string made of the first and last
     * n chars from the string. The string length will be at least n.
     * @param str
     * @param n
     * @return 
     */
    public String nTwice(String str, int n) {
        return (str.length() <= n) ? str + str :
                str.substring(0, n) + str.substring(str.length() - n);
    }
    
    /**
     * Given a string and an index, return a string length 2 starting at the
     * given index. If the index is too big or too small to define a string 
     * length 2, use the first 2 chars. The string length will be at least 2.
     * @param str
     * @param index
     * @return 
     */
    public String twoChar(String str, int index) {
        return (index + 1 > str.length() || index < 0) ? str.substring(0, 2) :
                str.substring(index, index + 2);
    }
    
    /**
     * Given a string of odd length, return the string length 3 from its middle,
     * so "Candy" yields "and". The string length will be at least 3.
     * @param str
     * @return 
     */
    public String middleThree(String str) {
        return str.substring((str.length() / 2) - 1, (str.length() / 2) + 2);
    }
    
    /**
     * Given a string, return true if "bad" appears starting at index 0 or 1 
     * in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". 
     * The string may be any length, including 0. 
     * Note: use .equals() to compare 2 strings.
     * @param str
     * @return 
     */
    public boolean hasBad(String str) {
        return (str.length() >= 3 && str.substring(0, 3).equals("bad"))
                || (str.length() >=4 && str.substring(1, 4).equals("bad"));
    }
    
    /**
     * Given a string, return a string length 2 made of its first 2 chars. 
     * If the string length is less than 2, use '@' for the missing chars.
     * @param str
     * @return 
     */
    public String atFirst(String str) {
        return (str.length() < 2) ? (str + "@@").substring(0, 2) :
                str.substring(0, 2);
    }
    
    /**
     * Given 2 strings, a and b, return a new string made of the first char
     * of a and the last char of b, so "yo" and "java" yields "ya". 
     * If either string is length 0, use '@' for its missing char.
     * @param a
     * @param b
     * @return 
     */
    public String lastChars(String a, String b) {
        if (a.length() < 1) a = "@";
        if (b.length() < 1) b = "@";
        return a.substring(0, 1) + b.substring(b.length() - 1);
    }
    
    /**
     * Given two strings, append them together (known as "concatenation") and 
     * return the result. However, if the concatenation creates a double-char, 
     * then omit one of the chars, so "abc" and "cat" yields "abcat".
     * @param a
     * @param b
     * @return 
     */
    public String conCat(String a, String b) {
        if (a.length() < 1) a = b.substring(0, 1);
        if (b.length() < 1) b = a.substring(a.length() - 1);
        return (a.charAt(a.length() - 1) == b.charAt(0))
                ? a + b.substring(1) : a + b;
    }
    
    /**
     * Given a string of any length, return a new string where the last 2 chars,
     * if present, are swapped, so "coding" yields "codign".
     * @param str
     * @return 
     */
    public String lastTwo(String str) {
        return (str.length() >= 2)
                ? str.substring(0, str.length() - 2) 
                + str.substring(str.length() - 1)
                + str.substring(str.length() - 2, str.length() - 1) 
                : str;
    }
    
    /**
     * Given a string, if the string begins with "red" or "blue" return that 
     * color string, otherwise return the empty string.
     * @param str
     * @return 
     */
    public String seeColor(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("red")) return "red";
        if (str.length() >= 4 && str.substring(0, 4).equals("blue")) return "blue";
        return "";
    }
    
    /**
     * Given a string, return true if the first 2 chars in the string also 
     * appear at the end of the string, such as with "edited".
     * @param str
     * @return 
     */
    public boolean frontAgain(String str) {
        return (str.length() >= 2
                && str.substring(0, 2).equals(str.substring(str.length() - 2)));
    }
    
    /**
     * Given two strings, append them together (known as "concatenation") and 
     * return the result. However, if the strings are different lengths, omit 
     * chars from the longer string so it is the same length as the shorter 
     * string. So "Hello" and "Hi" yield "loHi". The strings may be any length.
     * @param a
     * @param b
     * @return 
     */
    public String minCat(String a, String b) {
        int len = Math.min(a.length(), b.length());
        a = a.substring(a.length() - len, a.length());
        b = b.substring(b.length() - len, b.length());
        return a + b;
    }
    
    /**
     * Given a string, return a new string made of 3 copies of the first 
     * 2 chars of the original string. The string may be any length. 
     * If there are fewer than 2 chars, use whatever is there.
     * @param str
     * @return 
     */
    public String extraFront(String str) {
        return (str.length() >= 2)
                ? multiString(str.substring(0, 2), 3)
                : multiString(str, 3);
    }

    /**
     * Multiplies the str int times.
     * @param str
     * @param multiplier
     * @return 
     */
    public String multiString(String str, int multiplier) {
        String result = "";
        for (int i = 0; i < multiplier; i++) {
            result += str;
        }
        return result;
    }
    
    /**
     * Given a string, if a length 2 substring appears at both its beginning 
     * and end, return a string without the substring at the beginning, 
     * so "HelloHe" yields "lloHe". The substring may overlap with itself, 
     * so "Hi" yields "". Otherwise, return the original string unchanged.
     * @param str
     * @return 
     */
    public String without2(String str) {
        return (str.length() >= 2 
                && str.substring(0, 2).equals(str.substring(str.length() - 2)))
                ? str.substring(2) : str;
    }
    
    /**
     * Given a string, return a version without the first 2 chars. 
     * Except keep the first char if it is 'a' and keep the second char if 
     * it is 'b'. The string may be any length. Harder than it looks.
     * @param str
     * @return 
     */
    public String deFront(String str) {
        String result = str.substring(2);
        char a = 'a', b = 'b';
        if (str.charAt(1) == b) result = b + result;
        if (str.charAt(0) == a) result = a + result;
        return result;
    }
    
    /**
     * Given a string and a second "word" string, we'll say that the word 
     * matches the string if it appears at the front of the string, 
     * except its first char does not need to match exactly. On a match, 
     * return the front of the string, or otherwise return the empty string. 
     * So, so with the string "hippo" the word "hi" returns "hi" and "xip" 
     * returns "hip". The word will be at least length 1.
     * @param str
     * @param word
     * @return 
     */
    public String startWord(String str, String word) {
        String result = "";
        if (str.length() >= word.length()) {
            result += str.charAt(0);
            for (int i = 1; i < word.length(); i++) {
                if (str.charAt(i) == word.charAt(i))
                    result += str.charAt(i);
                else return "";
            }
        }
        return result;
    }
    
    /**
     * Given a string, if the first or last chars are 'x', return the string 
     * without those 'x' chars, and otherwise return the string unchanged.
     * @param str
     * @return 
     */
    public String withoutX(String str) {
        String result = "";
        if (str.length() > 0) {
            if (str.charAt(0) != 'x')
                result += str.charAt(0);
            for (int i = 1; i < str.length() -1; i++)
                result += str.charAt(i);
            if (str.length() > 1 && str.charAt(str.length() - 1) != 'x')
                result += str.charAt(str.length() - 1);
        }
        return result;
    }
    
    /**
     * Given a string, if one or both of the first 2 chars is 'x', return the 
     * string without those 'x' chars, and otherwise return the string 
     * unchanged. This is a little harder than it looks.
     * @param str
     * @return 
     */
    public String withoutX2(String str) {
        String result = "";
        if (str.length() > 0) {
            if (str.charAt(0) != 'x')
                result += str.charAt(0);
            if (str.length() > 1 && str.charAt(1) != 'x')
                result += str.charAt(1);
            for (int i = 2; i < str.length(); i++)
                result += str.charAt(i);
        }
        return result;
    }
    
    /**
     * Given a string, return a string where for every char in the original, 
     * there are two chars.
     * @param str
     * @return 
     */
    public String doubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 2; j++) {
                result += str.charAt(i);
            }
        }
        return result;
    }
    
    /**
     * Return the number of times that the string "hi" appears anywhere in the
     * given string.
     * @param str
     * @return 
     */
    public int countHi(String str) {
        final String HI = "hi";
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals(HI)) {
                count++;
            }
        }
        return count;
    }
    
    /**
     * Return true if the string "cat" and "dog" appear the same number of 
     * times in the given string.
     * @param str
     * @return 
     */
    public boolean catDog(String str) {
        final String CAT = "cat", DOG = "dog";
        int cat = 0, dog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + CAT.length()).equals(CAT)) {
                cat++;
            }
            if (str.substring(i, i + DOG.length()).equals(DOG)) {
                dog++;
            }
        }
        return cat == dog;
    }
    
    /**
     * Return the number of times that the string "code" appears anywhere in
     * the given string, except we'll accept any letter for the 'd',
     * so "cope" and "cooe" count.
     * @param str
     * @return 
     */
    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") 
                    && str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }

    /**
     * Given two strings, return true if either of the strings appears at the
     * very end of the other string, ignoring upper/lower case differences
     * (in other words, the computation should not be "case sensitive"). 
     * Note: str.toLowerCase() returns the lowercase version of a string.
     * @param a
     * @param b
     * @return 
     */
    public boolean endOther(String a, String b) {
        String end = a.length() > b.length() ? 
                b.toLowerCase() : a.toLowerCase();
        String large = a.length() > b.length() ? 
                a.toLowerCase() : b.toLowerCase();
        return large.substring(large.length() - end.length()).endsWith(end);
    }
    
    /**
     * Return true if the given string contains an appearance of "xyz" where
     * the xyz is not directly preceeded by a period (.). So "xxyz" counts but
     * "x.xyz" does not.
     * @param str
     * @return 
     */
    public boolean xyzThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("xyz")
                    && (i > 0 ? str.charAt(i - 1) != '.' : true)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Return true if the given string contains a "bob" string, but where the
     * middle 'o' char can be any char.
     * @param str
     * @return 
     */
    public boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }
    
    /**
     * We'll say that a String is xy-balanced if for all the 'x' chars in the
     * string, there exists a 'y' char somewhere later in the string. So "xxy" 
     * is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. 
     * Return true if the given string is xy-balanced.
     * @param str
     * @return 
     */
    public boolean xyBalance(String str) {
        boolean balance = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                balance = false;
                for (int j = i; j < str.length(); j++) {
                    if (str.charAt(j) == 'y') {
                        balance = true;
                    }
                }
            }
        }
        return balance;
    }
    
    /**
     * Given two strings, a and b, create a bigger string made of the first
     * char of a, the first char of b, the second char of a, the second char
     * of b, and so on. Any leftover chars go at the end of the result.
     * @param a
     * @param b
     * @return 
     */
    public String mixString(String a, String b) {
       String result = "";
       String longer = a.length() > b.length() ? a : b;
       int shorter = Math.min(a.length(), b.length());
        for (int i = 0; i < shorter; i++) {
            result += a.charAt(i);
            result += b.charAt(i);
        }
        for (int i = shorter; i < longer.length(); i++) {
            result += longer.charAt(i);
        }
       return result;
    }

    /**
     * Given a string and an int n, return a string made of n repetitions of
     * the last n characters of the string. You may assume that n is between 
     * 0 and the length of the string, inclusive.
     * @param str
     * @param n
     * @return 
     */
    public String repeatEnd(String str, int n) {
        String result = "";
        if (n > str.length()) {return result;}
        for (int i = 0; i < n; i++) {
            result += str.substring(str.length() - n);
        }
        return result;
    }
    
    /**
     * Given a string and an int n, return a string made of the first n
     * characters of the string, followed by the first n-1 characters of
     * the string, and so on. You may assume that n is between 0 and the
     * length of the string, inclusive (i.e. n >= 0 and n <= str.length()).
     * @param str
     * @param n
     * @return 
     */
    public String repeatFront(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str.substring(0, n - i);
        }
        return result;
    }
    
    /**
     * Given two strings, word and a separator sep, return a big string made
     * of count occurrences of the word, separated by the separator string.
     * @param word
     * @param sep
     * @param count
     * @return 
     */
    public String repeatSeparator(String word, String sep, int count) {
        String result = word;
        for (int i = 1; i < count; i++) {
            result += (sep + word);
        }
        return count == 0 ? "" : result;
    }
    
    /**
     * Given a string, consider the prefix string made of the first N chars of
     * the string. Does that prefix string appear somewhere else in the string?
     * Assume that the string is not empty and that N is in the range
     * 1..str.length().
     * @param str
     * @param n
     * @return 
     */
    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        for (int i = n; i <= str.length() - n; i++) {
            if (str.substring(i, i + n).equals(prefix))
                return true;
        }
        return false;
    }
    
    /**
     * Given a string, does "xyz" appear in the middle of the string? To define
     * middle, we'll say that the number of chars to the left and right of the
     * "xyz" must differ by at most one. This problem is harder than it looks.
     * @param str
     * @return 
     */
    public boolean xyzMiddle(String str) {
        if (str.length() < 3) return false;
        int before = str.indexOf("xyz");
        for (int i = before; i < str.length() / 2; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                before = i;
            }
        }
        int after = str.length() - before - "xyz".length();
        return before > 0 && Math.abs(after - before) <= 1;
    }
    
    /**
     * A sandwich is two pieces of bread with something in between. Return the
     * string that is between the first and last appearance of "bread" in the
     * given string, or return the empty string "" if there are no
     * two pieces of bread.
     * @param str
     * @return 
     */
    public String getSandwich(String str) {
        final String BREAD = "bread";
        String result = "";
        int firstBread = -1, lastBread = -1;
        if (str.length() > 2 * BREAD.length()) {
            for (int i = 0; i <= str.length() - BREAD.length(); i++) {
                if (str.substring(i, i + BREAD.length()).equals(BREAD)) {
                    firstBread = i + BREAD.length();
                    i = str.length();
                }
            }
            for (int i = str.length(); i >= 0; i--) {
                if (str.substring(i - BREAD.length(), i).equals(BREAD)) {
                    lastBread = i - BREAD.length();
                    i = -1;
                }
            }
            if (firstBread != lastBread) {
                result = str.substring(firstBread, lastBread);
            }
        }
        return result;
    }
    
    /**
     * Returns true if for every '*' (star) in the string, if there are chars
     * both immediately before and after the star, they are the same.
     * @param str
     * @return 
     */
    public boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                if (str.charAt(i - 1) != str.charAt(i + 1)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    /**
     * Given a string, compute a new string by moving the first char to come
     * after the next two chars, so "abc" yields "bca". Repeat this process for
     * each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore
     * any group of fewer than 3 chars at the end.
     * @param str
     * @return 
     */
    public String oneTwo(String str) {
        String result = "";
        for (int i = 0; i < str.length() - 2; i += 3) {
            result = result + str.charAt(i + 1) + 
                    str.charAt(i + 2) + str.charAt(i);
        }
        return result;
    }
    
    /**
     * Look for patterns like "zip" and "zap" in the string -- length-3, 
     * starting with 'z' and ending with 'p'. Return a string where for all 
     * such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
     * @param str
     * @return 
     */
    public String zipZap(String str) {
        String result = "";
        for (int i = 0; i < str.length() - 2; i++) {
            result += str.charAt(i);
            if (str.length() > 2 && 
                    str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                i++;
            }
        }
        return result;
    }
    
    /**
     * Return a version of the given string, where for every star (*) in the
     * string the star and the chars immediately to its left and right are gone.
     * So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
     * @param str
     * @return 
     */
    public String starOut(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!((i > 0 && str.charAt(i - 1) == '*') ||
                    (i < str.length() - 1 && str.charAt(i + 1) == '*') ||
                    (str.charAt(i) == '*'))) {
                        result += str.charAt(i);
            }
        }
        return result;
    }
    
    /**
     * Given a string and a non-empty word string, return a version of the
     * original String where all chars have been replaced by pluses ("+"),
     * except for appearances of the word string which are preserved unchanged.
     * @param str
     * @param word
     * @return 
     */
    public String plusOut(String str, String word) {
        String result = "";
        while (str.length() > 0) {
            if (str.startsWith(word)) {
                result += word;
                str = str.substring(word.length());
            } else {
                result += "+";
                str = str.substring(1);
            }
        }
        return result;
        /*
        String[] splitStr = str.split(word);
        for (String elem : splitStr) {
            String plus = "";
            for (int j = 0; j < elem.length(); j++) {
                plus += "+";
            }
            result += plus + word;
        }
        return result.substring(0, str.length());
        
        for (int i = 0; i < str.length(); i++) {
            boolean isWord = false;
            if (str.charAt(i) == word.charAt(0)) {
                for (int j = 0; j < word.length(); j++) {
                    if (str.charAt(i + j) == word.charAt(j)) {
                        isWord = true;
                    }
                }
                if (isWord) {
                    result += word;
                    i += word.length();
                }
            }
            result += "+";
        }
        return result;*/
    }
    
    /**
     * Given a string and a non-empty word string, return a string made of each
     * char just before and just after every appearance of the word in the
     * string. Ignore cases where there is no char before or after the word,
     * and a char may be included twice if it is between two words.
     * @param str
     * @param word
     * @return 
     */
    public String wordEnds(String str, String word) {
        String result = "", strCopy = "";
        while (str.length() > 0) {
            if (str.startsWith(word)) {
                result += strCopy.length() > 0 
                        ? strCopy.substring(strCopy.length() - 1) : "";
                result += str.length() > word.length() ?
                        str.substring(word.length(), word.length() + 1) : "";
                strCopy = str.substring(0, word.length());
                str = str.substring(word.length());
            } else {
                strCopy += str.charAt(0);
                str = str.substring(1);
            }
        }
        return result;
    }
    
    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so
     * the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in
     * "yellow" (not case sensitive). We'll say that a y or z is at the end of
     * a word if there is not an alphabetic letter immediately following it. 
     * (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * @param str
     * @return 
     */
    public int countYZ(String str) {
        str = str.toLowerCase();
        int count = findPrevYZ(str, str.length());
        for (int i = 1; i < str.length(); i++) {
            if (!Character.isLetter(str.charAt(i))) {
                count += findPrevYZ(str, i); 
            }
        }
        return count;
    }
    
    public int findPrevYZ(String str, int position) {
        return str.charAt(position - 1) == 'z' || 
                str.charAt(position - 1) == 'y' ? 1 : 0;
    }
    
    /**
     * Given two strings, base and remove, return a version of the base string
     * where all instances of the remove string have been removed
     * (not case sensitive). You may assume that the remove string is length 1
     * or more. Remove only non-overlapping instances, so with "xxx" removing
     * "xx" leaves "x".
     * @param base
     * @param remove
     * @return 
     */
    public String withoutString(String base, String remove) {
        String result = "";
        remove = remove.toLowerCase();
        while (base.length() > 0) {
            if (base.toLowerCase().startsWith(remove)) {
                base = base.substring(remove.length());
            } else {
                result += base.substring(0, 1);
                base = base.substring(1);
            }
        }
        return result;
    }
    
    /**
     * Given a string, return true if the number of appearances of "is"
     * anywhere in the string is equal to the number of appearances of "not"
     * anywhere in the string (case sensitive).
     * @param str
     * @return 
     */
    public boolean equalIsNot(String str) {
        return findWord(str, "is") == findWord(str, "not");
    }

    private int findWord(String str, String word) {
        int count = 0;
        for (int i = 0; i < str.length() - word.length() + 1; i++) {
            count += str.substring(i, i + word.length()).equals(word) ?
                    1 : 0;
        }
        return count;
    }
    
    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is
     * another 'g' immediately to its left or right. Return true if all the
     * g's in the given string are happy.
     * @param str
     * @return 
     */
    public boolean gHappy(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g' &&
                    !(i > 0 && str.charAt(i - 1) == 'g' ||
                    i < str.length() - 1 && str.charAt(i + 1) == 'g')) {
                return false;
            }
        }
        return true;
    }

    /**
     * We'll say that a "triple" in a string is a char appearing three times
     * in a row. Return the number of triples in the given string. 
     * The triples may overlap.
     * @param str
     * @return 
     */
    public int countTriple(String str) {
        int triples = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            triples += (str.charAt(i) == str.charAt(i + 1) 
                    && str.charAt(i) == str.charAt(i + 2)) ? 1 : 0;
        }
        return triples;
    }
    
    /**
     * Given a string, return the sum of the digits 0-9 that appear in the
     * string, ignoring all other characters. Return 0 if there are no digits
     * in the string. 
     * (Note: Character.isDigit(char) tests if a char is one of the chars
     * '0', '1', .. '9'. 
     * Integer.parseInt(string) converts a string to an int.)
     * @param str
     * @return 
     */
    public int sumDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char nextChar = str.charAt(i);
            sum += (Character.isDigit(nextChar)) ?
                    Integer.parseInt(String.valueOf(nextChar)) : 0;
        }
        return sum;
    }
    
    /**
     * Given a string, return the longest substring that appears at both the
     * beginning and end of the string without overlapping. For example,
     * sameEnds("abXab") is "ab".
     * @param string
     * @return 
     */
    public String sameEnds(String string) {
        String result = "";
        for (int i = 1; i <= string.length() / 2; i++) {
            if (string.substring(0, i).equals(
                    string.substring(string.length() - i))) {
                result = string.substring(0, i);
            }
        }
        return result;
    }
    
    /**
     * Given a string, look for a mirror image (backwards) string at both the
     * beginning and end of the given string. In other words, zero or more
     * characters at the very begining of the given string, and at the very
     * end of the string in reverse order (possibly overlapping). For example,
     * the string "abXYZba" has the mirror end "ab".
     * @param string
     * @return 
     */
    public String mirrorEnds(String string) {
       String result = "", mirror = "";
        for (int i = 1; i <= string.length(); i++) {
            mirror += string.charAt(string.length() - i);
            if (string.substring(0, i).equals(mirror)) {
                result += string.charAt(i - 1);
            } else break;
        }
       return result;
    }
    
    /**
     * Given a string, return the length of the largest "block" in the string.
     * A block is a run of adjacent chars that are the same.
     * @param str
     * @return 
     */
    public int maxBlock(String str) {
        int count = 0, countChar = str.length() > 0 ? 1 : 0;
        char prevChar = str.length() > 0 ? str.charAt(0) : 0;
        for (int i = 1; i < str.length(); i++) {
            if (prevChar == str.charAt(i)) {
                countChar++;
            } else {
                count = Math.max(count, countChar);
                countChar = 1;
            }
            prevChar = str.charAt(i);
        }
        return Math.max(count, countChar);
    }
    
    /**
     * Given a string, return the sum of the numbers appearing in the string,
     * ignoring all other characters. A number is a series of 1 or more digit
     * chars in a row. (Note: Character.isDigit(char) tests if a char is one
     * of the chars '0', '1', .. '9'. 
     * Integer.parseInt(string) converts a string to an int.)
     * @param str
     * @return 
     */
    public int sumNumbers(String str) {
        int sum = 0;
        String num = "0";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                num += str.charAt(i);
            } else if (i > 0 && Character.isDigit(str.charAt(i - 1))) {
                sum += Integer.parseInt(num);
                num = "0";
            }
        }
        sum += Integer.parseInt(num);
        return sum;
    }
    
    /**
     * Given a string, return a string where every appearance of the lowercase
     * word "is" has been replaced with "is not". The word "is" should not be
     * immediately preceeded or followed by a letter -- so for example the "is"
     * in "this" does not count. 
     * (Note: Character.isLetter(char) tests if a char is a letter.)
     * @param str
     * @return 
     */
    public String notReplace(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (isEndsWithWord(result, "is")
                    && (!Character.isLetter(str.charAt(i)))
                    ) {
                result += " not";
            }
            result += str.charAt(i);
        }
        return isEndsWithWord(result, "is") ? result + " not" : result;
    }
    
    public boolean isEndsWithWord(String result, String word) {
        return result.endsWith(word)
                && (result.length() < word.length() + 1 || 
                !Character.isLetter(result.charAt(
                        result.length() - word.length() - 1)));
    }
    
    public boolean isPalindrome(String str) {
        return str.equals(new StringBuffer(str).reverse().toString());
    }
}
