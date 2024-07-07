package my.tools;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "app", mixinStandardHelpOptions = true, version = "1.0",
        description = "An example Picocli application.")
public class Menu implements Runnable {

    @Option(names = {"-n", "--name"}, description = "Your name")
    private String name;

    public static void main(String[] args) {
        int exitCode = new CommandLine(new Menu()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public void run() {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Hello, World!");
        } else {
            System.out.println("Hello, " + name + "!");
        }
    }
}
