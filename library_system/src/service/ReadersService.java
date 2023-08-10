package service;

import dao.ReadersDao;
import po.Readers;

import java.util.List;

/**
 * @Sundengyue
 */
public class ReadersService {
    private ReadersDao readersDao;

    public ReadersService() {

        this.readersDao = new ReadersDao();
    }

    public ReadersService(ReadersDao readersDao) {

        this.readersDao = readersDao;
    }


    //增加
    public int addReaders(Readers readers){

        return readersDao.addReaders(readers);
    }

    //查询全部
    public List<Readers> queryReaders(){
        return readersDao.queryReaders();
    }



    //更改
    public int updateReaders(Readers readers){

        return readersDao.updateReaders(readers);
    }


    //删除
    public int deleteReaders(int readerid){

        return readersDao.deleteReaders(readerid);
    }

    //根据id查询
    public List<Readers> idQueryReaders(int readerid){

        return  readersDao.idQueryReaders(readerid);
    }

    //根据名字查询
    public List<Readers> nameQueryReaders(String name){

        return readersDao.nameQueryReaders(name);
    }

}
