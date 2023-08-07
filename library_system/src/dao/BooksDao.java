package dao;

import java.sql.Date;
import java.util.List;

import po.Books;

public interface BooksDao {


    List<Books> getAllBooks();

    Books getBooksById(int id);

    Books getBooksByIsbn(String isbn);

    List<Books> getBooksByTitle(String title);

    List<Books> getBooksByPublisher(String publisher);

    List<Books> getBooksByPublicationDate(Date date);

    List<Books> getBooksByStatus(String status);

    int updateBooks(Books book);

    int insertBooks(Books book);

    int deleteBooks(Books book);

}