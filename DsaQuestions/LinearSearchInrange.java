package DsaQuestions;

public class LinearSearchInrange {
    public static void main(String[] args) {
        int[] orArr = {434,4,34,23,5,4,6,546,434};
        int startIn = 3;
        int endIn = 8;
        int toFound = 434;
        boolean res = search(orArr, toFound,startIn,endIn);
        System.out.println(res);
    }

    static boolean search(int[] arr, int target, int startIndex, int endIndex){
      for(int i = startIndex; i <= endIndex; i++){
          if(arr[i] == target){
              System.out.println(i);
              return true;
          }
      }
      return false;
    }
}
