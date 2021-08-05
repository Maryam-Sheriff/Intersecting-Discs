/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdsal;



import java.util.*;
public class Solution3 {
    public static int number_of_intersections(int[] A) {
        int N = A.length;
        long[] start_point = new long[N];
        long[] end_point = new long[N];
        for (int i = 0; i < N; i++) {
            start_point[i] = i - A[i];
            end_point[i] = i + A[i];
        }

        Arrays.sort(start_point);
        Arrays.sort(end_point);

        int intersection = 0;
        int j = 0;
        for (int i = 0; i < N; i++) {
            while (j < N &&  end_point[i] >=start_point[j]) {
                intersection += j;
                intersection -= i;
                j++;
            }
        }

        return intersection;
    }

}
