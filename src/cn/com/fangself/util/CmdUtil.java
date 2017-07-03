package cn.com.fangself.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CmdUtil {

	public static String getJavaProgramRuntimeResult(String fileName , String[]  args  ){
		try{
			Runtime rt = Runtime.getRuntime();
			String[] fileNameResult = fileName.split("\\\\");
			int len = fileNameResult.length;
			StringBuilder filePre = new StringBuilder();
	
			for(int i=0;i<len-1;i++){
				filePre.append(fileNameResult[i]);
			}
			String preCom = "mv "+fileName + new String(filePre) + "\\Test.java";
			String compileCmd = "javac "+fileName;
			
			Process proc = rt.exec(preCom);
			
			int status = proc.waitFor();
			if(status==1){
				return "¸ñÊ½´íÎó";
			}
			
			proc = rt.exec(compileCmd,null,new File("."));
			InputStream stderr = proc.getErrorStream();
			InputStream stdIs=null;
			
			InputStreamReader isr = new InputStreamReader(stderr);
			BufferedReader br = new BufferedReader(isr);
			String line = null;
			
			System.out.println("enter here");
			
			InputStreamReader isrIs = null;
			BufferedReader brIs = null;
			while ( (line = br.readLine()) != null){
				System.out.println(line);
			}System.out.println("");
			int exitVal = proc.waitFor();
			
			
			if(exitVal==1){
				System.out.println("±àÒë´íÎó");
			}
			if(exitVal == 0){
				StringBuilder exeCmd = new StringBuilder("java "+ fileName);
				for(String str : args){
					exeCmd.append(" "+str);
				}
				proc = rt.exec(new String(exeCmd),null,new File("."));
				stderr = proc.getErrorStream();
				isr = new InputStreamReader(stderr);
				br = new BufferedReader(isr);
				
			    stdIs= proc.getInputStream();
			
				isrIs = new InputStreamReader(stdIs);
				brIs = new BufferedReader(isrIs);
				System.out.println("result:");
				while ( (line = brIs.readLine()) != null){
					System.out.println(line);
				}System.out.println("");
				
				line = null;
				while ( (line = br.readLine()) != null){
					System.out.println(line);
				}
				System.out.println("");
				exitVal = proc.waitFor();
				if(exitVal==0){
						System.out.println("ok run success ");
					}else{
						System.out.println("failed ");
					}	
				}
			}catch (Throwable t){
			t.printStackTrace();
		}
		return null;
	}
}
