import java.util.*;
import java.io.*;
import java.nio.file.*;


class SusCompare{

    public static long filesCompareByByte(Path path1, Path path2) throws IOException {
        try (BufferedInputStream fis1 = new BufferedInputStream(new FileInputStream(path1.toFile()));
             BufferedInputStream fis2 = new BufferedInputStream(new FileInputStream(path2.toFile()))) {
            
            int ch = 0;
            long pos = 1;
            while ((ch = fis1.read()) != -1) {
                if (ch != fis2.read()) {
                    return pos;
                }
                pos++;
            }
            if (fis2.read() == -1) {
                return -1;
            }
            else {
                return pos;
            }
        } 
    }
    public static void main(String[] args) {
        Path file1 = Paths.get("file1.txt");
        Path file2 = Paths.get("file2.txt");

        try {
            long output = filesCompareByByte(file1, file2);
            if (output == -1){
                System.out.println("Files are identical!");
            }else{
                System.out.println("Not Identical !!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}