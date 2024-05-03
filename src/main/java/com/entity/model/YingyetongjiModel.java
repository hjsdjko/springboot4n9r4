package com.entity.model;

import com.entity.YingyetongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 营业统计
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-06 18:06:12
 */
public class YingyetongjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 统计类型
	 */
	
	private String tongjileixing;
		
	/**
	 * 总销额
	 */
	
	private Float zongxiaoe;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：统计类型
	 */
	 
	public void setTongjileixing(String tongjileixing) {
		this.tongjileixing = tongjileixing;
	}
	
	/**
	 * 获取：统计类型
	 */
	public String getTongjileixing() {
		return tongjileixing;
	}
				
	
	/**
	 * 设置：总销额
	 */
	 
	public void setZongxiaoe(Float zongxiaoe) {
		this.zongxiaoe = zongxiaoe;
	}
	
	/**
	 * 获取：总销额
	 */
	public Float getZongxiaoe() {
		return zongxiaoe;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
