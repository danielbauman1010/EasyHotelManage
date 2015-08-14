/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easymanagehotel;

/*import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
*/
/**
 *
 * @author daniel
 */
public class ConsoleManager { /*
    public static void main(String[] args) {
        try {
            FileManager roomFile = new FileManager("rooms.txt");
            FileManager viewFile = new FileManager("views");
            FileManager isAvailableFile = new FileManager("isAvailable.txt");
            FileManager typeFile = new FileManager("types.txt");
            
            List<String> roomNumbersString = roomFile.readFile();
            List<String> views = viewFile.readFile();
            List<String> types = typeFile.readFile();
            List<String> isAvailablesString = isAvailableFile.readFile();
            
            List<Integer> roomNumbers = new ArrayList();
            List<Boolean> isAvailables = new ArrayList();
            
            for(String roomNumberString: roomNumbersString) {
                int roomNumber = Integer.parseInt(roomNumberString);
                roomNumbers.add(roomNumber);                
            }
            for(String isAvailableString: isAvailablesString) {
                if(isAvailableString.equals("true")) {
                    isAvailables.add(true);
                } else {
                    isAvailables.add(false);
                }
            }
            
            List<Room> rooms = new ArrayList();
            for(int i = 0; i < roomNumbers.size(); i++) {
                
                int roomNumber = roomNumbers.get(i);
                String type = types.get(i);
                String view = views.get(i);
                boolean isAvailable = isAvailables.get(i);
                
                Room room = new Room(roomNumber, type, view, isAvailable);
                rooms.add(room);
            }
            
            System.out.println("Write your commands: (type help for options)");
            Scanner in = new Scanner(System.in);                        
            List<String> commands = new ArrayList();
            commands.add("add a room ");
            while(true) {
                String command = in.nextLine();
                if(command.equals("help"))
                    commands.parallelStream().forEach(System.out::println);
                else if(command.startsWith("add a room ")) {
                    
                }   
            }
        } catch (IOException ex) {
            System.out.println("No such file found");
        }
        
    }*/
}
