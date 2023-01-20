import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        float[] numbers1 = {1.57f, 7.654f, 9.986f};

        short[] numbers2 = {1995, 1424, 7854};
        System.out.println();


    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.print(numbers[i] + ",");
        }

        float[] numbers1 = {1.57f, 7.654f, 9.986f};
        for (int i = 0; i < numbers1.length; i++) {
            System.out.print(numbers1[i] + ", " );
        }


        short[] numbers2 = {1995, 1424, 7854};
        for (int i = 0; i < numbers2.length; i++) {
            System.out.print(numbers2[i] + ", ");
        }

    }



    public static void task3() {
        System.out.println("Задача 3");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 2; i >=0; i--) {
            System.out.print(numbers[i] + ",");
        }

        float[] numbers1 = {1.57f, 7.654f, 9.986f};
        for (int i = 2; i > 0; i--) {
            System.out.print(numbers1[i] + ", " );
        }


        short[] numbers2 = {1995, 1424, 7854};
        for (int i = 2; i >= 0; i--) {
            System.out.print(numbers2[i] + ", ");
        }
    }



    public static void task4() {
        System.out.println("Задача 4");

        int [] numbers = {1, 2, 3};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] +=1;
            }


        }
        System.out.println(Arrays.toString(numbers));
    }




}