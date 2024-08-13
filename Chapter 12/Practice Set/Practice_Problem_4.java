package Practice_Problem_4;

import Folder.FolderL1.FolderL2.Practice_Problem_3;

public class Practice_Problem_4 extends Practice_Problem_3 {
    public void Display() {
        System.out.println(ProtectedVarriable);
        System.out.println("Protected Varriable is Accessed");
        System.out.println(
                "DefaultVarriable is not accessible in this subclass as it is outside of that package where that Default Property Is Stated.");
        // System.out.println(DefaultVarriable); --> This will give an error because
        // DefaultVarriable is not accessible in this subclass as it is outside of that
        // package where that Default Property Is Stated.
    }

    public static void main(String[] args) {
        Practice_Problem_4 MyObject = new Practice_Problem_4();
        MyObject.Display();
    }
}