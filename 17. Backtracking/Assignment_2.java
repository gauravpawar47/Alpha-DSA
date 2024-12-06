import java.util.*;

class Assingmnet_2
{
    private static String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    private static void backtrack(String digits, int index, StringBuilder combination, List<String> result)
    {
        if (index == digits.length())
        {
            result.add(combination.toString());
            return;
        }

        String letters = keypad[digits.charAt(index) - '0'];
        for (char letter : letters.toCharArray())
        {
            combination.append(letter);
            backtrack(digits, index + 1, combination, result);
            combination.setLength(combination.length() - 1); // Backtrack
        }
    }

    public static List<String> letterCombinations(String digits)
    {
        List<String> result = new ArrayList<>();
        if (digits.isEmpty()) return result;
        backtrack(digits, 0, new StringBuilder(), result);
        return result;
    }

    public static void main(String[] args)
    {
        String digits = "23";
        System.out.println("Combinations : "+ letterCombinations(digits));
    }
}