import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] arg){
        int nbrCages;
        String zooName;
        Scanner sc = new Scanner(System.in);

        System.out.println("Donnez le nom de zoo : ");
        zooName = sc.nextLine();
        if(zooName.isEmpty()){
            System.out.println("Le nom du zoo ne peut pas etre vide");
        }

        System.out.println("Donnez le nombre de cages : ");
        nbrCages = sc.nextInt();
        if(nbrCages <=0){
            System.out.println("Le nombre de cages doit etre supérieur à 0");
        }

    }
}
