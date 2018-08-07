import java.util.Scanner;
public class account{
private int accno;
private double balance;
public account(int accno,double balance){
this.accno=accno;
this.balance=balance;
}
public account(int accno){
this.accno=accno;
}
public int getaccno(){
return accno;
}
public double getbalance(){
return balance;
}

public void setbalance(double balance){
    this.balance=balance;
}
public void credit(double amount){
balance+=amount;
}
public void debit(double amount){
if(balance>=amount){
balance-=amount;
}
else{
System.out.println("amount withdrawn is more than balance");
}
}
@Override
public String
return "account{"+"account no =" + accno + " balance =" + balance+"}";



  public static void main(String[] args) {
//Scanner sc=new Scanner(System.in);
account a=new account(1234,500);
a.setbalance(500);
a.credit(500);
a.debit(500);
System.out.println(a.toString());
System.out.println(a.getbalance);

account a1=new account(5000);
a1.setbalance(500);
a1.credit(500);
a1.debit(500);
System.out.println(a1.toString());



  }
}
