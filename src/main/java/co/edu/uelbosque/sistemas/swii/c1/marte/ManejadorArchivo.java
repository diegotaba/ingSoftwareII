/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swii.c1.marte;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author Alejandro
 */
public class ManejadorArchivo {

    private File reglas;

    public void setRutaArchivo(String ruta) throws FileNotFoundException {
        reglas = new File(ruta);
        if ((!reglas.exists()))
            throw new FileNotFoundException("El Archivo de Reglas No Existe");
    }

    public String getPrimeraLinea() throws IOException {
        FileReader fr = new FileReader(reglas);
        BufferedReader br = new BufferedReader(fr);
        return br.readLine();
    }


    public String getSegundaLinea() throws IOException {
        FileReader fr = new FileReader(reglas);
        BufferedReader br = new BufferedReader(fr);

        Path path = Paths.get(reglas.toURI());
        List<String> linea = Files.readAllLines(path);

        return linea.get(1);
    }

}
