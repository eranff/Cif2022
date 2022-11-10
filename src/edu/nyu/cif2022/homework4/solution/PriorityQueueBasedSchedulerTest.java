package edu.nyu.cif2022.homework4.solution;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import static org.assertj.core.api.BDDAssertions.then;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class PriorityQueueBasedSchedulerTest {
	
	private Runnable task1;
	private Runnable task2;
	private Runnable task3;
	
	private PriorityQueueBasedScheduler scheduler;
	
	@BeforeEach
	void before_each() {
		task1 = mock(Runnable.class);
		task2 = mock(Runnable.class);
		task3 = mock(Runnable.class);
		
		scheduler = new PriorityQueueBasedScheduler();
	}
	
	@Test
	void schedule_at_execution() {
		// for
		scheduler.scheduleAt(11, task1);
		
		// when
		scheduler.setTimeAndExecute(12);
		
		// then
		verify(task1).run();
	}
	
	@Test
	void after_execution_status_is_done() {
		// for
		var async = scheduler.scheduleAt(11, task1);
		
		// when
		scheduler.setTimeAndExecute(12);
		
		// then
		then(async.isDone()).isTrue();
	}
	
	@Test
	void schedule_at_not_executed_twice_execution() {
		// for
		scheduler.scheduleAt(11, task1);
		scheduler.setTimeAndExecute(12);
		
		// when
		scheduler.setTimeAndExecute(22);
		
		// then
		verify(task1).run();
	}
	
	@Test
	void schedule_at_not_executed_before_time() {
		// for
		scheduler.scheduleAt(11, task1);
		
		// when
		scheduler.setTimeAndExecute(5);
		
		// then
		verify(task1, never()).run();
	}

	@Test
	void schedule_at_after_cancel_task_is_canceled() {
		// for
		var async = scheduler.scheduleAt(11, task1);
		
		// when
		async.cancel();
		
		// then
		then(async.isDone()).isEqualTo(true);
	}

	@Test
	void schedule_in_execution() {
		// for
		scheduler.setTimeAndExecute(5);
		scheduler.scheduleIn(11, task1);
		
		// when
		scheduler.setTimeAndExecute(16);
		
		// then
		verify(task1).run();
	}
	
	@Test
	void schedule_in_not_executed_twice_execution() {
		// for
		scheduler.setTimeAndExecute(12);
		scheduler.scheduleIn(11, task1);
		scheduler.setTimeAndExecute(30);
		
		// when
		scheduler.setTimeAndExecute(40);
		
		// then
		verify(task1).run();
	}
	
	@Test
	void schedule_in_not_executed_before_time() {
		// for
		scheduler.setTimeAndExecute(5);
		scheduler.scheduleIn(11, task1);
		
		// when
		scheduler.setTimeAndExecute(13);
		
		// then
		verify(task1, never()).run();
	}
	
	@Test
	void schedule_every_executed_immidieatly() {
		// for
		scheduler.setTimeAndExecute(5);
		scheduler.scheduleEvery(5, task1);
		
		// when
		scheduler.setTimeAndExecute(10);
		
		// then
		verify(task1).run();
	}
	
	
	@Test
	void schedule_every_not_executed_before_delta_passed() {
		// for
		scheduler.setTimeAndExecute(5);
		scheduler.scheduleEvery(8, task1);
		scheduler.setTimeAndExecute(8);
		
		// when
		scheduler.setTimeAndExecute(15);
		
		// then
		verify(task1).run();
	}
	
	
	@Test
	void schedule_every_executed_after_delta_passed() {
		// for
		scheduler.setTimeAndExecute(5);
		scheduler.scheduleEvery(8, task1);
		scheduler.setTimeAndExecute(7);
		
		// when
		scheduler.setTimeAndExecute(16);
		
		// then
		verify(task1, times(2)).run();
	}
	
	@Test
	void schedule_every_cancel_task_stops_executions() {
		// for
		scheduler.setTimeAndExecute(5);
		var async = scheduler.scheduleEvery(8, task1);
		scheduler.setTimeAndExecute(7);
		async.cancel();
		
		// when
		scheduler.setTimeAndExecute(16);
		
		// then
		verify(task1).run();
	}

	@Test
	void tasks_are_executed_by_order() {
		// for
		scheduler.scheduleAt(11, task1);
		scheduler.scheduleAt(12, task2);
		scheduler.scheduleAt(10, task3);
		
		// when
		scheduler.setTimeAndExecute(20);
		
		// then
		var inOrder = Mockito.inOrder(task3, task1, task2);
		inOrder.verify(task3).run();
		inOrder.verify(task1).run();
		inOrder.verify(task2).run();
	}
	
	@Test
	void tasks_are_executed_by_order_with_every_task() {
		// for
		scheduler.setTimeAndExecute(5);
		scheduler.scheduleAt(11, task1);
		scheduler.scheduleAt(12, task2);
		scheduler.scheduleEvery(10, task3);
		scheduler.setTimeAndExecute(13);
		
		// when
		scheduler.setTimeAndExecute(33);
		
		// then
		var inOrder = Mockito.inOrder(task3, task1, task2, task3);
		inOrder.verify(task3).run();
		inOrder.verify(task1).run();
		inOrder.verify(task2).run();
		inOrder.verify(task3).run();
	}
}
