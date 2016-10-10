package ua.edu.ucu.tempseries;

public class TempSummaryStatistics {
    //TemperatureSeriesAnalysis nw = new TemperatureSeriesAnalysis();
    public final double avgTemp;
    final public double minTmp;
    final public double maxTmp;
    final public double devTmp;
    public TempSummaryStatistics(double avgTemp, double minTmp, double maxTmp, double devTmp){
        this.avgTemp = avgTemp;
        this.minTmp = minTmp;
        this.maxTmp = maxTmp;
        this.devTmp = devTmp;
    }

}
