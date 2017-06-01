package cn.com.fangself.model.pager;

import java.util.List;

public class PageBean<T> {
	private int pageCode ;
	private List<T> datas;
	private int totalRecord;
	private int pageSize;
	
	public PageBean(){
		this.setPageSize(20);
	}
	public PageBean(int pageCode ,int totalRecord){
		this(pageCode,totalRecord,10);
	}
	public PageBean(int pageCode, int totalRecord, int pageSize) {
		this.pageCode = pageCode;
		this.totalRecord = totalRecord;
		this.pageSize = pageSize;
	}
	public int getPageCode() {
		return pageCode;
	}
	public void setPageCode(int pageCode) {
		this.pageCode = pageCode;
	}
	public List<T> getDatas() {
		return datas;
	}
	public void setDatas(List<T> datas) {
		this.datas = datas;
	}
	public int getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalPage() {

		int totalPage = this.totalRecord/pageSize;
		return totalPage%pageSize==0?totalPage:totalPage+1;
	}

	
}
