package unit09.inheritance.learning35.computerpractice;

public class Computer {
    private String processor;
    private int storage;

    //constructor
    public Computer(String processor, int storage) {
        this.processor = processor;
        this.storage = storage;
    }

    //public void method to display information of the computer
    public void info(){
        System.out.println("The computer has: " + processor + " processor and: " + storage + " gb of storage");
    }


    //getters and setters
    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", storage=" + storage +
                '}';
    }
}
