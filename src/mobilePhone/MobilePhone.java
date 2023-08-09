package mobilePhone;

public class MobilePhone {
	// Please create 4 instance variables for our MobilePhone class:
	// 1.Brand
	// 2.Model
	// 3.Phone Number
	// 4.Storage Capacity
	// Think about what data types would work best with these fields :)

    public String Brand;
    public String Model;
    public int PhoneNumber;
    public int StorageCapacity;



	// Let's create a public constructor for our MobilePhone class
	// Given 4 pieces of information as input (brand, model, operatingSystem, and
	// storageCapacity),
	// Set the instance variables of your object accordingly

    public MobilePhone (String brand, String model, String operatingSystem, int storageCapacity)
    {
        this.Brand= brand;
        this.Model = model;
        this.Storage =storageCapacity;
        this.OS= operatingSystem;

    }

	
	
	// Create getter and setter methods for each of our instance variables
	// Please at least write 1 set of getter/setter by hand. After you get the
	// hang of it, you can go to 'source'->'generate getters and setters'->checkmark
	// all of the fields you want

    public String getModel() {
        return Model;
    }

    public int getStorageCapacity() {
        return StorageCapacity;
    }

    public void setStorageCapacity(int storage) {
        StorageCapacity = storage;
    }

    public int getPhoneNumber() {
        return Phone;
    }

    public void setPhoneNumber(int phone) {
        Phone = phone;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }
    // getters and setters for->'generate'

    public String getBrand ()
    {
        return Brand;
    }

    public void setModel(String model) {
        Model = model;
    }

    // Lets make a couple custom phone-related methods:

	// 1. A makeCall method that takes a phone number as a parameter and then
	// prints:
	// ''We are calling {the input phone number} from our {brand} {model} phone!'

    public void makeCall (int inputPhone) {
        System.out.printf("We are calling %s from our %s %s phone!", inputPhone, Brand, Model);
    }


	
	// 2. An installApp method that takes an app name String as input and then
	// prints:
	// 'Installing {input app name} on our {brand} {model} phone!'
    public void installApp ( String appName) {
        System.out.printf("Installing %s on our %s %s phone !", appName, Brand, Model);
    }


	
	// 3. Lastly, a displayInfo method that takes no parameters and prints all
	// information about
	// the phone:
	// Brand: {brand}
	// Model: {model}
	// Phone Number: {phone number}
	// Storage Capacity: {storage capacity}GB
    public void displayInfo() {
        System.out.printf("Brand: %s",Brand);
        System.out.printf("Model: %s", Model);
        System.out.printf("Phone Number: %d", PhoneNumber);
        System.out.printf("Storage Capacity: %d GB", Storage );


    }
