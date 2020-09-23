import java.util.*;
import java.util.Random;

class PlusOuMoins{
    static public void main(String[] args)
    {

        int Nombre,essais=0;
        Random rand = new Random();
        int NombreMystere = rand.nextInt(101);

        System.out.println("Jeu du Plus ou Moins..");
        System.out.println("Trouvez le nombre mystere entre 0 et 100 !");
        do{
            Scanner nombre = new Scanner(System.in);
            System.out.println("Veuillez entrer un nombre...");
            Nombre=nombre.nextInt();

            if (Nombre<NombreMystere)
            {
                System.out.println("C est plus ! ");
                essais++;
            }
            else if (Nombre >NombreMystere)
            {
                System.out.println("C est moins !");
                essais++;
            }
            else
            {
                System.out.println("Trouver en " + essais + " essais ! Bien Joué !");
            }
        }
        while(Nombre!=NombreMystere);

    }
}
