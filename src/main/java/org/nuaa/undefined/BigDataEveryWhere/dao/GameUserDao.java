package org.nuaa.undefined.BigDataEveryWhere.dao;

import org.nuaa.undefined.BigDataEveryWhere.entity.GameAllTwoEntity;
import org.nuaa.undefined.BigDataEveryWhere.entity.GameUserEntity;

import java.util.List;

/**
 * @Auther: cyw35
 * @Date: 2018/8/3 15:21
 * @Description:
 */
public interface GameUserDao {
    public List<GameUserEntity> listData(String sql,Object [] keys);

    public List<GameAllTwoEntity> listGlobalData(String sql,Object[] keys);
    public int count();

    public int count(String sql, Object[] keys);
}
