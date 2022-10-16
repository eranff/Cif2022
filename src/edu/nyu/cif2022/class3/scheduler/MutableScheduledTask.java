package edu.nyu.cif2022.class3.scheduler;

/**
 * A mutable scheduled task that wraps a {@code Runnable}.
 */
public class MutableScheduledTask implements ScheduledTask {
	
	private long executionTime;
	private Runnable task;
	
	/**
	 * Constructs an empty {@code MutableScheduledTask}.
	 */
	public MutableScheduledTask() {
	}
	
	/**
	 * Wraps an execution time and a task.
	 * 
	 * @param executionTime the execution time for the task
	 * @param task the task to execute at the specified {@code executionTime}
	 */
	void wrap(long executionTime, Runnable task) {
		this.executionTime = executionTime;
	}

	@Override
	public void run() {
		task.run();
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
