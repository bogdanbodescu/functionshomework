package ro.siit;

/***
 * Class used for the sort method.
 */
public class Sorter {

    /***
     * Method used for applying bubblesort in a descending order on a list of SaleRepresentative
     * @param saleRep the list of sale representative that will be sorted
     * @return  a sorted list of sale representative
     */
    public SaleRepresentative[] bubbleSort(SaleRepresentative[] saleRep){
        SaleRepresentative temp = new SaleRepresentative(0,0);
        int flag=0;

        for(int i= 0; i<saleRep.length;i++)
        {
            flag=0;
            for(int j=0;j<saleRep.length-i-1;j++)
                if(saleRep[j].getTotalRevenue()<saleRep[j+1].getTotalRevenue())
                {
                    flag=1;
                    temp=saleRep[j];
                    saleRep[j]=saleRep[j+1];
                    saleRep[j+1]=temp;
                }
            if(flag==0)
                break;
        }

        return saleRep;
    }
}
