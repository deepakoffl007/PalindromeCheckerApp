public class ReversePalindromeChecker{
    public static void main (String [] args){
        String Str ="malayalam";
        String reversed = "";
        for(int i = Str.length()-1;i>=0;i--){
            reversed += Str.charAt(i);
        }
        System.out.println("input text : "+Str);
        if (Str.equals(reversed)) {
            System.out.println("is it Palindrome : true");

        }
        else{
            System.out.println("is it Palindrome : false");
        }
    }
}