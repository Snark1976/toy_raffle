## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## Информация о проекте
Необходимо написать проект, для розыгрыша в магазине игрушек. Функционал
должен содержать добавление новых игрушек и задания веса для выпадения
игрушек.
## Как сдавать проект
Для сдачи проекта необходимо создать отдельный общедоступный
репозиторий(Github, gitlub, или Bitbucket). Разработку вести в этом
репозитории, использовать пул реквесты на изменения. Программа должна
запускаться и работать, ошибок при выполнении программы быть не должно.
Программа, может использоваться в различных системах, поэтому необходимо
разработать класс в виде конструктора
## Задание
1) Напишите класс-конструктор у которого принимает минимум 3 строки,
содержащие три поля id игрушки, текстовое название и частоту выпадения
игрушки
2) Из принятой строки id и частоты выпадения(веса) заполнить минимум три
массива.
3) Используя API коллекцию: java.util.PriorityQueue добавить элементы в
коллекцию
4) Организовать общую очередь 5) Вызвать Get 10 раз и записать результат в
файл
##Подсказка:
В метод put передаете последовательно несколько строк
1 2 конструктор;
2 2 робот;
3 6 кукла.
Метод Get должен случайно вернуть либо “2”, либо “3” и соответствии с весом.
В 20% случаях выходит единица
В 20% двойка
И в 60% тройка.
## Критерии оценки
Приложение должно запускаться, записывать значения в файл.