package ro.siit;

/***
 * Main class  used for the main function of the homework
 */
public class Main {

    /***
     * Main function
     * @param args  not used, only there for the function signature
     */
    public static void main(String[] args) {

        SaleRepresentative[] salesPersons = new SaleRepresentative[20];
        for(int i=0;i<20;i++)
            salesPersons[i]= new SaleRepresentative((int)(1+Math.random()*600),(int)(1+Math.random()*20));

        System.out.println("This is the initial state:");
        System.out.println();
        for(int i=0;i<20;i++)
            System.out.println(i+1 + ": "+salesPersons[i]);

        Sorter sorter = new Sorter();
        salesPersons= sorter.bubbleSort(salesPersons);


        System.out.println();
        System.out.println();


        System.out.println("This is the order after bubblesort algorithm applied:");
        System.out.println();
        for(int i=0;i<20;i++)
            System.out.println(i+1 + ": "+salesPersons[i]);

    }
}