package TwoDArray;

public class DisplayandReverse {
    static void main(String[] args) {
        int [][] flats = new int[2][3];
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;

        System.out.println("Original Array");
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]+" ");
            }
            System.out.println();
        }

        //Reverse
        System.out.println("Reversed Array");
        for(int i=flats.length-1;i>=0;i--){
            for(int j=flats[i].length-1;j>=0;j--){
                System.out.print(flats[i][j]+" ");
            }
            System.out.println();
        }
    }
}
