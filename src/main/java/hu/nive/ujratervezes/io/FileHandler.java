package hu.nive.ujratervezes.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static java.nio.file.Files.readAllLines;

public class FileHandler {

    public int sumIgnoreComments(String path) {
        try {
            return Files.readAllLines(Path.of(path)).stream().filter(line -> !line.startsWith("//")).mapToInt(Integer::parseInt).sum();
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!");
        }
    }
}
