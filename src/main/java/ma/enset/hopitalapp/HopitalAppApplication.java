package ma.enset.hopitalapp;

import lombok.Builder;
import ma.enset.hopitalapp.entities.Patient;
import ma.enset.hopitalapp.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HopitalAppApplication implements CommandLineRunner {

    @Autowired
	private PatientRepository patientRepository;
	public static void main(String[] args) {
		SpringApplication.run(HopitalAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		Patient patient = new Patient();
		patient.setId(null);
		patient.setNom("badr");
		patient.setMalade(false);
		patient.setDateNaissance(new Date());
		patient.setScore(329);

		Patient patient2 = new Patient(null ,"yassine", new Date(), true , 23);
		patientRepository.save(patient);

		Patient patient3 = patient.builder()
				.id(null)
				.nom("fakhir")
				.malade(false)
				.dateNaissance(new Date())
				.score(1000)
				.build();
		patientRepository.save(patient2);
		patientRepository.save(patient3);
		patientRepository.save(new Patient(null,"pedro",new Date(),true,27));
		patientRepository.save(new Patient(null,"said",new Date(),true,33));
		patientRepository.save(new Patient(null,"ahmed",new Date(),true,23));




	}
}
