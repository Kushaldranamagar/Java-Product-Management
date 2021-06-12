/*This is the main parent class MicrosoftProduct.
 * constructors are created and different parameters are passed with getter and setter method.
   This class has display method to print the details of the microsoftProduct.
    * @author (Kushal Magar)
   */

/*main class  MicroProduct is created*/
public class MicrosoftProduct
{   /*attributes of MicrosoftProduct*/                                           
    private int productNumber;
    private String productName;
    private String activationKey;
    private int price;
    
    /*constructors with two parameters*/
    public MicrosoftProduct(int productNumber, String productName){
        this.productNumber = productNumber;
        this.productName = productName;
        this.activationKey = "";
        this.price = 0;
    }
    /*getter and setter methods*/
    public int getProductNumber(){
        return productNumber; 
    }

    public void setProductNumber(int productNumber){
        this.productNumber = productNumber;
    }

    public String getProductName(){
        return productName; 
    }

    public void setProductName(){
        this.productName = productName;
    }

    public String getActivationKey(){
        return activationKey;
    }

    public void setActivationKey(String activationKey){
        this.activationKey = activationKey;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }
    /*display method to print the stored data*/
    public void display(){
       System.out.println("The name of this product is  " + this.productName + "." );
       System.out.println("The product number is  " + this.productNumber + ".");
       if(!this.activationKey.equals("")){
           System.out.println("The activation key is  " + this.activationKey + ".");
        }
        else{
            System.out.println("The activation key is missing");
        }
       if(this.price !=0){
           System.out.println("The total price of product is  " + this.price + ".");
        }
       else{
           System.out.println("The price of the product isnt set.");
        }

    }

    
    
}
