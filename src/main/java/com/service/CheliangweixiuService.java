package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CheliangweixiuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CheliangweixiuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CheliangweixiuView;


/**
 * 车辆维修
 *
 * @author 
 * @email 
 * @date 2022-05-06 18:06:12
 */
public interface CheliangweixiuService extends IService<CheliangweixiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CheliangweixiuVO> selectListVO(Wrapper<CheliangweixiuEntity> wrapper);
   	
   	CheliangweixiuVO selectVO(@Param("ew") Wrapper<CheliangweixiuEntity> wrapper);
   	
   	List<CheliangweixiuView> selectListView(Wrapper<CheliangweixiuEntity> wrapper);
   	
   	CheliangweixiuView selectView(@Param("ew") Wrapper<CheliangweixiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CheliangweixiuEntity> wrapper);
   	

}

