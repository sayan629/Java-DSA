public class ShadowingConcept {
    static int x=30; //This will be shadowed at line no 7.

    static void main(String[] args) {
        System.out.println(x);  //90
        int x=99;       //the class variable at line 2 is shadowed by this.
        System.out.println(x); //40

    }
}
