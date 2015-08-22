/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerdemo;

/**
 *
 * @author Hiren Patel
 */
import java.util.Scanner;
public class ScannerDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int testScore1, testScore2, testScore3;
        float avgScore;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter test1 :");
         testScore1 = sc.nextInt();
        System.out.println("Enter test2 :");
        testScore2 = sc.nextInt();
        System.out.println("Enter test3 :");
         testScore3 = sc.nextInt();
        System.out.println("Test1: "+testScore1+"Test2: "+testScore2+"Test3: "+testScore3);
        avgScore = (float)(testScore1 + testScore2 + testScore3) / 3;
        System.out.println("Average Score is :" + avgScore);
        
        
    }
    
}
