package netbeans_algorithms;

public class AbbreviateTwoWords {

    public static String abbrevName(String name) {
        String output = "";
        output += name.substring(0, 1).toUpperCase() + ".";
        
        for (int i = 1; i < name.length(); i++) {
            if (name.charAt(i) == ' ')
                output += name.substring(i + 1, i + 2).toUpperCase();
        }
        return output;
    }
}