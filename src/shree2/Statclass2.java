package shree2;

class Statclass2 { 
    // How to create instance of static 
    // and non static nested class? 
    public static void main(String args[]) 
    { 
  
        // Create instance of nested Static class 
        Statclass.NestedStaticClass printer = new Statclass.NestedStaticClass(); 
  
        // Call non static method of nested 
        // static class 
        printer.printMessage(); 
  
        // In order to create instance of 
        // Inner class we need an Outer class 
        // instance. Let us create Outer class 
        // instance for creating 
        // non-static nested class 
        Statclass outer = new Statclass(); 
        Statclass.InnerClass inner = outer.new InnerClass(); 
  
        // Calling non-static method of Inner class 
        inner.display(); 
  
        // We can also combine above steps in one 
        // step to create instance of Inner class 
        Statclass.InnerClass innerObject = new Statclass().new InnerClass(); 
  
        // Similarly we can now call Inner class method 
        innerObject.display(); 
    } 
} 
