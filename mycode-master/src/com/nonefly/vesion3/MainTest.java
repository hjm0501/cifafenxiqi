package com.nonefly.vesion3;

public class MainTest {
	public static void main(String[] args) {
		/*�����ʷ�������*/
		TestLexer testLexer = new TestLexer("./src/input.txt");
		//FileUtil.clearFile();//����ļ�
		testLexer.analyse();
	}
}
