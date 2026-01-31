public class Currency_Denomination {
        public static void main(String[] args) {
            if(args.length==0){
                System.out.println("Please Provide the amount in RS as command line argunment.");
                return;
            }
            int amount=Integer.parseInt(args[0]);


            int[] notes={2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

            System.out.println("Amount = ₹. "+amount);
            System.out.println("Required Denominations: ");
            for (int note : notes) {
                if (amount >= note) {
                    int count = amount / note;
                    amount %= note;
                    System.out.println(note + " x " + count);
                }
            }
        }
    }


