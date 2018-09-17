package codingbat;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Ócsai István
 */
public class Maps {
    
    /**
     * Modify and return the given map as follows: if the key "a" has a value,
     * set the key "b" to have that value, and set the key "a" to have the
     * value "". Basically "b" is a bully, taking the value and replacing it
     * with the empty string.
     * @param map
     * @return 
     */
    public Map<String, String> mapBully(Map<String, String> map) {
        String replace = "";
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", replace);
        }
        return map;
    }
    
    /**
     * Modify and return the given map as follows: if the key "a" has a value,
     * set the key "b" to have that same value. In all cases remove the key
     * "c", leaving the rest of the map unchanged.
     * @param map
     * @return 
     */
    public Map<String, String> mapShare(Map<String, String> map) {
        map.remove("c");
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        return map;
    }
    
    /**
     * Modify and return the given map as follows: for this problem the map may
     * or may not contain the "a" and "b" keys. If both keys are present,
     * append their 2 string values together and store the result under the
     * key "ab".
     * @param map
     * @return 
     */
    public Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }
    
    /**
     * Given a map of food keys and topping values, modify and return the map
     * as follows: if the key "ice cream" is present, set its value to
     * "cherry". In all cases, set the key "bread" to have the value "butter".
     * @param map
     * @return 
     */
    public Map<String, String> topping1(Map<String, String> map) {
        map.put("bread", "butter");
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        return map;
    }
    
    /**
     * Given a map of food keys and their topping values, modify and return
     * the map as follows: if the key "ice cream" has a value, set that as the
     * value for the key "yogurt" also. If the key "spinach" has a value,
     * change that value to "nuts".
     * @param map
     * @return 
     */
    public Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream"));
        }
        if (map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }
        return map;
    }
    
    /**
     * Given a map of food keys and topping values, modify and return the map
     * as follows: if the key "potato" has a value, set that as the value for
     * the key "fries". If the key "salad" has a value, set that as the value
     * for the key "spinach".
     * @param map
     * @return 
     */
    public Map<String, String> topping3(Map<String, String> map) {
        if (map.containsKey("potato")) {
            map.put("fries", map.get("potato"));
        }
        if (map.containsKey("salad")) {
            map.put("spinach", map.get("salad"));
        }
        return map;
    }

    /**
     * Modify and return the given map as follows: if the keys "a" and "b" are
     * both in the map and have equal values, remove them both.
     * @param map
     * @return 
     */
    public Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")
                && map.get("a").equals(map.get("b"))) {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }
    
    /**
     * Modify and return the given map as follows: if exactly one of the keys
     * "a" or "b" has a value in the map (but not both), set the other to have
     * that same value in the map.
     * @param map
     * @return 
     */
    public Map<String, String> mapAB3(Map<String, String> map) {
        if (map.containsKey("a") && !map.containsKey("b")) {
            map.put("b", map.get("a"));
        }
        if (map.containsKey("b") && !map.containsKey("a")) {
            map.put("a", map.get("b"));
        }
        return map;
    }
    
    /**
     * Modify and return the given map as follows: if the keys "a" and "b" have
     * values that have different lengths, then set "c" to have the longer
     * value. If the values exist and have the same length, change them both to
     * the empty string in the map.
     * @param map
     * @return 
     */
    public Map<String, String> mapAB4(Map<String, String> map) {
        String empty = "";
        if (map.containsKey("a") && map.containsKey("b")) {
            if (map.get("a").length() == map.get("b").length()) {
                map.put("a", empty);
                map.put("b", empty);
            } else {
                String str = map.get("a").length() > map.get("b").length()
                        ? map.get("a") : map.get("b");
                map.put("c", str);
            }
        }
        return map;
    }
    
    /**
     * Given an array of strings, return a Map<String, Integer> containing a
     * key for every different string in the array, always with the value 0.
     * For example the string "hello" makes the pair "hello":0.
     * We'll do more complicated counting later, but for this problem the value
     * is simply 0.
     * @param strings
     * @return 
     */
    public Map<String, Integer> word0(String[] strings) {
        int value = 0;
        Map<String, Integer> map = new HashMap<>();
        for (String elem : strings) {
            map.put(elem, value);
        }
        return map;
    }
    
    /**
     * Given an array of strings, return a Map<String, Integer> containing a
     * key for every different string in the array,
     * and the value is that string's length.
     * @param strings
     * @return 
     */
    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String elem : strings) {
            int value = elem.length();
            map.put(elem, value);
        }
        return map;
    }
    
    /**
     * Given an array of non-empty strings, create and return a
     * Map<String, String> as follows: for each string add its first character
     * as a key with its last character as the value.
     * @param strings
     * @return 
     */
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String elem : strings) {
            String first = elem.substring(0, 1);
            String last = elem.substring(elem.length() - 1);
            map.put(first, last);
        }
        return map;
    }
    
    /**
     * The classic word-count algorithm: given an array of strings, return a
     * Map<String, Integer> with a key for each different string, with the
     * value the number of times that string appears in the array.
     * @param strings
     * @return 
     */
    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String elem : strings) {
            if (map.containsKey(elem)) {
                map.put(elem, map.get(elem) + 1);
            } else {
                map.put(elem, 1);
            }
        }
        return map;
    }
    
    /**
     * Given an array of non-empty strings, return a Map<String, String> with a
     * key for every different first character seen, with the value of all the
     * strings starting with that character appended together in the order they
     * appear in the array.
     * @param strings
     * @return 
     */
    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String elem : strings) {
            String firstChar = elem.substring(0, 1);
            if (map.containsKey(firstChar)) {
                map.put(firstChar, map.get(firstChar) + elem);
            } else {
                map.put(firstChar, elem);
            }
        }
        return map;
    }
    
    /**
     * Loop over the given array of strings to build a result string like this:
     * when a string appears the 2nd, 4th, 6th, etc. time in the array, append
     * the string to the result.
     * Return the empty string if no string appears a 2nd time.
     * @param strings
     * @return 
     */
    public String wordAppend(String[] strings) {
        String result = "";
        Map<String, Integer> map = new HashMap<>();
        for (String elem : strings) {
            if (map.containsKey(elem))
                map.put(elem, map.get(elem) + 1);
            else
                map.put(elem, 1);
            if (map.get(elem) % 2 == 0)
                result += elem;
        }
        return result;
    }
    
    /**
     * Given an array of strings, return a Map<String, Boolean> where each
     * different string is a key and its value is true if that string appears 2
     * or more times in the array.
     * @param strings
     * @return 
     */
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> booMap = new HashMap<>();
        for (String elem : strings) {
            if (booMap.containsKey(elem)) {
                booMap.put(elem, true);
            } else {
                booMap.put(elem, false);
            }
        }
        return booMap;
    }
    
    /**
     * We'll say that 2 strings "match" if they are non-empty and their first
     * chars are the same. Loop over and then return the given array of
     * non-empty strings as follows: if a string matches an earlier string in
     * the array, swap the 2 strings in the array. When a position in the array
     * has been swapped, it no longer matches anything. Using a map, this can
     * be solved making just one pass over the array.
     * @param strings
     * @return 
     */
    public String[] allSwap(String[] strings) {
        String[] result = new String[strings.length];
        Map<Character, Integer> map = new HashMap<>();
        for (int index = 0; index < strings.length; index++) {
            char key = strings[index].charAt(0);
            if (map.containsKey(key)) {
                result[map.get(key)] = strings[index];
                result[index] = strings[map.get(key)];
                map.remove(key);
            } else {
                result[index] = strings[index];
                map.put(key, index);
            }
        }
        return result;
    }
    
    /**
     * We'll say that 2 strings "match" if they are non-empty and their first
     * chars are the same. Loop over and then return the given array of
     * non-empty strings as follows: if a string matches an earlier string in
     * the array, swap the 2 strings in the array. A particular first char can
     * only cause 1 swap, so once a char has caused a swap, its later swaps
     * are disabled. Using a map, this can be solved making just one pass over
     * the array. More difficult than it looks.
     * @param strings
     * @return 
     */
    public String[] firstSwap(String[] strings) {
        String[] result = new String[strings.length];
        Map<Character, Integer> map = new HashMap<>();
        for (int index = 0; index < strings.length; index++) {
            char key = strings[index].charAt(0);
            if (map.containsKey(key) && map.get(key) != -1) {
                result[map.get(key)] = strings[index];
                result[index] = strings[map.get(key)];
                map.put(key, -1);
            } else {
                result[index] = strings[index];
                if (!map.containsKey(key) || map.get(key) != -1) {
                    map.put(key, index);
                }
            }
        }
        return result;
    }
}