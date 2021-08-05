/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdsal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Solution2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of Circles ");
        System.out.println("Enter any character to stop:");
        while (input.hasNextInt()) {
            list.add(input.nextInt());
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        System.out.println("number of intersections =" + intersectingDiscs(arr));
    }

    public static int intersectingDiscs(int[] A) {
        long[] EndPoint = new long[A.length];
        long[] startPoint = new long[A.length];

        for (int i = 0; i < A.length; i++) {
            EndPoint[i] = (long) A[i] + i;
            startPoint[i] = -((long) A[i] - i);
        }
        Arrays.sort(EndPoint);
        Arrays.sort(startPoint);

        long count = 0;

        for (int i = A.length - 1; i >= 0; i--) {
            int position = Arrays.binarySearch(startPoint, EndPoint[i]);
            if (position >= 0) { //end loop
                while (position < A.length && startPoint[position] == EndPoint[i]) {
                    position++;
                }
                count += position;
            } else { // element not there
                int intersectionPoint = -(position + 1);
                count += intersectionPoint;
            }

        }

        long unIntersectedDiscs = (long) A.length * ((long) A.length + 1) / 2;
        count -= unIntersectedDiscs;

        return (int) count;
    }

}

