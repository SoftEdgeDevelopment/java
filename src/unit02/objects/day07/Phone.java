package unit02.objects.day07;

//new public class for Phone
public class Phone {

//new private String variable for type of phone
        private String type;
    //new private String variable for model of phone
        private String model;
    //new private String variable for color of phone
        private String color;
    //new private double variable for price of phone
        private double price;

        //generate constructor with new variables to assign privates values
        public Phone(String theType, String theModel, String theColor, double thePrice) {
            //assign new values from main method
            type = theType;
            model = theModel;
            color = theColor;
            price = thePrice;
            //display all the information and values entered from main method
            System.out.println("the phone is " + type);
            System.out.println("the model is " + model);
            System.out.println("the color is " + color);
            System.out.println("the price is " + price);
        }
}
