package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.CheliangxiaoshouDao;
import com.entity.CheliangxiaoshouEntity;
import com.service.CheliangxiaoshouService;
import com.entity.vo.CheliangxiaoshouVO;
import com.entity.view.CheliangxiaoshouView;

@Service("cheliangxiaoshouService")
public class CheliangxiaoshouServiceImpl extends ServiceImpl<CheliangxiaoshouDao, CheliangxiaoshouEntity> implements CheliangxiaoshouService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CheliangxiaoshouEntity> page = this.selectPage(
                new Query<CheliangxiaoshouEntity>(params).getPage(),
                new EntityWrapper<CheliangxiaoshouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CheliangxiaoshouEntity> wrapper) {
		  Page<CheliangxiaoshouView> page =new Query<CheliangxiaoshouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CheliangxiaoshouVO> selectListVO(Wrapper<CheliangxiaoshouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CheliangxiaoshouVO selectVO(Wrapper<CheliangxiaoshouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CheliangxiaoshouView> selectListView(Wrapper<CheliangxiaoshouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CheliangxiaoshouView selectView(Wrapper<CheliangxiaoshouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
