package coreJavaTraining;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date dt=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("d/M/yyyy");
		SimpleDateFormat sdfs=new SimpleDateFormat("d/M/yyyy hh:mm:ss");
		System.out.println(dt);
		System.out.println(sdf.format(dt));
		System.out.println(sdfs.format(dt));
		System.out.println(dt.toString());
	}

}
