import java.util.ArrayList;

public class PersonFactory {

    private ArrayList<Person> allPersons;

    public PersonFactory() {
        allPersons = new ArrayList<>();
    }

    public void addPerson(Person person) {
        allPersons.add(person);
        for(int i = allPersons.size()-1; i >= 0; i --){
                String w = allPersons.get(i).getLastName();
                String q = allPersons.get(i-1).getLastName();

            if(w.compareTo(q) == 1){
                allPersons.set(i, allPersons.get(i-1));
            }
            if(w.compareTo(q) == -1){
                continue;
            }
            if(w.compareTo(q) == 0) {
                continue;
            }

        }

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
