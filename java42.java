package Java42;

import java.util.Arrays;
import java.util.Scanner;

public class java42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] dizi = new int[6];
        System.out.println("6 sayı girin: ");
        for(int i=0; i<6; i++){
            System.out.print(i+1 + ". sayı: ");
            int a = input.nextInt();
            dizi[i] = a;
        }
        Arrays.sort(dizi);
        int min = dizi[0], max = dizi[5];
        System.out.println("referans: ");
        int b = input.nextInt();

        for(int i = 0; i<dizi.length; i++){
                if(dizi[i] >= min && dizi[i] <= b) min = dizi[i];
                if(dizi[i] <= max && dizi[i] >= b) max = dizi[i];
        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);


        input.close();
    }
    
}
