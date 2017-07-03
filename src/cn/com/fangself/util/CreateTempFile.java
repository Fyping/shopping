package cn.com.fangself.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateTempFile {
	public static File createTempFile(String fileKind ,String content){
		File  temp = null;
		if("java".equals(fileKind.trim())){
		    try {
		        // ������ʱ�ļ�
		        temp = File.createTempFile("pattern", ".java");
		        //�ڳ����˳�ʱɾ����ʱ�ļ�
		        temp.deleteOnExit();
		        // ����ʱ�ļ���д������
		        BufferedWriter out = new BufferedWriter(new FileWriter(temp));
		        //out.write(str);
		        out.write(content);
		        System.out.println("write success !!!!!");
		        out.close();
		    } catch (IOException e) {

		    }
		}
		return temp;
	}
}
