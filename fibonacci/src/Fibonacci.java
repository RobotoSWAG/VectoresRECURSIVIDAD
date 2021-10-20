import java.util.Scanner;

public class Fibonacci{

    static int funcionFibonacci(int num){
        if(num == 0 || num==1)
            return num;
        else
            return funcionFibonacci(num-1) + funcionFibonacci(num-2);
    }

}
