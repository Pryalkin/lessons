package lesson4.collection.list;

import lesson1.phone.Phone;

import java.util.Comparator;

public class PhoneComparator implements Comparator<Phone> {
    @Override
    public int compare(Phone phone1, Phone phone2) {
        return phone1.getNumber().compareTo(phone2.getNumber());
    }
}
