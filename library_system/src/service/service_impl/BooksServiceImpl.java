package service.service_impl;

import java.sql.Date;
import java.util.List;

import po.Books;
import service.BooksService;

public class BooksServiceImpl implements BooksService {

    @Override
    public List<Books> queryAllBooks() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'queryAllBooks'");
    }

    @Override
    public Books queryBooksById(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'queryBooksById'");
    }

    @Override
    public Books queryBooksByIsbn(String isbn) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'queryBooksByIsbn'");
    }

    @Override
    public List<Books> queryBooksByTitle(String title) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'queryBooksByTitle'");
    }

    @Override
    public List<Books> queryBooksByPublisher(String publisher) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'queryBooksByPublisher'");
    }

    @Override
    public List<Books> queryBooksByPublicationDate(Date date) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'queryBooksByPublicationDate'");
    }

    @Override
    public List<Books> queryBooksByStatus(String status) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'queryBooksByStatus'");
    }

    @Override
    public int changeBooks(Books book) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'changeBooks'");
    }

    @Override
    public int addBooks(Books book) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addBooks'");
    }

    @Override
    public int deleteBooks(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteBooks'");
    }
    
}
