import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import Entites.LogEntry;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file full path:");
        String path = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            
            Set<LogEntry> set = new HashSet<>();

            String line = br.readLine();
            while (line != null) {
                String[] data = line.split(" ");
                String username = data[0];
                Instant instant = Instant.parse(data[1]);
                

                set.add(new LogEntry(username, instant));
                
                line = br.readLine();
            }
            System.out.println("Total users: " + set.size());

        } catch (IOException e) {
            e.getMessage();
        }
    }
}

