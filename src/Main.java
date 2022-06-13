public class Main {
    public static void main(String[] args) {

//   Задание 1

//        1. Необходимо создать класс Book, который содержит в себе данные об имени, авторе и годе публикации.
//        Типы полей должны быть String, Author (который мы создадим  в п. 2) и int.

//        2. Необходимо создать класс Author, который содержит в себе данные об имени и фамилии автора.

//        3. Написать конструкторы для обоих классов, заполняющие все поля.

//        4. Создать геттеры для всех полей автора и всех полей книги.

//        5. Создать сеттер для поля «Год публикации» у книги.

//        6. В методе main создать несколько объектов Книга (достаточно двух) и несколько объектов Автор (достаточно тоже двух)
//        и инициализировать друг друга.
//        Учесть, что авторы являются обязательными членами книг и книги не могут создаться без авторов.
//        Метод main не должен находиться в классах Book и Author.
//        Требуется создать отдельный класс для запуска приложения и объявить метод main в нем.

//        7. В том же методе main изменить год публикации одной из книг с помощью сеттера.

        Author author1 = new Author("Александр", "Пушкин");
        Book book1 = new Book("Капитанская дочка", author1, 1836);


        Author author2 = new Author("Антон", "Чехов");
        Book book2 = new Book("Хамелеон", author2, 1884);


        System.out.println(book1.getBookName() + " " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getSecondName() + " " + book1.getPublishedYear());

        book1.setPublishedYear(1990);
        System.out.println(book1.getBookName() + " " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getSecondName() + " " + book1.getPublishedYear());


        System.out.println(book2.getBookName() + " " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getSecondName() + " " + book2.getPublishedYear());
        book2.setPublishedYear(1985);
        System.out.println(book2.getBookName() + " " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getSecondName() + " " + book2.getPublishedYear());




    }
}