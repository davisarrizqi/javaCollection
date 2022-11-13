import java.util.Scanner;

public class menentukanBilanganGanjil {
    public static void main(String[] main){
        // same as before, say hello first
        System.out.println("PROGRAM MENAMPILKAN BILANGAN GANJIL");

        // make a blank space
        System.out.println("");

        // declare it first
        int count, floorLimit, skyLimit; count = 1;
        Scanner input = new Scanner(System.in);

        // input the floorLimit
        System.out.print("Batas minimum bilangan: ");
        floorLimit = input.nextInt();

        // input the skyLimit
        System.out.print("Batas maksimum bilangan: ");
        skyLimit = input.nextInt();

        // make a blank space
        System.out.println("");

        // make sure their number is an odd
        if(floorLimit %2 == 0) {floorLimit += 1;}
        if(skyLimit %2 == 0) {skyLimit -= 1;}

        // do a loop as much as needed
        for(int loopCount=floorLimit;loopCount<=skyLimit;loopCount+=2){
            System.out.println("Bilangan ke-" + count + " : " + loopCount);
            count += 1;
        }

        // don't forget to close
        input.close();
    }
}
