/*
 * Copyright 2014 Len Payne <len.payne@lambtoncollege.ca>.
 * Updated 2015 Mark Russell <mark.russell@lambtoncollege.ca>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/* The following exercises are adapted from: 
 * Gaddis, T. (2013). Starting Out with Java: From Control Structures through  
 * Objects. (5th ed.). Upper Saddle River, NJ: Pearson Education. 
 * ISBN: 978-0-13-285583-9 
 */

package cpd3314.assign7;

/* Exercise #1 - RainFall Class
 *
 * Write a RainFall class that stores the total rainfall for each of 12 months
 * into an array of doubles. The program should have methods that return the
 * following: 
 * - A setRainfall(int, double) method to set a given month's rainfall. For 
 *     example, setRainfall(0,10) would set January's rainfall to 10.
 * - A getRainfall(int) method to retrieve a given month's rainfall. For 
 *     example, getRainfall(0) would retrieve January's rainfall. 
 * - A getTotal() method to retrieve the total rainfall for the year 
 * - A getAverage() method to retrieve the average monthly rainfall 
 * - A getMax() method to retrieve the month with the most rain as an integer 
 *    (0=Jan, ... 11=Dec)
 * - A getMin() method to retrieve the month with the least rain as an  integer 
 *    (0=Jan, ... 11=Dec)
 *
 * - Gaddis pg. 490
 */
/**
 * @author YATIN PATEL
 */
public class RainFall {
    
    double[] month = new double[12];
    public double setRainfall(int x , double y)
    {
        double rainfall;
        
         month[x] = month[x] + y;
        rainfall = month[x];

        return rainfall;
}
      public double getRainfall(int z) {

        double retrive_rain = month[z];

        return retrive_rain;
}  
        public double getTotal() {
        double sum = 0;

        for (double t : month) {

            sum = sum + t;
        }

        return sum;
      
}
         public double getAverage() {

        double sum = 0;

        for (double t : month) {

            sum = sum + t;
        }

        double avg = sum / 12;
        return avg;
    }

    public double getMax() {
        double max = month[0];

        for (int i = 0; i < month.length; i++) {
            if (month[i] > max) {

                max = i;
            }

        }

        return max;
    }

    public double getMin() {
        double min = month[0];

        for (int i = 0; i < month.length; i++) {
            if (month[i] < min) {

                min = i;
            }

        }

        return min;
    }

}


