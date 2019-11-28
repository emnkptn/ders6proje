package ders6;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class MetinIslemleriTest2 {

	@Test
	public void testBuyukHarf() {
		String sonuc = MetinIslemleri
				.buyukHarf("okul");
		Assert.assertEquals("ALİ", sonuc);
	}

}
