import java.util.ArrayList;

public class BeeHive {
    private ArrayList<Bee> beeList;

    public BeeHive(int numBees) {
        this.beeList = new ArrayList<Bee>();
        for (int i = 0; i < numBees; i++) {
            this.beeList.add(new Bee("bee" + i));
        }
    }

    // First exercice
    public void printBees() {
        for (Bee bee : beeList) {
            System.out.println(bee.getName());
        }
    }

    // 2nd exercice
    public ArrayList<Bee> getBeeList() {
        return this.beeList;
    }

    public void leaveHome(String beeName) {
        for (Bee bee : beeList) {
            if (bee.getName().equals(beeName)) {
                bee.leaveHome();
            }
        }
    }

    // 3rd exercicie
    private void addBees(ArrayList<String> newBees) {
        for (String name : newBees) {
            this.beeList.add(new Bee(name));
          }
    }

    // Main Part
    public static void main(String[] args) {
        // BeeHive myHive = new BeeHive(365);
        // 1st
        // myHive.printBees();
        // 2nd
        // myHive.leaveHome("bee43");
        // Affiche le statut de l'abeille pour s'assurer qu'elle n'est plus à la maison
        // System.out.println(myHive.beeList.get(43).isHome());

        // 3rd
        BeeHive myHive = new BeeHive(3);
        ArrayList<String> newBees = new ArrayList<String>();
        newBees.add("bob");
        newBees.add("macey");
        newBees.add("anna");
    
        myHive.addBees(newBees);
       
        // Afficher les éléments dans la liste d'abeille pour s'assurer que les nouvelles abeille ont été ajoutées
        for (Bee b : myHive.beeList) {
          System.out.println(b.getName());
        }
    }

    
}
