import java.util.Scanner;
/*class Str{
    public static void main(String args[]){
        String message="hi my name is peddaiah";
        System.out.println(message.charAt(1));
    }

}*/
/*class Str{
    public static void main(String args[]){
        String name="peddaiah";
        String rev="";
        for(int i=name.length()-1;i>=0;i--){//      it a logic of reverse string.
          rev=rev+name.charAt(i);
        }
        System.out.println(rev);
    }
}*/




// qus=3   check it is palindrome.
/*class Str{
    public static void main(String[]args){
        String palindrome="madam";
        String rev="";
        for( int i=palindrome.length()-1;i>=0;i--){
            rev=rev+palindrome.charAt(i);

        }
        if(palindrome.equals(rev)){
            System.out.println("yes it is palindrome");
        }
        else{
            System.out.println("it is not palindrome");
        }
        //System.out.println(rev);
        
    }
}*/


// method 2 with own idea.......................
/*class Str{
    public static void main(String[]args){
        String name="101";
        String rev="";
        int a=name.length()-1;
        for (int i=a;i>=0;i--){
            rev=rev+name.charAt(i);
        }
        if (name.equals(rev)){
            System.out.println("yes it is palindrome");
        }
        else{
            System.out.println("it is not palindrome");
        }
    }
}
*/

// topic about length in strings.............
/*class Str{
    public static void main(String[]args){
        String name="peddaiah";                  one method using length..........
        System.out.println(name.length());

    }
}*/
/*class Str{
    public static void main(String[]args){
        String name="peddaiah chinna";
        int len=name.length();                  another method usind string.
        System.out.println(len);
    }
}*/
/*class Str{
    public static void main(String[]args){
         String name="peddaiah";
         System.out.println("upper latters:"+name.toUpperCase());
    }
}*/
/*class Str {
    public static void main(String[]args){
        String name="PEDDAIAH";
        System.out.println("capital to lower cash:"+name.toLowerCase());
    }
}*/

class Str{
    public static void main(String[]args){
        Scanner a=new Scanner(System.in);
        String var=a.Scanner();
        String rev="";
        int b=var.length()-1;
        for (int i=b;i>=0;i--){
            //reve=rev+var.charAT(i);
            rev=rev+var.charAt(i);
        }
        if (var.equals(rev)){
            System.out.println("yes it is palindrome.");
        }
        else{System.out.println("it's not a palindrome.");}
    }
}