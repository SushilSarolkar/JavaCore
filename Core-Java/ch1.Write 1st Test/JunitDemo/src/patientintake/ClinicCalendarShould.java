package patientintake;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.junit.Test;

public class ClinicCalendarShould {

	@Test
	public void allowEntryOfAnApointment() {
		ClinicCalendar calendar=new ClinicCalendar(LocalDate.now());
		calendar.addAppointment("Sush", "Sarolkar", "rathi", "4/02/2019 11:33 AM");
		List<PatientAppointment> appointments=calendar.getAppointments();
		assertNotNull(appointments);
		assertEquals(1,appointments.size());
		PatientAppointment enterdApppointment=appointments.get(0);
		assertEquals("Sush",enterdApppointment.getPatientFirstName());
		assertEquals("Sarolkar",enterdApppointment.getPatientLastName());
		assertEquals(Doctor.rathi,enterdApppointment.getDoctor());
		/*assertNotSame(Doctor.rathi, enterdApppointment.getDoctor());*/
		
	}
	@Test
	public void returnTrueForHasAppointmentsIfThereAreAppointments(){
		ClinicCalendar calendar=new ClinicCalendar(LocalDate.now());
		calendar.addAppointment("Sush", "Sarolkar", "rathi", "04/02/2019 11:33 AM");
		assertTrue(calendar.hasAppointment(LocalDate.of(2019, 04, 02)));
	}
	@Test
	public void returnFalseForHasAppointmentsIfThereAreAppointments(){
		ClinicCalendar calendar=new ClinicCalendar(LocalDate.now());
		assertFalse(calendar.hasAppointment(LocalDate.of(2019, 04, 02)));
	}
	@Test
	public void returnCurrentDaysAppointments(){
		ClinicCalendar calendar=new ClinicCalendar(LocalDate.now());
		calendar.addAppointment("sushil", "sarolkar", "rathi", "09/09/2019 10:20 PM");
		calendar.addAppointment("sushil", "sarolkar", "rathi", "09/09/2019 10:30 PM");
		calendar.addAppointment("sushil", "sarolkar", "rathi", "10/09/2019 11:00 PM");
		assertEquals(3,calendar.getAppointments().size());
		assertEquals(calendar.patientAppointment(),calendar.getAppointments());
		
	}

}
