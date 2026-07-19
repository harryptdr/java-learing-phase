
import java.util.*;
public class Main{
public class Solution {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read the patch string
            String patch = scanner.next();

            // Read the designer words
            String designerWords = scanner.next();

            scanner.close();

            // Find the sequence
            List<Integer> sequence = findPatchSequence(patch, designerWords);

            // Print the sequence or -1 if not possible
            if (sequence.isEmpty()) {
                System.out.println("-1");
            } else {
                for (int index : sequence) {
                    System.out.print(index);
                }
            }
        }

        public static List<Integer> findPatchSequence(String patch, String target) {
            List<Integer> sequence = new ArrayList<>();
            StringBuilder formedString = new StringBuilder();

            for (int i = 0; i < target.length(); i++) {
                formedString.append(patch);
                if (formedString.length() > target.length()) {
                    formedString.setLength(target.length());
                }
                sequence.add(i);

                // If the required string is formed, return the sequence
                if (formedString.toString().equals(target)) {
                    return sequence;
                }
            }
            return new ArrayList<>(); // Return empty list if not possible
        }
    }
    }
