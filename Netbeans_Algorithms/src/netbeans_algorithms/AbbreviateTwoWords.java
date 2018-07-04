package netbeans_algorithms;

public class AbbreviateTwoWords {

    public static String abbrevName(String name) {
        String output = "";
        
        for (int i = 0; i < name.length(); i++) {
            if (i == 0) {
                output += name.substring(0, 1) + ".";
//                System.out.println(output);                
            }
            else if (name.charAt(i) == ' ')
                System.out.println(i);
                System.out.println();
//                output += Character.toString(name.charAt(i + 1));
        }
        
        return output;
    }
}
