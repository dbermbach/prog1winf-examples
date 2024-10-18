package de.tuberlin.mcc.prog1winf.outlook;

import de.tuberlin.mcc.prog1winf.birdshow.Bird;

public class Example {

    //static block
    static {
        System.out.println("Executing static block");
        /*instructions in the static block are executed when the classloader loads the class
        * and also creates all class variables.*/

    }

    public static void main(String[] args) {
        usingAnonymousClasses();
        usingInnerClasses();
    }

    static void usingInnerClasses() {
        //Using inner classes

        //This creates an instance of a class that contains inner classes
        OtherClass oc = new OtherClass();
        //This creates an instance of an inner class
        OtherClass.InnerClass oic = oc.new InnerClass();
        //This creates an instance of a static inner class
        OtherClass.StaticInnerClass osic = new OtherClass.StaticInnerClass();

        /*
         * It is possible to declare a class inside another class (at the same level
         * where we define methods or fields). These so-called inner classes can be
         * static or non-static and only exist together with their surrounding context.
         * There classname (see above) is "OuterClassname.InnerClassname".
         * Inner classes are usually used to hide implementation details and are, hence,
         * very often private classes, i.e., they are only accessible inside the surrounding
         * class. A typical example for using an inner class would be when implementing a
         * linked list data structure: The outer class would be "LinkedList", the "ListElement"
         * class (which is not supposed to be exposed to users of LinkedList or anyone else)
         * would be implemented as a (private) inner class.
         *
         * Static inner classes vs. non-static inner classes:
         * All kinds of inner classes only exist together with a surrounding context. In the case
         * of static inner classes, the surrounding context is the class. Therefore, it is
         * possible (see example above) to instantiate an instance of a static inner class simply
         * by referring to the classname of the outer class. Instance of non-static inner classes
         * are bound to a specific instance of the outer class (they are essentially part of it).
         * This can best be seen in the example of the linked list above: Instances of the
         * (non-static) inner class for list elements are part of a specific linked list instance,
         * i.e., in this case the list for which they have been created. This is also reflected in
         * the way that the oic object above is instantiated - the new operator requires a reference
         * to an instance of the outer class.
         *
         * All inner classes can access the methods and fields of their surrounding context (including
         * private ones!) as they are essentially a part of "it". This means that:
         * - static inner classes can access all class variables and class methods of the surrounding class
         * - non-static inner classes can access all class and instance variables/methods of the surrounding
         * class. Inside a non-static inner class "this" refers to the instance of the inner class. The "this"
         * reference to the surrounding instance can be retrieved via "OuterClassName.this".
         */

    }


    static void usingAnonymousClasses(){
        // Anonymous classes
        //Example 1
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("I'm running!");
            }
        };
        new Thread(r).start();
        //Example 2
        AbstractClass ac = new AbstractClass() {
            @Override
            void foobar() {
                //doing nothing
            }
        };
        System.out.println("Class and package name for object r: "+r.getClass().getName());
        System.out.println("Class and package name for object ac: "+ac.getClass().getName());

/*whenever you need a quick implementation of an interface/abstract class
but will only need it exactly one time, it is usually not worth creating
a separate class somewhere. In those cases, an anonymous class can be created:

=> new InterfaceName()
is not allowed because the interface cannot be instantiated, since there is no
implementation. What can be used is the following:
=> new InterfaceName(){add class content here}
This creates a class that doesn't have a real classname and instantiates it for
direct use in the following. This can be used with interfaces and abstract classes
in the exact same way.
*/


    }




}
