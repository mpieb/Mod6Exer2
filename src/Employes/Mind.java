package Employes;

public class Mind extends Employe {
    public Mind(String name, String adress, String phone, double salaryMonth){
        super(name, adress, phone, salaryMonth);
    }
    
     public void validarMind(double salaryMonth) throws ArithmeticException{ 
        if(salaryMonth >= 1800 && salaryMonth < 2500){
            aument = salaryMonth * 0.9;
        } else {
            throw new ArithmeticException("El sou d´un Mind oscil.la " +
                    "entre 1800 i 2499 euros!");
        }
    }
}
