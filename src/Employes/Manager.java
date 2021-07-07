package Employes;

public class Manager extends Empleat {
    public Manager(String name, String adress, String phone, double salaryMonth){
        super(name, adress, phone, salaryMonth);
    }
    
    public void validarManager(double salaryMonth) throws ArithmeticException{
        if(salaryMonth >= 3000 && salaryMonth < 5000){
            aument= salaryMonth * 1.1;
        } else {
            throw new ArithmeticException("El sou d´un Manager oscil.la " +
                    "entre 3000 i 4999 euros!");
        }
    }
}

