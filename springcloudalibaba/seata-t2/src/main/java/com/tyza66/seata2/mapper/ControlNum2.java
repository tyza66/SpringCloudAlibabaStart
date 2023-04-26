package com.tyza66.seata2.mapper;

import org.apache.ibatis.annotations.Update;

/**
 * Author: tyza66
 * Date: 2023/04/26 7:46
 * Github: https://github.com/tyza66
 **/
public interface ControlNum2 {

    @Update("UPDATE Num2 SET num = num - 1 WHERE id = #{id}")
    int noPass(int id);
}
