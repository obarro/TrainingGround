import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;


public class Prueba {
	private  Logger logger = LogManager.getLogger();
	private List<Long> listaTiempos = new ArrayList<Long>();
	public static void main(String[] args) {
		System.out.println(" --- INICIO --- ");
		String logConfigurationFile="c:\\Aplicaciones\\DEV\\TrainingGround\\conf\\log4j2.xml";
		System.setProperty("log4j.configurationFile", logConfigurationFile);
		/*try {
			File f = new File(logConfigurationFile);
			URI fc = f.toURI(); 
			LoggerContext.getContext().setConfigLocation(fc);
		} catch (Exception e) {
			e.printStackTrace();
			
		}*/
		Prueba lanzador =new Prueba();
		lanzador.go();
		System.out.println(" ---  FIN ---");
	}
	private void go() {
		try {

			logger.info("go START");
			//Map<String, String> a = System.getenv();
			//System.out.println(a.get("CLASSPATH"));
			//System.out.println("Working Directory = " +
		      //        System.getProperty("user.dir"));
			//setEnvironmentVariables();
		//PropertyConfigurator.configure();
		//System.out.println("INICIO");
		//Configurator.initialize(null, );
			logger.info("prueba");
		//ConfigurationSource source = new ConfigurationSource(new FileInputStream(logConfigurationFile));
		
		//Configurator.initialize(null, source);
		for(int i=0;i<10;i++) itera();
		OptionalDouble  average = listaTiempos
	            .stream()
	            .mapToDouble(a -> a)
	            .average();
		logger.warn("END: {}",average);
		//System.out.println("FIN");
		
	} catch (Exception e) {
		logger.error(e);
	//	e.printStackTrace();
	}

	}
	private void itera() {
		long startTime = System.currentTimeMillis();
		for(int i=0;i<10;i++) logger.info("linea: {}",i);
		long endTime = System.currentTimeMillis();
		long finalTime = endTime-startTime;
		listaTiempos.add( finalTime);
	}
	
	

	
}



