package edu.nyu.cif2022.homework4.solution;

/**
 * A reusable {@code ScheduledTask} that can be compared to other 
 * {@code ScheduledTask} based on execution time, and its also an 
 * {@code Async} which represents to the wrapped task. 
 */
public class MutableScheduledTask implements 
		ScheduledTask, Comparable<ScheduledTask>, Async {
	
	private boolean cancelled;
	private boolean done;
	private boolean repeatable;
	
	private long delta;
	
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
		this.task = task;
		done = false;
		cancelled = false;
		repeatable = false;
		delta = -1;
	}
	
	/**
	 * Wraps an execution time and a task.
	 * 
	 * @param executionTime the execution time for the task
	 * @param task the task to execute at the specified {@code executionTime}
	 * @param repeateble true if the task is repeatable
	 * @param delta milliseconds between consecutive execution of the this task
	 */
	void wrap(long executionTime, Runnable task, boolean repeatable, long delta) {
		this.executionTime = executionTime;
		this.task = task;
		this.repeatable = repeatable;
		this.delta = delta;
		done = false;
		cancelled = false;
		repeatable = false;
	}


	@Override
	public void run() {
		if (!cancelled && !done) {
			this.task.run();
		}
		if (!repeatable) {
			done = true;
		}
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
	public long delta() {
		return delta;
	}

	@Override
	public void cancel() {
		cancelled = true;
	}

	@Override
	public boolean isDone() {
		return done || cancelled;
	}
	
	@Override
	public boolean isRepeatable() {
		return repeatable;
	}
	
	@Override
	public void executionTime(long executionTime) {
		this.executionTime = executionTime;
	}
}
