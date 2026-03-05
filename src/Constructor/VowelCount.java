package Constructor;

//Constructor Named UserString having a string variable, no argument constructor, a one argument constructor and a copy constructor
//to initialize the string and method called charCount(), which returns the number of character present in the String and a method
// countVowel() to count number of vowel present in the String
class UserString{
    String str;

    UserString(){
        str="Not Known";
    }
    UserString(String s){
        str=s;
    }
    UserString(UserString u){
        str=u.str;
    }
    int charCount(){
        return str.length();
    }
    int countVowel(){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch= Character.toLowerCase(str.charAt(i));
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u'){
                count++;
            }
        }
        return count;
    }
    void display(){
        System.out.println("String is: "+str);
        System.out.println("Number of alphabet: "+charCount());
        System.out.println("Number of Vowels: "+countVowel());
    }
}
public class VowelCount {
    static void main(String[] args) {
        UserString s1=new UserString("The Quick Brown Fox jumps over the lazy dog");
        UserString s2= new UserString(s1);
        s1.display();
        s2.display();
    }
}
