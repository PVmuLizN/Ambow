package service;

import java.sql.Date;
import java.util.List;

import po.Books;

public interface BooksService {
    /**
     * @author weihuanchun
     * @category query(select)
     * @param Books attributes
     * @return a list of books
     * 
     */
    List<Books> queryAllBooks();

    Books queryBooksById(int id);

    Books queryBooksByIsbn(String isbn);

    List<Books> queryBooksByTitle(String title);

    List<Books> queryBooksByPublisher(String publisher);

    List<Books> queryBooksByPublicationDate(Date date);

    List<Books> queryBooksByStatus(String status);

    /**
     * @author weihuanchun
     * @category update:change data
     * @param Books
     * @return integer: success or not
     * @tips: 先查后改
     */

    int changeBooks(Books book);

    /**
     * @author weihuanchun
     * @category add(insert)
     * @param Books
     * @return integer: success or not
     */

    int addBooks(Books book);

    /**
     * @author weihuanchun
     * @category delete(delete)
     * @param int id
     * @return integer: success or not
     * @tips: 先查后删
     */

     int deleteBooks(Books book);

}
