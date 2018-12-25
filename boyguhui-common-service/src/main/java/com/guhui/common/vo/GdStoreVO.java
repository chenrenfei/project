/**
 *@Generated by sagacity-quickvo 4.0
 */
package com.guhui.common.vo;

import com.guhui.common.vo.base.AbstractGdStoreVO;
import org.sagacity.sqltoy.config.annotation.SqlToyEntity;

/**
 * @project spring-boot-common-service
 * @author guhui
 * @version 1.0.0
 * Table: gd_store 	
 */
@SqlToyEntity
public class GdStoreVO extends AbstractGdStoreVO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1030906007025870714L;
	
	/** default constructor */
	public GdStoreVO() {
		super();
	}
	
	/*---begin-constructor-area---don't-update-this-area--*/
	/** pk constructor */
	public GdStoreVO(Integer gdId)
	{
		this.gdId=gdId;
	}


	/** full constructor */
	public GdStoreVO(Integer gdId,Integer isDelete,Integer productClassId,String remark,Integer storeNum)
	{
		this.gdId=gdId;
		this.isDelete=isDelete;
		this.productClassId=productClassId;
		this.remark=remark;
		this.storeNum=storeNum;
	}

	/*---end-constructor-area---don't-update-this-area--*/
	
	/**
     *@todo vo columns to String
     */
	public String toString() {
		return super.toString();
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	public GdStoreVO clone() {
		try {
			// TODO Auto-generated method stub
			return (GdStoreVO) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}