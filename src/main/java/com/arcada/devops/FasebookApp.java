

package com.arcada.devops;
import java.io.IOException;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

class FasebookApp {
	
	 private ArrayList<String> array = new ArrayList<String>();
	 
	void n() throws IOException {
        Scanner sc = new Scanner(new File("./SampleCSV.csv"));
        sc.useDelimiter(","); // sets the delimiter pattern
        
        array.clear();
        while (sc.hasNext()) // returns a boolean value
        {
            System.out.print(sc.next()); // find and returns the next complete token from this scanner
            String text = sc.next();
            array.add(text);
        }
        sc.close();
        
    }

	public  String getName() {
		
	//	 for (String words : array) {
	//		 System.out.print(words);
	 //       }
		 
		 return array.toString();
		 
	}
	
	public  void addName(String text) {
		
		array.add(text);
	}
	
	public  void clearList() {
		
		 array.clear();
	}
	
	
	public ArrayList<String> getArray() {
		
		return array ;
	}
	
	
	
	
    void p() {
        try {
            n();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    
}