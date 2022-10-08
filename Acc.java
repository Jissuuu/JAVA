/*Consider the Account class, which has private data members like Account Id, Account Name, Account Balance, and AnnualInterestRate as well as member methods 
like getMonthlyInterestRate(), getMonthlyInterest(), doWithDraw(), doDeposit(), and getBalance() that return MonthlyInterestRate, MonthlyInterest, and soon, respectively. 
The Account class also has two constructors: 1-Default and 2-Parameterized. Write a Java application and accompanying pseudocode as a programmer to carry out the situation mentioned above.

Input : Read Id, Name, Balance, AnnaulInterestRate (One by one in each line), Choice('D'/'W')
Output : Print Id, Name, Balance, MonthlyInterest.

Compute MontlyInterest :

Monthly interest = balance * monthlyInterestRate. 
monthlyInterestRate = annualInterestRate / 12. Note annualInterestRate is a percentage, 
Example if annualInterestRate = 4.5%. You need to divide annualInterestRate by 100.)
Note: 

The Datamembers like id, balance, rateofInterest are assigned by default to 0 using Default Consutructor.
Balance is always +Ve, otherwise print Invalid Balance.
For Option 'W', if Balance is less than the Withdraw Amount then print "Insufficient Balance"
if Choice is other than 'W' or 'D', then print "Invalid Operation"

*/



import java.util.*;
class Account{
    private int id;
    private String name;
    private float bal,air;
    private double mi;
    Account(){
        this.id = 0;
        this.bal = 0;
        this.air = 0;
    }
    Account(int id, String name, float bal, float air){
        this.id += id;
        this.name = name;
        this.bal += bal;
        this.air += air;
    }
    public void getmi(){
        this.mi = (air/1200)*bal;
        System.out.printf("%.2f",mi);
    }
    public void doWD(int WA){
        this.bal-=WA;
    }
    public void doD(int DA){
        this.bal+=DA;
    }
    public void getbal(){
        System.out.println(id);
        System.out.println(name);
        System.out.println((int)bal);
    }
}
class Acc{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int id,bal,WA,DA;
        char ch;
        float air;
        id = in.nextInt();
        String name = in.nextLine();
        name+=in.nextLine();
        bal = in.nextInt();
        air = in.nextFloat();
        if(bal<0){
            System.out.println("Invalid Balance");
        }
        else{
            Account a = new Account(id,name,bal,air);
            ch = in.next().charAt(0);
            if(ch!='W' && ch!='D'){
                System.out.println("Invalid Operation");
            }
            else{
                if(ch=='W'){
                    WA = in.nextInt();
                    if(bal<WA){
                        System.out.println("Insufficient Balance");
                    }
                    else{
                        a.doWD(WA);
                        a.getbal();
                        a.getmi();
                    }
                }
                else if(ch=='D'){
                    DA = in.nextInt();
                    a.doD(DA);
                    a.getbal();
                    a.getmi();
                }
            }
        }
        in.close();
    }
}
