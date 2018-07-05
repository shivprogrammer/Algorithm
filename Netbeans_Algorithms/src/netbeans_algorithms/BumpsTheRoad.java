package netbeans_algorithms;

/*
2nd Algorithm
Bumps in the Road
7kyu

Your car is old, it breaks easily. The shock absorbers are gone and you think it can handle about 15 more bumps before it dies totally.

Unfortunately for you, your drive is very bumpy! Given a string showing either flat road ("_") or bumps ("n"), work out if you make it home safely. 15 bumps or under, return "Woohoo!", over 15 bumps return "Car Dead".
*/

public class BumpsTheRoad {
    
    public static String bumps(final String road) {
        int bumps = 0;
        
        for (int i = 0; i < road.length(); i++) {
            if (road.charAt(i) == 'n') {
                bumps++;
            }
        }
        
        return (bumps <= 15) ? "Woohoo!" : "Car Dead";
    }
  
}
