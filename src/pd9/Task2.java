/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd9;

/**
 *
 * @author YDRGZM
 */
public class Task2 {

    public static void main(String[] args) {

    }

    static void displayVertical(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                System.out.println(s.charAt(i));
            }
        }
    }
}
