package ua.edu.ucu.tempseries;

public class TempSummaryStatistics {
    public double getAvgTemp() {
        return avgTemp;
    }

    //TemperatureSeriesAnalysis nw = new TemperatureSeriesAnalysis();
    private final double avgTemp;
    final private double minTmp;

    public double getMinTmp() {
        return minTmp;
    }

    public double getMaxTmp() {
        return maxTmp;
    }

    public double getDevTmp() {
        return devTmp;
    }

    final private double maxTmp;
    final private double devTmp;
    public TempSummaryStatistics(double avgTemp, double minTmp, double maxTmp, double devTmp){
        this.avgTemp = avgTemp;
        this.minTmp = minTmp;
        this.maxTmp = maxTmp;
        this.devTmp = devTmp;
    }

}
