/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;
class Worker{
    String name;
    int number;
    double salary;
    
    public void setName(String name){
        this.name=name;
}
    
    public void setNumber(int number){
     this.number=number;   
    }
    
    public void setSalary(double salary)
    {
        this.salary=salary;
    }
    
    public String getinfo(){
        return "Name: "+name+" Number: "+number+" Salary: "+salary;
    }
}

/**
 *
 * @author Bibek Yogi
 */
public class Practise1 {
    public static void main(String[] args) {
    Worker Bibek = new Worker();
    Worker Rakesh = new Worker();
    Bibek.setName("Bibek");
    Bibek.setNumber(98888);
    Bibek.setSalary(9595959.25);
        System.out.println(Bibek.getinfo());
        System.out.println(Rakesh.getinfo());
    }
   
    
}
