package observer_pattern.virtual_monitoring_application;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}