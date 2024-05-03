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


import com.dao.BaoxiangongsiDao;
import com.entity.BaoxiangongsiEntity;
import com.service.BaoxiangongsiService;
import com.entity.vo.BaoxiangongsiVO;
import com.entity.view.BaoxiangongsiView;

@Service("baoxiangongsiService")
public class BaoxiangongsiServiceImpl extends ServiceImpl<BaoxiangongsiDao, BaoxiangongsiEntity> implements BaoxiangongsiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaoxiangongsiEntity> page = this.selectPage(
                new Query<BaoxiangongsiEntity>(params).getPage(),
                new EntityWrapper<BaoxiangongsiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaoxiangongsiEntity> wrapper) {
		  Page<BaoxiangongsiView> page =new Query<BaoxiangongsiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaoxiangongsiVO> selectListVO(Wrapper<BaoxiangongsiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaoxiangongsiVO selectVO(Wrapper<BaoxiangongsiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaoxiangongsiView> selectListView(Wrapper<BaoxiangongsiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaoxiangongsiView selectView(Wrapper<BaoxiangongsiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
