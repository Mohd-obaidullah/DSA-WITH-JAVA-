public class bridge {
        public static void main(String[] args) {
            int n = 6; // Number of rows

            for (int i = 0; i < n; i++) {
                // Left side alphabet sequence
                for (char ch = 'A'; ch < 'A' + n - i; ch++) {
                    System.out.print(ch + " ");
                }

                // Middle spaces creating the gap under the bridge
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print("  ");
                }

                // Right side reverse alphabet sequence
                for (char ch = (char)('A' + n - 1 - i); ch >= 'A'; ch--) {
                    // Skip duplicating the middle peak character on row 0
                    if (ch == 'A' + n - 1) continue;
                    System.out.print(ch + " ");
                }
                System.out.println();
            }
        }
    }

