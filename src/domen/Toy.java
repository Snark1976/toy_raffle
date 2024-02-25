package domen;

/**
 * Класс, представляющий игрушку.
 */
public class Toy {
    private int id;
    private String name;
    private double weight;

    /**
     * Конструктор для создания игрушки.
     *
     * @param id     ID игрушки
     * @param name   Название игрушки
     * @param weight Вес выпадения игрушки
     */
    public Toy(int id, String name, double weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    // Геттеры для получения значений полей

    /**
     * Получить ID игрушки.
     *
     * @return ID игрушки
     */
    public int getId() {
        return id;
    }

    /**
     * Получить название игрушки.
     *
     * @return Название игрушки
     */
    public String getName() {
        return name;
    }

    /**
     * Получить вес выпадения игрушки.
     *
     * @return Вес выпадения игрушки
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Метод для получения строкового представления объекта.
     *
     * @return Строковое представление объекта
     */
    @Override
    public String toString() {
        return "Toy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
