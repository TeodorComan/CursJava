package curs_20may.algorithm;

public class Person {
   private String name;
   private String phoneNumber;

   public String getName(){
       return name;
   }

   public void setName(String name){
       this.name=name.toUpperCase();
   }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
