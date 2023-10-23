import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class WeatherApp extends JFrame {
        public  WeatherApp(){
            super("Weather App"); /// title // setTitle("Weather App");
            setDefaultCloseOperation(EXIT_ON_CLOSE); /// what to do when closed

            setSize(500,500);

            setLocationRelativeTo(null);    // ?? -> centrate to the middle of the screen if #null

            setLayout(null);    // null to  be able to position manually elemnts in GUI

            setResizable(false); // can't resize anymore

            addGuiComponents();

        }

        private void addGuiComponents(){

            JTextField searchText = new JTextField(); // search field (where we put input)

            searchText.setBounds(15,15,300,40);

            searchText.setFont(new Font("Magneto Bold",Font.PLAIN,30));
            add(searchText);

            JButton searchButton = new JButton(loadImage("assets/search.png"));
            
            searchButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            searchButton.setBounds(325,15,40,40);

            add(searchButton);

        }
        // we put images in GUI comp
        private ImageIcon loadImage(String imagePath ){

            try {
                BufferedImage image = ImageIO.read(new File(imagePath));
                return new ImageIcon(image);
            }catch (IOException e){
                    e.printStackTrace();
            }
            System.out.println("Couldn't find file path");
            return null;
        }

}
