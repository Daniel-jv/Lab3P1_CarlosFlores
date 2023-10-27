package lab3p1_carlosflores;

import java.util.Scanner;
        
public class Lab3P1_CarlosFlores {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("------ M E N U ------");
        System.out.println("1.Sucesiones y mas Sucesiones!");
        System.out.println("2.Pocket Monsters");
        System.out.println("3.Asterisco en casa!");
        System.out.println("4.Salir");
        int opcion = leer.nextInt();
        System.out.println();
        
        while(opcion > 0 && opcion < 4){
            
            switch(opcion){
                
                case 1 -> {
                    System.out.print("Diferencia: ");
                    int dif = leer.nextInt();
                    int dif2 = dif;
                    System.out.print("Inicial: ");
                    int inic = leer.nextInt();
                    int inic2 = inic;
                    System.out.print("Cantidad: ");
                    int cant = leer.nextInt();
                    for(int limit = 1; limit <= cant; limit++){
                        System.out.print(inic);
                        inic = inic++ + dif++;
                        if(limit < cant){
                            System.out.print(", ");
                        }
                    }
                    System.out.println();
                    System.out.print("Que numero desea ver mas adelante en la sucesion?");
                    int adici = leer.nextInt();
                    for(int limit2 = 1; limit2 < adici;limit2++){
                        inic2 = inic2++ + dif2++;
                    }
                    adici = inic2;
                    System.out.print("El numero seria: " + adici);
                    System.out.println();
                }
                
                case 2 -> {
                    System.out.println("Ingrese que modo de pelea pokemon desea: ");
                    System.out.println("1.-Hasta la muerte");
                    System.out.println("2.-Por rondas");
                    int type = leer.nextInt();
                    System.out.println("Estadistica de los pokemones");
                    System.out.println("Sylveon Vida:280 Ataque:80 Defensa:15%");
                    System.out.println("Gyarados Vida:300 Ataque:50 Defensa:10%");
                    System.out.println("Girantina Vida:300 Ataque:70 Defensa:25%");
                    System.out.println("Dragonite Vida:250 Ataque:75 Defensa:20%");
                    System.out.println();
                    System.out.println("Ingrese una pelea determinada");
                    System.out.println("1.-Sylveon vrs Dragonite ");
                    System.out.println("2.-Gyarados vrs Girantina");
                    System.out.println("3.-Dragonite vrs Girantina");
                    System.out.println("4.-Girantia vrs Sylveon");
                    while(type > 0&&type < 3){
                        
                    }
                }
                
                case 3 -> {
                    System.out.print("n: ");
                    int n = leer.nextInt();
                    int fila = n;
                    int column = n;
                    if(n % 2 > 0 && n>=7){
                        for(int limit = 1;limit <= fila;limit++){
                            System.out.print("+ ");
                            if(limit == 1 || limit == fila){
                                for(int reps = 1;reps < column;reps++)
                                    System.out.print("+ ");
                            }
                            else{
                                if(limit > 1 && limit < fila){
                                    for(int reps = 1;reps < column;reps++){
                                        if(reps == column-1){
                                            System.out.print("+");
                                        }
                                        if(reps<column*200){
                                            System.out.print("  ");
                                        }
                                    }
                                }
                            }
                            System.out.println();
                        }
                    }
                    else{
                        System.out.println("'n' tiene que ser mayor o igual que 7 e impar.");
                    }
                }
                
            }//fin de switch
            System.out.println();
            System.out.println("------ M E N U ------");
            System.out.println("1.Sucesiones y mas Sucesiones!");
            System.out.println("2.Pocket Monsters");
            System.out.println("3.Asterisco en casa!");
            System.out.println("4.Salir");
            System.out.println();
            
            opcion = leer.nextInt();
            
        }//fin de while
        System.out.println("Salio del programa :D");
    }//fin de main
}//fin de clase
