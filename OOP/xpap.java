
class Area{
    
    int length,breadth;
    
    Area(int length, int breadth)
    {
        this.length= length;
        this.breadth = breadth;
    }
    void display()
    {
        System.out.println("The area is "+ length*breadth);
    }
}
class HelloWorld {
    public static void main(String[] args) {
        Area a = new Area(5,10);
        a.display();
        
    }
}