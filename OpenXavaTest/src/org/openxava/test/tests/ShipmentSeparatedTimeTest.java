package org.openxava.test.tests;

import org.openxava.tests.*;


/**
 * 
 * @author Javier Paniza
 */ 
public class ShipmentSeparatedTimeTest extends ModuleTestBase {
	
	public ShipmentSeparatedTimeTest(String testName) {
		super(testName, "ShipmentSeparatedTime");		
	}
	
	public void testDateTimeSeparatedCalendarEditor() throws Exception {
		execute("List.viewDetail", "row=0");
		String [] emptyTime = { "", "" };
		assertValues("time", emptyTime); // TMP FALLA
		String [] time = { "5/27/09", "11:59 AM" };
		setValues("time", time);
		execute("CRUD.save");
		assertValues("time", emptyTime); 
		execute("Mode.list");
		execute("List.viewDetail", "row=0");
		assertValues("time", time); 
		setValues("time", emptyTime);
		execute("CRUD.save");
		assertNoErrors();
	}
	
	public void testDateTimeSeparatedCalendarEditorInSpanishCroatian() throws Exception { 
		setLocale("es");
		assertDateTimeSeparatedCalendarEditor("/", "0:00"); // TMP FALLA
		setLocale("hr");
		assertDateTimeSeparatedCalendarEditor(".", "00:00");		
	}

	public void assertDateTimeSeparatedCalendarEditor(String separator, String timeZero) throws Exception { 
		execute("List.viewDetail", "row=0");
		
		assertTime("30" + separator + "6" + separator + "14", "13:30", "30" + separator + "06" + separator + "2014", "13:30");
		assertTime("30" + separator + "6" + separator + "14", "", "30" + separator + "06" + separator + "2014", timeZero); 
		assertTime("30" + separator + "6" + separator + "2014", "13:30", "30" + separator + "06" + separator + "2014", "13:30");
		assertTime("30" + separator + "6" + separator + "2014", "", "30" + separator + "06" + separator + "2014", timeZero);		
		
		String [] emptyTime = { "", "" };
		setValues("time", emptyTime);
		execute("CRUD.save");
		assertNoErrors();
	}

	private void assertTime(String date, String time, String expectedDate, String expectedTime) throws Exception { 
		System.out.println("[ShipmentSeparatedTimeTest.assertTime] date=" + date); // tmp
		System.out.println("[ShipmentSeparatedTimeTest.assertTime] expectedDate=" + expectedDate); // tmp
		String [] dateTime = { date, time };
		setValues("time", dateTime);
		execute("CRUD.save");
		assertNoErrors();
		execute("Navigation.first");
		String [] expectedDateTime = { expectedDate, expectedTime };
		assertValues("time", expectedDateTime);
	}
	
	public void testProva() throws Exception { // tmp
		// TMP ME QUED� POR AQU�: TODAV�A FALLA
		setLocale("es");
		assertDateTimeSeparatedCalendarEditor2("/", "0:00"); // TMP FALLA
	}
	
	public void assertDateTimeSeparatedCalendarEditor2(String separator, String timeZero) throws Exception { // tmp 
		execute("List.viewDetail", "row=0");
		assertTime2("30" + separator + "6" + separator + "14", "13:30", "30" + separator + "06" + separator + "2014", "13:30");
	}

	private void assertTime2(String date, String time, String expectedDate, String expectedTime) throws Exception { // tmp
		System.out.println("[ShipmentSeparatedTimeTest.assertTime2] date=" + date); // tmp
		System.out.println("[ShipmentSeparatedTimeTest.assertTime2] expectedDate=" + expectedDate); // tmp
		String [] expectedDateTime = { expectedDate, expectedTime };
		printHtml(); 
		assertValues("time", expectedDateTime);
	}

						
}
