package com.ahn.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class OrdersDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //��dao����ʵ�ָ��ֶ����ݿ�Ĳ���

/*    1��ת��ҵ��Ĵ�����̣�
    һ���˻��������٣�һ���˻������������Ӧ�Ĳ�����
    �ص��ǣ�������������Ϊһ��ԭ�ӹ��̣�������Ϊ����������*/
    //ת������
    public void transOutM(){
        String sql="update t_account set totalaccount=totalaccount-? where username=?";
        jdbcTemplate.update(sql,1000,"С��");
    }

    //ת�뷽��
    public void transInM(){
        String sql="update t_account set totalaccount=totalaccount+? where username=?";
        jdbcTemplate.update(sql,1000,"С��");
    }
}
