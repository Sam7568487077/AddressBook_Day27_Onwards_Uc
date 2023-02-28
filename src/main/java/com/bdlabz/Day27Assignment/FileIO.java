package com.bdlabz.Day27Assignment;

import java.io.IOException;
import java.util.HashMap;

public interface FileIO {

    void writeDataToDestination(HashMap<String, AddressBook> addressBookHashMap) throws IOException;
    void readDataFromSource() throws IOException;

}