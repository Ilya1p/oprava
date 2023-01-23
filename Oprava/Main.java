
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Zadejte pocet radku: ");
        int radek = sc.nextInt();
        System.out.println("Zadejte pocet sloupcu: ");
        int sloupec = sc.nextInt();
        int [][] matice = new int[radek][sloupec];
        System.out.println("Zadejte prvky: ");
        for(int i = 0; i<radek; i++){
            for(int j = 0; j< sloupec; j++){
                matice[i][j]=sc.nextInt();//cteni hodnot matice
            }
        }
        int[][] revMatice = reverseHorizontally(radek, sloupec,matice);//nacitani do novu matice revMatice reversni
    }
    public static int[][] reverseHorizontally(int r, int s, int[][] matice){
        int [][] matice2 = new int[r][s];
        //process zmeny matice
        for(int i = 0; i<r;i++){
            matice2[(r-1)-i]=matice[i];
            //matice[0]; 1 2 3 содержиться идем с конца первой и началом второй в данном цикле
        }
         // Vystup
        for(int i = 0; i<r;i++){
            for(int j = 0; j<s;j++){
                if(matice2[i][j]<=9){
                    System.out.print(" " + matice2[i][j]+" ");
                }else{
                    System.out.print(matice2[i][j]+" ");
                }
            }
            System.out.println(" ");
        }
        return matice2;
    }
}