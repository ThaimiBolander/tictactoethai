package se.iths.thailambo.tictactoethai;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class TicTacToeController {
    public Label label1;
    public Label label2;
    public Label label3;
    public Label label4;
    public Label label5;
    public Label label6;
    public Label label7;
    public Label label8;
    public Label label9;


    private Model model = new Model();

    public void initialize()
    {
        label1.textProperty().bind(model.cell1Property());
        label2.textProperty().bind(model.cell2Property());
        label3.textProperty().bind(model.cell3Property());
        label4.textProperty().bind(model.cell4Property());
        label5.textProperty().bind(model.cell5Property());
        label6.textProperty().bind(model.cell6Property());
        label7.textProperty().bind(model.cell7Property());
        label8.textProperty().bind(model.cell8Property());
        label9.textProperty().bind(model.cell9Property());

        playerScore.textProperty().bind(Bindings.createStringBinding(()-> Integer.toString(model.getPlayerScore()),model.playerScoreProperty()));
        computerScore.textProperty().bind(Bindings.createStringBinding(()-> Integer.toString(model.getComputerScore()),model.computerScoreProperty()));
    }

    public void labelClicked(MouseEvent mouseEvent) {
        int id = Integer.parseInt(((Label) mouseEvent.getSource()).getId().substring(5));
        model.cellClicked(id);
    }
}



//    @FXML
//    private ImageView cell1;
//    @FXML
//    private ImageView cell2;
//    @FXML
//    private ImageView cell3;
//    @FXML
//    private ImageView cell4;
//    @FXML
//    private ImageView cell5;
//    @FXML
//    private ImageView cell6;
//    @FXML
//    private ImageView cell7;
//    @FXML
//    private ImageView cell8;
//    @FXML
//    private ImageView cell9;
//
//    private Model model = new Model();
////    AudioClip buzzer = new AudioClip(getClass().getResource("Sounds/punch.mp3").toExternalForm());
//    public Model getModel(){
//        return model;
//    }
//    public void initialize(){
//    }
//    //        Initialize connects controller to model make a List of arrays(Botton)
//
//    public void image1Clicked (MouseEvent mouseEvent) {
//        model.makePlayerMove(0,0);
//
//
//    }
//
//    public void image2Clicked (MouseEvent mouseEvent) {
//        model.makePlayerMove(0,1);
//    }
//
//    public void image3Clicked (MouseEvent mouseEvent) {
//        model.makePlayerMove(0,2);
//    }
//
//    public void image4Clicked (MouseEvent mouseEvent) {
//        model.makePlayerMove(1,0);
//    }
//
//    public void image5Clicked (MouseEvent mouseEvent) {
//        model.makePlayerMove(1,1);
//    }
//
//    public void image6Clicked (MouseEvent mouseEvent) {
//        model.makePlayerMove(1,2);
//    }
//
//    public void image7Clicked (MouseEvent mouseEvent) {
//        model.makePlayerMove(2,0);
//    }
//
//    public void image8Clicked (MouseEvent mouseEvent) {
//        model.makePlayerMove(2,1);
//    }
//
//    public void image9Clicked (MouseEvent mouseEvent) {
//        model.makePlayerMove(2,2);
//    }
}