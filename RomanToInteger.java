import java.util.*;
//Roman Numbers to Integers
class RomanToInteger {
    public static int romanToInt(String s) {
        char[] a = s.toCharArray();
        int n = a.length;
        int sum=0;
        if(n>=1 && n<=15){
            for(int i=0;i<n;i++){
                if(a[i]!='I' && a[i]!='V' && a[i]!='X' && a[i]!='L' && a[i]!='C' && a[i]!='D' && a[i]!='M'){
                    System.out.println("Input must consist of values in ['I', 'V', 'X', 'L', 'C', 'D', 'M'] only");
                    return -1;
                }
                else{
                    if(a[i]=='I'){
                        if(i<(n-1)){
                            if(a[i+1]=='X' || a[i+1]=='V'){
                                sum-=1;
                            }
                            else{
                                sum+=1;
                            }
                        }
                        else{
                            sum+=1;    
                        }
                    }         
                    else if(a[i]=='X'){
                        if(i<(n-1)){
                            if(a[i+1]=='L' || a[i+1]=='C'){
                                sum-=10;
                            }
                            else{
                                sum+=10;
                            }
                        }
                        else{
                            sum+=10;    
                        }
                    }    
                    else if(a[i]=='C'){
                        if(i<(n-1)){
                            if(a[i+1]=='D' || a[i+1]=='M'){
                                sum-=100;
                            }
                            else{
                                sum+=100;
                            }
                        }
                        else{
                            sum+=100;    
                        }
                    }    
                    else if(a[i]=='V'){
                        sum+=5;                
                    } 
                    else if(a[i]=='L'){
                        sum+=50;                
                    } 
                    else if(a[i]=='D'){
                        sum+=500;                
                    } 
                    else if(a[i]=='M'){
                        sum+=1000;                
                    } 
                }
                
            }
            return sum;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close();
        System.out.println(romanToInt(s));
    }    
}

