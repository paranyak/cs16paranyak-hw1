package ua.edu.ucu.tempseries;

public class TemperatureSeriesAnalysis {
    protected double[] temperatureSeries;

    public TemperatureSeriesAnalysis() {

    }

    public TemperatureSeriesAnalysis(double[] temperatureSeries) {
        this.temperatureSeries = temperatureSeries;
        if (temperatureSeries.length == 0)
            throw new IllegalArgumentException();

    }

    public double average() {

        double average_number = 0;
        for (int i = 0; i < temperatureSeries.length; i++) {
            average_number += temperatureSeries[i];
        }
        average_number = average_number / temperatureSeries.length;
        return average_number;
    }

    public double deviation() {
        return 0;
    }

    public double min() {
        double min_number = temperatureSeries[0];
        int i;
        for (i = 0; i < temperatureSeries.length; i++) {
            if (temperatureSeries[i] < min_number) {
                min_number = temperatureSeries[i];
            }
        }
        return min_number;
    }

    public double max() {
        double max_number = temperatureSeries[0];
        int i;
        for (i = 0; i < temperatureSeries.length; i++) {
            if (temperatureSeries[i] > max_number) {
                max_number = temperatureSeries[i];
            }
        }
        return max_number;
    }

    public double findTempClosestToZero() {
        return 0;
    }

    public double findTempClosestToValue(double tempValue) {
        return 0;
    }

    public double[] findTempsLessThen(double tempValue) {
        return null;
    }

    public double[] findTempsGreaterThen(double tempValue) {
        return null;
    }

    public TempSummaryStatistics summaryStatistics() {
        return null;
    }

    public int addTemps(double... temps) {
        return 0;
    }
}
