package fundamentals.coderecap;

public class MissingNumberFromArray {
    public static void main(String[] args) {
        int [] testVector={1,2,3,4,5,10,9,8,7};

        System.out.println(computeMissingNumber(testVector));
    }

    public static int computeMissingNumber(int[] testVector) {
        int [] frequencyVector=new int[testVector.length+2];
        for(int i=0;i<testVector.length;i++){
            frequencyVector[testVector[i]]=1;

        }
        for(int i=1;i<frequencyVector.length;i++){
            if(frequencyVector[i]==0){
                return i;
            }
        }

        return -1;
    }



}
