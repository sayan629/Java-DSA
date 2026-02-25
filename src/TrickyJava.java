public class TrickyJava {
        public static void main(String[] args) {

            int c = 10;

            for (;;) {        // infinite loop
                if (c++ > 10) {
                    break;
                }
            }

            System.out.println(c);
        }
    }

