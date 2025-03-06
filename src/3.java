import java.util.Scanner;
class Solution{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
if(n==1){
System.out.println(""+a+"");
}else if(n==2){
System.out.println(""+b+"");
}else{
System.out.println(""+c+"");
}
sc.close();
}}