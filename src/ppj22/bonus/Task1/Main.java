package ppj22.bonus.Task1;

public class Main {
    public static void main(String[] args) {
        String[] passes = {"AbcDe93", "A1b:A1b>", "Ab:Acb<",
                "abc123><", "Zorro@123"};
        for (String pass : passes) {
            System.out.println("\nchecking " + pass);
            if (checkpass(pass)) System.out.println("OK");
        }
    }

    private static boolean checkpass(String pass) {
        if (pass.length() < 8){
            System.out.println("Too short");
        }
        boolean digit = false;
        boolean upperCaseLetter = false;
        boolean lowerCaseLetter = false;
        boolean specialChar = false;
        boolean sixDiferent = false;
        Character[] sixDiferentChars = new Character[6];
        int sixDifferentIndex = 0;

        for (int i = 0; i < pass.length(); i++) {
            boolean found = false;

            for(int j = 0; j < sixDifferentIndex; j++) {
                if (pass.charAt(i) == sixDiferentChars[j]) found = true;
            }

            if (!found && sixDifferentIndex < 5 )
                sixDiferentChars[sixDifferentIndex++] = pass.charAt(i);
            else if (!found)
                sixDiferentChars[sixDifferentIndex] = pass.charAt(i);


            char c = pass.charAt(i);

            if (c >= '0' && c <= '9') digit = true;
            else if (c >= 'a' && c <= 'z') lowerCaseLetter = true;
            else if (c >= 'A' && c <= 'Z') upperCaseLetter = true;
            else if (!Character.isLetterOrDigit(c)) specialChar = true;
        }
        if(sixDifferentIndex < 5) sixDiferent = true;
        else System.out.println("Too few different characters");
        if (!digit) System.out.println("No digit");
        if(!upperCaseLetter) System.out.println("No upper case letter");
        if(!lowerCaseLetter) System.out.println("No lower case letter");
        if(!specialChar) System.out.println("No special character");

        if (!digit) return false;
        if(!upperCaseLetter) return false;
        if(!lowerCaseLetter) return false;
        if(!specialChar) return false;
        if (!sixDiferent) return false;
        if (pass.length() < 8) return false;

        return true;
    }
}
