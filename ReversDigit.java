package org.example;

public class ReversDigit {
    public static void main(String[] args) {
        int num=1234567;
        int revnumber=0;
        while (num>0){
            int rem=num%10;
            revnumber=revnumber*10+rem;
            num=num/10;
        }
        System.out.println(revnumber);
    }
}
