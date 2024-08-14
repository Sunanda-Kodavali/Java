package dci.j24e01.javafxhangmanioc;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.AudioClip;

import java.text.Collator;
import java.util.Random;

public class GameController implements EventHandler<ActionEvent>{

    @FXML
    private Label inputLabel;

    @FXML
    private VBox buttonContainer;

    @FXML
    private ImageView hangmanImageView;

    String secretPhrase = "ROAR";
    StringBuilder gamePhrase = createGamePhrase(secretPhrase);

    @FXML
    private void initialize(){



        inputLabel.setText(gamePhrase.toString());
        HBox hBox1 = createLine("QWERTYUIOP");
        HBox hBox2 = createLine("ASDFGHJKL");
        HBox hBox3 = createLine("ZXCVBNM");

        Button extrabutton = new Button();
        extrabutton.setText("Extra");
        hBox3.getChildren().add(extrabutton);

        extrabutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                extraAction();
            }
        });
        buttonContainer.getChildren().add(hBox1);
        buttonContainer.getChildren().add(hBox2);
        buttonContainer.getChildren().add(hBox3);



    }

    private void extraAction() {
        String resourcePath = "audio/wilhelm-splash-14579.mp3";
        String fullPath = String.valueOf(HangmanApplication.class.getResource(resourcePath));

        AudioClip audioClip = new AudioClip(fullPath);
        audioClip.play();
    }

    private HBox createLine(String letters){
        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        for (int i = 0; i < letters.length(); i++) {
            Button button = new Button();
            button.setText(String.valueOf(letters.charAt(i)));
            button.setOnAction(this);
            hBox.getChildren().add(button);
        }
        return hBox;
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        Button button = (Button)actionEvent.getSource();
        boolean gameOver = false;
        int lives = 6;

        while (!gameOver) {
            System.out.println("Lives: " + lives);
            System.out.println(gamePhrase);
            System.out.println("Try to guess a letter");

            String userLetter = button.getText();

            int foundLetterCounter = 0;
            for (int i = 0; i < secretPhrase.length(); i++) {
                if (isSameLetter(userLetter.charAt(0), secretPhrase.charAt(i))) {
                    gamePhrase.setCharAt(i, secretPhrase.charAt(i));
                    foundLetterCounter += 1;
                }
            }

            if (foundLetterCounter == 1) {
                System.out.printf("There is %d '%s' in the phrase\n", foundLetterCounter, userLetter);
            } else {
                System.out.printf("There are %d '%s's in the phrase\n", foundLetterCounter, userLetter);
            }

            if (foundLetterCounter == 0) {
                lives -=1 ;
                if (lives == 0) {
                    gameOver = true;
                }
            }

            if (secretPhrase.equals(gamePhrase.toString())) {
                gameOver = true;
            }
        }

        System.out.println("THE GAME IS OVER!");
        if (lives > 0) {
            System.out.println("CONGRATULATIONS YOU WON!");
            System.out.println("Lives left: " + lives);
            System.out.println("The word was: " + secretPhrase);
        } else {
            System.out.println("YOU SUCK YOU LOST!");
            System.out.println("you will never know the word... 😈");
        }

//        Random random = new Random();
//        int imageNumber = random.nextInt(0,7);
//        String filename = "hangman_" + imageNumber + ".png";
//        String resourcePath = "images/" + filename;
//        String fullPath = String.valueOf(HangmanApplication.class.getResource(resourcePath));
//        Image image = new Image(fullPath);
//        hangmanImageView.setImage(image);
    }
    public static StringBuilder createGamePhrase(String secretPhrase) {
        StringBuilder gamePhrase = new StringBuilder();
        for (int i = 0; i < secretPhrase.length(); i++) {
            if (secretPhrase.charAt(i) == ' ') {
                gamePhrase.append(" ");
            } else {
                gamePhrase.append("-");
            }
        }
        return gamePhrase;
    }

    public static boolean isSameLetter(char letterA, char letterB) {
        return isSameLetter(String.valueOf(letterA), String.valueOf(letterB));
    }

    public static boolean isSameLetter(String letterA, String letterB) {
        Collator collator = Collator.getInstance();
        collator.setStrength(Collator.PRIMARY);
//        PRIMARY strength = diacritics and cases are considered the same
//        SECONDARY strength = ignores cases but not diacritics
//        TERTIARY strength = character needs to be exactly the same


        // compare will return 0 if they are the same
        int result = collator.compare(letterA, letterB);

        if (result == 0) {
            return true;
        } else {
            return false;
        }
    }
}