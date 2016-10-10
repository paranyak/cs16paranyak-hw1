package ua.edu.ucu.tempseries;

import static org.junit.Assert.*;
import org.junit.Test;

import java.sql.Array;
import java.util.Arrays;
import java.util.InputMismatchException;

public class TemperatureSeriesAnalysisTest {

    @Test
    public void testAverageWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;

        // call tested method
        double actualResult = seriesAnalysis.average();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAverageWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.average();
    }

    @Test
    public void testAverage() {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 1.0;

        double actualResult = seriesAnalysis.average();
        
        assertEquals(expResult, actualResult, 0.00001);        
    }
    @Test(expected = IllegalArgumentException.class)
    public void testminWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.min();
    }
    @Test
    public void testMin() {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -5.0;

        double actualResult = seriesAnalysis.min();

        assertEquals(expResult, actualResult, 0.00001);
    }
    @Test
    public void testMinSecond() {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0, -7.0, 3.7, -1.0, 10.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -7.0;

        double actualResult = seriesAnalysis.min();

        assertEquals(expResult, actualResult, 0.00001);
    }
    @Test
    public void testMinWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;

        // call tested method
        double actualResult = seriesAnalysis.min();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testmaxWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.max();
    }
    @Test
    public void testMax() {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 5.0;

        double actualResult = seriesAnalysis.max();

        assertEquals(expResult, actualResult, 0.00001);
    }
    @Test
    public void testMaxSecond() {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0, -7.0, 3.7, -1.0, 10.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 10.0;

        double actualResult = seriesAnalysis.max();

        assertEquals(expResult, actualResult, 0.00001);
    }
    @Test
    public void testMaxWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;

        // call tested method
        double actualResult = seriesAnalysis.max();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testTempClosestToZeroWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;

        // call tested method
        double actualResult = seriesAnalysis.findTempClosestToZero();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }
    @Test
    public void testTempClosestToZero()  {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 1.0;

        double actualResult = seriesAnalysis.findTempClosestToZero();

        assertEquals(expResult, actualResult, 0.00001);
    }
    @Test
    public void testTempClosestToZeroSecond() {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0, -7.0, 3.7, -1.0, 10.0, 0.5};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 0.5;

        double actualResult = seriesAnalysis.findTempClosestToZero();

        assertEquals(expResult, actualResult, 0.00001);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testZeroWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.findTempClosestToZero();
    }
    @Test
    public void testTempClosestToZeroThird() {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0, -7.0, 3.7, -1.0, 10.0, 0.5, -0.25};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -0.25;

        double actualResult = seriesAnalysis.findTempClosestToZero();

        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testTempClosestToFarValue()  {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 5.0;
        double actualResult = seriesAnalysis.findTempClosestToValue(19.0);

        assertEquals(expResult, actualResult, 0.00001);
    }
    @Test
    public void testTempClosestToValueOne()  {
        double[] temperatureSeries = {-2.0, 22.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 22.0;

        double actualResult = seriesAnalysis.findTempClosestToValue(10.0);

        assertEquals(expResult, actualResult, 0.00001);
    }
    @Test
    public void testTempClosestToValueTwo()  {
        double[] temperatureSeries = {-2.0, 22.0, 9.0, 1.2, 8.7, 5.3};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -2.0;

        double actualResult = seriesAnalysis.findTempClosestToValue(-0.8);

        assertEquals(expResult, actualResult, 0.00001);
    }
    @Test
    public void testTempClosestToValueThree()  {
        double[] temperatureSeries = {-2.0, 22.0, 88.0, 19.3, 90.5, 11.0, 52.7};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 11.0;

        double actualResult = seriesAnalysis.findTempClosestToValue(12.0);

        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.findTempClosestToValue(9.0);
    }
    @Test
    public void testTempClosestToValueWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;

        // call tested method
        double actualResult = seriesAnalysis.findTempClosestToValue(9.0);

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testLessWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.findTempsLessThen(9.0);
    }
    @Test
    public void testTempLessThenOne() {
        double[] temperatureSeries = {-2.0, 22.0, 9.0, 1.0, 3.0, 56.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double [] expResult = {-2.0, 9.0, 1.0, 3.0};
        double [] actualResult = seriesAnalysis.findTempsLessThen(10.0);

        assertEquals(Arrays.toString(expResult), Arrays.toString(actualResult));

    }
    @Test
    public void testTempLessThenTwo() {
        double[] temperatureSeries = {-2.0, 22.0, 9.0, 1.0, 3.0, 56.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double [] expResult = {-2.0,1.0, 3.0};
        double [] actualResult = seriesAnalysis.findTempsLessThen(5.0);

        assertEquals(Arrays.toString(expResult), Arrays.toString(actualResult));

    }

    @Test
    public void testTempLessThenThree() {
        double[] temperatureSeries = {-2.0, -2.5, -9.0, -1.0, -3.0, -5.0, -6.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double [] expResult = {-2.0, -2.5, -9.0, -1.0, -3.0, -5.0, -6.0};
        double [] actualResult = seriesAnalysis.findTempsLessThen(10.0);

        assertEquals(Arrays.toString(expResult), Arrays.toString(actualResult));

    }
    @Test
    public void testTempLessThenFour() {
        double[] temperatureSeries = {-2.0, 14.0, 4.0, 7.0, 3.0, 10.0, -2.5};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double [] expResult = {-2.5};
        double [] actualResult = seriesAnalysis.findTempsLessThen(-2.1);

        assertEquals(Arrays.toString(expResult), Arrays.toString(actualResult));

    }
    @Test
    public void testTempLessThenWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double [] expResult = {-1.0};

        // call tested method
        double [] actualResult = seriesAnalysis.findTempsLessThen(9.0);

        // compare expected result with actual result
        assertEquals(Arrays.toString(expResult), Arrays.toString(actualResult));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testGreaterWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.findTempsGreaterThen(9.0);
    }
    @Test
    public void testTempGreaterThenOne() {
        double[] temperatureSeries = {-2.0, 22.0, 9.0, 1.0, 3.0, 56.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double [] expResult = {22.0, 9.0, 1.0, 3.0, 56.0};
        double [] actualResult = seriesAnalysis.findTempsGreaterThen(1.0);

        assertEquals(Arrays.toString(expResult), Arrays.toString(actualResult));

    }
    @Test
    public void testTempGreaterThenTwo() {
        double[] temperatureSeries = {-2.0, 22.0, 9.0, 1.0, 3.0, 56.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double [] expResult = {-2.0, 22.0, 9.0, 1.0, 3.0, 56.0};
        double [] actualResult = seriesAnalysis.findTempsGreaterThen(-2.0);

        assertEquals(Arrays.toString(expResult), Arrays.toString(actualResult));

    }

    @Test
    public void testTempsGreaterThenThree() {
        double[] temperatureSeries = {-2.0, -2.5, -9.0, -1.0, -3.0, -5.0, -6.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double [] expResult = {-2.0, -2.5, -1.0, -3.0, -5.0};
        double [] actualResult = seriesAnalysis.findTempsGreaterThen(-5.0);

        assertEquals(Arrays.toString(expResult), Arrays.toString(actualResult));

    }
    @Test
    public void testTempGreaterThenFour() {
        double[] temperatureSeries = {-2.0, -4.0, 4.0, 7.0, 3.0, 10.0, -2.5};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double [] expResult = {10.0};
        double [] actualResult = seriesAnalysis.findTempsGreaterThen(10.0);

        assertEquals(Arrays.toString(expResult), Arrays.toString(actualResult));

    }
    @Test
    public void testTempGreaterThenWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double [] expResult = {1.0};

        // call tested method
        double [] actualResult = seriesAnalysis.findTempsGreaterThen(0.0);

        // compare expected result with actual result
        assertEquals(Arrays.toString(expResult), Arrays.toString(actualResult));
    }
    @Test(expected = InputMismatchException.class)
    public void testAddingFail() {
        double[] temperatureSeries = {15.9, 10.0, 19.7};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.addTemps(1.3,-212, -556.9, 3.0);
    }
    @Test
    public void testTempAddingOneSimple() {
        double[] temperatureSeries = {-2.0, -4.0, 4.0, 7.0, 3.0, 10.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        int expResult = 69;
        int actualResult = seriesAnalysis.addTemps(10.0, 11.0, 12.0, 18.0);

        assertEquals(expResult,actualResult);

    }
    @Test
    public void testTempAddingBigger() {
        double[] temperatureSeries = {-2.0, -4.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        int expResult = 69;
        int actualResult = seriesAnalysis.addTemps(10.0, 11.0, 12.0, 18.0, 4.0, 7.0, 3.0, 10.0);

        assertEquals(expResult, actualResult);
    }
    @Test
    public void testTempAddingEmpty() {
        double[] temperatureSeries = {-2.0, -4.0, 10.0, 11.0, 12.0, 18.0, 4.0, 7.0, 3.0, 10.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        int expResult = 69;
        int actualResult = seriesAnalysis.addTemps();

        assertEquals(expResult, actualResult);
    }
    @Test
    public void testTempAddingZero() {
        double[] temperatureSeries = {-2.0, -4.0, 10.0, 11.0, 12.0, 18.0, 4.0, 7.0, 3.0, 10.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        int expResult = 0;
        int actualResult = seriesAnalysis.addTemps(2.0, 4.0, -10.0, -11.0, -12.0, -18.0, -4.0, -7.0, -3.0, -10.0);

        assertEquals(expResult, actualResult);
    }
    @Test
    public void testDeviationOne() {
        double[] temperatureSeries = {9, 2, 5, 4, 12, 7};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 3.61939;

        double actualResult = seriesAnalysis.deviation();

        assertEquals(expResult, actualResult, 0.00001);
    }
    @Test
    public void testDeviationTwo() {
        double[] temperatureSeries = {1.0, 2.0, 3.0, 4.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 1.58114;

        double actualResult = seriesAnalysis.deviation();

        assertEquals(expResult, actualResult, 0.00001);
    }
    @Test
    public void testDeviationThreeNeg() {
        double[] temperatureSeries = {-1.0, -2.0, -3.0, -4.0, -5.0, -7.0, -90.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 32.69047;

        double actualResult = seriesAnalysis.deviation();

        assertEquals(expResult, actualResult, 0.00001);
    }
    @Test
    public void testDeviationFourSame() {
        double[] temperatureSeries = {3.0, 3.0, 3.0, 3.0, 3.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 0;

        double actualResult = seriesAnalysis.deviation();

        assertEquals(expResult, actualResult, 0.00001);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testDeviationWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.deviation();
    }
    @Test
    public void testTempSummaryStatistics() {
        double[] temperatureSeries = {-2.0, -4.0, 1.0, 5.0, 14.0, -3.0, 19.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        TempSummaryStatistics expResult = new TempSummaryStatistics(4.28571, -4.0, 19.0, 8.97616);
        TempSummaryStatistics actualResult = seriesAnalysis.summaryStatistics();

        assertEquals(expResult.avgTemp, actualResult.avgTemp, 0.00001);
        assertEquals(expResult.minTmp, actualResult.minTmp, 0.00001);
        assertEquals(expResult.maxTmp, actualResult.maxTmp, 0.00001);
        assertEquals(expResult.devTmp, actualResult.devTmp, 0.00001);
    }
    @Test
    public void testTempSummaryStatisticsOne() {
        double[] temperatureSeries = {1.0, -1.0, 4.0, -4.0, 7.0, -7.0, 10.0, -10.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        TempSummaryStatistics expResult = new TempSummaryStatistics(0, -10.0, 10.0, 6.88684);
        TempSummaryStatistics actualResult = seriesAnalysis.summaryStatistics();

        assertEquals(expResult.avgTemp, actualResult.avgTemp, 0.00001);
        assertEquals(expResult.minTmp, actualResult.minTmp, 0.00001);
        assertEquals(expResult.maxTmp, actualResult.maxTmp, 0.00001);
        assertEquals(expResult.devTmp, actualResult.devTmp, 0.00001);
    }
    @Test
    public void testTempSummaryStatisticsTwo() {
        double[] temperatureSeries = {1.0, -1.0, 1.0, -1.0, 1.0, -1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        TempSummaryStatistics expResult = new TempSummaryStatistics(0, -1.0, 1.0, 1.09545);
        TempSummaryStatistics actualResult = seriesAnalysis.summaryStatistics();

        assertEquals(expResult.avgTemp, actualResult.avgTemp, 0.00001);
        assertEquals(expResult.minTmp, actualResult.minTmp, 0.00001);
        assertEquals(expResult.maxTmp, actualResult.maxTmp, 0.00001);
        assertEquals(expResult.devTmp, actualResult.devTmp, 0.00001);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testTempSummaryWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.summaryStatistics();
    }



}
