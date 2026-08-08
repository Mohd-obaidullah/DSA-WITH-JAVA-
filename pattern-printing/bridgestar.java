public class bridgestar {
    public static void main(String[] args) {
        int n = 5;

        // Outer loop handles the number of rows
        for (int i = 0; i < n; i++) {

            // 1. First inner loop: Prints left side downward triangle
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            // 2. Second inner loop: Prints increasing spaces in the center
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }

            // 3. Third inner loop: Prints right side downward triangle
            for (int j = 0; j < n - i; j++) {
                // Skips the extra overlapping star in the very first row
                if (i == 0 && j == 0) {
                    continue;
                }
                System.out.print("*");
            }

            // Move to the next line after completing each row
            System.out.println();
        }
    }
}

