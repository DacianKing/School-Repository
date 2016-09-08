/****************************************************************************
 *
 * Created by: Andi Iacob
 * Created on: Sept 2016
 * This program calculates the number of logs that will fit on a truck,
 *     if you know their length
 *
 ****************************************************************************/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

class Main
{
    
    
public void CalculateNumberOfLogsInTruck(float length) {
    
    if(length == 1) 
        System.out.println("%d",1100/5);
    if(length == 0.5)
        System.out.println("%d",1100/10);
    if(length == 0.25)
        System.out.System.out.println("%d",1100/20);
}

	public static void main (String[] args) t
	{
		CalculateNumberOfLogsInTruck(1);
		CalculateNumberOfLogsInTruck(0.5);
		CalculateNumberOfLogsInTruck(0.25);
		
	}
}
