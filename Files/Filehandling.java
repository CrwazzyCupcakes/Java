import java.io.*;
import java.nio.file.*;
import java.util.List;
import java.util.stream.Stream;

public class Filehandling {
    public static void main(String[] args) throws IOException {

        // ============================================================
        // FILE HANDLING - reading from and writing to files. Java
        // has TWO main approaches: the older java.io package, and
        // the modern java.nio.file package (Java 7+, preferred now).
        // ============================================================


        // ------------------------------------------------------
        // WRITING to a file - java.io approach (FileWriter)
        // ------------------------------------------------------
        // try-with-resources -> automatically CLOSES the writer even
        // if an exception occurs, no need for a manual finally block
        try (FileWriter writer = new FileWriter("notes.txt")) {
            writer.write("Hello, this is line 1.\n");
            writer.write("This is line 2.\n");
        }
        // FileWriter OVERWRITES the file by default if it exists.


        // ------------------------------------------------------
        // APPENDING to a file - pass "true" as second argument
        // ------------------------------------------------------
        try (FileWriter appender = new FileWriter("notes.txt", true)) {
            appender.write("This line is appended.\n");
        }


        // ------------------------------------------------------
        // READING a file line by line - java.io approach (BufferedReader)
        // ------------------------------------------------------
        try (BufferedReader reader = new BufferedReader(new FileReader("notes.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {   // readLine() -> null when file ends
                System.out.println(line);
            }
        }


        // ------------------------------------------------------
        // MODERN APPROACH - java.nio.file (Files class + Path)
        // Cleaner, fewer lines, preferred in newer code.
        // ------------------------------------------------------
        Path path = Paths.get("notes.txt");   // Path -> represents a file location

        // Write entire content in one line (overwrites by default)
        Files.writeString(path, "Overwritten using NIO.\n");

        // Append using NIO
        Files.writeString(path, "Appended using NIO.\n", StandardOpenOption.APPEND);

        // Read ALL lines into a List<String> in one line
        List<String> allLines = Files.readAllLines(path);
        System.out.println(allLines);

        // Read entire file content as a single String
        String content = Files.readString(path);
        System.out.println(content);


        // ------------------------------------------------------
        // Reading with a Stream - useful for LARGE files (doesn't
        // load everything into memory at once, unlike readAllLines)
        // ------------------------------------------------------
        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(System.out::println);
        }


        // ------------------------------------------------------
        // Checking file properties
        // ------------------------------------------------------
        System.out.println(Files.exists(path));          // exists() -> true/false
        System.out.println(Files.size(path));             // size() -> file size in bytes
        System.out.println(Files.isDirectory(path));      // isDirectory() -> false, it's a file


        // ------------------------------------------------------
        // Creating / deleting files
        // ------------------------------------------------------
        Path newFile = Paths.get("temp.txt");
        if (!Files.exists(newFile)) {
            Files.createFile(newFile);        // createFile() -> makes a new empty file
        }
        Files.delete(newFile);                 // delete() -> removes the file


        // ------------------------------------------------------
        // Handling exceptions PROPERLY - file operations can fail
        // (file not found, permission denied, etc.), so wrap risky
        // calls in try-catch when you're NOT using "throws" on main
        // ------------------------------------------------------
        try {
            Files.readString(Paths.get("does_not_exist.txt"));
        } catch (IOException e) {
            System.out.println("File not found: " + e.getMessage());
        }


        // ============================================================
        // QUICK GUIDE:
        //  - Small file, quick read/write   -> Files.readString() /
        //                                        Files.writeString()
        //  - Line-by-line reading            -> Files.readAllLines()
        //                                        or BufferedReader
        //  - Large file (memory-conscious)   -> Files.lines() (Stream)
        //  - Appending                        -> StandardOpenOption.APPEND
        //                                        (NIO) or "true" flag (io)
        //  - ALWAYS use try-with-resources for FileWriter/BufferedReader
        //    so the file gets closed automatically, even on error
        // ============================================================
    }
}