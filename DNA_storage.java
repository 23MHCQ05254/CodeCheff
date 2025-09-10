
// 4
// 2
// 00
// 4
// 0011
// 6
// 101010
// 4
// 1001

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            
            StringBuilder dna = new StringBuilder();
            
            for(int i=0;i<n;i+=2)
            {
                String pair=s.substring(i,i+2);
                switch(pair){
                    case "00":
                        dna.append("A");
                        break;
                    case "01":
                        dna.append("T");
                        break;
                    case "10":
                        dna.append("C");
                        break;
                    case "11":
                        dna.append("G");
                        break;
                }
            }
            System.out.println(dna);

        }
    }
}
