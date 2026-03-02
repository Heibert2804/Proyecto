import java.util.ArrayList; 
import java.util.Scanner;

public class MetodoEstudiante {
    Scanner sc = new Scanner(System.in);

    public ObjEstudiante[][] LlenarMatriz(){
        System.out.println("Ingrese la dimension: ");
        int n = sc.nextInt();
        sc.nextLine();
        ObjEstudiante[][] matriz = new ObjEstudiante[n][n];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("\n Estudiante [" + i + "]["+ j + "]");

                System.out.println("Nombre del estudiante: ");
                String Nombre = sc.nextLine();

                System.out.println("Calificacion del estudiante: ");
                String Calificacion = sc.nextLine();

                matriz[i][j] = new ObjEstudiante(Nombre, Calificacion);
            }
        }

        return matriz;
    }

    public void AgruparEstudiantes(ObjEstudiante[][] matriz){
        ArrayList<ObjEstudiante> grupoA = new ArrayList<>();
        ArrayList<ObjEstudiante> grupoB = new ArrayList<>();
        ArrayList<ObjEstudiante> grupoC = new ArrayList<>();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                ObjEstudiante est = matriz[i][j];

                if(est.getCalificacion().equalsIgnoreCase("A")){
                    grupoA.add(est);
                }else if(est.getCalificacion().equalsIgnoreCase("B")){
                    grupoB.add(est);
                }else{
                    grupoC.add(est);
                }
            }
        }

        System.out.println("\nGrupo A: ");
        for(ObjEstudiante e : grupoA) e.mostar();

        System.out.println("\nGrupo B: ");
        for(ObjEstudiante e : grupoB) e.mostar();
        
        System.out.println("\nGrupo C: ");
        for(ObjEstudiante e : grupoC) e.mostar();
    }

}