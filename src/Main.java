import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

    public static <Char> void main(String[] args) {
        // Задача 1
        for (int i = 0; i < nums.size(); i++) {
            if (!(nums.get(i) % 2 == 0)) {
                System.out.print(nums.get(i) + " ");
            }
        }
        // Задача 2
        System.out.println();
        Collections.sort(nums);
        Set<Integer> numsSet = new HashSet<>(List.of());
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                numsSet.add(nums.get(i));
            }
        }
        System.out.println(numsSet);

        //Задача 3
        Set<String> stringsSet = new HashSet<>(List.of());
        for (int i = 0; i < strings.size(); i++) {
              stringsSet.add(strings.get(i));
            }
        System.out.println(stringsSet);

        //Задача 4
        List<String> strings2 = new ArrayList<>(List.of());
        for (int i = 0; i < strings.size(); i++){
            if (!(strings2.contains(strings.get(i)))){
                strings2.add(strings.get(i));
            }
        }
        for (int i = 0; i < strings2.size(); i++) {
            int count =0;
              for (int a = 0; a < strings.size(); a++) {
                  if (strings2.get(i).equals(strings.get(a))) {
                      count++;
                  }
              }
              System.out.println(strings2.get(i) + " " + count);
        }




    }
}