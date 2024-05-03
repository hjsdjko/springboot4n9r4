package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CheliangxiaoshouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CheliangxiaoshouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CheliangxiaoshouView;


/**
 * 车辆销售
 *
 * @author 
 * @email 
 * @date 2022-05-06 18:06:12
 */
public interface CheliangxiaoshouService extends IService<CheliangxiaoshouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CheliangxiaoshouVO> selectListVO(Wrapper<CheliangxiaoshouEntity> wrapper);
   	
   	CheliangxiaoshouVO selectVO(@Param("ew") Wrapper<CheliangxiaoshouEntity> wrapper);
   	
   	List<CheliangxiaoshouView> selectListView(Wrapper<CheliangxiaoshouEntity> wrapper);
   	
   	CheliangxiaoshouView selectView(@Param("ew") Wrapper<CheliangxiaoshouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CheliangxiaoshouEntity> wrapper);
   	

}

