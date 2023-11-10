package Resources;

import java.lang.reflect.Constructor;
import java.util.*;


public class Test implements CollectionTest {

    private ArrayList<Person> peopleArrayList = new ArrayList<>();
    private LinkedList<Person> peopleLinkedList = new LinkedList<>();
    private HashMap<String, Person> peopleHashMap = new HashMap<>();

    private int size;
    public Test(){
    }

    @Override
    public void setSize(int size) {
       this.size = size;
    }


    @Override
    public void runTest(CollectionTest.CollectionType type, CollectionTest.TestType test, int iterations) {
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
                            addPersonHashMap();
                        }
                        break;
                    case INDEX:
                        for (int i = 0; i < iterations; i++) {
                            indexPersonHashMap();
                        }
                        break;
                    case SEARCH:
                        for (int i = 0; i < iterations; i++) {
                            searchPersonHashmap();
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

    public void addpersonArrayList(){
        peopleArrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            String name = "Person"+i;
            Person p = new Person(name, 20);
            peopleArrayList.add(p);
        }
    }

    public void indexPersonArrayList(){
        peopleArrayList.get(size/2);
    }

    public void searchPersonArrayList(){

        peopleArrayList.indexOf(peopleArrayList.get(size/2));

    }

    public void addpersonLinkedList(){
        peopleLinkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            String name = "Person"+i;
            Person p = new Person(name, 20);
            peopleLinkedList.add(p);
        }
    }

    public void searchPersonLinkedList(){
        peopleLinkedList.indexOf(peopleLinkedList.get(size/2));
    }

    public void indexPersonLinkedList(){
        peopleLinkedList.get(size/2);
    }

    public void addPersonHashMap(){
        peopleHashMap = new HashMap<>();
        for (int i = 0; i < size; i++) {
            String name = "Person"+i;
            Person p = new Person(name, 20);
            peopleHashMap.put(p.getName(), p);
        }
    }

    public void indexPersonHashMap(){
        String name = "Person"+(size/2);
        peopleHashMap.get(name);
    }

    public void searchPersonHashmap(){
        String name = "Person"+(size/2);
        peopleHashMap.get(name);
    }
}

