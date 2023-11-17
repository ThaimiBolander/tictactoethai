module se.iths.thailambo.tictactoethai {
    requires javafx.controls;
    requires javafx.fxml;


    opens se.iths.thailambo.tictactoethai to javafx.fxml;
    exports se.iths.thailambo.tictactoethai;
}