package com.bdlabz.Day27Assignment;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

public class JsonFile implements FileIO {

    public static final String FILE_PATH = "D:\\Codes\\AddressBook_Day27_Onwards_Uc\\AddressBook_Day27_Onwards_Uc\\src\\main\\java\\com\\bdlabz\\Day27Assignment\\addressMap.json";


    public void writeDataToDestination(HashMap<String, AddressBook> addressBookHashMap) throws IOException {
        Gson gson = new Gson();
        Writer writer = Files.newBufferedWriter(Paths.get(FILE_PATH));
        gson.toJson(addressBookHashMap, writer);
        writer.close();
    }

    public void readDataFromSource() throws IOException {
        Gson gson = new Gson();

        Reader reader = Files.newBufferedReader(Paths.get(FILE_PATH));


        HashMap<?, ?> map = gson.fromJson(reader, HashMap.class);
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        reader.close();
    }

}