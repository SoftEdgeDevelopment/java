package unit02.objects.day07;

public class Phone {


        private String type;
        private String model;
        private String color;
        private double price;

        public Phone(String theType, String theModel, String theColor, double thePrice) {
            type = theType;
            model = theModel;
            color = theColor;
            price = thePrice;
            System.out.println(type);
            System.out.println(model);
            System.out.println(color);
            System.out.println(price);
        }

}
