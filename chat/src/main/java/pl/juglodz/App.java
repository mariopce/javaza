package pl.juglodz;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JFrame;

public class App {

    /**
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        
        ApplicationWindow applicationWindow = new ApplicationWindow();
        applicationWindow.showApp();
        
    }

}
