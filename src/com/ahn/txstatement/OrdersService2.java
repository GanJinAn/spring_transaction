package com.ahn.txstatement;

import com.ahn.dao.OrdersDao;
import org.springframework.transaction.annotation.Transactional;

//����ʽ������� ������ ��Ҫʹ����������ķ����������������ע��@Transactional
//���ע��֮��ض������������з��������������

@Transactional
public class OrdersService2 {
    private OrdersDao ordersDao;

    public void setOrdersDao(OrdersDao ordersDao) {
        this.ordersDao = ordersDao;
    }

    // ת��ҵ��������˹�����Ҫ����Ŀ���
    public void transMoney(){
        ordersDao.transOutM();

        //�ֶ������쳣,����������ᱻ�ع�
        int i=10/0;

        ordersDao.transInM();
    }
}
