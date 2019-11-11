package com.epam.less10;


        import java.util.Arrays;
        import java.util.Comparator;

public class MyPhoneBook {
    class PhoneRecord {
        private String name;
        private String phone;

        public PhoneRecord(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getPhone() {
            return phone;
        }
        public void setPhone(String phone) {
            this.phone = phone;
        }
        @Override
        public String toString() {
            return "PhoneRecord: " +
                    "name= " + name +
                    ", phone= " + phone;
        }
    }
    private PhoneRecord[] records = new PhoneRecord[10];
    private int counter = 0;
    public void addPhoneNumber(String name, String phone){
        PhoneRecord temp = new PhoneRecord(name, phone);
        if (counter != records.length){
            records[counter++] = temp;
        }
    }
    public void printPhoneBook(){
        for (int i = 0; i < counter; i++) {
            System.out.println(records[i]);
        }
    }
    public PhoneRecord[] sortByName(){
        PhoneRecord[] newRecord = Arrays.copyOf(records, counter);
        Arrays.sort(newRecord, new Comparator<PhoneRecord>() {
            @Override
            public int compare(PhoneRecord o1, PhoneRecord o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return newRecord;
    }

}

