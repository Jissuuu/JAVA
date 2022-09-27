import java.util.*;
class Arithmetic{
    double a,b;
    public void getdata(){
        Scanner ob = new Scanner(System.in);
        a=ob.nextDouble();
        b=ob.nextDouble();
    }
    public void add(){
        System.out.println((int)(a+b));
    }
    public void sub(){
        System.out.println((int)(a-b));
    }
    public void mul(){
        System.out.println((int)(a*b));
    }
    public void div(){
        System.out.printf("%.2f",a/b);
    }
}
class Operation extends Arithmetic{
    
    void putdata(){
        if(a<0 && b>=0){
            System.out.println("First Number is Negative");
            add();
            sub();
            mul();
            div();
        }
        else if(b==0 & a!=0){
            System.out.println("Second Number is 0, Can't divide by Zero");
            add();
            sub();
            mul();
        }
        else if(b<0 && a>=0){
            System.out.println("Second Number is Negative");
            add();
            sub();
            mul();
            div();
        }
        else if(a<0 && b<0){
            System.out.println("Both are Negative Numbers");
            add();
            sub();
            mul();
            div();
        }
        else{
            add();
            sub();
            mul();
            div();
        }
    }
    public static void main(String[] arg){
        Operation x = new Operation();
        System.out.println("Enter the values of the two numbers: ");
        x.getdata();
        x.putdata();
    }
}
