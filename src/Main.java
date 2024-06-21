import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("=============== Bài 1 ================");
        int[] listNumBai1 = {1, -1,10,10, 5,1,8,4,9, 3,1,5};
        int resultBai1 = sumDistinctElements(listNumBai1);
        System.out.println("Kết quả bài 1, tổng khác nhau của " + Arrays.toString(listNumBai1) + " là : " + resultBai1);

        System.out.println("\n=============== Bài 2 ================");
        String strBai2 = "hello"; // hheelllloo
        System.out.println("Kết quả bài 2, với input " + strBai2 + " kết quả là : " + printLetterTwice(strBai2));


        System.out.println("\n=============== Bài 3 ================");
        int[] listNumBai3 = {1,2,12,9,124,12,3,123,12};
        printNumOfEvenAndOdd(listNumBai3);

        System.out.println("\n=============== Bài 4 ================");
        String strBai4 = "characters";
        String resultBai4 = removeDuplicateChar(strBai4);
        System.out.println("Kết quả bài 4, với input " + strBai4 + " kết quả là : " + resultBai4);

        System.out.println("\n=============== Bài 5 ================");
        String str1 = "Hello", str2 = "World";
        swapStringNoThird(str1, str2);

    }

    // Bài 1
    public static int sumDistinctElements(int[] intArr) {

        int sum = 0;
        StringBuilder numCheck = new StringBuilder();
        for(int i = 0; i < intArr.length; i++) {
            // thêm "_" trước và sau để có sự khác nhau giữa -1, 1, 10, -10
            String checkStr = "_" + String.valueOf(intArr[i]) + "_";
            // Nếu số không xuất hiện trong string sẽ cộng dồn.
            if(!numCheck.toString().contains(checkStr)) {
                sum += intArr[i];
                numCheck.append(checkStr);
            }
        }

        return sum;
    }

    // Bài 2
    public static String printLetterTwice(String inStr) {
        StringBuilder resultStr = new StringBuilder();

        for(int i = 0; i < inStr.length(); i++) {
            String indexStr = String.valueOf(inStr.charAt(i));
            resultStr.append(indexStr).append(indexStr);
        }

        return resultStr.toString();
    }

    // Bài 3
    public static void printNumOfEvenAndOdd(int[] arrInt) {
        int numEven = 0;
        for(int i = 0; i < arrInt.length; i++) {
            if(arrInt[i] % 2 == 0) {
                numEven++;
            }
        }

        System.out.println("Number of even elements: " + numEven + ", Number of odd elements: " + (arrInt.length - numEven));
    }

    // Bài 4
    public static String removeDuplicateChar(String inpStr) {

        StringBuilder resultString = new StringBuilder();
        for(int i = 0; i < inpStr.length(); i++) {
            if(!resultString.toString().contains(String.valueOf(inpStr.charAt(i)))) {
                resultString.append(inpStr.charAt(i));
            }
        }

        return resultString.toString();
    }

    // Bài 5
    public static void swapStringNoThird (String inpStr1, String inpStr2) {
        // lưu để so sanh kết quả
        String inpStr1Before = inpStr1, inpStr2Before = inpStr2;

        // xử lý
        inpStr1 += inpStr2;
        inpStr2 = inpStr1.substring(0, inpStr1.length() - inpStr2.length());
        inpStr1 = inpStr1.substring(inpStr2.length());

        System.out.println("Before Swap, str1 : " + inpStr1Before + ", str2: " + inpStr2Before);
        System.out.println("After Swapped, Swapped str1 : " + inpStr1 + ", Swapped str2: " + inpStr2);
    }
}