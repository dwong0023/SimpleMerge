/**
 * Created by Teacher on 1/28/2019.
 * simpleMerge takes in two sorted arrays of
 * integers and merges them to return one sorted
 * array of integers.
 */
public class SimpleMerge {
    public static int[] simpleMerge(int[] arr1, int[] arr2) {
    int[] finalarray = new int[arr1.length+arr2.length];
    int[] firstarray = new int[arr1.length];
    int[] secarray = new int[arr1.length];
    for(int i = 0; i < arr1.length;i++)
    {
        firstarray[i] = Math.min(arr1[i],arr2[i]);
        secarray[i] = Math.max(arr1[i],arr2[i]);
    }
    for(int i = 0; i < arr1.length;i++)
    {
        finalarray[i] = firstarray[i];
        finalarray[i+arr1.length] = secarray[i];
    }
    return finalarray;
    }
}
