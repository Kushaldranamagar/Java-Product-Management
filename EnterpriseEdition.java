
/*
 * subclass EnterpriseEdition of main class MicrosoftProduct.
 * inherits the properties and behaviour from the parent class MicrosoftProduct.
 * @author (Kushal Magar)
 */

/*
inherits the feature and properties from MicrosoftProduct by "extends" .
 */
public class EnterpriseEdition extends MicrosoftProduct{

    /*attributes of EnterpriseEdition,can't be directly accessed by other classes.*/
    private String clientCompanyName;                    
    private int pricePerUser;
    private int numberOfUser;
    private String activationDate;
    private String licenseExpireDate;
    private boolean isActivated;
    private boolean isExpired;
    private boolean isTerminated;

    /*This is the constructor having three parameters (productNumber, productName and pricePerUser)
     * passes the value received in parameter to main class.
     * also assigns the value.*/

    public EnterpriseEdition(int productNumber, String productName, int pricePerUser){
        super(productNumber, productName);
        this.pricePerUser = pricePerUser;
        this.clientCompanyName = "";
        this.numberOfUser = 0;
        this.activationDate = "";
        this.licenseExpireDate = "";
        this.isActivated = false;
        this.isExpired = false;
        this.isTerminated = false;
    }    

    /*
     * get method of private String variable name getClientCompanyName.
     * returns the value of companyName upon being called.*/
    public String getClientCompanyName(){
        return clientCompanyName;
    }
    
    /*
     * set method of private String variable name clientCompanyName.
     * sets the value of companyName upon being passed using set method in other classes or subclasses.
     */
    public void setClientCompanyName(String clientCompanyName){
         this.clientCompanyName = clientCompanyName;
    }
     
    /*
     * get method of private integer variable pricePerUser.
     * returns the value of pricePerUser upon being called.     
     */
    public int getPricePerUser(){
         return pricePerUser;
    }
    
    /*
     * a set method of private int variable pricePerUser.
     * sets the value of pricePerUser upon being passed using set method.    
     */
    public void setPricePerUser(int pricePerUser) {
        this.pricePerUser = pricePerUser;
    }
    
    /*
     * get method of private integer variable getNumberOfUser.
     * returns the value of numberOfUser upon being called.     
     */
    public int getNumberOfUser(){
        return numberOfUser;
    }
    
    /*
     * a set method of private int variable numberOfUser.
     * sets the value of numberOfUser upon being passed using set method.    
     */
    public void setNumberOfUser(int numberOfUser){
        this.numberOfUser = numberOfUser;
    }
    
    /*
     * get method of private String variable getActivationDate.
     * returns the value of activationDate upon being called.     
     */
    public String getActivationDate(){
        return activationDate;
    }
    
    /*
     * a set method of private String variable activationDate.
     * sets the value of activationDate upon being passed using set method.    
     */
    public void setActivationDate(String activationDate){
        this.activationDate = activationDate;
    }

    public String getLicenseExpireDate(){
        return licenseExpireDate;
    }

    public void setLicenseExpireDate(String licenseExpireDate){
        this.licenseExpireDate = licenseExpireDate;
    }

    public boolean isActivated(){
        return isActivated;
    }

    public void setActivated(boolean activated){
        isActivated = activated;
    }

    public boolean isExpired(){
        return isExpired;
    }

    public void setExpired(boolean expired){
        isExpired = expired;
    }

    public boolean isTerminated(){
        return isTerminated;
    }
    /*inserting or changing the price per user when license is not activated*/
    public void pricePerUser(int pricePerUser){
        if(!isActivated){
            this.pricePerUser = pricePerUser;
            System.out.println("Price per user of the product has been succsssfully changed.");
        }
        else{
            System.out.println("Product licnese is already granted therefore it canNnot be changed.");
        }
    }
    /*method to activate the license which is not activated yet*/
    public void activatedLicense(String clientCompanyName, int numberOfUser, String activationDate, String licenseExpireDate, String activationKey){
        if(!isActivated){
            this.clientCompanyName = clientCompanyName;
            this.numberOfUser = numberOfUser;
            this.activationDate = activationDate;
            this.licenseExpireDate = licenseExpireDate;
            isActivated = true;
            isExpired = false;
            isTerminated = false;
            super.setActivationKey(activationKey);
            super.setPrice(this.numberOfUser * this.pricePerUser);            
        }
        else{
            System.out.println("Product has already been activated by  " + this.clientCompanyName + "  having" + this.numberOfUser + "   users.");
        }
    }
    /*terminate the activated license*/
    public void terminateLicense(){   
        if(isTerminated){
            System.out.println("Product is terminated already");
        }
        else{
            clientCompanyName = "";
            activationDate = "";
            licenseExpireDate = "";
            numberOfUser = 0;
            isActivated = false;
            isExpired = true;
            isTerminated = true;
            System.out.println("Product termination is successful.");

        }
    }
    /*displays the details of the MicrosoftProduct*/
    public void display(){
        super.display();
        if(isActivated()){
            System.out.println();
            System.out.println("The details of this product are:  ");
            System.out.println("The number of users using this product are  " + numberOfUser + ".");
            System.out.println("The activation date is  " + activationDate + ".");
            System.out.println("The expiration date is  " + licenseExpireDate + ".");
            System.out.println("The product is activated.");
        }
        else{
            System.out.println("This product is not activated.");
        }
    }
}