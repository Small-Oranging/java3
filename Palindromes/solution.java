package Palindromes;

public class solution {
    public boolean Solution(int num){
        int num1=num;
        int newNum=0,x;
        while(num1>0){
            x=num1%10;
            num1=num1 / 10;
            newNum=10*newNum+x;
        }
        if(num==newNum){
            return true;
        }else {
            return false;
        }
    }
}
