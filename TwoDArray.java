public class TwoDArray {

    public static void main(String[] args) {
        /**** Création d'un tableau 2D *****/
        // 2D int array
        int[][] nums = { { 10, 9, 8 }, { 7, 6, 5 }, { 4, 3, 2 } };
        // 2D String array
        String[][] name = { { "Oswald", "Nicole", "Faris" }, { "Possi", "Emile", "Axel" }, { "Moi", "Lio", "Toi" } };

        /***** Accéder à un élément dans un tableau 2D ******/
        // 2D int array
        System.out.println(nums[1][1]); // Prints 6
        // 2D String array
        System.out.println(name[2][0]); // Prints "Moi"

        /**** Mise à jour d'un élément de tableau 2D *****/
        // int array
        nums[0][0] = 23;
        System.out.println(nums[0][0]); // Prints 23

        /***** Création d'un tableau 2D vide ****/
        int[][] numsEmpty = new int[2][3];
        numsEmpty[0][0] = 1;
        numsEmpty[0][1] = 2;
        numsEmpty[0][2] = 4;
        numsEmpty[1][0] = 1;
        numsEmpty[1][1] = 3;
        numsEmpty[1][2] = 6;

        /***** Traversée d'un tableau 2D/ Ordre majeur des lignes *****/
        char[][] letters = { { 'A', 'a' }, { 'B', 'b' }, { 'C', 'c' } };
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters[0].length; j++) {
                System.out.print(letters[i][j]);
            }
        }

        // char[][] letters = { { 'A', 'a' }, { 'B', 'b' }, { 'C', 'c' } };
        // for (int i = 0; i < letters.length; i++) {
        // for (int j = 0; i < letters[0].length; j++) {
        // System.out.print(letters[i][j]); // Prints AaBbCc
        // }
        // }
    }

}
