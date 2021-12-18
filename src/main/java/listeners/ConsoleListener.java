package listeners;

import ConsoleCommands.TcpSendCommand;
import ConsoleCommands.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleListener {
    public static void consoleListener(){
        new Thread(() -> {
            String line = "";
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            try {
                while ((line = reader.readLine()) != null) {
                    String[] msg = line.split("-");

                    //Insert ConsoleCommands here

                    TcpSendCommand.tcpSendCommand(line);
                    Test.test(line);

                    //
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
