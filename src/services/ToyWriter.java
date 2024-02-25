package services;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import domen.Toy;

/**
 * Класс, предназначенный для записи информации об игрушках в файл.
 */
public class ToyWriter {
    private String filename;

    /**
     * Конструктор класса ToyWriter.
     *
     * @param filename имя файла, в который будет производиться запись информации об игрушках
     */
    public ToyWriter(String filename) {
        this.filename = filename;
        clearFile();
    }

    /**
     * Метод для записи информации об игрушке в файл.
     *
     * @param toy объект типа Toy, информация о котором будет записана в файл
     */
    public void writeToFile(Toy toy) throws IllegalArgumentException{
        if (toy == null) {
            throw new IllegalArgumentException("Ошибка: передан null объект игрушки.");
        }
        try {
            FileWriter fileWriter = new FileWriter(filename, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(toy.toString());
            printWriter.close();
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл " + filename + ": " + e.getMessage());
        }
    }

    /**
     * Метод для очистки содержимого файла.
     */
    private void clearFile() {
        try {
            FileWriter fileWriter = new FileWriter(filename, false);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.close();
        } catch (IOException e) {
            System.out.println("Ошибка при очистке файла " + filename + ": " + e.getMessage());
        }
    }
}