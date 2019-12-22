package ro.siit;

/***
 * SaleRepresentative Class used to model information about a sales representative
 */
public class SaleRepresentative {
    private int quota;
    private int sales;
    private int totalRevenue;

    /***
     * Constructor
     * @param quota stores value of the quota for the sales representative
     * @param sales stores the number of sales for the sales representative
     */
    public SaleRepresentative(int quota, int sales)
    {
        this.quota = quota;
        this.sales=sales;
        totalRevenue= quota *sales;
    }

    /***
     * Getter for totalRevenue
     * @return  returns the total Revenue value
     */
    public int getTotalRevenue(){
        return totalRevenue;
    }

    /***
     *  toString override
     * @return  Returns a string with information about the object (number of sales, quota and total revenue).
     */
    public String toString(){
        return "Number of sales: " + sales + ", Quota: " + quota +", Total Revenue: " + totalRevenue;
    }
}
