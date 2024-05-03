package com.entity.vo;

import com.entity.KehuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 客户
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-06 18:06:12
 */
public class KehuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 客户姓名
	 */
	
	private String kehuxingming;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 车辆品牌
	 */
	
	private String cheliangpinpai;
		
	/**
	 * 购车方式
	 */
	
	private String gouchefangshi;
		
	/**
	 * 交车时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jiaocheshijian;
		
	/**
	 * 保险年限
	 */
	
	private String baoxiannianxian;
		
	/**
	 * 维修记录
	 */
	
	private String weixiujilu;
		
	/**
	 * 保养记录
	 */
	
	private String baoyangjilu;
				
	
	/**
	 * 设置：客户姓名
	 */
	 
	public void setKehuxingming(String kehuxingming) {
		this.kehuxingming = kehuxingming;
	}
	
	/**
	 * 获取：客户姓名
	 */
	public String getKehuxingming() {
		return kehuxingming;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
				
	
	/**
	 * 设置：车辆品牌
	 */
	 
	public void setCheliangpinpai(String cheliangpinpai) {
		this.cheliangpinpai = cheliangpinpai;
	}
	
	/**
	 * 获取：车辆品牌
	 */
	public String getCheliangpinpai() {
		return cheliangpinpai;
	}
				
	
	/**
	 * 设置：购车方式
	 */
	 
	public void setGouchefangshi(String gouchefangshi) {
		this.gouchefangshi = gouchefangshi;
	}
	
	/**
	 * 获取：购车方式
	 */
	public String getGouchefangshi() {
		return gouchefangshi;
	}
				
	
	/**
	 * 设置：交车时间
	 */
	 
	public void setJiaocheshijian(Date jiaocheshijian) {
		this.jiaocheshijian = jiaocheshijian;
	}
	
	/**
	 * 获取：交车时间
	 */
	public Date getJiaocheshijian() {
		return jiaocheshijian;
	}
				
	
	/**
	 * 设置：保险年限
	 */
	 
	public void setBaoxiannianxian(String baoxiannianxian) {
		this.baoxiannianxian = baoxiannianxian;
	}
	
	/**
	 * 获取：保险年限
	 */
	public String getBaoxiannianxian() {
		return baoxiannianxian;
	}
				
	
	/**
	 * 设置：维修记录
	 */
	 
	public void setWeixiujilu(String weixiujilu) {
		this.weixiujilu = weixiujilu;
	}
	
	/**
	 * 获取：维修记录
	 */
	public String getWeixiujilu() {
		return weixiujilu;
	}
				
	
	/**
	 * 设置：保养记录
	 */
	 
	public void setBaoyangjilu(String baoyangjilu) {
		this.baoyangjilu = baoyangjilu;
	}
	
	/**
	 * 获取：保养记录
	 */
	public String getBaoyangjilu() {
		return baoyangjilu;
	}
			
}
