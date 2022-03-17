package hu.nive.ujratervezes.lettermultiplier;

public class LetterMultiplier {

    public String multiply(String input, int number) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("String is empty or null!");
        }
        StringBuilder output = new StringBuilder();
        for (char letter: input.toCharArray()) {
            output.append(String.valueOf(letter).repeat(number));
        }
        return output.toString();
    }
}
