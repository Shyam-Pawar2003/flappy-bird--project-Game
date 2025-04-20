import javax.swing.*;

public class FlappyGameLauncher {
    public static void main(String[] args) {
        final int WIDTH = 360;
        final int HEIGHT = 640;

        // Create the main window
        JFrame gameWindow = new JFrame();
        gameWindow.setTitle("Flappy Bird Clone");
        gameWindow.setSize(WIDTH, HEIGHT);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.setLocationRelativeTo(null); // Center on screen
        gameWindow.setResizable(false);

        // Create and add the game panel
        FlappyBird gamePanel = new FlappyBird();
        gameWindow.getContentPane().add(gamePanel);
        gameWindow.pack(); // Adjusts frame to fit panel size
        gamePanel.requestFocusInWindow(); // Ensure panel can receive key input

        gameWindow.setVisible(true); // Show the window
    }
}
//import javax.swing.*;

//public class App {
 //   public static void main(String[] args) throws Exception {
 //       int boardWidth = 360;
  //      int boardHeight = 640;

   //     JFrame frame = new JFrame("Flappy Bird");
        // frame.setVisible(true);
	//	frame.setSize(boardWidth, boardHeight);
    //    frame.setLocationRelativeTo(null);
      //  frame.setResizable(false);
       // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     //   FlappyBird flappyBird = new FlappyBird();
     //   frame.add(flappyBird);
     //   frame.pack();
      //  flappyBird.requestFocus();
      //  frame.setVisible(true);
//    }
//}
  
