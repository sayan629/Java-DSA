package Arrays;

public class ReverseOrder {
    static void main(String[] args) {
        int [] arr= {2,3,4,5,7};
        int i;

        System.out.println("Orginal Array Elements are: ");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

        System.out.println("\nReversed Array Elements are: ");
        for(i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
