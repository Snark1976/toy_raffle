package services;

import java.util.PriorityQueue;

import domen.Toy;

public class ToyRaffle {
    private PriorityQueue<Toy> toyQueue;

    /**
     * Конструктор для создания лотереи игрушек.
     *
     * @param toyStrings Массив строк с информацией о каждой игрушке
     */
    public ToyRaffle(String[] toyStrings) {
        toyQueue = new PriorityQueue<>((t1, t2) -> Double.compare(t1.getWeight(), t2.getWeight()));

        // Заполнение PriorityQueue игрушками
        for (String toyString : toyStrings) {
            addToyToRaffle(toyString);
        }
    }

    /**
     * Метод для получения очередной игрушки.
     *
     * @return ID игрушки
     */
    public Toy getToy() {
        return toyQueue.poll();
    }
    
    /**
     * Метод для добавления игрушки в розыгрыш. 
     * Добавляется count игрушек, каждая из них получает при добавлении случайный вес.
     * Вес в дальнейшем влияет на порядок выпадения игрушек
     * @param toyString Строка формата "{id} {count} {name}". Пример "3 6 кукла"
     */
    public void addToyToRaffle(String toyString)
    {
        String[] parts = toyString.split(" ");
        int id = Integer.parseInt(parts[0]);
        int count = Integer.parseInt(parts[1]);
        String name = parts[2];
        for (int i = 0; i < count; i++)
        {
            Toy toy = new Toy(id, name, Math.random());
            toyQueue.offer(toy);
        }
    }
}
