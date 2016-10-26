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
		String c="Sha1 very bad my friend";
		System.out.println("Mensaje:"+ c);
		System.out.println("Funcion hash:"+ veryBad(c));
		
	}
	
	@Test
	public void sha256() throws InvalidKeyException, NoSuchAlgorithmException{
		String c="Sha256 aun aguanta como un valiente";
		System.out.println("Mensaje:"+ c);
		System.out.println("Funcion hash:"+ sha256(c));
		
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
	private String sha256(String s) throws NoSuchAlgorithmException, InvalidKeyException{
		String clave ="pakito";
		SecretKeySpec keySpec = new SecretKeySpec(clave.getBytes(),"HmacSha256");
		Mac m=Mac.getInstance("HmacSha256");
		m.init(keySpec);
		m.update(s.getBytes());
		byte [] b = m.doFinal();
		String res=DatatypeConverter.printHexBinary(b).toLowerCase();
		return res;
	}

}
