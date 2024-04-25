package programme1;
//8. Display right angle triangle of @ using nested for loops

public class RightAngleTriangle {
        public static void main(String[] args) {
            int rows = 5;

            for (int i = 1; i <= rows; i++) {
                for (int a = 1; a <= i; a++) {
                    System.out.print("@");
                }
                System.out.println();
            }
        }
    }

