package edu.nyu.cif2022.homework4.solution;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.assertj.core.api.BDDAssertions.then;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MutableScheduledTaskTest {
	
	private MutableScheduledTask task;
	
	private Runnable runnable;
	
	@BeforeEach
	void before_each() {
		runnable = mock(Runnable.class);
		
		task = new MutableScheduledTask();
		task.wrap(100, runnable, false, 0);
	}
	
	@Test
	void initial_delta_minus_one() {
		// when
		task.wrap(100, runnable);
		
		// then
		then(task.delta()).isEqualTo(-1);
	}
	
	@Test
	void initial_repeatable_false() {
		// when
		task.wrap(100, runnable);
		
		// then
		then(task.isRepeatable()).isFalse();
	}
	
	@Test
	void initially_isDone_is_false() {
		// then
		then(task.isDone()).isFalse();
	}
	
	@Test
	void after_cancel_isDone_is_true() {
		// when
		task.cancel();
		
		// then
		then(task.isDone()).isTrue();
	}
	
	@Test
	void run_run_the_task() {
		// when
		task.run();
		
		// then
		verify(runnable).run();
	}
	
	@Test
	void second_run_does_not_run_the_task() {
		// for
		task.run();
		
		// when
		task.run();
		
		// then
		verify(runnable).run();
	}
	
	@Test
	void after_run_isDone_is_true() {
		// when
		task.run();
		
		// then
		then(task.isDone()).isTrue();
	}
	
	@Test
	void after_cancel_run_does_not_run_the_task() {
		// for
		task.cancel();
		
		// when
		task.run();
		
		// then
		verify(runnable, never()).run();
	}
	
	@Test
	void repeatble_task_runs_twice() {
		// for
		task.wrap(100, runnable, true, 0);
		task.run();
			
		// when
		task.run();
				
		// then
		verify(runnable, times(2)).run();		
	}
	
	@Test
	void after_run_repeatable_task_isDone_is_false() {
		// for
		task.wrap(100, runnable, true, 0);
		
		// when
		task.run();
		
		// then
		then(task.isDone()).isFalse();
	}
	
	@Test
	void repeatble_task_after_cancel_stops_running() {
		// for
		task.wrap(100, runnable, true, 0);
		task.run();
		task.cancel();
			
		// when
		task.run();
				
		// then
		verify(runnable).run();		
	}
	
	@Test
	void set_get_execution_time() {
		// for
		task.wrap(100, runnable, true, 0);
			
		// when
		task.executionTime(122);
				
		// then
		then(task.executionTime()).isEqualTo(122);
	}
	
	@Test
	void set_get_delta_time() {
		// when
		task.wrap(100, runnable, true, 100);
				
		// then
		then(task.delta()).isEqualTo(100);
	}
}
