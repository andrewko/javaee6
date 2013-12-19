package javaee6.server.ejb.timer;

import javax.annotation.Resource;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;
import javax.ejb.Timeout;
import javax.ejb.Timer;
import javax.ejb.TimerConfig;
import javax.ejb.TimerService;

@Singleton
public class TimerBean {

	private int count = 0;

	@Resource
	private TimerService timerService;

	@Timeout
	@Lock(LockType.WRITE)
	public void execute(Timer timer) {
		System.out.println("execution " + ++count);

	}

	public void schedule() {
		System.out.println("creating new timer");
		TimerConfig timerConfig = new TimerConfig();
		timerService.createIntervalTimer(1000, 2000, timerConfig );
	}

	public void stopAllTimers() {
		System.out.println("stopping all timers");
		for (Timer timer : timerService.getTimers()) {
			timer.cancel();
		}
	}
}
