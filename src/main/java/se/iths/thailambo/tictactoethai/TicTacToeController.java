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
    public Label playerScore;
    public Label computerScore;


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
//int id = Integer.parseInt(((Label) mouseEvent.getSource()).getId().substring(5)); Femte plats L=1,a=2..l=5
    public void labelClicked(MouseEvent mouseEvent) {
        System.out.println("Clicked on label" + ((Label) mouseEvent.getSource()).getId());
        int id = Integer.parseInt(((Label) mouseEvent.getSource()).getId().substring(5));
        model.cellClicked(id);
    }
}


