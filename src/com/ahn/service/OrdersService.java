package com.ahn.service;

import com.ahn.dao.OrdersDao;

public class OrdersService {
    private OrdersDao ordersDao;

    public void setOrdersDao(OrdersDao ordersDao) {
        this.ordersDao = ordersDao;
    }

    // ת��ҵ��������˹�����Ҫ����Ŀ���
    public void transMoney(){
        ordersDao.transOutM();

        //�ֶ������쳣,����������ᱻ�ع�
        //int i=10/0;

        ordersDao.transInM();
    }
}
