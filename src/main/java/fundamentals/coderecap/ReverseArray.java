package fundamentals.coderecap;

public class ReverseArray {
    public static void main(String[] args) {

        int[] array={1,2,3,4,5,6,7};
//        int[] reversedArray=reverseArray(array);
//
//        for(int i=0;i<reversedArray.length;i++){
//            System.out.println(reversedArray[i]);
//        }
        int[] reversedArrayWithFor=reverseArrayWithFor(array);
        for(int i=0;i<reversedArrayWithFor.length;i++){
            System.out.println(reversedArrayWithFor[i]);
        }

    }

    public static int[] reverseArray(int[] array) {
        int start = 0;
        int end = array.length-1;


        while (start < end) {
            int copy;
            copy = array[end];
            array[end] = array[start];
            array[start] = copy;
            start++;
            end--;
        }
        return array;


    }

    public static int[] reverseArrayWithFor(int[] array){
        for(int i=0,j=array.length-1;i<j;i++,j--){
            int copy;
            copy=array[j];
            array[j]=array[i];
            array[i]=copy;
        }
        return array;
    }
}
