// i/p: 3                               
// ABCDE
// EDCBA
// ROUND
// RINGS
// START
// STUNT

// o/p: BBGBB
// GBBBB
// GGBBG

import java.util.*;

class WordleChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //  number of test cases
        int T = sc.nextInt();
        
        while (T-- > 0) {
            String S = sc.next();   // hidden word
            String T_str = sc.next(); // guess word
            
            StringBuilder M = new StringBuilder();
            
            for (int i = 0; i < 5; i++) {
                if (S.charAt(i) == T_str.charAt(i)) {
                    M.append("G");  // Correct guess
                } else {
                    M.append("B");  //  guess wrong
                }
            }
            
            System.out.println(M.toString());
        }
        
        sc.close();
    }
}
