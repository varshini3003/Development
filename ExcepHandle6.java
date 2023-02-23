/*
 * Program to check whether a derived class constructor can catch exception
 * thrown by base class constructor
 */
class BaseClass
{
    BaseClass()
    {
        System.out.println("In base class constructor... Going to throw an exception...");
        throw new RuntimeException("Throwing a Runtime exception");
    }
}
class DerivedClass extends BaseClass
{
    DerivedClass()
    {
        try
        {
            //BaseClass base = new BaseClass();
        }
        catch(RuntimeException rte)
        {
            System.out.println("In catch block...");
            System.out.println(rte);
            //Not able to catch exception thrown by base class constructor
        }
    }
}
public class ExcepHandle6 {
    public static void main(String[] args) {
        DerivedClass derived = new DerivedClass();
    }
}