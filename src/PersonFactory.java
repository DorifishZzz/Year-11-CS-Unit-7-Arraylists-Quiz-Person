import java.util.ArrayList;

public class PersonFactory {

    private ArrayList<Person> allPersons;

    public PersonFactory() {
        allPersons = new ArrayList<>();
    }

    public void addPerson(Person newPerson) {
        for (int i = 0; i < allPersons.size(); i++) {
            if (newPerson.getLastName().compareTo(allPersons.get(i).getLastName()) <= 0) {
                allPersons.add(i, newPerson);
                return;
            }
        }
        allPersons.add(0,newPerson);
    }

    public ArrayList<Person> under18() {
        ArrayList<Person> under18Only = new ArrayList<>();
        for(int i = 0; i < allPersons.size(); i++){
            if (allPersons.get(i).getAge() == 18){
                under18Only.add(allPersons.get(i));
            }
        }
        return under18Only;

    }

    public boolean checkLastName(String lastName) {
        for(int i = 0; i < allPersons.size(); i++ ){
            String last = allPersons.get(i).getLastName();
            if (last.equals(lastName)){
                return true;
            }
            }
        return false;
        }
    }
}
