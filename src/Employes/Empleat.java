package Employes;

//Declaració de clase empleat
public class Empleat{
    
    //Declaració de variables de classe 
    protected String name;
    protected String adress;
    protected String phone;
    protected double salaryMonth;
    protected double aument;
    
     //Declaració del constructor i paràmetres 
    public Empleat(String name, String adress, String phone, double salaryMonth){
        this.name = name;
        this.adress = adress;
        this.phone = phone;
        this.salaryMonth = salaryMonth;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return  name;
    }
    
    public void setAdress(String adress){
        this.adress = adress;
    }
    
    public String getAdress(){
        return adress;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public String getPhone(){
        return  phone;
    }
    
    public void setSalaryMonth(double salaryMonth){
        this.salaryMonth = salaryMonth;
    }
    
    public double getSalaryMonth(){
        return salaryMonth; 
    }
    
    public double getAument(){
        return aument;
    }
    
}

    
    
    
    
