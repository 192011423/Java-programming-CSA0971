import java.util.Scanner;
class numofsplchar {
 
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string with special character = ");
        String input = scanner.nextLine();
        int count= 0;
        for (int i = 0; i < input.length(); i++) {
        if (isSpecialChar(input.charAt(i))) {
        count++;
            }
        }
        System.out.println("Count of special character = " + count);
      
        }
        public static boolean isSpecialChar(char ch) {
                boolean isSpecialChar;
                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                isSpecialChar = false;
                } else if (ch >= '0' && ch <= '9') {
                isSpecialChar = false;
                }
                else if(ch == ' ')
                {
                 isSpecialChar = false;
                
                } 
                 else if(ch == ','||ch=='.')
                {
                 isSpecialChar = false;
                
                }
                else {
                        isSpecialChar = true;
                }
                return isSpecialChar;
        }
}