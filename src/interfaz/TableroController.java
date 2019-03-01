
	package interfaz;

	import java.net.URL;
	import java.util.ResourceBundle;
	import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
	import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import model.TableroMagico;

	public class TableroController {
		
		public static final  int TAM_GRID=400;

	    @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private TextField size;

	    @FXML
	    private SplitMenuButton side;

	    @FXML
	    private SplitMenuButton orientation;

	    @FXML
	    private Button generate;
	    
	    @FXML 
	    private GridPane grid;

	    @FXML
	    private MenuItem sideLeft;

	    @FXML
	    private MenuItem sideRight;

	    @FXML
	    private MenuItem sideUp;

	    @FXML
	    private MenuItem sideDown;
	   
	    @FXML
	    private MenuItem noresteRight;

	    @FXML
	    private MenuItem noresteUp;

	    @FXML
	    private MenuItem noroesteUp;

	    @FXML
	    private MenuItem noroesteLeft;

	    @FXML
	    private MenuItem suroesteLeft;

	    @FXML
	    private MenuItem suroesteDown;

	    @FXML
	    private MenuItem suresteDown;

	    @FXML
	    private MenuItem suresteRight;
	    
	    private TableroMagico tablero;
	    

	    @FXML
	    void generateTable() {
	    	
	    	grid.getChildren().clear();
	    	grid.getColumnConstraints().clear();
	    	grid.getRowConstraints().clear();
	    	
	    	int sizeNumber= Integer.parseInt(size.getText());
	    	
	    	tablero= new TableroMagico(sizeNumber);
	    	
	    	if (sizeNumber%2!=0) {
	    		
	    		for (int i = 0; i < sizeNumber; i++) {
					ColumnConstraints column =new ColumnConstraints(TAM_GRID/sizeNumber);
					RowConstraints row= new RowConstraints(TAM_GRID/sizeNumber);
					grid.getColumnConstraints().add(column);
					grid.getRowConstraints().add(row);
				}
	    		grid.setGridLinesVisible(true);
	    		for (int i = 0; i < sizeNumber; i++) {
	    			for (int j = 0; j < sizeNumber; j++) {
	    				Label labelcito=new Label();
		    			labelcito.setId(i+"");
		    			labelcito.setPrefHeight(TAM_GRID/sizeNumber-2);
		    			labelcito.setPrefWidth(TAM_GRID/sizeNumber-2);
		    			labelcito.setStyle("-fx-font-size: 10px; -fx-text-fill: white;-fx-alignment:center;");
		    			

						grid.add(labelcito,i,j);
					}
				}
	    		

				
			}else {
				Alert  alerta= new Alert(Alert.AlertType.ERROR);
				alerta.setHeaderText("Digitò un numero par");
				alerta.setTitle("Error al generar el cuadrado magico");
				alerta.setContentText("El cuadrado magico solo es generado de orden impar, por favor ingrase un numero par");
				alerta.show();
			}
	    }
	    
	    
	    @FXML
	    void stablishNERight(ActionEvent event) {
	    	tablero.fillDiagonalNERight(-1);
	    	for (int i = 0; i < tablero.getTablero().length; i++) {
				for (int j = 0; j < tablero.getTablero().length; j++) {
					Label labeli=(Label)grid.getChildren().get((tablero.getNumero()*j)+i);
					labeli.setText(tablero.getTablero()[i][j]+"");
				}
			}
	    	
	    }



	    @FXML
	    void stablishNEUp(ActionEvent event) {
	    	tablero.fillDiagonalNEUp(-1);
	    	for (int i = 0; i < tablero.getTablero().length; i++) {
				for (int j = 0; j < tablero.getTablero().length; j++) {
					Label labeli=(Label)grid.getChildren().get((tablero.getNumero()*j)+i);
					labeli.setText(tablero.getTablero()[i][j]+"");
				}
			}
	    	
	    }
	    	
	   
	    

	    @FXML
	    void stablishNOLeft(ActionEvent event) {
	    	tablero.fillDiagonalNOLeft(-1);
	    	for (int i = 0; i < tablero.getTablero().length; i++) {
				for (int j = 0; j < tablero.getTablero().length; j++) {
					Label labeli=(Label)grid.getChildren().get((tablero.getNumero()*j)+i);
					labeli.setText(tablero.getTablero()[i][j]+"");
				}
			}
	    	
	    }

	    @FXML
	    void stablishNOUp(ActionEvent event) {
	      	tablero.fillDiagonalNOUp(-1);
	    	for (int i = 0; i < tablero.getTablero().length; i++) {
				for (int j = 0; j < tablero.getTablero().length; j++) {
					Label labeli=(Label)grid.getChildren().get((tablero.getNumero()*j)+i);
					labeli.setText(tablero.getTablero()[i][j]+"");
				}
			}
	    	
	    }

	    @FXML
	    void stablishSEDown(ActionEvent event) {

	    }

	    @FXML
	    void stablishSERight(ActionEvent event) {
	    	tablero.fillDiagonalSERight(1);
	    	for (int i = 0; i < tablero.getTablero().length; i++) {
				for (int j = 0; j < tablero.getTablero().length; j++) {
					Label labeli=(Label)grid.getChildren().get((tablero.getNumero()*j)+i);
					labeli.setText(tablero.getTablero()[i][j]+"");
				}
			}
	    
	    }

	    @FXML
	    void stablishSODown(ActionEvent event) {

	    }

	    @FXML
	    void stablishSOLeft(ActionEvent event) {
	    	tablero.fillDiagonalSOLeft(-1);
	    	for (int i = 0; i < tablero.getTablero().length; i++) {
				for (int j = 0; j < tablero.getTablero().length; j++) {
					Label labeli=(Label)grid.getChildren().get((tablero.getNumero()*j)+i);
					labeli.setText(tablero.getTablero()[i][j]+"");
				}
			}
	    
	    }

	  
	    @FXML
	    void stablishSideDown(ActionEvent event) {
	    	side.setText("Abajo");
	       	noroesteLeft.setVisible(false);
	    	noroesteUp.setVisible(false);
	    	suroesteLeft.setVisible(false);
	    	suroesteDown.setVisible(true);
	    	noresteUp.setVisible(false);
	    	noresteRight.setVisible(false);
	    	suresteDown.setVisible(true);
	    	suresteRight.setVisible(false);
	    	
	    	tablero.establecerTechoInferior();
	    }

	    @FXML
	    void stablishSideLeft(ActionEvent event) {
	    	side.setText("Izquierda");
	       	noroesteLeft.setVisible(true);
	    	noroesteUp.setVisible(false);
	    	suroesteLeft.setVisible(true);
	    	suroesteDown.setVisible(false);
	    	noresteUp.setVisible(false);
	    	noresteRight.setVisible(false);
	    	suresteDown.setVisible(false);
	    	suresteRight.setVisible(false);
	    	
	    	tablero.establecerLateralIzquierdo();
	    }

	    @FXML
	    void stablishSideRight(ActionEvent event) {
	    	side.setText("Derecha");
	    	noroesteLeft.setVisible(false);
	    	noroesteUp.setVisible(false);
	    	suroesteLeft.setVisible(false);
	    	suroesteDown.setVisible(false);
	    	noresteUp.setVisible(false);
	    	noresteRight.setVisible(true);
	    	suresteDown.setVisible(false);
	    	suresteRight.setVisible(true);
	    	
	    	tablero.establecerLateralDerecho();
	    }

	    @FXML
	    void stablishSideUp(ActionEvent event) {
	    	side.setText("Arriba");
	       	noroesteLeft.setVisible(false);
	    	noroesteUp.setVisible(true);
	    	suroesteLeft.setVisible(false);
	    	suroesteDown.setVisible(false);
	    	noresteUp.setVisible(true);
	    	noresteRight.setVisible(false);
	    	suresteDown.setVisible(false);
	    	suresteRight.setVisible(false);
	    	
	    	tablero.establecerTechoSuperior();
	    }
	    
	    

	    @FXML
	    void initialize() {
	        

	    }
	}


	

