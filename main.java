package ru.geekbrains.j3.ht8;
//буду честен - подгуглил...сам бы до такого решения не дошел...
public class main {
    public static void main(String[] args)
    {
        int n = 5;
        int[][] matrix = new int[n][n];

        int rows = 0;
        int columns = 0;
        int x = 1;
        int y = 0;
        int dirChanges = 0;
        int visits = n;

        for (int i = 0; i < n * n; i++) {
            matrix[rows][columns] = i + 1;
            if (--visits == 0) {
                visits = n * (dirChanges % 2) +
                        n * ((dirChanges + 1) % 2) -
                        (dirChanges / 2 - 1) - 2;
                int temp = x;
                x = -y;
                y = temp;
                dirChanges++;
            }
            columns += x;
            rows+= y;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(matrix[i][j] + "\t");
            System.out.println();
        }
    }
}
