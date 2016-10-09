package ua.edu.ucu.tempseries;

import java.util.Arrays;
import java.util.InputMismatchException;

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
        double veryClose = Math.abs(temperatureSeries[0]);
        double close = 0;
        for(int i = 0; i < temperatureSeries.length; i++){
            if(Math.abs(temperatureSeries[i]) < veryClose){
                veryClose = Math.abs(temperatureSeries[i]);
            }
        }
        for(int i = 0;i < temperatureSeries.length; i++){
            if (temperatureSeries[i] == veryClose){
                close = veryClose;
            }
        }if(close == 0){
            close = -veryClose;
        }
        return close;
    }

    public double findTempClosestToValue(double tempValue) {
        double veryClose = Math.abs(temperatureSeries[0] - tempValue);
        double close = 0;
        double[] myArray = new double[2];
        for(int i = 0; i < temperatureSeries.length; i++){
            if(Math.abs(temperatureSeries[i] - tempValue) <= veryClose){
                veryClose = Math.abs(temperatureSeries[i] - tempValue);
            }
        }
        for(int i = 0;i < temperatureSeries.length; i++){
            int j = 0;
            if (Math.abs(temperatureSeries[i] - tempValue) == veryClose){
                myArray[j] = temperatureSeries[i];
                j++;
            }
            Arrays.sort(myArray);
        }if(myArray[0] != 0 && myArray[1] != 0){
            close = myArray[1];
        }if(myArray[0] == 0 && myArray[1] != 0){
            close = myArray[1];
        }else{
            close = myArray[0];
        }
        return close;

    }

    public double[] findTempsLessThen(double tempValue) {
        double [] myArray = new double[temperatureSeries.length];
        int counter = 0;
        for(int i = 0; i < temperatureSeries.length; i++){
            if(temperatureSeries[i] < tempValue){
                myArray[counter] = temperatureSeries[i];
                counter++;
            }
        }
        double [] lessArray = new double[counter];
        for(int i = 0; i < counter; i++){
            lessArray[i] = myArray[i];
        }
        return lessArray;
    }

    public double[] findTempsGreaterThen(double tempValue) {

        double [] myArray = new double[temperatureSeries.length];
        int counter = 0;
        for(int i = 0; i < temperatureSeries.length; i++){
            if(temperatureSeries[i] >= tempValue){
                myArray[counter] = temperatureSeries[i];
                counter++;
            }
        }
        double [] greaterArray = new double[counter];
        for(int i = 0; i < counter; i++){
            greaterArray[i] = myArray[i];
        }
        return greaterArray;
    }

    public TempSummaryStatistics summaryStatistics() {

        return null;
    }

    public int addTemps(double... temps) {
        for(int i = 0; i<temps.length; i++){
            if(temps[i] < -273){
                throw new InputMismatchException();
            }
        }
        int globalSum = 0;
        if (temps.length <= temperatureSeries.length){
            double[] temperatureSeriesBigger = new double[temperatureSeries.length*2];
            int lastIndex = temperatureSeries.length;
            for(int i = 0; i < lastIndex; i++){
                temperatureSeriesBigger[i] = temperatureSeries[i];
                globalSum += temperatureSeriesBigger[i];
            }
            for(int i =0; i< temps.length; i++){
                temperatureSeriesBigger[i+lastIndex] = temps[i];
                globalSum += temperatureSeriesBigger[i+lastIndex];

            }
        }else{
            int bigNumber = temps.length/temperatureSeries.length +1;
            double[] temperatureSeriesBigger = new double[temperatureSeries.length*bigNumber];
            int lastIndex = temperatureSeries.length;
            for(int i = 0; i < lastIndex; i++){
                temperatureSeriesBigger[i] = temperatureSeries[i];
                globalSum += temperatureSeriesBigger[i];
            }
            for(int i =0; i< temps.length; i++){
                temperatureSeriesBigger[i+lastIndex] = temps[i];
                globalSum += temperatureSeriesBigger[i+lastIndex];

            }
        }

        return globalSum;
    }
}
