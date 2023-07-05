package Projeto;


import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Interface extends Application {

    private Biblioteca biblioteca;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        biblioteca = new Biblioteca();

        primaryStage.setTitle("Sistema de Biblioteca");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);

        Label titleLabel = new Label("Título:");
        GridPane.setConstraints(titleLabel, 0, 0);
        TextField titleField = new TextField();
        GridPane.setConstraints(titleField, 1, 0);

        Label authorLabel = new Label("Autor:");
        GridPane.setConstraints(authorLabel, 0, 1);
        TextField authorField = new TextField();
        GridPane.setConstraints(authorField, 1, 1);

        Button addButton = new Button("Adicionar Livro");
        GridPane.setConstraints(addButton, 0, 2);
        addButton.setOnAction(e -> {
            String title = titleField.getText();
            String author = authorField.getText();
            Livro livro = new Livro(title, author);
            biblioteca.adicionarLivro(livro);
            titleField.clear();
            authorField.clear();
        });

        ListView<String> bookListView = new ListView<>();
        GridPane.setConstraints(bookListView, 0, 3, 2, 1);
        ObservableList<String> bookItems = FXCollections.observableArrayList();
        bookListView.setItems(bookItems);

        Button searchButton = new Button("Pesquisar Livro");
        GridPane.setConstraints(searchButton, 0, 4);
        searchButton.setOnAction(e -> {
            String termoPesquisa = titleField.getText();
            biblioteca.pesquisarLivro(termoPesquisa);
        });

        Button showAllButton = new Button("Exibir Livros");
        GridPane.setConstraints(showAllButton, 1, 4);
        showAllButton.setOnAction(e -> biblioteca.exibirLivros());

        grid.getChildren().addAll(titleLabel, titleField, authorLabel, authorField,
                addButton, bookListView, searchButton, showAllButton);

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}