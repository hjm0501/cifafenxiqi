package com.nonefly.vesion1;

public class hjm {

	/**
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Integer i1=new Integer(11);
		Integer i2=new Integer(11);
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		Integer i5=new Integer(128);
		Integer i6=new Integer(128);
		System.out.println(i5==i6);
		System.out.println(i5.equals(i6));
		Integer i3=1;
		Integer i4=1;
		System.out.println(i3==i4);
		System.out.println(i3.equals(i4));
		Integer i7=1144;
		Integer i8=1144;
		System.out.println(i7==i8);
		System.out.println(i7.equals(i8));
		/*
		 * -128��127��byte��ȡֵ��Χ,��������ȡֵ��Χ��,�Զ�װ��Ͳ����´�������,���Ǵӳ������л�ȡ
		 * ���������byteȡֵ��Χ�ͻ����´�������
		 * 
		 * public static Integer valueOf(int i) {
		        assert IntegerCache.high >= 127;
		        if (i >= IntegerCache.low && i <= IntegerCache.high)			//i>= -128 && i <= 127
		            return IntegerCache.cache[i + (-IntegerCache.low)];
		        return new Integer(i);
		    }
		 */
	}

}
