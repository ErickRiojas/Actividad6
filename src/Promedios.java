import java.util.Scanner;
import java.lang.String;

public class Promedios {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Introduce el nombre del alumno");
        String alumno = leer.nextLine();

        int arreglo[] = new int[5];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Introduce la calificación " + (i + 1));
            arreglo[i] = (int) leer.nextDouble();
        }
        calProm(arreglo);
        calFinal(arreglo, calProm(arreglo));
        mostrar(arreglo,alumno,calProm(arreglo),calFinal(arreglo, calProm(arreglo)));
    }

    private static double calProm(int[] arreglo) {
        double res = 0;
        res =(arreglo[0]+arreglo[1]+arreglo[2]+arreglo[3]+arreglo[4])/5;
        return res;
    }

    private static String calFinal(int[] arreglo, double calProm) {
        String resF="A";
        if(calProm>= 51 && calProm <= 60) resF = "E";
        else if (calProm >= 61 && calProm <=70) resF= "D";
        else if (calProm >= 71 && calProm <=80) resF= "C";
        else if (calProm >= 81 && calProm <=90) resF= "B";
        else if (calProm >= 91 && calProm <=100) resF= "A";
        else resF= "F";
        return resF;
    }

    private static void mostrar(int []arreglo,String alumno, double calProm, String calFinal) {
        System.out.println("Nombre del alumno: " +alumno);
        System.out.println("Calificacion 1: " +arreglo[0]);
        System.out.println("Calificacion 2: " +arreglo[1]);
        System.out.println("Calificacion 3: " +arreglo[2]);
        System.out.println("Calificacion 4: " +arreglo[3]);
        System.out.println("Calificacion 5: " +arreglo[4]);
        System.out.println("Promedio:" +calProm);
        System.out.println("Calificacion Final:" +calFinal);
    }
}