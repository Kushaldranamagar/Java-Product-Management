/*importing swing and awt packages
 * importing arraylist*
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/* class productGUI is created*/
public class ProductGUI
{   
    /*assigning the variables for JFrame,JLabel,JTextField,JButton etc*/
    private JFrame frame;
    private JLabel title, productNumber, productName, pricePerUser, clientCompanyName, noOfUser, licenseActivationDate, expiryDate, activationKey, totalPrice;
    private JTextField tfProductNumber,tfProductNumber1,tfProductNumber3, tfProductName, tfPricePerUser, tfPricePerUser1, tfClientCompanyName, tfNoOfUser, tfLicenseActivationDate, tfExpiryDate, tfActivationKey, tfTotalPrice; 
    private JButton btnAddProduct, btnActivateLicense, btnTerminateLicense, btnSetPricePerUser, btnDisplay, btnClear;

    /*creating new object for arrayList from Microsoft*/
    ArrayList<MicrosoftProduct> mpList = new ArrayList<>();
    public ProductGUI(){  //This is a contructor of class ProductGUI//
        ProductDetails(); //call ProductDetails Method method//
    }

    /*giving the layout and graphical forms and values*/
    private void ProductDetails(){
        frame = new JFrame("ProductGUI");
        frame.setSize(700,650);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        title = new JLabel("DETAILS OF THE PRODUCT");
        title.setBounds(250,10,200,40);
        frame.add(title); 

        /*for add Product*/   
        productNumber = new JLabel("Product Number");
        productNumber.setBounds(30,50,100,30);
        frame.add(productNumber);

        tfProductNumber = new JTextField();
        tfProductNumber.setBounds(130,57,150,20);
        frame.add(tfProductNumber);

        productName = new JLabel("Product Name");
        productName.setBounds(30,80,100,30);
        frame.add(productName);

        tfProductName = new JTextField();
        tfProductName.setBounds(130,87,150,20);
        frame.add(tfProductName);

        pricePerUser =  new JLabel("Price Per User");
        pricePerUser.setBounds(30,110,100,30);
        frame.add(pricePerUser);

        tfPricePerUser = new JTextField();
        tfPricePerUser.setBounds(130,117,150,20);
        frame.add(tfPricePerUser);

        btnAddProduct = new JButton("Add Product");
        btnAddProduct.setBounds(90,140,120,30);
        frame.add(btnAddProduct);
        btnAddProduct.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    addProduct();
                }             
            });
        /*for Activate License For Product*/
        productNumber = new JLabel("Product Number");
        productNumber.setBounds(350,50,100,30);
        frame.add(productNumber);

        tfProductNumber1 = new JTextField();
        tfProductNumber1.setBounds(490,57,150,20);
        frame.add(tfProductNumber1);

        clientCompanyName = new JLabel("Client Company Name");
        clientCompanyName.setBounds(350,80,150,30);
        frame.add(clientCompanyName);

        tfClientCompanyName = new JTextField();
        tfClientCompanyName.setBounds(490,87,150,20);
        frame.add(tfClientCompanyName);

        noOfUser = new JLabel("No Of User");
        noOfUser.setBounds(350,110,100,30);
        frame.add(noOfUser);

        tfNoOfUser = new JTextField();
        tfNoOfUser.setBounds(490,117,150,20);
        frame.add(tfNoOfUser);

        licenseActivationDate = new JLabel("license Activation Date");
        licenseActivationDate.setBounds(350,140,150,30);
        frame.add(licenseActivationDate);

        tfLicenseActivationDate = new JTextField();
        tfLicenseActivationDate.setBounds(490,147,150,20);
        frame.add(tfLicenseActivationDate);

        expiryDate = new JLabel("Expiry Date");
        expiryDate.setBounds(350,170,100,30);
        frame.add(expiryDate);

        tfExpiryDate = new JTextField();
        tfExpiryDate.setBounds(490,177,150,20);
        frame.add(tfExpiryDate);

        activationKey = new JLabel("Activation Key");
        activationKey.setBounds(350,200,100,30);
        frame.add(activationKey);

        tfActivationKey = new JTextField();
        tfActivationKey.setBounds(490,207,150,20);
        frame.add(tfActivationKey);

        totalPrice = new JLabel("Total Price");
        totalPrice.setBounds(350,240,290,30);
        frame.add(totalPrice);

        tfTotalPrice = new JTextField();
        tfTotalPrice.setBounds(490,237,150,20);
        tfTotalPrice.setEditable(false);
        frame.add(tfTotalPrice);

        btnActivateLicense = new JButton("Activate license for the Product");
        btnActivateLicense.setBounds(350,280,290,30);
        frame.add(btnActivateLicense);
        btnActivateLicense.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    activateLicense();
                }             
            });   

        /*Terminate License for the product*/    

        btnTerminateLicense = new JButton("Terminate License for the product");
        btnTerminateLicense.setBounds(350,370,290,30);
        frame.add(btnTerminateLicense);
        btnTerminateLicense.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    terminateLicense();
                }             
            });

        /*set product price per user*/
        productNumber = new JLabel("Product Number");
        productNumber.setBounds(30,330,100,30);
        frame.add(productNumber);

        tfProductNumber3 = new JTextField();
        tfProductNumber3.setBounds(130,337,150,20);
        frame.add(tfProductNumber3);

        pricePerUser =  new JLabel("Price Per User");
        pricePerUser.setBounds(30,360,100,30);
        frame.add(pricePerUser);

        tfPricePerUser1 = new JTextField();
        tfPricePerUser1.setBounds(130,367,150,20);
        frame.add(tfPricePerUser1);

        btnSetPricePerUser = new JButton("set product price per user");
        btnSetPricePerUser.setBounds(30,400,250,30);
        frame.add(btnSetPricePerUser);
        btnSetPricePerUser.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    setPricePerUser();
                }
            });

        /*for Display button*/  
        btnDisplay = new JButton("Display");
        btnDisplay.setBounds(150,500,100,30);
        frame.add(btnDisplay);
        btnDisplay.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    display();
                }             
            });

        /*for Clear button*/
        btnClear = new JButton("Clear");
        btnClear.setBounds(450,500,100,30);
        frame.add(btnClear);
        btnClear.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    clear();
                }             
            });

    } 
    /*making button addProduct operatinal with class casting and try catch method*/
    /*this button adds the inserted values to the arraylist*/
    /*checks the duplicate entry*/
    public void addProduct(){
        try{
            String sProductName= tfProductName.getText();
            int pNumber= Integer.parseInt(tfProductNumber.getText().trim());
            int pPerUser= Integer.parseInt(tfPricePerUser.getText().trim());
            if(pNumber <=0 || sProductName.trim().equals("") || pPerUser<=0){
                JOptionPane.showMessageDialog(frame,"Please fill all the forms","warning" ,0);
            }
            else{
                if(mpList.size() ==0){
                    mpList.add(new EnterpriseEdition(pNumber, sProductName, pPerUser));
                    JOptionPane.showMessageDialog(frame,"Product is successfully added.");
                    return;
                }
                boolean bool= true;
                for(MicrosoftProduct mp: mpList){
                    EnterpriseEdition ee = (EnterpriseEdition) mp;
                    if(ee.getProductNumber() == pNumber){
                        JOptionPane.showMessageDialog(frame,"Product is already added.","information",JOptionPane.ERROR_MESSAGE);
                        bool = false;
                        break;

                    }

                }
                if(bool){
                    mpList.add(new EnterpriseEdition(pNumber, sProductName, pPerUser));
                    JOptionPane.showMessageDialog(frame,"Product is successfully added.");
                }
                else{
                }
            }
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(frame,"Please check your input format and try again.","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }

    /*making button activateLicense operatinal with class casting and try catch method*/
    /*activates the product if valid product number is entered*/
    /*totalPrice is automatically set upon activating the product*/
    public void activateLicense(){
        try{
            String clientCompanyName = tfClientCompanyName.getText().trim();
            String licenseActivationDate = tfLicenseActivationDate.getText();
            String expiryDate = tfExpiryDate.getText();
            String activationKey = tfActivationKey.getText();
            int productNumber=Integer.parseInt(tfProductNumber1.getText().trim());
            int noOfUser=Integer.parseInt(tfNoOfUser.getText().trim());
            if(clientCompanyName.equals("")||licenseActivationDate.equals("")||expiryDate.equals("")||activationKey.equals("")||productNumber<=0 ||noOfUser<=0){
                JOptionPane.showMessageDialog(frame,"Please fill all the forms","warning" ,0);
            }
            else{
                boolean bool = true;
                for(MicrosoftProduct mp: mpList){
                    EnterpriseEdition ee = (EnterpriseEdition) mp;
                    if(ee.getProductNumber() == productNumber){
                        if(!ee.isActivated()){
                            ee.activatedLicense(clientCompanyName, noOfUser, licenseActivationDate, expiryDate, activationKey);
                            JOptionPane.showMessageDialog(frame,"Product is successfully activated.");
                            tfTotalPrice.setText(String.valueOf(+Integer.parseInt(tfPricePerUser.getText()) * + Integer.parseInt(tfNoOfUser.getText())));
                        }
                        else{
                            JOptionPane.showMessageDialog(frame,"Product is already activated.","information",JOptionPane.ERROR_MESSAGE);

                        }
                        bool = false;
                        break;
                    }
                }
                if(bool){
                    JOptionPane.showMessageDialog(frame,"Product is already activated.","information",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(frame,"Please check your input fields and try again.","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    /*terminates the license after comparing the entered product number to the existing product number in the list. If a valid value
      has been entered, it is used to terminate the appropriate Enterprise Edition product from the array list of MicrosoftProduct.
     *The method to terminate the license from the EnterpriseEdition class is called.
     */
    public void terminateLicense(){ 
        int productNumber1=0;
        String productNumber = JOptionPane.showInputDialog(frame,"Enter The Product Number","Terminate",3);
        try{
            if(productNumber.equals("")){                
                JOptionPane.showMessageDialog(frame,"Empty textfield found","Terminate",3);
                return;
            }
        }
        catch(NullPointerException npe){
            return;
        }

        try{
            productNumber1=Integer.parseInt(tfProductNumber.getText());            
        }
        catch(NullPointerException npe){
            return;
        }

        try{          

            if(productNumber.equals("")){
                JOptionPane.showMessageDialog(frame,"Please fill all the forms","warning" ,0);
            }
            else{
                boolean bool = true;
                for(MicrosoftProduct mp: mpList){
                    EnterpriseEdition ee = (EnterpriseEdition) mp;
                    if(ee.getProductNumber()==Integer.parseInt( productNumber )){
                        if(!ee.isTerminated()){
                            ee.terminateLicense();
                            JOptionPane.showMessageDialog(frame,"Product is successfully terminated.");
                            bool = false; 
                            break;
                        }
                        else{
                            JOptionPane.showMessageDialog(frame,"Product is already terminated.","information",JOptionPane.ERROR_MESSAGE);

                        }
                        bool = false;
                        break;
                    }

                }                
            }
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(frame,"please enter the valid number and try again.","ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }

    }

        /*sets new price of the product When the button is pressed, the input value of product number is compared to the existing product number,
        and if valid product number has been entered and not issued the license yet for this
        product.
        *calling the method to set price per user from the EnterpriseEdition class.*/
        
    public void setPricePerUser(){
        int productNumber = 0;
        int pricePerUser = 0;

        try {
            productNumber = Integer.parseInt(tfProductNumber3.getText());
            pricePerUser = Integer.parseInt(tfPricePerUser1.getText());
        }

        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(frame, "Please,check the textfield and try again","warning",0);
            return;
        }

        if(productNumber <=0 || pricePerUser <=0){
            JOptionPane.showMessageDialog(frame, "Input not valid", "error", 0);
        }
        else{
            boolean bool = true;
            for(MicrosoftProduct mp: mpList){
                EnterpriseEdition ee = (EnterpriseEdition) mp;
                if(ee.getProductNumber() == productNumber){
                    if(!ee.isActivated()){
                        ee.pricePerUser(pricePerUser);
                        JOptionPane.showMessageDialog(frame,"New ProductPricePerUser is successfully set.");
                        bool = false; 
                        break;
                    }
                    else{
                        JOptionPane.showMessageDialog(frame,"Product is not terminated.","ERROR",JOptionPane.ERROR_MESSAGE);

                    }
                    bool = false;
                    break;
                }

            }                
        }
    }
    
    /*displays all the details of the product*/
    public void display(){
        int productNumber1=0;
        String productNumber = JOptionPane.showInputDialog(frame,"Enter The Product Number","Display",3);
        try{
            if(productNumber.equals("")){                
                JOptionPane.showMessageDialog(frame,"Empty textfield found","Display",3);
                return;
            }
        }
        catch(NullPointerException npe){
            return;
        }

        try{
            productNumber1=Integer.parseInt(tfProductNumber.getText());            
        }
        catch(NullPointerException npe){
            return;
        }

        try{          

            if(productNumber.equals("")){
                JOptionPane.showMessageDialog(frame,"Please fill all the forms","Error" ,0);
            }
            else{

                for(MicrosoftProduct mp: mpList){
                    EnterpriseEdition ee = (EnterpriseEdition) mp;
                    if(ee.getProductNumber()==Integer.parseInt( productNumber )){

                        ee.display();

                        break;
                    }
                    else{
                        JOptionPane.showMessageDialog(frame,"Product is not availabe","ERROR",JOptionPane.ERROR_MESSAGE);
                        return;

                    }

                }

            }
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(frame,"please enter the valid number and try again.","ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }

    }
    /*clears all the values from the textfields*/
    public void clear(){
        tfProductNumber.setText(null);
        tfProductNumber1.setText(null);        
        tfProductNumber3.setText(null);
        tfProductName.setText(null);
        tfPricePerUser.setText(null);
        tfPricePerUser1.setText(null);
        tfClientCompanyName.setText(null);
        tfNoOfUser.setText(null);
        tfLicenseActivationDate.setText(null);
        tfExpiryDate.setText(null);
        tfActivationKey.setText(null);
        tfTotalPrice.setText(null);
    }
    /*this is the main method*/
    public static void main(String[]args){
        new ProductGUI().frame.setVisible(true); 
    } 
} 
