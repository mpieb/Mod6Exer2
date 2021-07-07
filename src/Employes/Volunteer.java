package Employes;

public class Volunteer extends Empleat {
    public Volunteer(String name, String adress, String phone, double salaryMonth){
        super(name, adress, phone, salaryMonth);
    }
    
    public void validarVolunteer(double salaryMonth) throws ArithmeticException{
        if(salaryMonth == 0){
            aument = salaryMonth;
        } else {
            throw new ArithmeticException("El Volunter no cobra!");
        }
    }
}