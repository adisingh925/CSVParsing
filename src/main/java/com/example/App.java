package com.example;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        /**
         * Creating a list of string array to store all the data from csv file
         */
        List<String[]> allData = new ArrayList<String[]>();

        /**
         * Adding our code inside try-with-resources
         */
        try (CSVReader reader = new CSVReader(
                new FileReader("C:\\Users\\adisi\\Downloads\\Sample data v2\\Catalog_v2.csv"))) {

            /**
             * As we know that first line is going to be the header so we have stored it in
             * a seperate array
             */
            String[] headerList = reader.readNext();

            /**
             * All the lines after the header is data so we will read one line at a time and
             * store it in row variable
             */
            String row[];

            /**
             * Reading line by line and storing the data in row variables
             */
            while ((row = reader.readNext()) != null) {
                /**
                 * adding the row to our array list
                 */
                allData.add(row);
            }
        } catch (Exception e) {
            /**
             * Displaying the exception if any
             */
            System.out.println(e.getMessage());
        }
    }
}
