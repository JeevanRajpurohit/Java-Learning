import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class ReadingAFIle {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a Number : ");
//        int num= System.in.read();                                1st approach
//        System.out.println("The Number is :" + (num-48));
//        InputStreamReader input = new InputStreamReader(System.in);   //2nd approach
//        BufferedReader bf = new BufferedReader(input);
//        int num= Integer.parseInt(bf.readLine());
//        System.out.println(num);
        Scanner sc = new Scanner(System.in);    //3rd approach
        int ans= sc.nextInt();
        System.out.println(ans);

    }
}
