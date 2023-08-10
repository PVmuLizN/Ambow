package service;
// package service.sertvice_impl;

// import dao.dao_impl.ReservationRecordsDao;
import po.ReservationRecords;

import java.util.List;

import dao.ReservationRecordsDao;

/**
 * ClassName: aaaaaa
 * Package: main
 * Description: 类的描述
 *
 * @Author 王志鹏
 * @Create 2023/8/10 16:05
 * @Version 1.0 版本号
 */

public class ReservationService {
    private ReservationRecordsDao reservationRecordsDao;
    private ReservationRecordsDao rr = new ReservationRecordsDao();

    public ReservationService() {
        this.reservationRecordsDao = new ReservationRecordsDao();

    }

    public ReservationService(ReservationRecordsDao reservationRecordsDao) {
        this.reservationRecordsDao = reservationRecordsDao;
    }

    public List<ReservationRecords> queryAllReservationRecords() {
        return rr.queryAllReservationRecords();
    }

    public int addAllreservationRecords(ReservationRecords res) {
        return rr.addAllreservationRecords(res);
    }

    public int ReservationRecordsUpdate(ReservationRecords res) {
        return rr.ReservationRecordsUpdate(res);
    }

    public int Delete(ReservationRecords res) {
        return rr.Delete(res);
    }
}
