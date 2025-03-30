package Tasks;

public class Task_15_Start_pattern_difficult {
    public static void main(String[] args) {
        int rows = 4; // Number of rows for the pyramid

        for (int i = 1; i <= rows; i++) {
            // Print spaces for alignment
            for (int j = i; j < rows; j++) {
                System.out.print("\t");
            }

            // Print stars with tabs
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*\t");
            }

            // New line after each row
            System.out.println();
        }
    }
    }

