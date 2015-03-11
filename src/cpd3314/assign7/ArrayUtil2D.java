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

/* Exercise #15 - 2D Array Operations
 * 
 * The methods of this class are going to be fed two-dimensional arrays of 
 * doubles. Write methods within this class to perform the following tasks:
 * - getTotal(double[][]) This method should accept a two-dimensional array as 
 *     its argument and return the total of all the values in the array. 
 * - getAverage(double[][]) This method should accept a two-dimensional array as
 *     its argument and return the average of all the values in the array.
 * - getRowTotal(double[][], int) This method should accept a two-dimensional
 *     array as its first argument, and an integer as its second argument. The
 *     second argument should be the subscript of a row in the array. The method
 *     should return the total of the values in the specified row.
 * - gotColumnTotal(double[][], int) This method should accept a two-dimensional
 *     array as its first argument, and an integer as its second argument. The
 *     second argument should be the subscript of a column in the array. The 
 *     method should return the total of the values in the specified column.
 * - getHighestInRow(double[][], int) This method should accept a two-dimensional
 *     array as its first argument, and an integer as its second argument. The
 *     second argument should be the subscript of a row in the array. The method
 *     should return the highest value in the specified row of the array.
 * - getLowestInRow(double[][], int) This method should accept a two-dimensional
 *     array as its first argument, and an integer as its second argument. The
 *     second argument should be the subscript of a row in the array. The method
 *     should return the lowest value in the specified row of the array.
 *
 * - Gaddis pg. 495
 */

/**
 * @author YATIN PATEL
 */
public class ArrayUtil2D {
    
    public double getTotal(double[][] grid){
        int count=0;
     
    for(int i=0;i<grid.length;i++)
    {
    for(int j=0; j<grid[i].length;j++)
    {    
        count+=grid[i][j];
    }        
    }  
    return count;
    }
  public double getAverage(double[][] grid)
    {
    double count=0;
    double avg;
    double sum=0;
    
    
    
    for(int i=0;i<grid.length;i++)
 {
        sum += grid[i].length;
        
    for(int j=0; j<grid[i].length;j++)
    {
     count+=grid[i][j];  
    }
        
 }
    avg = count/sum;
    return avg;
    }
     public double getRowTotal(double myarr[][],int x)
     {
     double  count=0;
         
     for(int i =0; i<myarr[x].length;i++)
     {
     count = count + myarr[x][i];    
     }
     return count;
     }
    
   
     public double getColumnTotal(double ar[][],int k)
     {
     double s=0;
     
     for(int i =0; i<ar.length;i++)
    {
     s = s + ar[i][k];    
     }
     return s;
     }
     
     
     public double getHighestInRow(double arra[][],int x)
     {
     double max = arra[x][0];
  
     for(int i =0;i<arra.length;i++)
     {
        if(arra[x][i]>max)
         {
         max = arra[x][i];
         } 
     }
     return max;
     }
     
     
     public double getLowestInRow(double arra[][],int x)
     {
     double min = arra[x][0];
     
     for(int i =0;i<arra.length;i++)
     {
         if(arra[x][i]<min)
         {
         min = arra[x][i];
         } 
     }
     return min;
     }
}

