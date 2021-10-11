import java.io.File;

public class Main {
    public final static String PATH = "F:/Trainings";

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        showDirectoryContents(new File(PATH), "");
    }

    public static void showDirectoryContents(File f, String prefix) {
        if (f.isDirectory()) {
            for (File file : f.listFiles()) {
                if (file.isFile()) {
                    System.out.println(prefix + file.getName());
                } else {
                    System.out.println(prefix + "Directory " + file.getName() + ":");
                    showDirectoryContents(file, prefix + "          ");
                }
            }
        }
    }
}