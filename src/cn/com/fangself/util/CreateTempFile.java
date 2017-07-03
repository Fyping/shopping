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
		        // 创建临时文件
		        temp = File.createTempFile("pattern", ".java");
		        //在程序退出时删除临时文件
		        temp.deleteOnExit();
		        // 向临时文件中写入内容
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
