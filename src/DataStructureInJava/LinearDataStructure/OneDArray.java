package DataStructureInJava.LinearDataStructure;

public class OneDArray {
    public static void main(String[] args) {
        // Declaration
        int[] oneDarray = new int[5] ;
        // Initialisation
        for(int i=0;i<oneDarray.length;i++){
            oneDarray[i] +=i;
        }
        // Affichage
        for(int i=0;i<oneDarray.length;i++){
            System.out.print(oneDarray[i]+" ");
        }
    }
}
