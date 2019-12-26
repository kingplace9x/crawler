package com.cellphone.craw;

import lombok.Data;

@Data
public class Phone {
	private int id;
	private String linkDetail;
	private String image;
	private String name;
	private long currentPrice;
	private long oldPrice;
	private int rating;
	private String gift;
}
