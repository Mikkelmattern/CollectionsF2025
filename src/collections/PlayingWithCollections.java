package collections;

import entities.Course;
import entities.Creature;
import entities.Student;
import util.DataReader;

import java.util.*;

public class PlayingWithCollections {

    public static void main(String[] args) {
        playWithLists();
        playWithSet();
        playWithMaps();
        searchTimes();
    }

    public static void playWithLists() {

        // Lav en LinkedList og en ArrayList med Student-objekter. Fyld dem op med objekter ved at kalde DataReader.fillWithStudents() med din liste
        ArrayList<Student> list = new ArrayList<>();
        LinkedList<Student> students = new LinkedList<>();
        DataReader.fillWithStudents(list, 10);
        DataReader.fillWithStudents(students, 10);
        // Tilføj et nyt Student-objekt objekt med metoden add() til hver af listerne.
        Student student1 = new Student("Mikkel", 10);
        list.add(student1);
        students.add(student1);
        // Hvor i listerne tror du, det bliver tilføjet? Test din teori ved at printe listerne før og efter
        // System.out.println(list);
        // System.out.println(students);
        // Hvad sker der hvis vi tilføjer et nyt Student-objekt på index 3 i hver af listerne?
        Student student2 = new Student("Abaa", 2);
        list.add(2, student2);
        students.add(2, student2);
        // Prøv det af. Tænk over hvad du tror, der vil ske og print så ud for at se om du har ret
        // System.out.println(list);
        // System.out.println(students);
        // Hvad sker der hvis vi tilføjer to ens Student-objekter?
        Student student3 = new Student("Mikkel", 10);
        list.add(student3);
        students.add(student3);
        // System.out.println(list);
        // System.out.println(students);
    }

    public static void playWithSet() {
        // Lav et HashSet og et TreeSet med Student-objekter. Fyld det op ved at kalde DataReader.fillWithStudents() med dit sæt
        HashSet<Creature> set = new HashSet<>();
        TreeSet<Creature> treeSet = new TreeSet<>();

        // Tilføj et nyt Student-objekt objekt med metoden add()
        treeSet.add(new Creature("Demon", 20000, 2));
        treeSet.add(new Creature("Angel", 1500, 1));
        treeSet.add(new Creature("Goblin", 35, 10));
        treeSet.add(new Creature("Orc", 50, 12));
        treeSet.add(new Creature("Vampire", 400, 7));
        treeSet.add(new Creature("Werewolf", 80, 15));
        treeSet.add(new Creature("Elf", 120, 4));
        treeSet.add(new Creature("Dark Elf", 140, 5));
        treeSet.add(new Creature("High Elf", 300, 6));
        treeSet.add(new Creature("Giant", 3000, 9));
        treeSet.add(new Creature("Troll", 130, 11));
        treeSet.add(new Creature("Dragon", 10000, 3));
        treeSet.add(new Creature("Skeleton", 10, 18));
        treeSet.add(new Creature("Zombie", 5, 22));
        treeSet.add(new Creature("Ghoul", 40, 16));
        treeSet.add(new Creature("Wraith", 500, 8));
        treeSet.add(new Creature("Phantom", 600, 13));
        treeSet.add(new Creature("Minotaur", 200, 14));
        treeSet.add(new Creature("Hydra", 900, 20));
        treeSet.add(new Creature("Slime", 3, 25));

        set.add(new Creature("Demon", 20000, 2));
        set.add(new Creature("Angel", 1500, 1));
        set.add(new Creature("Goblin", 35, 10));
        set.add(new Creature("Orc", 50, 12));
        set.add(new Creature("Vampire", 400, 7));
        set.add(new Creature("Werewolf", 80, 15));
        set.add(new Creature("Elf", 120, 4));
        set.add(new Creature("Dark Elf", 140, 5));
        set.add(new Creature("High Elf", 300, 6));
        set.add(new Creature("Giant", 3000, 9));
        set.add(new Creature("Troll", 130, 11));
        set.add(new Creature("Dragon", 10000, 3));
        set.add(new Creature("Skeleton", 10, 18));
        set.add(new Creature("Zombie", 5, 22));
        set.add(new Creature("Ghoul", 40, 16));
        set.add(new Creature("Wraith", 500, 8));
        set.add(new Creature("Phantom", 600, 13));
        set.add(new Creature("Minotaur", 200, 14));
        set.add(new Creature("Hydra", 900, 20));
        set.add(new Creature("Slime", 3, 25));
        // Hvor i settet tror du, det bliver tilføjet? Test din teori ved at printe settet før og efter
        // System.out.println(set);
        // System.out.println(treeSet);
        // Hvad sker der hvis vi tilføjer to ens Student-objekter?

        // Ekstra - hvad vil det sige, at Student-objekterne er ens? Kan vi ændre på dette?

        // Lav din egen klasse med nogle attributter og nogle fornuftige equals(), hashcode og compareTo()-metoder
        // Prøv din klasse af ved at indsætte nogle objekter af den i henholdsvis et TreeSet og et HashSet
    }

    public static void playWithMaps() {
        // Lav et HashMap() med Student-objekter og Courses, hvor Student er key og Course er value
        HashMap<Student, Course> map = new HashMap<>();

        // Fyld det op ved at kalde DataReader.fillWithStudentsAndCourses()
        DataReader.fillWithStudentsAndCourses(map, 20);
        // Tilføj et nyt Student-objekt/Course-objekt par med metoden put()
        map.put(new Student("Mikkel", 1), new Course("DAT1"));
        // Hvor i mappet tror du, det bliver tilføjet? Test din teori ved at printe settet før og efter
        System.out.println(map);
        map.put(new Student("Mikkel1", 1), new Course("DAT1"));
        System.out.println(map);
        // Hvad sker der hvis vi tilføjer to Student/Course par hvor Student-objekterne er ens?
        // Den overskriver både key og value
        // Og hvad sker der hvis vi tilføjer to Student/Course par hvor Course-objekterne er ens?
        // Den tilføjer valuen til den nye key

        // Prøv at indsætte objekter af din egen klasse (med tilhørende values, fx i form af Stringobjekter) i et HashMap
    }

    public static void searchTimes() {
        // brug metoden System.currentTimeMillis() til at tage tid.
        // Eksempel:
        List<Student> studlist = new ArrayList<>();
        DataReader.fillWithStudents(studlist, 100000000);

        // starttid
        long start = System.currentTimeMillis();
        System.out.println(studlist.contains(new Student("Signe", 30)));
        // sluttid
        long end = System.currentTimeMillis();
        // Søgetiden er sluttid minus starttid
        System.out.println("Time list: " + (end - start));
    }
}