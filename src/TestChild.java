/**
 * Created by volfovskaya on 11.04.17.
 */
public class TestChild extends TestParent implements InterfaceForChildren {
    @Override
    public void printInterface(){
        System.out.println("text from interface");
    }
    @Override
    public void printText(){
        System.out.println("I'am a child");
    }
    public void printMethodOfParent(){
        super.printText();
    }

    public void printTextOfChild(){
        System.out.println("text");
    }

    public static void main(String[] args) {
        TestParent parent = new TestParent();
        parent.printText();
        TestChild child = new TestChild();
        child.printText();
        child.printMethodOfParent();
        child.printInterface();
        TestParent childParent = new TestChild();
        childParent.printText();
    }
}
