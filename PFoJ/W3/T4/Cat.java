/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: Overriding and Hiding Methods
* Link: exercises03.pdf
* @author Fabian Grun (1230840)
* @author Selin Can (1101908)
* @author Tom Rosenberger (1208597)
* @version 1.0, 05.11.2018
*
* Method : <Add method name>
* Status: <Add status>
* Runtime: <Add runtime>
*/

package T4;

import T02.Bicycle;

public class Cat extends Animal 
{
    public static void testClassMethod() 
    {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() 
    {
        System.out.println("The instance method in Cat");
    }
    public Cat clone (Cat newCat) throws CloneNotSupportedException
    {
    	Cat clonedObj = (Cat) super.clone();
    	return clonedObj;
    }

    public static void main(String[] args) 
    {
        Cat myCat = new Cat();
        Cat newCat = new Cat();
        Animal myAnimal = myCat;
        Animal.testClassMethod();
        myAnimal.testInstanceMethod();
        Cat.testClassMethod();
        myCat.testInstanceMethod();
        
        //Clone Cat
        try
        {
        	myCat.clone(newCat);
        	System.out.println("Cat cloned!");
        }
        catch(CloneNotSupportedException e) 
	    {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(myCat.equals(myAnimal));
        System.out.println(myCat.getClass());
        System.out.println(myCat.hashCode());
        System.out.println(myCat.toString());
    }
}
