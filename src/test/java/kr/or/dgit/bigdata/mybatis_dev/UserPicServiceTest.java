package kr.or.dgit.bigdata.mybatis_dev;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.bigdata.mybatis_dev.dto.UserPic;
import kr.or.dgit.bigdata.mybatis_dev.service.UserPicService;

public class UserPicServiceTest {
	private static UserPicService userpicservice;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		userpicservice = UserPicService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		userpicservice = null;
	}

	@Test
	public void testinsertuserpic() {
		byte[]pic = null;
		File file = new File(System.getProperty("user.dir") + "\\DataFiles\\star.jpg");
		
		try {
			InputStream is = new FileInputStream(file);
			pic = new byte[is.available()];
			is.read(pic);
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		UserPic up = new UserPic();
		up.setName("토성");
		up.setBio("나는 토성");
		up.setPic(pic);
		
		int res = userpicservice.insertUserPic(up);
		Assert.assertSame(1, res);
		System.out.println(res);
	}
	@Test
	public void testgetuserpic() {
		UserPic up = userpicservice.getUserPic(1);
		Assert.assertNotNull(up);
		byte[]pic = up.getPic();
		
		try{
			File file = new File(System.getProperty("user.dir")+"\\DataFiles\\icon_alarm.png");
			OutputStream os = new FileOutputStream(file);
			os.write(pic);
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			System.out.println(up);
		}
	}
	
}
