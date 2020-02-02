package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class Server extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
    TextArea ta = new TextArea();

    // Create a scene and place it in the stage
    Scene scene = new Scene(new ScrollPane(ta), 450, 200);
    primaryStage.setTitle("Server"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage

    new Thread(() -> {
      try {
        ServerSocket serverSocket = new ServerSocket(8000);
        Platform.runLater(() -> {
          ta.appendText("Server started at " + new Date() + '\n');
        });

        Socket socket = serverSocket.accept();

        // Create data input and output streams
        DataInputStream inputFromClient = new DataInputStream(socket.getInputStream());
        DataOutputStream outputToClient = new DataOutputStream(socket.getOutputStream());

        while (true) {
          double radius = inputFromClient.readDouble();
          double area = radius * radius * Math.PI;
          outputToClient.writeDouble(area);

          Platform.runLater(() -> {
            ta.appendText("Radius received from client: " + radius + '\n');
            ta.appendText("Area is: " + area + '\n');
          });
        }

      } catch (IOException e) {
        e.printStackTrace();
      }
    }).start();
  }
}