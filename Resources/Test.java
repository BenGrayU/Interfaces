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
        for (int i = 0; i < size; i++) {
            Person p = new Person("a", 20);
            peopleArrayList.add(p);
            peopleLinkedList.add(p);
            peopleHashMap.put(Integer.toString(p.hashCode()), p);
        }
    }

    @Override
    public void runTest(CollectionType type, TestType test, int iterations) {
        long start_time = 0;
        long end_time = 0;
        switch (type){
            case ARRAY_LIST:
                switch (test){
                    case ADD:
                        for (int i = 0; i < iterations; i++) {
                            start_time = System.nanoTime();
                            Person p = new Person("a", 20);
                            addperson(p);
                            end_time = System.nanoTime();
                            System.out.println((end_time-start_time));
                        }
                        break;
                    case INDEX:
                        for (int i = 0; i < iterations; i++) {
                            start_time = System.nanoTime();
                            //not too sure what to do here
                            end_time = System.nanoTime();
                            System.out.println((end_time - start_time));
                        }
                        break;
                    case SEARCH:
                        for (int i = 0; i < iterations; i++) {
                            start_time = System.nanoTime();
                            peopleArrayList.indexOf(null);//for now
                            end_time = System.nanoTime();
                            System.out.println((end_time - start_time));
                        }
                        break;
                }
                break;
            case HASH_MAP:
                break;
            case LINKED_LIST:
                break;

        }
    }

    public void addperson(Person person){
        peopleArrayList.add(person);
    }

}

