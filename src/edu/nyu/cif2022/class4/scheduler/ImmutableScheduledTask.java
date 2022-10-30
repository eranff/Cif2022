package edu.nyu.cif2022.class4.scheduler;

import edu.nyu.cif2022.class4.scheduler.v4.ScheduledTask;

/**
 * An abstract immutable scheduled task.
 */
public abstract class ImmutableScheduledTask implements ScheduledTask {
	
	private long executionTime;
	
	public ImmutableScheduledTask(long executionTime) {
		this.executionTime = executionTime;
	}

	@Override
	public int compareTo(ScheduledTask o) {
		var diff = executionTime - o.executionTime();
		if (diff < 0) {
			return -1;
		} else if (diff == 0) {
			return 0;
		} else {
			return 1;
		}
	}

	@Override
	public long executionTime() {
		return executionTime;
	}

}
