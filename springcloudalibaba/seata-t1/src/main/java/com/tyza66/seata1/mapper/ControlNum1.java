package com.tyza66.seata1.mapper;

import org.apache.ibatis.annotations.Update;

/**
 * Author: tyza66
 * Date: 2023/04/26 7:46
 * Github: https://github.com/tyza66
 **/
public interface ControlNum1 {

    @Update("UPDATE Num1 SET num = num + 1 WHERE id = #{id}")
    int noPass(int id);
}
