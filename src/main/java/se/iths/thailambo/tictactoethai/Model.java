package se.iths.thailambo.tictactoethai;

import javafx.beans.property.*;
import javafx.scene.control.Label;
import javafx.scene.image.Image;

public class Model {
    StringProperty cell1 = new SimpleStringProperty("");
    StringProperty cell2 = new SimpleStringProperty("");
    StringProperty cell3 = new SimpleStringProperty("");
    StringProperty cell4 = new SimpleStringProperty("");
    StringProperty cell5 = new SimpleStringProperty("");
    StringProperty cell6 = new SimpleStringProperty("");
    StringProperty cell7 = new SimpleStringProperty("");
    StringProperty cell8 = new SimpleStringProperty("");
    StringProperty cell9 = new SimpleStringProperty("");

    IntegerProperty playerScore = new SimpleIntegerProperty(0);
    IntegerProperty computerScore = new SimpleIntegerProperty(0);

    public int getPlayerScore () {
        return playerScore.get();
    }

    public IntegerProperty playerScoreProperty () {
        return playerScore;
    }

    public void setPlayerScore (int playerScore) {
        this.playerScore.set(playerScore);
    }

    public int getComputerScore () {
        return computerScore.get();
    }

    public IntegerProperty computerScoreProperty () {
        return computerScore;
    }

    public void setComputerScore (int computerScore) {
        this.computerScore.set(computerScore);
    }

    public boolean isGameOver () {
        return gameOver;
    }

    public void setGameOver (boolean gameOver) {
        this.gameOver = gameOver;
    }

    public String getCurrentPlayer () {
        return currentPlayer;
    }

    public void setCurrentPlayer (String currentPlayer) {
        this.currentPlayer = currentPlayer;
    }


    boolean gameOver = false;

    String currentPlayer = "X";
    static final String PLAYER = "X";
    static final String COMPUTER = "O";



    public void cellClicked (int id) {
        if (gameOver)
            prepareNextRound();


            return;
        if (!cellValue(id).isEmpty())
            return;

        switch (id) {
            case 1 -> setCell1("currentPlayer");
            case 2 -> setCell2("currentPlayer");
            case 3 -> setCell3("currentPlayer");
            case 4 -> setCell4("currentPlayer");
            case 5 -> setCell5("currentPlayer");
            case 6 -> setCell6("currentPlayer");
            case 7 -> setCell7("currentPlayer");
            case 8 -> setCell8("currentPlayer");
            case 9 -> setCell9("currentPlayer");
        }
        checkForGameOver();
        changeCurrentPlayer();

    }

    private void prepareNextRound () {
    }

    private void changeCurrentPlayer(){
    }

    private String cellValue (int id) {
        return switch (id) {
            case 1 -> getCell1();
            case 2 -> getCell2();
            case 3 -> getCell3();
            case 4 -> getCell4();
            case 5 -> getCell5();
            case 6 -> getCell6();
            case 7 -> getCell7();
            case 8 -> getCell8();
            case 9 -> getCell9();
            default -> "";
        };
    }

    private void checkForGameOver(){
        for (int i = 0; i < 10; i++) {
            if (cellValue(i).isEmpty()) {
                gameOver = false;
                break;
            }
        }
        if (cellValue(1) == cellValue(2) && cellValue(2) == cellValue(3))
        gameOver = true;
        else if (cellValue(4) == cellValue(5)) {

        }
    }
//  Check for 3 in a row

    for (var ids : possibleWins) {
        if (!cellValue(ids[0]).isEmpty()
                && cellValue([0]).equals(cellValue(ids[1]))
                && cellValue([1]).equals(cellValue(ids[2])) {
            gameOver = true;
            return;
        }
    }

    static final int[][] possibleWins = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {1,4,7},
            {2,5,8},
            {3,6,9},
            {1,5,9},
            {3,5,7}
    };








//    public int board[];
//    private final int player = 1;
//    private final int computer = -1;
//    private final int empty = 0;
//    private int currentPlayer = player;
//
//    public int turns = 0;


    public Model () {


        //    private Image imageEmpty;
//    private Image imagePlayerO;
//    private Image imagePlayerX;
//    private ObjectProperty<Image> first;
//    private ObjectProperty<Image> second;
//    private ObjectProperty<Image> third;
//    private ObjectProperty<Image> forth;
//    private ObjectProperty<Image> fifth;
//    private ObjectProperty<Image> sixth;
//    private ObjectProperty<Image> seventh;
//    private ObjectProperty<Image> eight;
//    private ObjectProperty<Image> ninth;
//
////    private List<ObjectProperty<Image>> images = List.of(first,second,third,forth,fifth,sixth,seventh,eight,ninth);
//
//    private StringProperty score = new SimpleStringProperty("0 points");
//    private int yourScore;
//    private int drawCount = 0;
//
//    public Model () {
//        // Initialize your images
//        imageEmpty = new Image(getClass().getResource("images/empty.png").toExternalForm());
//        imagePlayerX = new Image(getClass().getResource("images/playerO.png").toExternalForm());
//        imagePlayerO = new Image(getClass().getResource("images/playerX.png").toExternalForm());
//
//        first = new SimpleObjectProperty<>(imageEmpty);
//        second = new SimpleObjectProperty<>(imageEmpty);
//        third = new SimpleObjectProperty<>(imageEmpty);
//        forth = new SimpleObjectProperty<>(imageEmpty);
//        fifth = new SimpleObjectProperty<>(imageEmpty);
//        sixth = new SimpleObjectProperty<>(imageEmpty);
//        seventh = new SimpleObjectProperty<>(imageEmpty);
//        eight = new SimpleObjectProperty<>(imageEmpty);
//        ninth = new SimpleObjectProperty<>(imageEmpty);
//    }
//        // Initialize the board
//        Image[][] board = new Image[3][3];
//        public void makePlayerMove (int row, int col){
//            if (row == 0 && col == 0 && first.get() == imageEmpty) {
//                first.set(imagePlayerX);
//            } else if (row == 0 && col == 1 && second.get() == imageEmpty) {
//                second.set(imagePlayerX);
//            } else if (row == 0 && col == 2 && third.get() == imageEmpty) {
//                third.set(imagePlayerX);
//            } else if (row == 1 && col == 0 && forth.get() == imageEmpty) {
//                forth.set(imagePlayerX);
//            } else if (row == 1 && col == 1 && fifth.get() == imageEmpty) {
//                fifth.set(imagePlayerX);
//            } else if (row == 1 && col == 2 && sixth.get() == imageEmpty) {
//                sixth.set(imagePlayerX);
//            } else if (row == 2 && col == 0 && seventh.get() == imageEmpty) {
//                seventh.set(imagePlayerX);
//            } else if (row == 2 && col == 1 && eight.get() == imageEmpty) {
//                eight.set(imagePlayerX);
//            } else if (row == 2 && col == 2 && ninth.get() == imageEmpty) {
//                ninth.set(imagePlayerX);
//            }
//
//            if (board[row][col].equals(imageEmpty)) {
//                board[row][col] = imagePlayerX;
//
//            }
//        }
//        public void makeComputerMove(int row, int col){
//            if (board[row][col].equals(imageEmpty)) {
//                board[row][col] = imagePlayerO;
//            }
//        }
//        public boolean checkForWin () {
//            for (int i = 0; i < 3; i++) {
//                if (checkRowCol(board[i][0], board[i][1], board[i][2]) || checkRowCol(board[0][i], board[1][i] , board[2][i])) {
//                    return true;
//                }
//            }
//            return checkRowCol(board[0][0] , board[1][1] , board[2][2]) || checkRowCol(board[0][2] , board[1][1] , board[2][0]);
//        }
//        public void resetBoard () {
//            for (int row = 0; row < 3; row++) {
//                for (int col = 0; col < 3; col++) {
//                    board[row][col] = (imageEmpty);
//                }
//            }
//        }
//
//        private boolean checkRowCol
//        (Image cell1 , Image cell2 , Image cell3){
//            return cell1 != imageEmpty && cell1 == cell2 && cell1 == cell3;
//        }
//        public String getScore () {
//            return score.get();
//        }
//
//        public StringProperty scoreProperty () {
//            return score;
//        }
//
//        public void setScore (String score){
//            this.score.set(score);
//        }
//        public void setYourScore ( int yourScore){
//            this.yourScore = yourScore;
//        }
//        public void clickAndGetPoints () {
//            if (checkForWin()) {
//                if (getScore().equals("It's a draw!")) {
//                    drawCount++;
//                    setScore("It's a draw! (Draws: " + drawCount + ")");
//                } else {
//                    yourScore++;
//                }
//            }
//            yourScore++;
//            setScore(yourScore + " points");
//            resetBoard();
//        }
//
//
//    public Image getFirst () {
//        return first.get();
//    }
//
//    public ObjectProperty<Image> firstProperty () {
//        return first;
//    }
//
//    public void setFirst (Image first) {
//        this.first.set(first);
//    }
//
//    public Image getSecond () {
//        return second.get();
//    }
//
//    public ObjectProperty<Image> secondProperty () {
//        return second;
//    }
//
//    public void setSecond (Image second) {
//        this.second.set(second);
//    }
//
//    public Image getThird () {
//        return third.get();
//    }
//
//    public ObjectProperty<Image> thirdProperty () {
//        return third;
//    }
//
//    public void setThird (Image third) {
//        this.third.set(third);
//    }
//
//    public Image getForth () {
//        return forth.get();
//    }
//
//    public ObjectProperty<Image> forthProperty () {
//        return forth;
//    }
//
//    public void setForth (Image forth) {
//        this.forth.set(forth);
//    }
//
//    public Image getFifth () {
//        return fifth.get();
//    }
//
//    public ObjectProperty<Image> fifthProperty () {
//        return fifth;
//    }
//
//    public void setFifth (Image fifth) {
//        this.fifth.set(fifth);
//    }
//
//    public Image getSixth () {
//        return sixth.get();
//    }
//
//    public ObjectProperty<Image> sixthProperty () {
//        return sixth;
//    }
//
//    public void setSixth (Image sixth) {
//        this.sixth.set(sixth);
//    }
//
//    public Image getSeventh () {
//        return seventh.get();
//    }
//
//    public ObjectProperty<Image> seventhProperty () {
//        return seventh;
//    }
//
//    public void setSeventh (Image seventh) {
//        this.seventh.set(seventh);
//    }
//
//    public Image getEight () {
//        return eight.get();
//    }
//
//    public ObjectProperty<Image> eightProperty () {
//        return eight;
//    }
//
//    public void setEight (Image eight) {
//        this.eight.set(eight);
//    }
//
//    public Image getNinth () {
//        return ninth.get();
//    }
//
//    public ObjectProperty<Image> ninthProperty () {
//        return ninth;
//    }
//
//    public void setNinth (Image ninth) {
//        this.ninth.set(ninth);
//    }
    }

    public String getCell1 () {
        return cell1.get();
    }

    public StringProperty cell1Property () {
        return cell1;
    }

    public void setCell1 (String cell1) {

    }

    public String getCell2 () {
        return cell2.get();
    }

    public StringProperty cell2Property () {
        return cell2;
    }

    public void setCell2 (String cell2) {
        this.cell2.set(cell2);
    }

    public String getCell3 () {
        return cell3.get();
    }

    public StringProperty cell3Property () {
        return cell3;
    }

    public void setCell3 (String cell3) {
        this.cell3.set(cell3);
    }

    public String getCell4 () {
        return cell4.get();
    }

    public StringProperty cell4Property () {
        return cell4;
    }

    public void setCell4 (String cell4) {
        this.cell4.set(cell4);
    }

    public String getCell5 () {
        return cell5.get();
    }

    public StringProperty cell5Property () {
        return cell5;
    }

    public void setCell5 (String cell5) {
        this.cell5.set(cell5);
    }

    public String getCell6 () {
        return cell6.get();
    }

    public StringProperty cell6Property () {
        return cell6;
    }

    public void setCell6 (String cell6) {
        this.cell6.set(cell6);
    }

    public String getCell7 () {
        return cell7.get();
    }

    public StringProperty cell7Property () {
        return cell7;
    }

    public void setCell7 (String cell7) {
        this.cell7.set(cell7);
    }

    public String getCell8 () {
        return cell8.get();
    }

    public StringProperty cell8Property () {
        return cell8;
    }

    public void setCell8 (String cell8) {
        this.cell8.set(cell8);
    }

    public String getCell9 () {
        return cell9.get();
    }

    public StringProperty cell9Property () {
        return cell9;
    }

    public void setCell9 (String cell9) {
        this.cell9.set(cell9);
    }
}




