package org.example;

import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Vector;

public class ListOfNumbers {

    private List<Integer> list;

    private Vector<Integer> vector;
    private static final int SIZE = 10;

    public ListOfNumbers () {
        list = new ArrayList<Integer>(SIZE);
        vector=new Vector<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++)
            list.add(i);
    }

    public void readList() throws IOException {

        BufferedReader  bufferedReader = null;

        try {

            bufferedReader = new BufferedReader(new FileReader("OutFile.txt"));

            String readedValue;

            while((readedValue=bufferedReader.readLine()) !=null){

                String[] splittedString=readedValue.split(" ");

                Integer number=Integer.parseInt(splittedString[splittedString.length-1]);

                vector.add(number);
                System.out.println("Readed value "+number);
            }



        } catch (IndexOutOfBoundsException e) {
            System.err.println("Caught IndexOutOfBoundsException: " +
                    e.getMessage());
        }
        catch (FileNotFoundException e){
            System.err.println("Caught FileNotFoundException: " +
                    e.getMessage());
        }
        catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        }
        catch (Exception e){
            System.err.println("Caught Exception: " + e.getMessage());
        }
        finally {
            if (bufferedReader != null) {
                System.out.println("Closing Buffer Reader");
                bufferedReader.close();
            } else {
                System.out.println("Buffer Reader not open");
            }
        }

    }

    public void writeList() {
        PrintWriter out = null;

        try {
            System.out.println("Entering try statement");


            out = new PrintWriter(new FileWriter("OutFile.txt"));

            for (int i = 0; i < SIZE; i++){
                out.println("Value at: " + i + " = " + list.get(i));

            }

        } catch (IndexOutOfBoundsException e) {
            System.err.println("Caught IndexOutOfBoundsException: " +
                    e.getMessage());
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        } finally {
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } else {
                System.out.println("PrintWriter not open");
            }
        }
    }



}
