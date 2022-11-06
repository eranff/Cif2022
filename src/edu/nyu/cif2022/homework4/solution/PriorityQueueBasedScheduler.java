package edu.nyu.cif2022.homework4.solution;

import edu.nyu.cif2022.homework3.solution.ZGPriorityQueue;

public class PriorityQueueBasedScheduler implements Scheduler {
	
	private ZGPriorityQueue<ScheduledTask> tasks;
	private long time;
	
	public PriorityQueueBasedScheduler() {
		tasks = new ZGPriorityQueue<>();
	}

	@Override
	public Async scheduleAt(long executionTime, Runnable task) {
		var scheduledTask = new MutableScheduledTask();
		scheduledTask.wrap(executionTime, task);
		tasks.add(scheduledTask);
		return scheduledTask;
	}

	@Override
	public Async scheduleIn(long delta, Runnable task) {
		var scheduledTask = new MutableScheduledTask();
		scheduledTask.wrap(time + delta, task);
		tasks.add(scheduledTask);
		return scheduledTask;
	}

	@Override
	public Async scheduleEvery(long delta, Runnable task) {
		var scheduledTask = new MutableScheduledTask();
		scheduledTask.wrap(time,  task,  true,  delta);
		tasks.add(scheduledTask);
		return scheduledTask;
	}
	
	/**
	 * Executes all the tasks with target execution time lower or equal to 
	 * the specified {@code time}.
	 *  
	 * @param time the time for earlier tasks to be executed.
	 */
	public void setTimeAndExecute(long time) {
		this.time = time;
		while (tasks.peek() != null && tasks.peek().executionTime() <= time) {
			var task = tasks.remove();
			task.run();
			if (task.isRepeatable()) {
				task.executionTime(time + task.delta());
				tasks.add(task);
			}
		}
	}
}
