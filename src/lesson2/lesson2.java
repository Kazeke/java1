package lesson2;

public class lesson2 {
    public static void main(String[] args) {
//        char grade = 'D';
//
//        switch (grade) {
//            case 'A':
//                System.out.println("A");
//                break;
//            case 'B':
//                System.out.println("B");
//                break;
//            case 'D':
//                System.out.println("D");
//                break;
//            default:
//                System.out.println("Неизвестно");

//        for (int i = 0, j = 10; i < 10; i++, j--) {
//            System.out.println(i + " " + j);
        //    }

//        for (int i = 0; i < 10; i++) {
//
//            if (i == (i / 2) * 2) {
//                System.out.println(i);
//            }
//
//        }
//        for (int i = 0; i < 10; i++) {
//
//            if (i == 5) {
//                continue;
//            }
//            System.out.println(i);
//
//        }
//        for (int i = 0; i < 10; i++) {
//
//            if (i == 5) {
//                break;
//            }
//            System.out.println(i);
//
//        }
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//
//                System.out.println(i + " " + j);
//
//            }
//        }
//        outer:
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                if (i == 3) {
//
//                    continue outer;
//                }
//
//                System.out.println(i + " " + j);
//            }
//        }
//        outer:
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                if (i == 3) {
//
//                    break outer;
//                }
//
//                System.out.println(i + " " + j);
//            }
//        }


//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                if (i == j) {
//                    System.out.print(1);
//                } else {
//                    System.out.print(0);
//                }
//
//            }
//            System.out.println();
//        }


//        int[] mass = new int[5];
//
//        mass[0]=1;
//        mass[1]=2;
//        mass[2]=3;
//        mass[3]=4;
//        mass[4]=5;
//
//        System.out.println(Arrays.toString(mass));


//        int[] mass = {1, 2, 3, 4, 5};
//
//        System.out.println("Длинна массива " + mass.length);
//        for (int i = 0; i < mass.length; i++)
//
//            System.out.println(mass[i]);


//        String[] nameList = {"Artem", "Azat", "Sofia", "Marat"};
//        for (int i = 0; i < nameList.length; i++) {
//            System.out.println(nameList[i]);
//        }


//        int[] nameList = new int[10];
//        System.out.println(Arrays.toString(nameList));

//        int a = 1;
//
//        while (a ==0) {
//            System.out.println(" Бесконечность и далее!");
//            a++;
//        }


//        int a = 1;
//        do {
//            System.out.println(" Бесконечность и далее!");
//        } while (a == 0);
        int count = 1;
        int[][] mass = new int[3][5];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++){
                mass[i][j] = count;
                System.out.print(mass[i][j] + "\t");
                count++;
            }
            System.out.println();
        }

    }
}



