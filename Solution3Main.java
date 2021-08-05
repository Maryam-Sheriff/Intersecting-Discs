/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdsal;

import pdsal.Solution3;

public class Solution3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                int[] array = {1, 5, 2, 1, 4, 0};
        System.out.println("pairs of discs that intersect = " + new Solution3().number_of_intersections(array));
    }
    
}
