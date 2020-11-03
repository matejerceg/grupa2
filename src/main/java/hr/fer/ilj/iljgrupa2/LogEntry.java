package hr.fer.ilj.iljgrupa2;

public class LogEntry {
	private long id;
	private String time; 
	private String level;
	private String message;
	private String thread;
	private int pid; 
	
	
	public LogEntry(String time, String level, String message, String thread, int pid, long id) {
		    this.time = time;
		    this.level = level;
		    this.message = message;
		    this.thread = thread;
		    this.pid = pid;
		    this.id = id;
	}
	public LogEntry() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public void setTime(String time) {
		this.time = time;
	}

	public String getTime() {
		return time;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getLevel() {
		return level;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setThread(String thread) {
		this.thread = thread;
	}

	public String getThread() {
		return thread;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getPid() {
		return pid;
	}
	@Override
	public String toString() {
		return "LogEntry [id=" + id + ", time=" + time + ", level=" + level + ", message=" + message + ", thread="
				+ thread + ", pid=" + pid + "]";
	}
}
