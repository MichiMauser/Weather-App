import javax.swing.*;

public class Launcher {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {     /// invokeLater for multi threading -> using only one thread or running in one thread
            @Override
            public void run() {
                WeatherApp application = new WeatherApp();
                application.setVisible(true);
            }
        });

    }
}