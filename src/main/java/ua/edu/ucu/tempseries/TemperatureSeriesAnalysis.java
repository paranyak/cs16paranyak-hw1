package ua.edu.ucu.tempseries;

public class TemperatureSeriesAnalysis {
    protected double[] temperatureSeries;

    public TemperatureSeriesAnalysis() {

    }

    public TemperatureSeriesAnalysis(double[] temperatureSeries) {
        this.temperatureSeries = temperatureSeries;
        if(temperatureSeries.length == 0)
            throw new IllegalArgumentException();

    }

    public double average() {

        double average_number = 0;
        for(int i = 0; i < temperatureSeries.length; i++){
            average_number += temperatureSeries[i];
            }
        average_number = average_number/temperatureSeries.length;
        return average_number;
    }

    public double deviation() {
        return 0;
    }

    /*public double min() {
        double min_number = 0;
        int i, j;
        for (i = 1; i < temperatureSeries.length; i++) {
            newValue = temperatureSeries[i];
            j = i;
            while (j > 0 && temperatureSeries[j - 1] > newValue) {
                temperatureSeries[j] = temperatureSeries[j - 1];
                j--;
            }
            temperatureSeries[j] = newValue;
        }
        return min_number;
    }*/

    public double max() {
        return 0;
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
