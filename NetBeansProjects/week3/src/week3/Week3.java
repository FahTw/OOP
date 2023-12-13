/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week3;
import java.util.*;
public class Week3 {

    public static void main(String[] args) {
        int countOdd = 0;
        int countEven = 0;
        while (true) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
            else {
                if (num % 2 == 0) {
                    countEven += 1;
                }
                else {
                    countOdd += 1;
                }
            }
        }
        System.out.println("Odd numbet = " + countOdd + " Even number = " + countEven);
    }
    
}
