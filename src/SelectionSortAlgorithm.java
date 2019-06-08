import java.util.ArrayList;

public class SelectionSortAlgorithm {

    public static void main(String[] args) {
        //make 3 new lists
        int[] arr1 = {432, 543, 77, 312, 5, 2, 88, 654, 7699};
        int[] arr2 = {3234, 6456, 32, 1, 9, -653, -3, 432};
        int[] arr3 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] arr4 = {31240, 4, -2, 5, 3, 9, 10, 204, -41239, 58, 1329, 5095, -1994, 2, 78, 4};

        //print out sorted lists
        System.out.print(selectionSort(arr1) + "\n");
        System.out.print(selectionSort(arr2) + "\n");
        System.out.print(selectionSort(arr3) + "\n");
        System.out.print(selectionSort(arr4) + "\n");
    }

    //method to sort our list
    private static ArrayList<Integer> selectionSort(int[] listtobesorted){
        //make arraylist to store sorted list into
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < listtobesorted.length; i++) {
            //set each index from the zero place to the length of the original list to the lowest number in list
            result.add(i, getLowestNum(listtobesorted));
            //make smallest number equal to biggest number plus 1 to make sure repetition does not occur
            listtobesorted[indexOf(listtobesorted, getLowestNum(listtobesorted))] = getBiggestNum(listtobesorted) + 1;
        }
        //return sorted list
        return result;
    }
    //method to find location of any number
    private static int indexOf(int[] list, int numbertofind){
        //instantiate variable to store index number
        int index = 0;
        for(int i=0; i<list.length; i++){
            //if number to find does not equal the i element of list then add 1 to index
            if(numbertofind != list[i]){
                index++;
            }else{
                //if number to find does equal i element of list then end for loop
                i=list.length;
            }
        }
        //return index number of number to find
        return index;
    }
    //method to get lowest number of any list
    private static int getLowestNum(int[] list){
        //variable that acts like best so far variable to maintain lowest number
        int low;

        //give low the lowest value between first 2 indexes of list
        if(list[0] < list[1]){
            low = list[0];
        }else{
            low = list[1];
        }
        //compare lowest of first 2 elements with each rest of elements
        for(int i=2; i<list.length; i++){
            if(low > list[i]) {
                low = list[i];
            }
        }
        //return the lowest number found
        return low;
    }
    //method to find biggest number in a list
    private static int getBiggestNum(int[] list){
        //instantiate best so far variable to maintain highest number
        int high;

        //get highest number of first two indexes
        if(list[0] > list[1]){
            high = list[0];
        }else{
            high = list[1];
        }
        //compare highest number between first two numbers in list to each rest of elements
        for(int i=2; i<list.length; i++){
            if(high < list[i]){
                high = list[i];
            }
        }
        //return the highest number found in the variable
        return high;
    }

}