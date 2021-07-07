
package Employes;

public class NewMain {

    public static void main(String[] args) {
        Boss boss = new Boss("Pere Boss", "Joan Torruella 4", "654127825", 8100);
        boss.validarBoss(8100);
        System.out.println("name=" + boss.name + ", adress=" + boss.adress +
                ", phone=" + boss.phone + ", salaryPerMonth=" + boss.salaryMonth +
                ", totalP=" + boss.getAument());
        
        Manager manager = new Manager("Queco Manager", "Josep Tusset", "587413698", 4500);
        manager.validarManager(4500);
        System.out.println("name=" + manager.name + ", adress=" + manager.adress +
                ", phone=" + manager.phone + ", salaryPerMonth=" + manager.salaryMonth +
                ", totalP=" + manager.getAument());
        
        Senior senior = new Senior("Toño Senior", "Coll 34", "789541236", 3900);
        senior.validarSenior(3900);
        System.out.println("name=" + senior.name + ", adress=" + senior.adress +
                ", phone=" + senior.phone + ", salaryPerMonth=" + senior.salaryMonth +
                ", totalP=" + senior.getAument());
        
        Mind mind = new Mind("Suso Mind", "Aparici 32", "582147862", 2400);
        mind.validarMind(2400);
        System.out.println("name=" + mind.name + ", adress=" + mind.adress +
                ", phone=" + mind.phone + ", salaryPerMonth=" + mind.salaryMonth +
                ", totalP=" + mind.getAument());
        
        Junior junior = new Junior("Peco Junior", "Calderes 2", "74589632541", 1500);
        junior.validarJunior(1500);
        System.out.println("name=" + junior.name + ", adress=" + junior.adress +
                ", phone=" + junior.phone + ", salaryPerMonth=" + junior.salaryMonth +
                ", totalP=" + junior.getAument());
        
        Volunteer volunteer = new Volunteer("Primo Volunteer", "Pacheco 6", "666666666", 0);
        volunteer.validarVolunteer(0);
        System.out.println("name=" + volunteer.name + ", adress=" + volunteer.adress +
                ", phone=" + volunteer.phone + ", salaryPerMonth=" + volunteer.salaryMonth +
                ", totalP=" + volunteer.getAument());
    }
    
}
