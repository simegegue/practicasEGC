package Test;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

import org.junit.Test;

public class Pakito {
	@Test
	public void sha1() throws InvalidKeyException, NoSuchAlgorithmException{
		String c="Sha1 very bad";
		System.out.println(c);
		System.out.println(veryBad(c));
		
	}
	private String veryBad(String s) throws NoSuchAlgorithmException, InvalidKeyException{
		String clave ="pakito";
		SecretKeySpec keySpec = new SecretKeySpec(clave.getBytes(),"HmacSha1");
		Mac m=Mac.getInstance("HmacSha1");
		m.init(keySpec);
		m.update(s.getBytes());
		byte [] b = m.doFinal();
		String res=DatatypeConverter.printHexBinary(b).toLowerCase();
		return res;
	}

}
