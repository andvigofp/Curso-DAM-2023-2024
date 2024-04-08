package Practicas.ContadorCaractres;

import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ContradorCarateresTest {
    private static final String RND_BASE = "abcxyz?!cdepqr%^";

    @Test
    public void testBasicWords() {
        assertTrue(ContadorCarateres.validateWord("abcabc"));
        assertTrue(ContadorCarateres.validateWord("Abcabc"));
        assertTrue(ContadorCarateres.validateWord("AbcCBa"));
        assertTrue(ContadorCarateres.validateWord("?!?!?!"));
        assertTrue(ContadorCarateres.validateWord("abc123"));
        assertTrue(ContadorCarateres.validateWord("abc!abc!"));
        assertFalse(ContadorCarateres.validateWord("AbcabcC"));
        assertFalse(ContadorCarateres.validateWord("pippi"));
        assertFalse(ContadorCarateres.validateWord("abcabcd"));
        assertFalse(ContadorCarateres.validateWord("?abc:abc"));
    }

    @Test
    public void testRandomWords() {
        Random random = new Random();
        for (int n = 1; n <= 50; n++) {
            int lettersNumb = random.nextInt(4) + 2;
            char[] basicLetters = new char[lettersNumb];
            for (int k = 0; k < lettersNumb; k++)
                basicLetters[k] = RND_BASE.charAt(random.nextInt(RND_BASE.length()));

            int repeats = random.nextInt(4) + 1;
            List<Character> letters = new ArrayList<>();
            for (char letter : basicLetters) {
                for (int k = 1; k <= repeats; k++)
                    letters.add(random.nextBoolean() ? letter : Character.toUpperCase(letter));
            }

            if (random.nextBoolean()) {
                int firstCharRepeats = random.nextInt(3) + 1;
                char firstChar = letters.get(0);
                for (int k = 1; k <= firstCharRepeats; k++)
                    letters.add(firstChar);
            }

            Collections.shuffle(letters, random);
            StringBuilder builder = new StringBuilder(letters.size());
            letters.forEach(l -> builder.append(l));
            String randomWord = builder.toString();

            assertEquals(validateWordSolution(randomWord), ContadorCarateres.validateWord(randomWord));
        }
    }

    private boolean validateWordSolution(String word) {
        String lowWord = word.toLowerCase();
        int firstCharCount = charCounter(lowWord.charAt(0), lowWord);
        return lowWord.chars().allMatch(c -> charCounter(c, lowWord) == firstCharCount);
    }

    private int charCounter(int c, String word) {
        return word.length() - word.replace(String.valueOf((char) c), "").length();
    }
}