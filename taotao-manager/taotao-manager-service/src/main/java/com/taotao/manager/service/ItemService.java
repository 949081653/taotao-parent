package com.taotao.manager.service;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.manager.pojo.TbItem;
import com.taotao.manager.pojo.TbItemDesc;

public interface ItemService {

	TbItem getItemById(long itemId);
	EasyUIDataGridResult getItemList(int page, int rows);
	TaotaoResult addItem(TbItem item, TbItemDesc itemDesc, String itemParams);
}
