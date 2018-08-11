package com.sunway.webbase;

import java.io.Serializable;

public class BasePageData implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7992097995131818923L;
	
	private Object data;
	
	private int pagenum;
	
	private int pagelimit;
	
	private long total;
	
	private int totalpage;


	public BasePageData(Object data, int pagenum, int pagelimit, long total, int totalpage) {
		super();
		this.data = data;
		this.pagenum = pagenum;
		this.pagelimit = pagelimit;
		this.total = total;
		this.totalpage = totalpage;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public int getPagenum() {
		return pagenum;
	}

	public void setPagenum(int pagenum) {
		this.pagenum = pagenum;
	}

	public int getpagelimit() {
		return pagelimit;
	}

	public void setpagelimit(int pagelimit) {
		this.pagelimit = pagelimit;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public int getTotalpage() {
		return totalpage;
	}

	public void setTotalpage(int totalpage) {
		this.totalpage = totalpage;
	}
	
	@Override
	public String toString() {
		return "BasePageData [data=" + data + ", pagenum=" + pagenum + ", pagelimit=" + pagelimit + ", total=" + total
				+ ", totalpage=" + totalpage + "]";
	}
}
