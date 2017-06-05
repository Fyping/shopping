package snippet;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.login.Configuration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.api.ProgressCallback;
import org.mybatis.generator.api.VerboseProgressCallback;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

public class Snippet {
	private static  Logger log=LogManager.getLogger(Snippet.class);
	private static void shell() {
        List<String> warnings = new ArrayList<String>();
        try {
            String configFilePath = System.getProperty("user.dir")
                    .concat("/resources/generatorConfig.xml");
            configFilePath = "MybatisGenerator.xml";
            System.out.println("º”‘ÿ≈‰÷√Œƒº˛===" + configFilePath);
            boolean overwrite = true;
            File configFile = new File(configFilePath);
            ConfigurationParser cp = new ConfigurationParser(warnings);
            org.mybatis.generator.config.Configuration config = cp.parseConfiguration(configFile);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
                    callback, warnings);
            ProgressCallback progressCallback = new VerboseProgressCallback();
            // myBatisGenerator.generate(null);
            myBatisGenerator.generate(progressCallback);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        for (String warning : warnings) {
            System.out.println(warning);
        }
    }
	public static void main(String[] args) {
		Snippet.shell();
	}
	private void  guangfangshell(){
		System.out.println("starting create");
		   List<String> warnings = new ArrayList<String>();
		   boolean overwrite = true;
		   File configFile = new File("MybatisGenerator.xml");
		   System.out.println("starting create");
		   ConfigurationParser cp = new ConfigurationParser(warnings);
		   System.out.println("starting create");
		   org.mybatis.generator.config.Configuration config = null;
		try {
			config = cp.parseConfiguration(configFile);
			System.out.println("starting create");
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			System.out.println("IOException create");
			e2.printStackTrace();
		} catch (XMLParserException e2) {
			// TODO Auto-generated catch block
			System.out.println("XMLParserException create");
			e2.printStackTrace();
		}
		   DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		   MyBatisGenerator myBatisGenerator = null;
		   System.out.println("DefaultShellCallback create");
		try {
			myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
			System.out.println("starting myBatisGenerator create");
		} catch (InvalidConfigurationException e1) {
			// TODO Auto-generated catch block
			System.out.println("InvalidConfigurationException create");
			e1.printStackTrace();
		}
		   try {
			myBatisGenerator.generate(null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   System.out.println("end");
	}
}



