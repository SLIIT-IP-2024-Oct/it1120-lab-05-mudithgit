import java.util.Scanner;
public class  it24610813Lab5Q2{
public static void main (String [] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter the number of new members introduced:");
int newmembers= input.nextInt();
if(newmembers<0){
 System.out.println("Invalid input. The number of new members must be greater than or equal to 0.");
 }else{
 String prize;
 switch (newmembers){
 case 0:
 prize="no prize";
 break;
  case 1:
 prize="pen";
 break;
  case 2:
 prize="umbrella";
 break;
  case 3:
 prize="bag";
 break;
  case 4:
 prize="travelling chair";
 break;
  default:
 prize="headphone";
 break;
 }
  System.out.println("The prize is: " + prize);
  }
  
  }
  }
 
 
