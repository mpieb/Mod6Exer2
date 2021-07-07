package Employes;

public class Senior extends Employe {
    public Senior(String name, String adress, String phone, double salaryMonth){
        super(name, adress, phone, salaryMonth);
    }
    
    public void validarSenior(double salaryMonth) throws ArithmeticException{
        if(salaryMonth >= 2700 && salaryMonth < 4000){
            aument = salaryMonth * 0.85;
        } else {
            throw new ArithmeticException("El sou d´un Senior oscil.la " +
                    "entre 2700 i 3999 euros!");
        }
    }
}
