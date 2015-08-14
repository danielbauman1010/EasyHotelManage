/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easymanagehotel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

/**
 *
 * @author daniel
 */
public class FileManager {
    
    private FileWriter fw;
    private FileReader fr;
    private BufferedWriter bw;
    private BufferedReader br;
    
    public FileManager(String filename) throws IOException {
        this.fw = new FileWriter(filename, true);
        this.bw = new BufferedWriter(fw);
        this.fr = new FileReader(filename);
        this.br = new BufferedReader(fr);
    }
            
    public boolean write(String line){
        try {
            this.bw.write(line);
            this.bw.flush();
            return true;
        } catch (IOException ex) {
            return false;
        }
    }
    public String readLine() throws IOException {
        return this.br.readLine();
    }
    public List<String> readFile() throws IOException{
        List<String> lines = new ArrayList();
        
        if(br.ready()) {
            lines.add(br.readLine());
        }                
        return lines;
    }
    
}
