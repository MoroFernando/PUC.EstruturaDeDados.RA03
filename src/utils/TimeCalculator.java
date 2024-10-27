package utils;

public class TimeCalculator {
  private long startTime;
  private long endTime;

  public void start() {
      startTime = System.currentTimeMillis();
  }

  public double stop() {
      endTime = System.currentTimeMillis();
      long durationInMillis = endTime - startTime;
      return durationInMillis;
  }
}
