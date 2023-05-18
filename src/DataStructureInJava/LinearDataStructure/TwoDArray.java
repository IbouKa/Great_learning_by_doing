package DataStructureInJava.LinearDataStructure;

public class TwoDArray {
    public static void main(String[] args) {
                // Declaration
                int[][] oneDarray = new int[5][3] ;
                // Initialisation
                int k=1;
                for(int i=0;i<oneDarray.length;i++){
                    for(int j=0;j<oneDarray[i].length;j++){
                    
                        oneDarray[i][j] = k++;
                    }
                }
                // Affichage
                for(int i=0;i<oneDarray.length;i++){
                    for(int j=0;j<oneDarray[i].length;j++){
                        System.out.print(oneDarray[i][j]+" ");
                    }
                    System.out.println(" ");
                }
    }
    
}
