package com.runner;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.testng.annotations.Test;

import java.io.FileReader;
import java.io.IOException;
public class DataDrivenTest {
    @Test
    public void testLoginWithCSVData() throws IOException, InterruptedException, CsvValidationException {
        String csvFile = "src/test/resources/testData.csv";
        CSVReader reader = new CSVReader(new FileReader(csvFile));
        String[] data;
        while ((data = reader.readNext()) != null) {
            String username = data[0];
            String password = data[1];

            // Your test code to perform login using the provided username and password
            System.out.println("Testing login with username: " + username + " and password: " + password);
            // Your assertions and test steps here
            Thread.sleep(5000);
        }
        reader.close();
    }
}
