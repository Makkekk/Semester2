package opgave04;


import opgave04.model.MergeSortHelper;

import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {
            ArrayList<Integer> testList = new ArrayList<>();
            testList.add(5);
            testList.add(2);
            testList.add(9);
            testList.add(1);
            testList.add(6);

            ArrayList<Integer> sorted = MergeSortHelper.mergeSort(testList);
            System.out.println("Sorteret liste: " + sorted);  // Forvent fx [1, 2, 5, 6, 9]
        }
    }
