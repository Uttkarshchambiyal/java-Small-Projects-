import java.lang.String;

class Totalmethods{
    private char[] value;
     public Totalmethods(String s){
         value = s.toCharArray();
     }

     public int length(){
         return value.length;
     }

     public char charAt(int index){
         return value[index];
     }

//     public int charPointAt(int index){
//
//     }

     public int indexOf(char x){
       for(int i = 0; i<value.length; i++){
       if(x == value[i]){
         return i; }
       }
       return -1;
     }

    public int indexOf(String x){
        for(int i = 0; i<value.length; i++){
            if(x.charAt(i) == value[i]){
                return i; }
        }
        return -1;
    }


     public int lastIndexOf(char x){
         int start = value.length-1;
         for(int i = start; i>=0; i--){
             if(x == value[i]){
                 return i;
             }
         }
         return -1;
     }



     public String toUpperCase() {
         char[] arr = new char[value.length];
         for (int i = 0; i < value.length; i++) {
             if (value[i] >= 'a' && value[i] <= 'z') {
                 arr[i] = (char) (value[i] - 32);
             }
             else{
                 arr[i] = value[i];
             }
         }
         return new String(arr);
     }

    public String toLowerCase() {
        char[] arr = new char[value.length];
        for (int i = 0; i < value.length; i++) {
            if (value[i] >= 'A' && value[i] <= 'Z') {
                arr[i] = (char) (value[i]+32);
            }
            else{
                arr[i] = value[i];
            }
        }
        return new String(arr);
    }


    public  String substring(int start, int end){
         String arr = "";
         for(int i = start; i < end; i++){
             arr += value[i];
         }
         return arr;
    }

    public boolean contains(String word){
         return indexOf(word) != -1;
    }

    public boolean startsWith(String word){
         int n = word.length();
        for(int i = 0; i < n; i++){
             if(value[i] != word.charAt(i)){
                 return false;
             }
         }
             return true;
    }

    public boolean endsWith(String word){
         int n = word.length();
         for(int i = n; i> value.length-n; i--){
             if(value[i] != word.charAt(i)){
                 return false;
             }
         }
         return true;
    }



}

public class Allstringmethods {
    public static void main() {
        Totalmethods s = new Totalmethods("raja ram mohan roy");

        System.out.println(s.length());
        System.out.println(s.charAt(3));
        System.out.println(s.indexOf('r'));
        System.out.println(s.lastIndexOf('r'));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.substring(9, 14));
        System.out.println(s.contains("ram"));
        System.out.println(s.startsWith("raja"));
        System.out.println(s.endsWith("roy"));
        //        System.out.println(s.charPointAt(0));


    }
}
