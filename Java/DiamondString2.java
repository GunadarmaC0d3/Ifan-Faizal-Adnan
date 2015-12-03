package diamond;
import java.util.*;

public class DiamondString2 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[]args){
        String kalimat = "";
        String kalimatbaru = "";
        System.out.print("Masukkan kalimat: ");
        kalimat = input.nextLine();        
        
        if (kalimat.length()%2==0){   
            kalimat += " ";
            for (int i=0;i<kalimat.length();i++){ 
                if (i==kalimat.length()-1){           
                    kalimatbaru += kalimat.substring(i, i+1);
                }else{
                    kalimatbaru += kalimat.substring(i, i+1)+" ";  
                }
            }  

            int penambah = kalimatbaru.length()/2;
            int penambah1 = 1;
           
            for (int i=0,k=0,l=0;i<=kalimat.length()/2;i++,l+=2){
                for (int j=kalimatbaru.length()/2;j>l;j--){
                    System.out.print(" ");
                }
                if (k<kalimatbaru.length()/2){
                    System.out.print(kalimatbaru.substring(k+penambah, k+penambah+penambah1));
                    penambah -= 3;
                    penambah1 += 4;             
                    k++;
                }else if(k==kalimatbaru.length()/2){
                    System.out.print(kalimatbaru.substring(k+penambah, k+penambah+penambah1));
                }
                System.out.println();            
            }
            
            int pengurang = kalimatbaru.length()/2-2;
            int pengurang1 = kalimatbaru.length()-4;
            for (int i=1,k=kalimatbaru.length()/2,l=2;i<=kalimat.length()/2;i++,l+=2){
                for (int j=0;j<l;j++){
                    System.out.print(" ");
                }
                if (k>0){                
                    System.out.print(kalimatbaru.substring(k-pengurang, k-pengurang+pengurang1));
                    pengurang -= 4;
                    pengurang1 -= 4;
                    k-=2;
                }
                System.out.println();                    
            }
        }else{
            for (int i=0;i<kalimat.length();i++){ 
                if (i==kalimat.length()-1){           
                    kalimatbaru += kalimat.substring(i, i+1);
                }else{
                    kalimatbaru += kalimat.substring(i, i+1)+" ";  
                }
            }  

            int penambah = kalimatbaru.length()/2;
            int penambah1 = 1;
           
            for (int i=0,k=0,l=0;i<=kalimat.length()/2;i++,l+=2){
                for (int j=kalimatbaru.length()/2;j>l;j--){
                    System.out.print(" ");
                }
                if (k<kalimatbaru.length()/2){
                    System.out.print(kalimatbaru.substring(k+penambah, k+penambah+penambah1));
                    penambah -= 3;
                    penambah1 += 4;             
                    k++;
                }else if(k==kalimatbaru.length()/2){
                    System.out.print(kalimatbaru.substring(k+penambah, k+penambah+penambah1));
                }
                System.out.println();            
            }
            
            int pengurang = kalimatbaru.length()/2-2;
            int pengurang1 = kalimatbaru.length()-4;
            for (int i=1,k=kalimatbaru.length()/2,l=2;i<=kalimat.length()/2;i++,l+=2){
                for (int j=0;j<l;j++){
                    System.out.print(" ");
                }
                if (k>0){                
                    System.out.print(kalimatbaru.substring(k-pengurang, k-pengurang+pengurang1));
                    pengurang -= 4;
                    pengurang1 -= 4;
                    k-=2;
                }
                System.out.println();                    
            }
        }
    }
}
