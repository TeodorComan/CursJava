package curs_20may.algorithm;

public class Main
{
    public static void main( String[] args )
    {
        System.out.println(adunareCifre(999999999));

    }

    public static void findPhoneNumberByName(String name, PhoneBook phoneBook) {
       for(int i=0;i<20;i++) {
           Person person = phoneBook.getPersons()[i];

           if(person!=null && person.getName().equals(name)){
               System.out.println(person.getPhoneNumber());
           }
       }
    }

    public static void findPersonsByCommonNationality(String name, PhoneBook phoneBook) {
        Person myPerson = null;

        for(int i=0;i<20;i++) {
            Person person = phoneBook.getPersons()[i];

            if(person!=null && person.getName().equals(name)){
                myPerson=person;
                break;
            }
        }
        if(myPerson!=null) {
            for (int i = 0; i < 20; i++) {
                Person person = phoneBook.getPersons()[i];

                if (person != null && person.getNationalitate().equals(myPerson.getNationalitate())) {
                    System.out.println(person.getName());
                }
            }
        }

    }


    public static int adunareCifre(int numar) {
        int suma = 0;
        while (numar != 0) {
            suma = suma + numar % 10;//impartind un numar la 10 este ca si ccum am desparti ultima cifra de restul cifrelor
            numar = numar / 10;
        }
        if (suma <= 9)
            return suma;
        else
            return (adunareCifre(suma));
    }
}
