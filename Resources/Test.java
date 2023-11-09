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

        switch (type){
            case ARRAY_LIST:
                switch (test){
                    case ADD:
                        for (int i = 0; i < iterations; i++) {
                            addpersonArrayList();
                        }
                        break;
                    case INDEX:
                        for (int i = 0; i < iterations; i++) {
                            indexPersonArrayList();
                        }
                        break;
                    case SEARCH:
                        for (int i = 0; i < iterations; i++) {
                            searchPersonArrayList();
                        }
                        break;
                }
                break;
            case HASH_MAP:
                switch (test){
                    case ADD:
                        for (int i = 0; i < iterations; i++) {
                            addpersonArrayList();
                        }
                        break;
                    case INDEX:
                        for (int i = 0; i < iterations; i++) {
                            indexPersonArrayList();
                        }
                        break;
                    case SEARCH:
                        for (int i = 0; i < iterations; i++) {
                            searchPersonArrayList();
                        }
                        break;
                }
                break;
            case LINKED_LIST:
                switch (test){
                    case ADD:
                        for (int i = 0; i < iterations; i++) {
                            addpersonLinkedList();
                        }
                        break;
                    case INDEX:
                        for (int i = 0; i < iterations; i++) {
                            indexPersonLinkedList();
                        }
                        break;
                    case SEARCH:
                        for (int i = 0; i < iterations; i++) {
                            searchPersonLinkedList();
                        }
                        break;
                }
                break;

        }
    }

    public long addpersonArrayList(){
        long start_time = System.nanoTime();
        Person p = new Person("a", 20);
        peopleArrayList.add(p);
        long end_time = System.nanoTime();
        System.out.println("Add: " + (end_time-start_time));
        return (end_time-start_time);
    }

    public long indexPersonArrayList(){
        Random rand = new Random();
        int index = rand.nextInt(peopleArrayList.size());
        long start_time = System.nanoTime();
        peopleArrayList.get(index);
        long end_time = System.nanoTime();
        System.out.println("Index: " + (end_time - start_time));
        return (end_time-start_time);
    }

    public long searchPersonArrayList(){
        Random rand = new Random();
        int index = rand.nextInt(peopleArrayList.size());
        Person p = peopleArrayList.get(index);
        long start_time = System.nanoTime();
        peopleArrayList.indexOf(p);
        long end_time = System.nanoTime();
        System.out.println("Search: " + (end_time - start_time));
        return (end_time-start_time);
    }

    public long addpersonLinkedList(){
        long start_time = System.nanoTime();
        Person p = new Person("a", 20);
        peopleLinkedList.add(p);
        long end_time = System.nanoTime();
        System.out.println("Add: " + (end_time-start_time));
        return (end_time-start_time);
    }

    public long searchPersonLinkedList(){
        Random rand = new Random();
        int index = rand.nextInt(peopleArrayList.size());
        Person p = peopleArrayList.get(index);
        long start_time = System.nanoTime();
        peopleLinkedList.indexOf(p);
        long end_time = System.nanoTime();
        System.out.println("Search: " + (end_time - start_time));
        return (end_time-start_time);
    }

    public long indexPersonLinkedList(){
        Random rand = new Random();
        int index = rand.nextInt(peopleArrayList.size());
        long start_time = System.nanoTime();
        peopleArrayList.get(index);
        long end_time = System.nanoTime();
        System.out.println("Index: " + (end_time - start_time));
        return (end_time-start_time);
    }

}

