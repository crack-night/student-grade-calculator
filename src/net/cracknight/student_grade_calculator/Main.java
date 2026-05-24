
package net.cracknight.student_grade_calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String app = "Calculadora de Nota Promedio de un Estudiante";
        System.out.println(app);

        float grade1, grade2, grade3, average = 0.0f;
        String message = "N/A";

        Scanner scInput = new Scanner(System.in);

        System.out.print("[>] Nombre Estudiante: ");
        String studentName = scInput.nextLine();

        if( studentName.isEmpty() || studentName.isBlank() ){
            System.err.println("[X] El nombre del estudiante es requerido!");
            System.exit(1); //Error
        }

        System.out.print("[>] Ingresa la primer calificacion: ");
        grade1 = scInput.nextFloat();

        System.out.print("[>] Ingresa la segunda calificacion: ");
        grade2 = scInput.nextFloat();

        System.out.print("[>] Ingresa la tercer calificacion: ");
        grade3 = scInput.nextFloat();

        if( grade1 <= 0 || grade2 <= 0 || grade3 <= 0 ){
            System.err.println("[X] No se admiten calificaciones con valor !Cero!");
            System.exit(1); //Error
        }

        average = (grade1 + grade2 + grade3) / 3;

        if( average < 3 ){
            message = "Lo siento, no aprovaste!";
        }else if( average <= 6 ){
            message = "Lo siento, no aprovaste! Necesitas estudiar un poco mas!!!";
        }else if( average >= 7 && average <= 8 ){
            message = "Felicidades Aprovasteeee!!!!";
        }else if( average > 8 ){
            message = "Muchisimas Felicidades!!! Eres un Crack!!!";
        }else{
            message = "Ups, Algo salio mal, por favor intentalo mas tarde!!";
        }

        System.out.println(
                "\nNota Promedio \n" +
                        " Estudiante: "+ studentName +"\n" +
                        " - Nota #1: " + grade1 + "\n" +
                        " - Nota #2: " + grade2 + "\n" +
                        " - Nota #3: " + grade3 + "\n" +
                        " - Promedio: " + String.format("%.2f", average) + "\n" +
                        " - Nota: " + message
        );

        scInput.close();

        System.exit(0); //Success
    }
}
