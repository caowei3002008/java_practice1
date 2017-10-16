package com.wei.web.models;

import java.util.Arrays;
import java.util.Random;

public class Generate {
    public String generateRandomWords()
    {
        String[] randomStrings = new String[1];
        Random random = new Random();
        for(int i = 0; i < 1; i++)
        {
            char[] word = new char[random.nextInt(8)+3]; // words of length 3 through 10. (1 and 2 letter words are boring.)
            for(int j = 0; j < word.length; j++)
            {
                word[j] = (char)('a' + random.nextInt(26));
            }
            randomStrings[i] = new String(word);
        }
        String str = Arrays.toString(randomStrings);
        return str;
    }
}
