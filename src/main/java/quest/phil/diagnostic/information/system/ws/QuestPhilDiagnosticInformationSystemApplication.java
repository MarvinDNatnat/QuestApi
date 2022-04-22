package quest.phil.diagnostic.information.system.ws;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.lowagie.text.FontFactory;

@SpringBootApplication
public class QuestPhilDiagnosticInformationSystemApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(QuestPhilDiagnosticInformationSystemApplication.class);

	public static void main(String[] args) {
		LOGGER.info("Application Started Console");
		
		String path = "src/main/resources/garamond";
		File file = new File(path);
		String absolutePath = file.getAbsolutePath();
		FontFactory.register(absolutePath + File.separator + "Garamond.ttf", "GARAMOND");
		FontFactory.register(absolutePath + File.separator + "Garamond Bold font.ttf", "GARAMOND_BOLD");
		FontFactory.register(absolutePath + File.separator + "GARA.TTF", "GARA");
		FontFactory.register(absolutePath + File.separator + "GARABD.TTF", "GARABD");
		
		SpringApplication.run(QuestPhilDiagnosticInformationSystemApplication.class, args);
	}

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
