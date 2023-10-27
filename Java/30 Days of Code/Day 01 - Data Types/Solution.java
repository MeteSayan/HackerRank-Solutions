import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int firstInt =  4;
        double firstDouble = 4.0;
		String firstString = "HackerRank ";

		Scanner scn = new Scanner(System.in);

        int secondInt = scn.nextInt();
        double secondDouble = scn.nextDouble();
        scn.nextLine();
		String secondString = scn.nextLine();

        System.out.println(firstInt + secondInt);
        System.out.println(firstDouble + secondDouble);
        System.out.println(firstString + secondString);

        scn.close();
    }
}