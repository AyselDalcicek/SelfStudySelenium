package Interview_questions.Java;

import java.util.List;

public class ArrayList_SortingInAscending {

   // Write a method that can sort the ArrayList in Ascending order without using the sort method



   // Solution:

    public static void SortingArrayListAsc(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size(); j++) {

                if (list.get(i) < list.get(j)) {

                    Integer temp = list.get(i);

                    list.set(i, list.get(j));

                    list.set(j, temp);

                }

            }

        }

    }

    /*
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(18,72,19));
        SortingArrayListAsc(list);
    }

    public static void SortingArrayListAsc(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println(list);
    }
     */
}
