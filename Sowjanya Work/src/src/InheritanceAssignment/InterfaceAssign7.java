package InheritanceAssignment;

import ImplementedPrograms.Inter7;
import InterfacesAssignment.Interface7;

public class InterfaceAssign7 extends Inter7 {
    public Interface7 getInnerClass() {
        Face7 faceObj =  new Face7();
        return faceObj;
    }

    public static void main(String[] args) {
        InterfaceAssign7 clsObj = new InterfaceAssign7();
        Interface7 intObj = clsObj.getInnerClass();
        intObj.text();
        intObj.show();
    }
}
