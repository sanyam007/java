import java.util.Scanner;
class Author{

String name;
String email;
char gender;
 public Author(String name, String email, char gender) {
      this.name = name;
      this.email = email;
      this.gender = gender;
   }
public String getName() {
      return name;
   }
   public char getGender() {
      return gender;
   }
   public String getEmail() {
      return email;
   }
   public void setEmail(String email) {
      this.email = email;
   }
public String toString() {
      return name +" " + gender+ " "+ email;
   }



}



class book{
private Author author;
String name;
double price;
int qty=0;
public book(String name, Author author, double price, int qty) {
      this.name = name;
      this.author = author;
      this.price = price;
      this.qty = qty;
   }
public String getName() {
      return name;
   }
public Author getAuthor() {
      return author;
   }
public int getQty() {
      return qty;
   }
public double getPrice() {
      return price;
   }
public void setPrice(double price) {
      this.price = price;
   }
public void setQty(int qty) {
      this.qty = qty;
   }
public String toString() {
      return name +" by "+author;
   }
  




}

public class test{

public static void main(String[] args) {
Author a=new Author("sanyam","sanyamchhabra@gmail.com",'m');
   
System.out.println(a.toString());
    
    
book b=new book("harry potter",a,123.123,10);
b.setPrice(123.123);
b.setQty(10);
System.out.println(b.toString());

}

}