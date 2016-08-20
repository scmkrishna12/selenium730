
 abstract class Shape2{  
    abstract void draw();  
    }  
    //In real scenario, implementation is provided by others i.e. unknown by end user  
    class Rectangle2 extends Shape2{  
    void draw(){System.out.println("drawing rectangle");}  
    }  
      
    class Circle12 extends Shape2{  
    void draw(){System.out.println("drawing circle");}  
    }  
      
    //In real scenario, method is called by programmer or user  
   
    public class TestAbstraction12{  
    
    	public static void main(String args[]){  
    Shape2 ss=new Rectangle2();//In real scenario, object is provided through method e.g. getShape() method  
    Shape2 s=new Circle12();
    s.draw();  
    ss.draw();
    }  
    }  

    
