package main;

import ConsoleCommands.TcpSendCommand;
import ConsoleCommands.Test;
import de.m.mapi.tcp.TcpClient;
import listeners.ConsoleListener;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.TextChannel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

public class Main {
    public static TcpClient tcpClient;
    public static void main(String[] args) {
        ConsoleListener.consoleListener();

        tcpClient = new TcpClient("", (short) 9999);

        try {
            tcpClient.start();
            tcpClient.sendMessage("kekstart");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}