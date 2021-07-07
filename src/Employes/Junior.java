package Employes;

public class Junior extends Employe {
    public Junior(String name, String adress, String phone, double salaryMonth){
        super(name, adress, phone, salaryMonth);
    }
    
    public void validarJunior(double salaryMonth) throws ArithmeticException{
        if(salaryMonth >= 900 && salaryMonth < 1599){
            aument = salaryMonth * 0.95;
        } else {
            throw new ArithmeticException("El sou d´un Junior oscil.la " + 
                    "entre 900 i 1599 euros!");
        }
    }
}
