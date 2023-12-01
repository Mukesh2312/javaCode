package sorting;

import java.util.Arrays;

public class assignment {
    public static int[] merge(int[] arr1, int[] arr2){
        //creating new arr size of both previous arr
        int[] combine = new int[arr1.length + arr2.length];
        //creating index pointer for new arr
        int index = 0;
        //creating i pointer for arr1
        int i = 0;
        // creating j pointer for arr2
        int j = 0;
        //run while loop till one of the arr is empty
        //if one of the arr will empty then while loop break
        while(i<arr1.length && j < arr2.length){
            //checking if arr1[i] < arr2[j]

            // if true

            // add arr1[i] into the new arr
            // at the combine[index] position
            // increas index by one
            // increas i pointer by one
            if(arr1[i] < arr2[j] ){
                combine[index] = arr1[i];
                index++;
                i++;
            }

            // if arr1[i] not lesser than arr2[j]
            //then add arr2[j] into new arr
            // at the position combine[index] position
            // increase index pointer
            // increase j pointer
            else {
                combine[index] = arr2[j];
                index++;
                j++;
            }
        }
        // if arr1 have elements remaining
        // add this
        while(i<arr1.length){
            combine[index] = arr1[i];
            index++;
            i++;
        }

        // if arr2 have elements remaining
        // add this
        while(j<arr2.length){
            combine[index] = arr2[j];
            index++;
            j++;
        }


        // return new arr
        return combine;
    }
    public static void main(String[] args) {
        int[] arr2 = {1, 3, 4};
        int[] arr1 = {6, 8, 9, 10};

        int[] result = merge(arr1, arr2);
        System.out.println(Arrays.toString(result));
      }
}
