package seedu.addressbook;

import java.util.Comparator;
import java.util.HashMap;

public class HashMapComparator implements Comparator<HashMap<AddressBook.PersonProperty,String >>{
    public HashMapComparator(){
    }

    @Override
    public int compare(HashMap<AddressBook.PersonProperty, String> o1, HashMap<AddressBook.PersonProperty, String> o2) {
        String value1 = o1.get(AddressBook.PersonProperty.NAME);
        String value2 = o2.get(AddressBook.PersonProperty.NAME);
        return value1.compareTo(value2);
    }
}
