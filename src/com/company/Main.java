package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
//       CreateFilesDirectories createFilesDirectories=new CreateFilesDirectories();
//       createFilesDirectories.createFileDirectory();
        File file= File.listRoots()[0];
        Ejercicio1.imprimirDirectorio(file);
        Scanner reader = new Scanner(System.in);
        int decision=0;
        while (decision!=-1){
            decision= reader.nextInt();
            if(decision==0){
                if(file.equals(File.listRoots()[0])){
                    System.out.println("No tiene padre");
                }else {
                    file= file.getParentFile();
                    Ejercicio1.imprimirDirectorio(file);
                }
            }else if(decision==-1){
                break;
            }else if(decision>numeroFicheros(file)){
                System.out.println("No hay tantos directorios");
                Ejercicio1.imprimirDirectorio(file);
            }
            else{
                if (file.isDirectory() && !file.isHidden()) {
                    file = file.listFiles()[decision - 1];
                    Ejercicio1.imprimirDirectorio(file);
                }
            }
        }

    }

    public static int numeroFicheros(File f){
        return f.listFiles().length;
    }
}
