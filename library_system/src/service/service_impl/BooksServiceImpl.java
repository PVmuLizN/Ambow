package service.service_impl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import dao.BooksDao;
import dao.dao_impl.BooksDaoImpl;
import po.Books;
import service.BooksService;

public class BooksServiceImpl implements BooksService {
    private BooksDao booksDao;

    public BooksServiceImpl() {
        this.booksDao = new BooksDaoImpl();
    }

    public BooksServiceImpl(BooksDao booksDao) {
        this.booksDao = booksDao;
    }

    @Override
    public List<Books> queryAllBooks() {
        return booksDao.getAllBooks();
    }

    @Override
    public Books queryBooksById(int id) {

        return booksDao.getBooksById(id);

    }

    @Override
    public Books queryBooksByIsbn(String isbn) {
        return booksDao.getBooksByIsbn(isbn);
    }

    @Override
    public List<Books> queryBooksByTitle(String title) {
        return booksDao.getBooksByTitle(title);
    }

    @Override
    public List<Books> queryBooksByPublisher(String publisher) {
        return booksDao.getBooksByPublisher(publisher);
    }

    @Override
    public List<Books> queryBooksByPublicationDate(Date date) {
        return booksDao.getBooksByPublicationDate(date);
    }

    @Override
    public List<Books> queryBooksByStatus(String status) {
        return booksDao.getBooksByStatus(status);
    }

    @Override
    public int changeBooks(Books book) {
        return booksDao.updateBooks(book);
    }

    @Override
    public int addBooks(Books book) {
        return booksDao.insertBooks(book);
    }

    @Override
    public int deleteBooks(Books book) {
        return booksDao.deleteBooks(book);
    }

}
