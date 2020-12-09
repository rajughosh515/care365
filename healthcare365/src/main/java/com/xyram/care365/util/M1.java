package com.xyram.care365.util;

import java.util.Date;

public class M1 {
	
public static void main(String[] args) {
	System.out.println(" test >>>>   "+new Date(System.currentTimeMillis()));
	System.out.println(" test1 >>>>   "+new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10));
}
}
