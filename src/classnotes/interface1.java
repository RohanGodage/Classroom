package classnotes;

import java.net.InterfaceAddress;

public class interface1 {
    class I1 {
        //17th SEPTEMBER 2022//
        public static void main(String[] args) {

            // Interface : IT IS FULLY UNIMPLEMENTED CLASS WHICH IS USED TO ACHIEVE MULTIPLE INHERITANCE AND 100% ABSTRACTION.
            //WHEN TO USE : when we are not sure about which implementation is required.
            //To support multiple inheritances through interface in java we do not allow  instance variables,instance methods and instances blocks and constructor as part of interface.
            //abstract class cant support multiple inheritance but interfaces can do so
            //How interfaces are used and why ?
            // -->
            //In order to avoid ambiguity ,as the child class gets confused between which parent class's method to call specifically when it is instance type.
            //By default variables in interface are public static final
            //By default methods in interface are public and abstract.
            //As part of java 7 ,interface can have only abstract methods.
            //As part of JAVA 8 interface can have : abstract methods,static methods and default methods.[DAS]
            //D:DEFAULT
            //A:ABSTRACT
            //S:STATIC

            //MARKER INTERFACE : It is an empty interface.
            //:It means it does not have anything.
            //Examples : Serializable,autoclosable,clonable
            // interface I{}

            //: FUNCTIONAL INTERFACE :
            //Interface which contains single abstract method.
            //interface I1{
            //void m1();

            //@FUNCTIONAL INTERFACE
            //INTRODUCED IN JAVA 8 : A INTERFACE WHICH WILL HAVE SINGLE ABSTRACT METHOD...ANY NUMBER OF DEFAULT OR STATIC METHODS.
            //
        }

    }
}
//INTERFACES ARE NOTHING BUT TYPE OF CLASSES USED TO ACHIEVE DELIMITED CAPABILITIES OF ABSTRACT CLASS.
//1)MULTIPLE INHERITANCE
//2)100% ABSTRACTION
//SYNTAX:
/*Java 7 only abstract classes
 * Java 8 :can have abstract nethod single but also static and default methods.
 * ABSTRACT VS INTERFACE
 * 1)abstract classes contains abstract and concrete methods as well || interface by default has public and abstract methods.
 *
 * 2)abstract classes can achieve 0 to 100% inheritance ||   interfaces achieve 100% inheritance
 *
 * 3)no multiple inheritance || multiple inheritance can be achieved as only static methods are present
 *
 * 4)constructor are present || not present
 *
 * 5) instance methods present || instance methods not present
 *
 * 6)all variables present || public static final variables only
 *
 * 7)extends keyword used || implements keyword used
 *
 * 8)default methods not present || present
 *
 * 9)final methods present || not present
 *
 * 10)private methods present || not present
 */

/*
*DEFAULT METHODS IN
*INTERFACES :
*IF A FIXED STRUCTURE IS BEEN IN USE THEN IF A NEW ABSTRACT METHOD WHICH IS UNKNOWN IS INTRODUCED THEN THERE WILL BE A ERROR/AND BREAKING OF ALL THE SUB CLASSES  AND TO REMOVE THIS WE WILL NEED TO OVERRIDE -
- THE ALREADY EXISITING METHODS-UNTIL JAVA 7
* IN JAVA 8 ALL THE SUB CLASSES WILL HAVE THE  DEFAULT METHOD / CONDITION / IMPLEMENTATION IS AUTOMATICALLY INTRODUCED (IN ALL THE CLASSES) IN ORDER TO AVOID OVERRIDING.
*
* ----------------------------------------------------------------------------------------------------------------------------------------------------
*DEFAULT METHODS NOTES
* It is a feature if Java 8
* We can write default method only in an java 8 interface.
* A method which is defined in a interface with method body and with default keyword in an interface is called as default method.
*
* WHY DO WE NEED DEFAULT METHOD :
* PROBLEM STATEMENT :
* If we introduce an abstract method in an interface then all the implementing classes and sub classes  will break as we have to override all the abstract methods.
* If the no of implementing classes are too much then modifying/changing all classes will be difficult.
* To avoid this pin point we have a concept of default method.
* Solution :
* If we make the method default and provide method body in interface then sub classes will not break.
* All the subclasses will have the default implementation provided in the interface.
*
*
* ----------------------------------------------------------------------------------------------------------------------------------------------------
If we define same  default method in multiple  interfaces and these multiple interfaces are implemented by subclass then there will be a confusion for that subclass in which -
- method to accesss- so it will give compile time error.
* To avoid this confusion we override the default method in the subclass.
From overridden subclass method we can call all the default methods.











 */

