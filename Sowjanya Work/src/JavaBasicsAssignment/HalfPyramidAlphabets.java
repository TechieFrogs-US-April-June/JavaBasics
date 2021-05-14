package JavaBasicsAssignment;

import java.util.Scanner;

public class HalfPyramidAlphabets {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of rows you want to print: ");
            int rows = sc.nextInt();

            for (char ch = 'A'; ch <= 'E'; ch++) {
                for (char sh = 'A'; sh <= ch; sh++) {
                    System.out.print(ch + " ");
                }

                System.out.println();
            }

        }
    }

