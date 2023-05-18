package DataStructureInJava.LinearDataStructure;

import java.util.Arrays;

public class SortOneDArray {
    public static void main(String[] args) {
                // Declaration et  Initialisation
                int[] oneDarray = {1,4,3,8,7,4,6,9,3} ; 
                // Affichage
                for(int i=0;i<oneDarray.length;i++){
                    System.out.print(oneDarray[i]+" ");
                }
                // Affichage
                System.out.println("");
                Arrays.sort(oneDarray);
                for(int i=0;i<oneDarray.length;i++){
                    System.out.print(oneDarray[i]+" ");
                }
    }
}
