package org.example;
import java.io.*;
public class Main {





    public static void main(String[] args) throws IOException {


        try{
            ListOfNumbers listOfNumbers=new ListOfNumbers();
            listOfNumbers.writeList();
            listOfNumbers.readList();
        }
        catch (IOException e){
            System.out.println("Caught IOException "+e.getMessage() );
        }
        catch(Exception e){
            System.out.println("Caught Exception "+e.getMessage() );
   }


    }
}