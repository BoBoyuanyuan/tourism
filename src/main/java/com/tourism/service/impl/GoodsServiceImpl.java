package com.tourism.service.impl;

import com.tourism.entity.Goods;
import com.tourism.mapper.IGoodsMapper;
import com.tourism.service.IGoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class GoodsServiceImpl implements IGoodsService {

    @Resource
    private IGoodsMapper goodsMapper;

    @Override
    public int deleteByPrimaryKey(Integer gId) {
        return goodsMapper.deleteByPrimaryKey(gId);
    }

    @Override
    public int insert(Goods record) {
        return goodsMapper.insert(record);
    }

    @Override
    public int insertSelective(Goods record) {
        return goodsMapper.insertSelective(record);
    }

    @Override
    public Goods selectByPrimaryKey(Integer gId) {
        return goodsMapper.selectByPrimaryKey(gId);
    }

    @Override
    public int updateByPrimaryKeySelective(Goods record) {
        return goodsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Goods record) {
        return goodsMapper.updateByPrimaryKey(record);
    }

}
