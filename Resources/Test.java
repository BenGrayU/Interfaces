import java.lang.reflect.Constructor;
import java.util.*;

public class Test implements CollectionTest{

    ArrayList<Person> peopleArrayList = new ArrayList<>();
    LinkedList<Person> peopleLinkedList = new LinkedList<>();
    HashMap<String, Person> peopleHashMap = new HashMap<>();
    public Test(){
    }

    @Override
    public void setSize(int size) {

    }

    @Override
    public void runTest(CollectionType type, TestType test, int iterations) {
        switch (type){
            case ARRAY_LIST:
                for (int i = 0; i < 100; i++) {
                    Person p = new Person("a", 19);
                    peopleLinkedList.add(p);
                }
                break;
            case HASH_MAP:
                break;
            case LINKED_LIST:
                break;
        }



    }

}
