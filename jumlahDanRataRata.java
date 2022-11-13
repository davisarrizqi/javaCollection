import java.util.Scanner;

class MyClass{
    public static void main(String[] aStrings){
        // say hello and make a title
        System.out.println("MENJUMLAHKAN BILANGAN DAN MENCARI RATA RATA");
        
        // declare it first
        int count; float rataRata, myNumber, totalNumber;
        totalNumber = 0; count = 0;

        // we must be chosen how much we want
        System.out.print("Banyaknya data : ");
        Scanner input = new Scanner(System.in);
        count = input.nextInt();
        System.out.println("  ");

        // do a loop so that we input it into our's
        for (int goingOn=1;goingOn<=count;goingOn++){
            System.out.print("Data ke-" + goingOn + " : ");
            myNumber = input.nextFloat();
            totalNumber += myNumber;
        } rataRata = totalNumber/count;

        // make a new row so that we got a blank space
        System.out.println(" ");

        // show the total of our number
        System.out.println("Jumlah : " + totalNumber);

        // show the average
        System.out.println("Rata rata: " + rataRata);

        // close our input
        input.close();
    }
}
