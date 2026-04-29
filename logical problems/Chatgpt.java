import java.util.Scanner;
// adding two numbers using user input.
/*class Chatgpt{
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        System.out.println("enter num1 value:");
        //String num1=a.nextLine();
        int n1=a.nextInt();
        System.out.println("enter num2 value:");
        //String num2=a.nextLine();
        int n2=a.nextInt();
        int result=n1+n2;
        System.out.println("sum of two numbers using user input:"+result);
        
    }
}*/



// 2.find largest number
/*class Chatgpt{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value:");
        int a=sc.nextInt();
        System.out.println("enter b value:");
        int b=sc.nextInt();
        if(a>=b){
            System.out.println("a is the largest number:");
        }
        else{
            System.out.println("b is the largest value");

        }
    }
}*/


// 3.check even or odd......................
/*class Chatgpt{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter value:");
        int a=sc.nextInt();
        if (a%2==0){
            System.out.println("it is a even number:");
        }
        else{
            System.out.println("it is a odd number:");
        }
    }
}*/



// 4. check even or odd without using module operator.
/*class Chatgpt{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a value:");
        int a=sc.nextInt();
        if((a&1)==0){
            System.out.println(a+" it is even number.");
        }
        else{
            System.out.println(a+" it is a odd number.");

        }
    }
}*/





// 5. find largest number of 3 digits using decision making......
/*class Chatgpt{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=10,b=20,c=15;
        if (a>=b) {
            System.out.println("a is bigger");
            

            }
        if(b>c){
            System.out.println("b is bigger");
        }    
            
        }
    }*/
// 6.sum of digits
class Chatgpt{
    public static void main(String[]args){
        String digits="123";
        int x,y,z=digits.split(1,2,3);
        System.out.println(x+(y)+z);
    }
}