import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {

    public static void main(String[] args) {

        // =========================
        // ARRAYS SECTION
        // =========================
        // Think of an array like a fixed row of lockers.
        // Once you decide how many lockers you have,
        // you can't magically add more without rebuilding the whole thing.

        int[] gradesArray = new int[3]; // fixed size = 3

        // assigning values manually using index positions
        gradesArray[0] = 88;
        gradesArray[1] = 92;
        gradesArray[2] = 76;

        // accessing an element is very fast because Java knows exactly
        // where it lives in memory
        System.out.println("----- ARRAY EXAMPLE -----");
        System.out.println("Arrays are fixed in size after creation.");
        System.out.println("Array length: " + gradesArray.length);
        System.out.println("Second element in array: " + gradesArray[1]);
        System.out.println("Array contents: " + Arrays.toString(gradesArray));

        // lets say later we realize we actually needed 5 spots instead of 3
        // we can't just expand the original array...
        // so now we create a brand new one

        int[] newGradesArray = new int[5];

        // manually copying values over (kind of annoying honestly)
        for (int i = 0; i < gradesArray.length; i++) {
            newGradesArray[i] = gradesArray[i];
        }

        // now we can add more values to the new bigger array
        newGradesArray[3] = 81;
        newGradesArray[4] = 95;

        System.out.println("New resized array (manual process): "
                + Arrays.toString(newGradesArray));


        // =========================
        // ARRAYLIST SECTION
        // =========================
        // ArrayList is more flexible.
        // It automatically handles resizing behind the scenes.
        // No need to manually rebuild anything.

        ArrayList<Integer> gradesList = new ArrayList<>();

        // notice we are using Integer not int
        // ArrayLists store objects, not primitive types
        gradesList.add(88);
        gradesList.add(92);
        gradesList.add(76);

        System.out.println("\n----- ARRAYLIST EXAMPLE -----");
        System.out.println("ArrayLists can grow or shrink dynamically.");
        System.out.println("ArrayList size: " + gradesList.size());
        System.out.println("Second element in ArrayList: "
                + gradesList.get(1));
        System.out.println("ArrayList contents: " + gradesList);

        // we can just keep adding...
        gradesList.add(81);
        gradesList.add(95);

        // and removing...
        // removing index 0 will remove the first element (88)
        gradesList.remove(0);

        // this happens without needing to recreate anything
        System.out.println("After adding/removing elements: "
                + gradesList);
        System.out.println("Updated size: " + gradesList.size());

        // ArrayList has built-in helper methods
        // Arrays don't have these kinds of features by default
        System.out.println("\nArrayList contains 95? "
                + gradesList.contains(95));
     // --------- CALCULATE AVERAGE USING A LOOP ---------

        int sum = 0;

        // loop through each grade in the ArrayList
        for (int i = 0; i < gradesList.size(); i++) {
            sum += gradesList.get(i);
        }

        double average = (double) sum / gradesList.size();

        System.out.println("\nTotal sum of grades: " + sum);
        System.out.println("Average grade: " + average);


        // =========================
        // FINAL COMPARISON
        // =========================
        // quick breakdown for reference
        System.out.println("\n----- COMPARISON SUMMARY -----");

        System.out.println("Arrays:");
        System.out.println("- Fixed size once created");
        System.out.println("- Can store primitive types like int");
        System.out.println("- Require manual resizing");
        System.out.println("- Lightweight and simple");

        System.out.println("\nArrayLists:");
        System.out.println("- Dynamic size (auto resize)");
        System.out.println("- Store objects like Integer");
        System.out.println("- Built-in methods (add, remove, contains)");
        System.out.println("- Easier to manage changing data");

        // sometimes you may need to convert ArrayList back into an array
        // for compatibility with older code or certain APIs
        Integer[] convertedArray = gradesList.toArray(new Integer[0]);

        System.out.println("\nConverted ArrayList to array: "
                + Arrays.toString(convertedArray));

        // overall:
        // use arrays when you know the size ahead of time
        // use ArrayList when the number of items might change
    }
}