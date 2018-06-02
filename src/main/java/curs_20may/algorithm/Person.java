package curs_20may.algorithm;

public class Person {
   private String name;
   private String phoneNumber;

   /** Romania, nu rOmaniA **/
   private String nationalitate;

   public String getNationalitate() {
       return nationalitate;
   }

   public void setNationalitate(String nationalitate) {
       this.nationalitate = nationalitate.substring(0,1).toUpperCase() + nationalitate.substring(1).toLowerCase();
   }

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
