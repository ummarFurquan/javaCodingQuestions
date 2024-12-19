package DsaQuestions;

public class LinearSearchString {
    public static void main(String[] args) {
        String orStr = "Hello";
        char toFind = 'o';

        boolean res = search(orStr, toFind);
        boolean res2 = search(orStr, toFind);

        System.out.println(res);
        System.out.println(res2);

    }


// using normal for lopp
    static  boolean search(String str, char ch){
            if(str.isEmpty()){
                return  false;
            }
            for(int i =0; i < str.length(); i++){
                if(ch == str.charAt(i)){
                    return true;
                }
            }
            return false;
    }

    // using for each. conver the string to array using toCharArray()
    static  boolean search2(String str, char ch){
        for(char i : str.toCharArray()){
            if(ch == i ){
                return true;
            }
        }
        return false;
    }
}
