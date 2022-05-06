package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1 {

    private static void imprimirDirectorio(File f) throws IOException {
        int i=0;
        if (f.exists()) {

            if (f.isDirectory()) {

                for (File e : f.listFiles()){
                    i++;
                    if (!f.isHidden()) {

                        if (f.isFile()) {

                            System.out.println(e.getName() + " " + e.length());

                        }

                        if (e.isDirectory()){
                            System.out.println((i+"-"+e.getName() + " <Directorio>"));

                        }

                    }

                }

            } else {

                System.out.println("No es un directorio");

            }

        } else {

            System.out.println("No existe el directorio");

        }

    }

    public void navegadorDirectorios() throws IOException {

        String ent = "/";

        File f = new File(ent);

        System.out.println("Lista de ficheros y directorios del directorio: " + ent);

        System.out.println("---------------------------------------------------");

        imprimirDirectorio(f);

        String ent2 = new BufferedReader(new InputStreamReader(System.in)).readLine();
        System.out.println("Lista de ficheros y directorios del directorio: " + ent2);

        System.out.println("---------------------------------------------------");

        File f2 = new File(ent2);

        try {

            imprimirDirectorio(f2);

        } catch(IOException e) {

            System.out.println("No existe el directorio");
        }
    }

}