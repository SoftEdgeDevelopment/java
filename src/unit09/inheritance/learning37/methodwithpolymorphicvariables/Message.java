package unit09.inheritance.learning37.methodwithpolymorphicvariables;



//creating methods with subclass as parameters and calling to main with newly created objects
class Main {
    public static void main(String[] args) {
        //create new Message object
        Message message1 = new Message();
        //call to the sendMessage method with the Object
        sendMessage(message1);

        //call to the method with newly created objects if you will not use the object again
        sendMessage(new VideoMessage());
        sendMessage(new JSONMessage());
    }

    //new method for sendMessage using Message object as parameter
    public static void sendMessage(Message message) {
        //method to display which type of message is being sent
        System.out.println("Sent a " + message.getClass().getSimpleName());
    }
}


public class Message {
}

class TextMessage extends Message {

}

class VideoMessage extends Message {

}

class JSONMessage extends Message {

}