package mobilePhone;

public class Main {
    public static void main(String[] args) {
    	
        // Instantiate a brand new MobilePhone object and pass it the 4 parameters for your phone (Brand, Model, Phone Number, and Storage Capacity)//
        MobilePhone newPhonewhothis = new MobilePhone("Samsung", "Galaxy s23 ", 5553218020, 64);
        
        // Call the makeCall() method using your phone object - remember to pass it a phone number as input!
        newPhonewhothis.makeCall(2813308004);

        
        // Call the installApp() method using your phone object - remember to pass it an app name as input!
        newPhonewhothis.InstallApp("NordVPN");

        
        // Display your phones information using the displayInfo() method!
        newPhonewhothis.displayInfo();

    }
}
