package Employes;

public class Boss extends Empleat {
    public Boss(String name, String adress, String phone, double salaryMonth){
        super(name, adress, phone, salaryMonth);
    }
    
    public void validarBoss(double salaryMonth) throws ArithmeticException{
        if(salaryMonth > 8000){
            aument = salaryMonth * 1.5;
        } else {
            throw new ArithmeticException("El sou del Boss té que ser major " +
                    "de 8000 euros!");
        }
    }
}
