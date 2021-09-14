package test.junit;

import org.junit.Test;

import br.com.project.report.util.DateUtils;

public class TestApp {
	
	@Test
	public void testData() {
		
		System.out.println(DateUtils.getDateAtualReportName());
	}

}
