import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner we=new Scanner(System.in);
        int t=we.nextInt();
        int v=we.nextInt();
        double WCF = 35.74+(0.6215*t)+(0.4275*t-35.75)*Math.pow(v,0.16);
        System.out.printf("%.2f",WCF);
    }
}
