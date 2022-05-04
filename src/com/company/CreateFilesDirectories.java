package com.company;

import java.io.File;
import java.io.IOException;

public class CreateFilesDirectories {
    public void createFileDirectory() throws IOException {
        File direct= new File("/home/INFORMATICA/alu10186575/Ejercicios");
        File file = new File(direct,"hey.txt");
        direct.mkdir();
        file.createNewFile();
    }
}
