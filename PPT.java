import java.util.Random;
import java.util.Scanner;

public class PPT {
    static final int pedra = 1, paper = 2, tisores = 3;
    static int pu = 0, pm = 0;
    static Scanner lector = new Scanner(System.in);
    static int maquina = 0, usuario = 0;

    public static void main(String[] args) 
    {
        //VARIABLES
        System.out.println("                                                                  ");
        System.out.println("------------------------------------------------------------------");
        System.out.println("|  TRIA UN IDIOMA   |   Elija un idioma   |   CHOOSE A LANGUAGE  |");
        System.out.println("|                   |                     |                      |");
        System.out.println("|     Catala: 1     |    CASTELLANO: 2    |       English: 3     |");
        System.out.println("------------------------------------------------------------------");
        System.out.println("                                                                  ");
        int idioma = lector.nextInt();

        switch (idioma) 
        {                //Aqui posam els idiomes
            case 1:
                Catala();
                break;
            case 2:
                Castella();
                break;
            case 3:
                Ingles();
                break;
            default:
                System.out.println("Error");
        }
    }

    public static void Catala() 
    {
        int torn = 3;
        for (int i = 0; i < torn; i++) 
        {
            System.out.println(" ");
            System.out.println("                 *- RONDA " + (i + 1) + " -*");
            System.out.println(" ");
            System.out.println("Punts del usuari: " + pu + "         Punts de la maquina: " + pm);
            System.out.println(" ");
            System.out.println("Tria una opcio");
            System.out.println(" ");
            System.out.println("--------------");
            System.out.println("| 1- Pedra   |");
            System.out.println("| 2- Paper   |");
            System.out.println("| 3- Tisores |");
            System.out.println("--------------");
            System.out.println(" ");

            usuario = lector.nextInt();
            Random r = new Random();
            maquina = r.nextInt(3) + 1; //Random entre 1 i 3
            System.out.println(" ");
            System.out.println("---------------------------");
            System.out.println("Valor de la maquina: " + maquina);
            System.out.println("Valor de l'usuari: " + usuario);
            System.out.println("---------------------------");
            System.out.println(" ");

            if (maquina == pedra)          //Si la maquina treu pedra, i el usuari pedra, significa que hem empatat.
            {
                if (usuario == pedra) 
                {
                    System.out.println("-Heu empatat-");
                } 
                else 
                {		//Si la maquina treu pedra, i el usuari paper, el usuari guanya.
                    if (usuario == paper) 
                    {
                        System.out.println("-Puntua l'usuari-");
                        pu++;
                    }
                    else   //Si el usuari treu les tissores, la màquina guanya.
                    {
                        System.out.println("-La maquina puntua-");
                        pm++;
                    }
                }
            } 
            else 
            {
                if (maquina == paper) //si sa maquina treu paper i usuari pedra, la maquina guanya.
                {
                    if (usuario == pedra) 
                    {
                        System.out.println("-La maquina puntua-");
                        pm++;
                    } 
                    else 
                    {
                        if (usuario == paper) //si el usuari treu paper, empat.
                        {
                            System.out.println("-Heu empatat-");
                        } 
                        else 
                        {
                            System.out.println("-Puntua l'usuari-");
                            pu++;
                        }
                    }
                } 
                else 
                { //Tisores
                    if (usuario == pedra) //si el usuari treu pedra, guanya s'usuari
                    {
                        System.out.println("-Puntua l'usuari-");
                        pu++;
                    } 
                    else 
                    {
                        if (usuario == paper)  //si s'usuari treu paper, la màquina puntua S'APLICA EL MATEIX TANT AL CODI EN 
                        {																        // CATALA, CASTELLA, I INGLES
                            System.out.println("-La maquina puntua-");
                            pm++;
                        } 
                        else 
                        {
                            System.out.println("-Heu empatat-");
                        }
                    }
                }
            }
        }

        System.out.println(" ");
        System.out.println("Punts del usuari: " + pu + "         Punts de la maquina: " + pm);
        System.out.println(" ");

        if (pu < pm) {
            System.out.println("        |DERROTA|");
            System.out.println(" ");
        } 
        else 
        {
            if (pu > pm) 
            {
                System.out.println("        |VICTORIA|");
                System.out.println(" ");
            } 
            else 
            { // Han empatat
                System.out.println("        |EMPAT|");
                System.out.println(" ");
            }
        }
    }

    public static void Castella() 
    {
        int torn = 3;
        for (int i = 0; i < torn; i++) 
        {
            System.out.println(" ");
            System.out.println("                   *- RONDA " + (i + 1) + " -*");
            System.out.println(" ");
            System.out.println("Puntos del usuario: " + pu + "         Puntos de la maquina: " + pm);
            System.out.println(" ");
            System.out.println("|Elige una opcion|");
            System.out.println(" ");
            System.out.println("--------------");
            System.out.println("| 1- Piedra  |");
            System.out.println("| 2- Papel   |");
            System.out.println("| 3- Tijeras |");
            System.out.println("--------------");
            System.out.println(" ");

            usuario = lector.nextInt();
            Random r = new Random();
            maquina = r.nextInt(3) + 1; //Rsndom entre 1 i 3
            System.out.println(" ");
            System.out.println("-----------------------------");
            System.out.println("* Valor de la maquina: " + maquina);
            System.out.println("* Valor del usuario: " + usuario);
            System.out.println("-----------------------------");
            System.out.println(" ");

            if (maquina == pedra) 
            {
                if (usuario == pedra) 
                {
                    System.out.println("-Habeis empatado la ronda-");
                } 
                else 
                {
                    if (usuario == paper) 
                    {
                        System.out.println("-Puntua el usuario-");
                        pu++;
                    } 
                    else 
                    {
                        System.out.println("-Puntua la maquina-");
                        pm++;
                    }
                }
            }
            else 
            {
                if (maquina == paper) 
                {
                    if (usuario == pedra) 
                    {
                        System.out.println("-Puntua la maquina-");
                        pm++;
                    } 
                    else 
                    {
                        if (usuario == paper) 
                        {
                            System.out.println("-Habeis empatado la ronda-");
                        } 
                        else 
                        {
                            System.out.println("-Puntua el usuario-");
                            pu++;
                        }
                    }
                }
                else 
                { //Tisores
                    if (usuario == pedra) 
                    {
                        System.out.println("-Puntua el usuario-");
                        pu++;
                    } 
                    else 
                    {
                        if (usuario == paper) 
                        {
                            System.out.println("-Puntua la maquina-");
                            pm++;
                        } 
                        else 
                        {
                            System.out.println("-Habeis empatado la ronda-");
                        }
                    }
                }
            }
        }

        System.out.println(" ");
        System.out.println("Puntos del usuario: " + pu + "         Puntos de la maquina: " + pm);
        System.out.println(" ");

        if (pu < pm) {
            System.out.println("        |DERROTA|");
            System.out.println(" ");
        } 
        else 
        {
            if (pu > pm) 
            {
                System.out.println("        |VICTORIA|");
                System.out.println(" ");
            } 
            else 
            { // Han empatat
                System.out.println("        |EMPATE|");
                System.out.println(" ");
            }
        }
    }

    public static void Ingles() 
    {
        int torn = 3;
        for (int i = 0; i < torn; i++) 
        {
            System.out.println(" ");
            System.out.println("           *- RONDA " + (i + 1) + " -*");
            System.out.println(" ");
            System.out.println("User poins: " + pu + "         Bot points: " + pm);
            System.out.println(" ");
            System.out.println("Choose an option:");
            System.out.println(" ");
            System.out.println("---------------");
            System.out.println("| 1- Stone    |");
            System.out.println("| 2- Paper    |");
            System.out.println("| 3- Scissors |");
            System.out.println("---------------");
            System.out.println(" ");

            usuario = lector.nextInt();
            Random r = new Random();
            maquina = r.nextInt(3) + 1; //Random entre 1 i 3
            System.out.println(" ");
            System.out.println("--------------------------------");
            System.out.println("* Value of the computer: " + maquina);
            System.out.println("* Value of the user: " + usuario);
            System.out.println("--------------------------------");
            System.out.println(" ");

            if (maquina == pedra) 
            {
                if (usuario == pedra) 
                {
                    System.out.println("-The round has been tied-");
                } 
                else 
                {
                    if (usuario == paper) {
                        System.out.println("-The user takes points-");
                        pu++;
                    } 
                    else 
                    {
                        System.out.println("-The bot takes points-");
                        pm++;
                    }
                }
            } 
            else 
            {
                if (maquina == paper) 
                {
                    if (usuario == pedra) 
                    {
                        System.out.println("-The bot takes points-");
                        pm++;
                    } 
                    else 
                    {
                        if (usuario == paper) {
                            System.out.println("-The round has been tied-");
                        } 
                        else 
                        {
                            System.out.println("-The user takes points-");
                            pu++;
                        }
                    }
                } 
                else 
                { //Tisores
                    if (usuario == pedra) 
                    {
                        System.out.println("-The user takes points-");
                        pu++;
                    } 
                    else 
                    {
                        if (usuario == paper) 
                        {
                            System.out.println("-The bot takes points-");
                            pm++;
                        } 
                        else 
                        {
                            System.out.println("-The round has been tied-");
                        }
                    }
                }
            }
        }
        
        System.out.println(" ");
        System.out.println("User poins: " + pu + "         Bot points: " + pm);
        System.out.println(" ");

        if (pu < pm) {
            System.out.println("        |DEFEAT|");
            System.out.println(" ");
        } 
        else 
        {
            if (pu > pm) 
            {
                System.out.println("        |VICTORY|");
                System.out.println(" ");
            } 
            else 
            { // Han empatat
                System.out.println("        |DRAW|");
                System.out.println(" ");
            }
        }
    }
}