import java.util.Scanner;

public class stringcount {
    public static void main(String[] args) {
    	System.out.println("Enter a string:");
    	Scanner sc=new Scanner(System.in);
    	String line =sc.nextLine();
//        String line = "This website is aw3som3.";
        int vowels = 0, consonants = 0, digits = 0;
        line = line.toLowerCase();
        for(int i = 0; i < line.length(); ++i)
        {
            char ch = line.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
                ++vowels;
            }
            else if((ch >= 'a'&& ch <= 'z')) {
                ++consonants;
            }
            else if( ch >= '0' && ch <= '9')
            {
                ++digits;
            }
            
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        }
}