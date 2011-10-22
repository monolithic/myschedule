package myschedule.web.servlet.app.handler.pagedata;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

public class DashboardListPageData extends PageData {
	@Getter
	protected List<SchedulerRow> schedulerRows = new ArrayList<SchedulerRow>();
	
	@Getter @Setter
	public static class SchedulerRow {
		protected String configId;
		protected String name;
		protected boolean initialized;
		protected boolean started;
		protected Date runningSince;
		protected int numOfJobs;
		protected boolean connExceptionExists;
		protected String connExceptionString; // If started, but failed to get information.
	}
}