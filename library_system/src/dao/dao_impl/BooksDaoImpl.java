package dao.dao_impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.BooksDao;
import po.Books;
import utils.JDBCUtil;

public class BooksDaoImpl implements BooksDao {
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    @Override
    public List<Books> getAllBooks() {
        List<Books> books = new ArrayList();

        try {
            String sql = "SELECT * FROM Books";
            conn = JDBCUtil.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Books book = new Books();
                book.setId(rs.getInt(1));
                book.setTitle(rs.getString(2));
                book.setAuthor(rs.getString(3));
                book.setPublisher(rs.getString(4));
                book.setPublicationDate(rs.getDate(5));
                book.setIsbn(rs.getString(6));
                book.setStatus(rs.getString(7));
                books.add(book);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeAll(conn, ps, rs);
        }

        return books;
    }

    @Override
    public Books getBooksById(int id) {
        Books book = null;

        try {
            String sql = "SELECT * FROM Books WHERE BookID = ?";
            conn = JDBCUtil.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                book = new Books();
                book.setId(rs.getInt(1));
                book.setTitle(rs.getString(2));
                book.setAuthor(rs.getString(3));
                book.setPublisher(rs.getString(4));
                book.setPublicationDate(rs.getDate(5));
                book.setIsbn(rs.getString(6));
                book.setStatus(rs.getString(7));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeAll(conn, ps, rs);
        }
        return book;
    }

    @Override
    public Books getBooksByIsbn(String isbn) {
        Books book = null;

        try {
            String sql = "SELECT * FROM Books WHERE ISBN = ?";
            conn = JDBCUtil.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, isbn);
            rs = ps.executeQuery();

            if (rs.next()) {
                book = new Books();
                book.setId(rs.getInt(1));
                book.setTitle(rs.getString(2));
                book.setAuthor(rs.getString(3));
                book.setPublisher(rs.getString(4));
                book.setPublicationDate(rs.getDate(5));
                book.setIsbn(rs.getString(6));
                book.setStatus(rs.getString(7));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeAll(conn, ps, rs);
        }
        return book;
    }

    @Override
    public List<Books> getBooksByTitle(String title) {
        List<Books> books = new ArrayList();

        try {
            String sql = "SELECT * FROM Books WHERE Title LIKE ?";
            conn = JDBCUtil.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, title);
            rs = ps.executeQuery();

            while (rs.next()) {
                Books book = new Books();
                book.setId(rs.getInt(1));
                book.setTitle(rs.getString(2));
                book.setAuthor(rs.getString(3));
                book.setPublisher(rs.getString(4));
                book.setPublicationDate(rs.getDate(5));
                book.setIsbn(rs.getString(6));
                book.setStatus(rs.getString(7));
                books.add(book);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeAll(conn, ps, rs);
        }
        return books;
    }

    @Override
    public List<Books> getBooksByPublisher(String publisher) {
        List<Books> books = new ArrayList();
        try {
            String sql = "SELECT * FROM Books WHERE Publisher LIKE ?";
            conn = JDBCUtil.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, publisher);
            rs = ps.executeQuery();

            while (rs.next()) {
                Books book = new Books();
                book.setId(rs.getInt(1));
                book.setTitle(rs.getString(2));
                book.setAuthor(rs.getString(3));
                book.setPublisher(rs.getString(4));
                book.setPublicationDate(rs.getDate(5));
                book.setIsbn(rs.getString(6));
                book.setStatus(rs.getString(7));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeAll(conn, ps, rs);
        }
        return books;
    }

    @Override
    public List<Books> getBooksByPublicationDate(Date date) {
        List<Books> books = new ArrayList();
        try {
            String sql = "SELECT * FROM Books WHERE PublicationDate = ?";
            conn = JDBCUtil.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setDate(1, date);
            rs = ps.executeQuery();

            while (rs.next()) {
                Books book = new Books();
                book.setId(rs.getInt(1));
                book.setTitle(rs.getString(2));
                book.setAuthor(rs.getString(3));
                book.setPublisher(rs.getString(4));
                book.setPublicationDate(rs.getDate(5));
                book.setIsbn(rs.getString(6));
                book.setStatus(rs.getString(7));
                books.add(book);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeAll(conn, ps, rs);
        }
        return books;
    }

    @Override
    public List<Books> getBooksByStatus(String status) {
        List<Books> books = new ArrayList<Books>();
        try {
            String sql = "SELECT * FROM Books WHERE Status = ?";
            conn = JDBCUtil.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, status);
            rs = ps.executeQuery();

            if (rs.next()) {
                Books book = new Books();
                book.setId(rs.getInt(1));
                book.setTitle(rs.getString(2));
                book.setAuthor(rs.getString(3));
                book.setPublisher(rs.getString(4));
                book.setPublicationDate(rs.getDate(5));
                book.setIsbn(rs.getString(6));
                book.setStatus(rs.getString(7));
                books.add(book);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeAll(conn, ps, rs);
        }
        return books;
    }

    @Override
    public int updateBooks(Books book) {
        int result = 0;

        try {
            String sql = "UPDATE Books SET Title = ?, Author = ?, Publisher = ?, PublicationDate = ?, Status = ? WHERE BookID = ?";
            conn = JDBCUtil.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, book.getTitle());
            ps.setString(2, book.getAuthor());
            ps.setString(3, book.getPublisher());
            ps.setDate(4, book.getPublicationDate());
            ps.setString(5, book.getStatus());
            ps.setInt(6, book.getId());
            result = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeAll(conn, ps, rs);
        }
        return result;
    }

    @Override
    public int insertBooks(Books book) {
        int result = 0;
        try {

            String sql = "INSERT INTO Books (BookID, Title, Author, Publisher, PublicationDate, Status) VALUES (null,?, ?, ?, ?, ?)";
            conn = JDBCUtil.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, book.getTitle());
            ps.setString(2, book.getAuthor());
            ps.setString(3, book.getPublisher());
            ps.setDate(4, book.getPublicationDate());
            ps.setString(5, book.getStatus());
            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeAll(conn, ps, rs);
        }
        return result;

    }

    @Override
    public int deleteBooks(Books book) {
        int result = 0;
        try {
            String sql = "DELETE FROM Books WHERE BookID = ?";
            conn = JDBCUtil.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, book.getId());
            result = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeAll(conn, ps, rs);
        }
        return result;
    }

}
