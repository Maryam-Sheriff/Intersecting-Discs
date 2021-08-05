
package pdsal;

import java.util.Arrays;
public class circle {
  public int intersection(int[] array){
      int N = array.length; 
      int [] circleRadius = new int [N];
      int [] circleMidpoint = new int [N];
      for (int i = 0; i < N; i++) { 
          circleRadius[i] = i - array[i]; 
          if (Integer.MAX_VALUE - array[i] < i) { 
              circleMidpoint[i] = Integer.MAX_VALUE; 			
          } else {
              circleMidpoint[i] = i + array[i]; 
          }
      }
      Arrays.sort(circleRadius);
      Arrays.sort(circleMidpoint);
      int RadiusIndex = 0;
      int MidPointIndex = 0;
      int openCircles = 0;
      int intersections = 0;
        while (RadiusIndex < N) {
            if (circleRadius[RadiusIndex] <= circleMidpoint[MidPointIndex]) {
                intersections = intersections + openCircles;
                openCircles++;
                RadiusIndex++;
            } else {
                openCircles--;
                MidPointIndex++;
            }

        }
        return intersections;

    }
}
