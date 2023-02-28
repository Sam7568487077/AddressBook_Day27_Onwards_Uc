package com.bdlabz.Day27Assignment;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class TextFile implements FileIO{

    public static final String FILE_PATH = "D:\\Codes\\AddressBook_Day27_Onwards_Uc\\AddressBook_Day27_Onwards_Uc\\src\\main\\java\\com\\bdlabz\\Day27Assignment\\addressMap.txt";


    public void writeDataToDestination(HashMap<String, AddressBook> addressBookHashMap) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        for(Map.Entry<String, AddressBook> entry : addressBookHashMap.entrySet()){
            String addressBookString = entry.toString().concat("\n");
            stringBuffer.append(addressBookString);
        }
        Files.write(Path.of(FILE_PATH), stringBuffer.toString().getBytes());
    }

    public void readDataFromSource() throws IOException {
        Files.lines(Path.of(FILE_PATH)).forEach( addressBookString -> System.out.println(addressBookString));
    }
}