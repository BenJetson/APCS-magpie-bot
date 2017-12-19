public class KeywordTester {

    private static int findKeyword(String statement, String goal, int startPos) {
        String phrase = statement.trim();
        // The only change to incorporate the startPos is in
        // the line below
        int psn = phrase.toLowerCase().indexOf(
                goal.toLowerCase(), startPos);

        // Refinement--make sure the goal isn't part of a word
        String before = " ", after = " ";

        while (psn >= 0) {
            // Find the string of length 1 before and after
            // the word
            if (psn > 0) {
                before = phrase.substring(psn - 1, psn)
                        .toLowerCase();
            }

            if (psn + goal.length() < phrase.length()) {
                after = phrase.substring(
                        psn + goal.length(),
                        psn + goal.length() + 1)
                        .toLowerCase();
            }

            // If before and after aren't letters, we've
            // found the word
            if (((before.compareTo("a") < 0) || (before
                    .compareTo("z") > 0)) // before is not a
                                            // letter
                    && ((after.compareTo("a") < 0) || (after
                            .compareTo("z") > 0))) {
                System.out.printf("%s | psn: %d%n", statement, psn);
                System.out.printf("%s | before: ''%s''%n", statement, before);
                System.out.printf("%s | after: ''%s''%n", statement, after);
                return psn;
            }

            // The last position didn't work, so let's find
            // the next, if there is one.
            psn = phrase.indexOf(goal.toLowerCase(), psn + 1);

        }

        System.out.printf("%s | before: ''%s''%n", statement, before);
        System.out.printf("%s | after: ''%s''%n", statement, after);
        System.out.printf("%s | psn: %d%n", statement, -1);
        return -1;
    }

    public static void main(String[] args) {
        
        findKeyword("She's my sister", "sister", 0);
        findKeyword("Brother Tom is helpful", "brother", 0);
        findKeyword("I can't catch wild cats.", "cat", 0);
        findKeyword("I know nothing about snow plows.", "no", 0);

    }

}