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


import com.dao.YingyetongjiDao;
import com.entity.YingyetongjiEntity;
import com.service.YingyetongjiService;
import com.entity.vo.YingyetongjiVO;
import com.entity.view.YingyetongjiView;

@Service("yingyetongjiService")
public class YingyetongjiServiceImpl extends ServiceImpl<YingyetongjiDao, YingyetongjiEntity> implements YingyetongjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YingyetongjiEntity> page = this.selectPage(
                new Query<YingyetongjiEntity>(params).getPage(),
                new EntityWrapper<YingyetongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YingyetongjiEntity> wrapper) {
		  Page<YingyetongjiView> page =new Query<YingyetongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YingyetongjiVO> selectListVO(Wrapper<YingyetongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YingyetongjiVO selectVO(Wrapper<YingyetongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YingyetongjiView> selectListView(Wrapper<YingyetongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YingyetongjiView selectView(Wrapper<YingyetongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<YingyetongjiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<YingyetongjiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<YingyetongjiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
