package service;

import dao.BorrowreCordsDao;
import po.BorrowreCords;

import java.util.List;

/**
 * @author 张东旭
 */
public class BorrowreCordsService {
    private BorrowreCordsDao borrowreCordsDao;
    public BorrowreCordsService() {
        this.borrowreCordsDao = new BorrowreCordsDao();
    }

    public BorrowreCordsService(BorrowreCordsDao borrowreCordsDao) {
        this.borrowreCordsDao = borrowreCordsDao;
    }
    //查
    public List<BorrowreCords> queryAllBorrowCords(){
        return borrowreCordsDao.queryAllBorrowerCords();
    }
    //增
    public int addBorrowerCards(BorrowreCords bor){
        return borrowreCordsDao.addBorrowerCards(bor);
    }
    //改
    public int BorrowreCordsUpdate(BorrowreCords bor){
        return borrowreCordsDao.BorrowreCordsUpdate(bor);
    }
    //删除
    public int Delete(int borrowID){
        return borrowreCordsDao.Delete(borrowID);
    }

}
