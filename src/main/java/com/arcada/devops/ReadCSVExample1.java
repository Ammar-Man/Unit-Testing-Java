package com.arcada.devops;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadCSVExample1 {
    private ArrayList<String> array = new ArrayList<String>();

    public void Test() {
        String path = "./SampleCSV.csv";
        String line = "";
        array.clear();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                String text = "Name: \t" + values[0] + "\t Email: " + values[1];
             //   System.out.println(text);
                array.add(text);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void getSCV() {Test();}
    
    public void clearArray() {   array.clear();}
    
    public void setArray() {Test();}
    
    public ArrayList<String> getArray() {return array ;}
    
    public void addFriends(String name) {
    	array.add(name);
    }
    
    public void removeFriends(String name) {
    	
    	
    	for(int i=0; i<array.size();i++){
    		  String arrayName =  array.get(i).toString();
    		
    		  
    		  if (arrayName == name ) {
    			  
    			  array.remove(i);
    			  System.out.print(name+ " The name removed form list!");
    		  }
    		}
    	
    	
    }


    
    

}