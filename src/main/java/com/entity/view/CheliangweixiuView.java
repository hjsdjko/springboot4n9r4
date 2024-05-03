package com.entity.view;

import com.entity.CheliangweixiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 车辆维修
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-06 18:06:12
 */
@TableName("cheliangweixiu")
public class CheliangweixiuView  extends CheliangweixiuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CheliangweixiuView(){
	}
 
 	public CheliangweixiuView(CheliangweixiuEntity cheliangweixiuEntity){
 	try {
			BeanUtils.copyProperties(this, cheliangweixiuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
