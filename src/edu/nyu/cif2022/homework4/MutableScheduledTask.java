package edu.nyu.cif2022.homework4;

/**
 * A reusable {@code ScheduledTask} that can be compared to other 
 * {@code ScheduledTask} based on execution time, and its also an 
 * {@code Async} with respect to the wrapped task. 
 */
public class MutableScheduledTask implements 
		ScheduledTask, Comparable<ScheduledTask>, Async {
	
	private boolean cancelled;
	private boolean done;
	
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
		done = false;
		cancelled = false;
	}

	@Override
	public void run() {
		// implement
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

	@Override
	public void cancel() {
		cancelled = true;
	}

	@Override
	public boolean isDone() {
		return done;
	}
}
