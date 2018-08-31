package model;

import java.util.HashMap;
import java.util.Map;

public class PersonDb {


private static Map<Long,Person> persons;

public static Map<Long,Person> getPersons (){
    if (persons==null){
        persons=new HashMap<>();
        persons.put(1L, new Person(1L, "Jack", "Black"));
        persons.put(2L, new Person(2L, "Rick", "Sanchez"));
        persons.put(3L, new Person(3L, "Peter", "Pan"));
    }

    return persons;
}

public void addPerson(Person person){

   if (persons==null){
       getPersons();
   }
    persons.put(person.getId(), person);

}


public Person remove (long id){
    if (persons==null){
        getPersons();
    }

    return persons.remove(id);

}



}
