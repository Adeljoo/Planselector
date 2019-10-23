package planoperator;
import  java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//import aQute.libg.map.MAP;

import java.awt.geom.Arc2D.Float;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.lang.Double;
public class planner { 
	 static /*planner 
	input set of plans, probability. agent should calculate the utility and select the highest one * */
	String[] planslist = {"P1","P2","P3","P4"};
	
	
	//R = Tv/Pv∗(1−T)
	
	//{ (double) 0,(double)1,(double)1};
	Integer selectedplan = 0; 
	@SuppressWarnings("unchecked")
	public static void main (String args[]){
		ArrayList<Double> listofprob = new ArrayList<Double>(); 
		ArrayList <Double> plans  = new ArrayList<Double>();
		ArrayList <Double> plansval  = new ArrayList<Double>();
		ArrayList <Double> value = new ArrayList <Double>();
		value.add((double) 0);
		value.add((double) 1);
		value.add((double) 1);
		value.add((double) 0);
		System.out.println(value);
	//System.out.println("Generating 10 random integers in range 0..99.");
     Random random = new Random();
      for(int i =0; i<5; i++){
		    double randomDouble = random.nextDouble();
		    listofprob.add(randomDouble);
		    
		  System.out.println(listofprob.get(i));
		}

 plans.addAll(listofprob);
 
System.out.println(plans);

//System.arraycopy(plans, 0, planslist, 0, 4);
//System.out.println(planslist);

for (int i = 0; i < plans.size(); i++) {

        for (int j = 0; j < value.size(); j++) {
        	 try { 
        		
        	plansval.add(plans.get(i) * value.get(j)); 
        	} catch (IndexOutOfBoundsException e)
        	 
        	 {
        		System.out.println("IndexOutOfBoundsException: " + e.getMessage()); 
        	 }
            
          
        }
  System.out.println(plansval);
	 

/*assign probabilies to plans *done assign value to each plan and  PU = value * probabilities done done */
	 /* calculate utility sort and chose the max*/
	 
 
System.out.println(Collections.max(plansval));
	//return max;
	
	
	
	}
	}
} 
