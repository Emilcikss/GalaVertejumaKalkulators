package pakotne;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VertejumuAprekins {
    private String[] studenti;
    private String[] kriteriji;
    private int[] kriterijaSvars;
    private int[][] kriterijaVertejums;
    private double[] semestraVertejums;
    private DecimalFormat df = new DecimalFormat("0.#");

    public void ievadeDati(Scanner scan) {
        int studSk, kritSk;

        // Audzēkņu skaita ievade
        do {
            System.out.println("Cik studentiem aprēķināsi gala vērtējumu?");
            while (!scan.hasNextInt()) {
                System.out.println("Cik studentiem aprēķināsi gala vērtējumu?");
                scan.next();
            }
            studSk = scan.nextInt();
        } while (studSk < 1);
        studenti = new String[studSk];

        // Kritēriju skaita ievade
        do {
            System.out.println("Kāds būs kritēriju skaits?");
            while (!scan.hasNextInt()) {
                System.out.println("Kāds būs kritēriju skaits?");
                scan.next();
            }
            kritSk = scan.nextInt();
        } while (kritSk < 1);
        kriteriji = new String[kritSk];
        kriterijaSvars = new int[kritSk];
        kriterijaVertejums = new int[studSk][kritSk];
        semestraVertejums = new double[studSk];

        scan.nextLine();

        // Studentu vārdi
        for (int i = 0; i < studenti.length; i++) {
            do {
                System.out.println("Ievadi " + (i + 1) + ". studentu");
                studenti[i] = scan.nextLine().trim();
            } while (!studenti[i].matches("^[\\p{L} ]+$"));
        }

        // Kritēriji un svari
        int maxSvars = 100, sk = 1;
        double atlSvars;
        for (int i = 0; i < kriteriji.length; i++) {
            do {
                System.out.println("Ievadi " + (i + 1) + ". kritēriju");
                kriteriji[i] = scan.nextLine().trim();
            } while (!kriteriji[i].matches("^[\\p{L} ]+$"));

            do {
                System.out.println("Ievadi " + (i + 1) + ". kritērija svaru (max: " + maxSvars + ")");
                while (!scan.hasNextInt()) {
                    System.out.println("Ievadi " + (i + 1) + ". kritērija svaru");
                    scan.next();
                }
                kriterijaSvars[i] = scan.nextInt();
                atlSvars = (maxSvars - kriterijaSvars[i]) / (double) (kriteriji.length - sk);
            } while (kriterijaSvars[i] > maxSvars || kriterijaSvars[i] < 5 ||
                    (i != kriteriji.length - 1 && kriterijaSvars[i] == maxSvars) ||
                    (i == kriteriji.length - 1 && (maxSvars - kriterijaSvars[i]) > 0) ||
                    atlSvars < 5);
            maxSvars -= kriterijaSvars[i];
            sk++;
            scan.nextLine();
        }

        // Vērtējumi
        for (int i = 0; i < kriterijaVertejums.length; i++) {
            for (int j = 0; j < kriterijaVertejums[i].length; j++) {
                do {
                    System.out.println("Ievadi " + studenti[i] + " vērtējumu par kritēriju " + kriteriji[j]);
                    while (!scan.hasNextInt()) {
                        System.out.println("Ievadi " + studenti[i] + " vērtējumu par kritēriju " + kriteriji[j]);
                        scan.next();
                    }
                    kriterijaVertejums[i][j] = scan.nextInt();
                } while (kriterijaVertejums[i][j] < 0 || kriterijaVertejums[i][j] > 10);
            }
        }

        // Aprēķins
        for (int i = 0; i < studenti.length; i++) {
            double rezultats = 0;
            for (int j = 0; j < kriteriji.length; j++) {
                rezultats += ((double) kriterijaSvars[j] / 100) * kriterijaVertejums[i][j];
            }
            semestraVertejums[i] = rezultats;
        }
    }

    }
