package netbeans_algorithms;

public class AbbreviateTwoWords {

    public static String abbrevName(String name) {
        String output = "";
        output += name.substring(0, 1) + ".";
        
        for (int i = 1; i < name.length(); i++) {
            if (name.charAt(i) == ' ')
                output += name.substring(i + 1, i + 2);
        }
        return output;
    }
}