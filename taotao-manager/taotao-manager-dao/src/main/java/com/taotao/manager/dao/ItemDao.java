package com.taotao.manager.dao;

import com.taotao.manager.pojo.Item;

public interface ItemDao {

    public Item findTbItemById(Long id);

    public int insertTbItem(Item obj);

    public int saveTbItem(Item obj);

    public int updateTbItem(Item obj);
}
