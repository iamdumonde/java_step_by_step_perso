import java.util.Arrays;

public class GroceryList {
    public static double getTotalCost(double[] groceryPrices) {
        double totalCost = 0.0;
        for (int i = 0; i < groceryPrices.length; i++) {
            totalCost = groceryPrices[i] + totalCost;
        }
        return totalCost;
    }

    public static double getMostExpensiveItemCost(double[] groceryPrices) {
        // On peut initialement assigner le premier item à `maxCost` sans erreur parce
        // qu'on part du postulat qu'on a au moins un item dans le tableau
        double maxCost = groceryPrices[0];
        for (int i = 0; i < groceryPrices.length; i++) {
            // maxCost = groceryPrices[i];
            if (maxCost < groceryPrices[i]) {
                maxCost = groceryPrices[i];
            }
        }
        return maxCost;
    }

    public static double getMostLowerItemCost(double[] groceryPrices) {
        // On peut initialement assigner le premier item à `maxCost` sans erreur parce
        // qu'on part du postulat qu'on a au moins un item dans le tableau
        double maxCost = groceryPrices[0];
        for (int i = 0; i < groceryPrices.length; i++) {
            // maxCost = groceryPrices[i];
            if (maxCost > groceryPrices[i]) {
                maxCost = groceryPrices[i];
            }
        }
        return maxCost;
    }

    public static int getNumAllergicItems(String[] groceryList) {
        int numAllergicItems = 0;
        for (int i = 0; i < groceryList.length; i++) {
            if (groceryList[i].length() > 5) {
                numAllergicItems++;
            }
        }
        return numAllergicItems;
    }

    // 4. Article spécial
    public static boolean hasSpecialItem(double[] groceryPrices) {
        String someStr;
        for (int i = 0; i < groceryPrices.length; i++) {
            someStr = groceryPrices[i] + "";
            if (someStr.endsWith("99")) {
                return true;
            }
        }
        return false;
    }

    // 5. Eléments alphabétiques
    public static boolean isAlphabetized(String[] groceryList) {
        boolean val = false;
        String[] copyGroceryList = Arrays.copyOf(groceryList, groceryList.length);
        Arrays.sort(copyGroceryList);
        for(int i = 0; i < groceryList.length; i++){
            if(groceryList[i] == copyGroceryList[i]){
                val = true;
            } else {
                return false;
            }
        }
        return val;
    }

    //Défi supplémentaire
    public static String isAlphabetizedl(String[] groceryList) {
        String val = groceryList[0];
        String[] copyGroceryList = Arrays.copyOf(groceryList, groceryList.length);
        Arrays.sort(copyGroceryList);
        for(int i = 0; i < groceryList.length; i++){
            if(groceryList[i] == copyGroceryList[i]){
                continue;
            } 
            val = groceryList[i];
        }
        return val;
    }


    /******************************************************************************/
    public static void main(String[] args) {
        // Ci-dessous sont des échantillons de valeurs que vous pouvez utiliser pour
        // exécuter votre code.
        double[] groceryPrices = { 10.0, 12.3, 8.45, 2.43 };
        System.out.println(getTotalCost(groceryPrices));

        double[] unlikelyGroceryPrices = { 100.23, -100.23, 0.0, -78.54 };
        System.out.println(getTotalCost(unlikelyGroceryPrices));

        // // Ci-dessous est un échantillon que vous pouvez utiliser pour exécuter votre
        // // code
        // // Vous pouvez changer ces valeurs pour tester avec d'autres valeurs
        // double[] groceryPrices = { 10.0, 12.3, 8.45, 2.34 };
        System.out.println(getMostExpensiveItemCost(groceryPrices));
        //
        System.out.println(getMostLowerItemCost(groceryPrices));

        // // 3. Longues courses
        String[] groceryList = { "apple", "milk", "banana", "bananas", "chocolate" };

        System.out.println(getNumAllergicItems(groceryList));

        // 4 . Article spécial
        double[] groceryListe = { 10.0, 89.9, 8.09, 2.99 };
        System.out.println(hasSpecialItem(groceryListe));

        // // 5. Eléments alphabétiques
        String[] groceryListee = {"apples", "zanannn", "banana", "bananas", "chocolate"};
        System.out.println(isAlphabetized(groceryListee));

        // // Défi supplémentaire
        String[] groceryListeee = {"apples", "zanannn", "banana", "bananas", "chocolate"};
        System.out.println(isAlphabetizedl(groceryListeee));
    }
}
