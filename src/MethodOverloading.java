/*class Overload
{
    void demo (int a)
    {
       System.out.println ("a: " + a);
    }
    void demo (int a, int b)
    {
       System.out.println ("a and b: " + a + "," + b);
    }
    double demo(double a) {
       System.out.println("double a: " + a);
       return a*a;
    }
}







public class MethodOverloading
{
    public static void main (String args [])
    {
        Overload Obj = new Overload();
        
        double result;
        result = Obj .demo(5.5);
        
        Obj .demo(10);
        Obj .demo(10, 20);
        
        System.out.println("O/P : " + result);
    }
}*/







 abstract class Shape1{  
    abstract void draw();  
    }  
    //In real scenario, implementation is provided by others i.e. unknown by end user  
    class Rectangle1 extends Shape1{  
    void draw(){System.out.println("drawing rectangle");}  
    }  
      
    class Circle11 extends Shape1{  
    void draw(){System.out.println("drawing circle");}  
    }  
      
    //In real scenario, method is called by programmer or user  
    class TestAbstraction1{  
    public static void main(String args[]){  
    Shape1 ss=new Rectangle1();//In real scenario, object is provided through method e.g. getShape() method  
    Shape1 s=new Circle11();
    s.draw();  
    ss.draw();
    }  
    }  

