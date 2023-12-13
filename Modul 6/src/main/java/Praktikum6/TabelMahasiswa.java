package Praktikum6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TabelMahasiswa extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TableView tabel = new TableView();
        TableColumn <Mahasiswa, String> kolom1 = new TableColumn<>("NIM");
        kolom1.setCellValueFactory(
                new PropertyValueFactory<>("nim"));
        TableColumn <Mahasiswa, String> kolom2 = new TableColumn<>("Nama");
        kolom2.setCellValueFactory(
                new PropertyValueFactory<>("nama"));

        tabel.getColumns().add(kolom1);
        tabel.getColumns().add(kolom2);

        tabel.getItems().add(
                new Mahasiswa(1, "221081721001","Thoma" ));
        tabel.getItems().add(
                new Mahasiswa(2, "221081732003","Aria"));
        tabel.getItems().add(
                new Mahasiswa(3, "221081711021", "Raisa"));
        tabel.getItems().add(
                new Mahasiswa(4, "221081721004", "Phillip"));
        tabel.getItems().add(
                new Mahasiswa(5, "221081731005", "Anissa"));
        tabel.getItems().add(
                new Mahasiswa(6, "221081721006", "Azkia"));
        tabel.getItems().add(
                new Mahasiswa(7, "221081722015", "Irfan"));
        tabel.getItems().add(
                new Mahasiswa(8, "221081711003", "Lili"));
        tabel.getItems().add(
                new Mahasiswa(9, "221081731012", "Ilya"));
        tabel.getItems().add(
                new Mahasiswa(10, "221081722005", "Stark"));

        VBox box = new VBox(tabel);
        Scene scene = new Scene(box);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}