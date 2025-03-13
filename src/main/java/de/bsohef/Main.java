package de.bsohef;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bitte gib deine Größe in m an!");
        float size = input.nextFloat();
        System.out.println("Bitte gib dein Gewicht in KG an!");
        float weight = input.nextFloat();
        //BMI -Formel = Körpergewicht (in kg ) geteilt durch Körpergröße (in m )
        float bmi = (float) (weight / Math.pow(size,2.0F));

        System.out.println("Dein bmi liegt bei: "+ bmi);
        if (bmi < 18.5)
        {
            System.out.println("Du bist Untergewichtich");
        }
        else if(bmi <= 24.9F)
        {
            System.out.println("Du bist Normalgewichtich");
        }
        else if (bmi >= 25 && bmi <=29.9)
        {
            System.out.println("Du bist Übergewichtich");
        }else
        {
            System.out.println("Du bist Stark Übergewichtich");
        }

    /*Erstellen Sie einen Programmablaufplan für einen BMI Rechner.
    Dieser soll das Gewicht und die Größer des Benutzers einlesen und den BMI berechnen.

    Anschließend sollen folgende Ausgaben erfolgen:
    Untergewicht: wenn der bmi < 18,5 ist
    Normalgewicht: wenn der bmi >= 18,5 und bmi <=24,9
    Übergewicht: wenn der bmi >= 25 und bmi <=29,9
    Starkes Übergewicht: ansonsten*/
    }
}
