public class PalindromeCheckerApp {

    public static void main(String [] args){

            String input ="malayalam";
            boolean ispalindrome = true;
            for (int i=0;i<input.length();i++){
                if(input.charAt(i) != input.charAt(input.length()-1 -i)){
                    ispalindrome = false;
                    break;
                }
            }
            System.out.println("input :" +input);
            System.out.println(ispalindrome);
        }
    }

