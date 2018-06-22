package de.sbmltab.view;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.InputEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;
import de.sbmltab.controller.*;


public class MenuController implements Initializable
{
	 @FXML
	  void initialize() {
		 
	 }
    //Generates a MenuBar as discussed in the GUI-Concept
	public static MenuBar generateMenuBar (){
		
        MenuBar menuBar = new MenuBar();
        
        //  Menus needed
        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        Menu viewMenu = new Menu("View");
        Menu helpMenu = new Menu("Help");
        
        // Menu-Items needed
          //file
        MenuItem newItem = new MenuItem("New");
        MenuItem openItem = new MenuItem("Open");
        MenuItem saveItem = new MenuItem("Save");
        MenuItem exitItem = new MenuItem("Exit");
        MenuItem exportItem = new MenuItem("Export");
        MenuItem importItem = new MenuItem("Import");
          //edit
        MenuItem copyItem = new MenuItem("Copy");
        MenuItem cutItem = new MenuItem("Cut");
        MenuItem pasteItem = new MenuItem("Paste");
        MenuItem undoItem = new MenuItem("Undo");
        MenuItem redoItem = new MenuItem("Redo");
          //View
        MenuItem columnsShownItem = new MenuItem("Columns shown");
        MenuItem hideColumnsItem = new MenuItem("Hide Columns");
        MenuItem showHiddenColumnsItem = new MenuItem("Show hidden columns");
        
        // Arranging Menu-Items in the right order
        fileMenu.getItems().addAll(newItem, openItem, importItem, exportItem, saveItem, exitItem );
        editMenu.getItems().addAll(undoItem, redoItem, copyItem, cutItem, pasteItem);
        viewMenu.getItems().addAll(columnsShownItem, hideColumnsItem, showHiddenColumnsItem);
        
        menuBar.getMenus().addAll(fileMenu, editMenu, viewMenu, helpMenu);
        
        //define Keyboard shortcuts
        newItem.setAccelerator(KeyCombination.keyCombination("Ctrl+N"));
        openItem.setAccelerator(KeyCombination.keyCombination("Ctrl+O"));
        saveItem.setAccelerator(KeyCombination.keyCombination("Ctrl+S"));
        undoItem.setAccelerator(KeyCombination.keyCombination("Ctrl+Z"));
        redoItem.setAccelerator(KeyCombination.keyCombination("Ctrl+Y"));
        copyItem.setAccelerator(KeyCombination.keyCombination("Ctrl+C"));
        cutItem.setAccelerator(KeyCombination.keyCombination("Ctrl+X"));
        pasteItem.setAccelerator(KeyCombination.keyCombination("Ctrl+V"));

        return menuBar;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	//file MenuItems:

	@FXML
	private MenuItem NewItem; 
	
	@FXML
	private MenuItem OpenItem;

	@FXML  
	private MenuItem SaveItem;
	
	@FXML	  
	private MenuItem QuitItem;
	
	@FXML
	private MenuItem ImportItem; 
	
	@FXML
	private MenuItem ExportItem; 
	
	@FXML
	private MenuItem ValidateItem;
	
//edit MenuItems:
	@FXML
	private MenuItem UndoItem; 
	
	@FXML
	private MenuItem RedoItem;
	
	@FXML
	private MenuItem CopyItem; 
	
	@FXML
	private MenuItem PasteItem;

	@FXML  
	private MenuItem CutItem;
	
//view MenuItems:
	@FXML
	private MenuItem FieldSizeItem; 
	
	@FXML
	private MenuItem HideColumnsItem;
	
	@FXML
	private MenuItem ShowHiddenColumnsItem; 

//Help MenuItems:
	@FXML
	private MenuItem DocumentationItem;

	@FXML
	private MenuItem WebSearchItem;

      //file menu action Methods:
	
	  @FXML
	  void doNew(ActionEvent event) {
	    handleNew();
	  }	
	  @FXML
	  void doOpen(ActionEvent event) {
	    handleOpen();
	  }

	  @FXML
	  void doSave(ActionEvent event) {

	    handleSave();
	  }
	  
	  @FXML
	  void doImport(ActionEvent event) {
	  }
	  
	  @FXML
	  void doExport(ActionEvent event) {
	    
	  }
	  
	  @FXML
	  void doValidate(ActionEvent event) {
	  }

	  @FXML
	  void doQuit(ActionEvent event) {
	    
	    //TODO: Check for unsaved changes
	    
	    System.exit(0);
	  }
	  
	  //edit menu action methods
	  @FXML
	  void doUndo(ActionEvent event) {

	  }
	  
	  @FXML
	  void doRedo(ActionEvent event) {

	  }
	  
	  @FXML
	  void doCopy(ActionEvent event) {

	  }
	  
	  @FXML
	  void doPaste(ActionEvent event) {
	  }
	  
	  @FXML
	  void doCut(ActionEvent event) {
	  }
	  	  
//View menu action methods:
	  @FXML
	  void doFieldSize(ActionEvent event) {
	  }
	  
	  @FXML
	  void doHideColumns(ActionEvent event) {
	  }
	  
	  @FXML
	  void doShowHiddenColumns(ActionEvent event) {
	  }
//Help menu action methods:
	  
	  @FXML
	  void doDocumentation(ActionEvent event) {
	  }
	  
	  @FXML
	  void doWebSearch(ActionEvent event) {
	  }

//Handler methods:
	  
	  private void handleNew() {
		    
	  }
	  
	  
	  private void handleOpen() {
		  SBMLTabController.open();
	    
	    
	  }
	  

	  private void handleSave() {
	    
	  }
	


   
}
