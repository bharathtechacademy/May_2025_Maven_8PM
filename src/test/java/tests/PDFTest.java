package tests;

import utilities.PDFUtil;

public class PDFTest {

	public static void main(String[] args) {
//		String text1 = PDFUtil.getPDFText("TestFile.pdf");
//		System.out.println(text1);
		
		String text2 = PDFUtil.getPDFText("TestFile.pdf",2,2);
		System.out.println(text2);

	}

}
