import java.util.Scanner;

 /*class Input_user {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(a);
    }
}*/

//scanner examples.
/*class Input_user{
    public static void main(String[]args){
        Scanner peddi=new Scanner(System.in);       this progam is int scanner example.
        int a =peddi.nextInt();
        System.out.println("enter a value:"+a);

    }
}*/

/*class Input_user{
    public static void main(String[]args){
        Scanner a=new Scanner(System.in);          this program is text (string ) scanner example.
        String name=a.nextLine();
        System.out.println("please enter ur name:"+name);


    }
}*/

/*class Input_user{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a name :");
        String name=sc.nextLine();
        System.out.print("enter a age :");
        int age=sc.nextInt();
        System.out.print("enter a height :");
        double height=sc.nextDouble();
        System.out.println("my name is :"+name);
        System.out.println("my age is :"+age);
        System.out.println("my height is : "+height);



    }






}*/


// problem: sum of two digits using user input.
/*class Input_user{
    public static void main(String[]args)
    { Scanner a=new Scanner(System.in);
        int num1=a.nextInt();
        System.out.println("enter a value");

    System.out.println("enter a value:"+num1);

     }
}*/
/*class Input_user{
    public static void main(String[]args){
        Scanner ob=new Scanner(System.in);
        System.out.print("enter a value :");    ...this program is sum of two digits using user input
        int a=ob.nextInt();
        System.out.print("enter b value :");
        int b=ob.nextInt();
        System.out.println("sum of two numbers :"+(a+b));
        ob.close();

    }
}*/

// product of two numbers ( a*b)
class Input_user {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter num1 value :");
        int num1=sc.nextInt();
        System.out.print("enter num2 value :");
        int num2=sc.nextInt();

        System.out.println("multiple two numbers:"+num1*num2);
    }
}

