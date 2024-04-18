package com.datademo.bean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import org.primefaces.model.charts.ChartData;
import org.primefaces.model.charts.pie.PieChartDataSet;
import org.primefaces.model.charts.pie.PieChartModel;

@ManagedBean
@ViewScoped
public class ChartViewPieBean implements Serializable {
    private static final long serialVersionUID = 1L;

//    private BarChartModel barModel;
//    private PieChartModel pieChartModel;
     private PieChartModel pieModel;

    public PieChartModel getPieModel() {
        return pieModel;
    }

    public void setPieModel(PieChartModel pieModel) {
        this.pieModel = pieModel;
    }
     

//    public PieChartModel getPieChartModel() {
//        return pieChartModel;
//    }
//    
//
//    public BarChartModel getBarModel() {
//        return barModel;
//    }
    
    @PostConstruct
    public void init() {
        System.out.println("BarModel Established");
        createPieModel();
    }
    
//    private BarChartModel createBarModel() {
//        barModel = new BarChartModel();
//        
//        ChartData data = new ChartData();
//        
//        BarChartDataSet barDataSet = new BarChartDataSet();
//        barDataSet.setLabel("My First Dataset");
//        
//        // Add some sample data as List<Number>
//        List<Number> dataList = new ArrayList<>();
//        dataList.add(65);
//        dataList.add(59);
//        dataList.add(80);
//        dataList.add(81);
//        dataList.add(56);
//        dataList.add(55);
//        dataList.add(40);
//        barDataSet.setData(dataList);
//        
//        // Set background and border colors
//        barDataSet.setBackgroundColor("rgba(255, 99, 132, 0.2)");
//        barDataSet.setBorderColor("rgb(255, 99, 132)");
//        barDataSet.setBorderWidth(1);
//
//        // Add the dataset to the chart data
//        data.addChartDataSet(barDataSet);
//        
//        // Add labels for the x-axis
//        List<String> labels = new ArrayList<>();
//        labels.add("January");
//        labels.add("February");
//        labels.add("March");
//        labels.add("April");
//        labels.add("May");
//        labels.add("June");
//        labels.add("July");
//        data.setLabels(labels);
//        
//        // Set the data to the chart model
//        barModel.setData(data);
//        return barModel;
//    }

//    private PieChartModel createPieModel() {
//        pieChartModel = new PieChartModel();
//        ChartData data = new ChartData();
//
//        PieChartDataSet dataSet = new PieChartDataSet();
//        List<Number> values = new ArrayList<>();
//        values.add(300);
//        values.add(50);
//        values.add(100);
//        dataSet.setData(values);
//
//        List<String> bgColors = new ArrayList<>();
//        bgColors.add("rgb(255, 99, 132)");
//        bgColors.add("rgb(54, 162, 235)");
//        bgColors.add("rgb(255, 205, 86)");
//        dataSet.setBackgroundColor(bgColors);
//
//        data.addChartDataSet(dataSet);
//        List<String> labels = new ArrayList<>();
//        labels.add("Red");
//        labels.add("Blue");
//        labels.add("Yellow");
//        data.setLabels(labels);
//
//        pieChartModel.setData(data);
//        return pieChartModel;
//    }
//    
    
    private void createPieModel() {
        pieModel = new PieChartModel();
        ChartData data = new ChartData();

        PieChartDataSet dataSet = new PieChartDataSet();
        List<Number> values = new ArrayList<>();
        values.add(6);
        values.add(1);
        dataSet.setData(values);

        List<String> bgColors = new ArrayList<>();
        bgColors.add("rgb(255, 99, 132)");
        bgColors.add("rgb(54, 162, 235)");
        dataSet.setBackgroundColor(bgColors);

        data.addChartDataSet(dataSet);
        List<String> labels = new ArrayList<>();
        labels.add("Male");
        labels.add("Female");
        data.setLabels(labels);

        pieModel.setData(data);
    }
}
