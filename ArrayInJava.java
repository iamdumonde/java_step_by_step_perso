public class ArrayInJava {
    
    public static void main(String[] args) {
        /***** Création de tableau rempli ***** */
        // Tableau de ints:
        int[] lottoNumbers = {12, 29, 4, 38, 3};
    
        // Tableau de Strings:
        String[] clothingItems = {"Huipil", "Beanie", "Kimono", "Sari"};
    
        /********* Accéder à un élément par son index *********** */
        //
        System.out.println(lottoNumbers[3]); // Prints: 38
        //
        System.out.println(clothingItems[2]); // Prints: Kimono

        /********** Changer la valeur d'un élément *******/
        //
        lottoNumbers[1] = 100;
        System.out.println(lottoNumbers[1]);
        //
        clothingItems[1] = "Bernice";
        System.out.println(clothingItems[1]);

        /*********** Création d'un tableau vide ***********/
        String[] menuItems =  new String[5];

        menuItems[0] = "Grilled Chicken Fatjita";
        menuItems[1] = "Fried Plantains";
        menuItems[2] = "Black Bean Taco";
        menuItems[3] = "Chili Nachos";
        menuItems[4] = "Chorizo Burrito";

        System.out.println(menuItems[3]);

        /**** Obtention de la longueur du tableau *****/
        System.out.println(menuItems.length);


        /*** Parcourir un tableau ****/
        // int[] lottoNumbers
        for(int i = 0; i < lottoNumbers.length; i++){
            //Output the current index value:
            System.out.println(lottoNumbers[i]);
        }


        /*** La boucle foreach ***/
        int[] newArray = new int[6];
        newArray[0] = 25;
        newArray[1] = 100;
        newArray[2] = 255;
        newArray[3] = 36;
        newArray[4] = 78;
        newArray[5] = 9;

        for(int arr: newArray){
            System.out.println(arr);
        }


    }


}
