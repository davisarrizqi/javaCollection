import java.util.Scanner;

class TentukanBilangan{
    public static void main(String[] args){
        // say hello and make a title
        System.out.println("MENJUMLAHKAN BILANGAN BULAT POSITIF KURANG DARI 100");

        // declare it first
        int totalNumber, myNumber, count;

        // made it up
        System.out.print("Banyaknya data : ");
        Scanner input = new Scanner(System.in);
        count = input.nextInt(); totalNumber = 0;

        // make a blank space
        System.out.println("");

        // made up our loop
        for (int counter=1;counter<=count;counter++){
            System.out.print("Data ke-" + counter + " : ");
            myNumber = input.nextInt(); 
            
            // make a logic for number that less than 100 selection
            if(myNumber >= 100 || myNumber < 0){
                System.out.println("Harap untuk memasukkan bilangan antara 0-99");
            } 
            
            else {
                System.out.println("Valid!, Bilangan masuk ke jangkauan aturan");
                totalNumber += myNumber;
            }
            
            // make a blank space
            System.out.println("");
        }

        // show our totalNumber
        System.out.println("Jumlah: " + totalNumber);

        // don't forget to close our input method
        input.close();
    }
}
