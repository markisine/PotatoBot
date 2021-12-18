package ConsoleCommands;


import main.Main;

public class TcpSendCommand {
    public static void tcpSendCommand(String line) {
        if (line.startsWith("send")) {
            System.out.println("kek send");
            Main.tcpClient.sendMessage(line.substring(5));
        }
    }
}
