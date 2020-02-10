package Interview_questions.Java;


import java.util.*;

public class ArrayList_RemoveSomeValues {

    // Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.

    public static void main(String[] args) {

        // Solution 1:
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 101, 200, 300));
        ArrayList<Integer> list2 = new ArrayList<>();
        for (Integer each : list1) {
            if (each < 100) {
                list2.add(each);
            }
        }
        list1 = list2;
        System.out.println(list1);

        // Solution 2:
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 101, 200, 300));
        Iterator<Integer> it = list.iterator();
        while (it.hasNext())
            if (it.next() > 100)
                it.remove();
        System.out.println(list);

        // Solution 3:
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 101, 200, 300));
        for (ListIterator<Integer> li = list3.listIterator(); li.hasNext(); )
            if (li.next() > 100)
                li.remove();
        System.out.println(list3);

        // Solution 4:
        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 101, 200, 300));
            list4.removeIf(p -> p>100);
        System.out.println(list4);

    }

}
