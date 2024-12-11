package BasicQuestions;
public class StringReverse {
    public static void main(String[] args) {

        //program to reverse a string

        String str = "NUll";
        System.out.println("Reversed String is " + reverseString(str));

    }

    public static  String reverseString(String in){
        if(in.equals("") || in == null)
            throw  new IllegalArgumentException("String should not be Empty or null");
        StringBuilder out = new StringBuilder();
        char[] chars = in.toCharArray();               // to store the chars for each iteration

        for(int i = chars.length-1; i >= 0; i--){             // iterating from the last index of string
            out.append(chars[i]);
        }

        return out.toString();
    }
}