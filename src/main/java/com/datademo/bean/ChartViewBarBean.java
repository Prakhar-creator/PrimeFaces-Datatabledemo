package com.datademo.bean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import org.primefaces.model.charts.ChartData;
import org.primefaces.model.charts.bar.BarChartDataSet;
import org.primefaces.model.charts.bar.BarChartModel;

@ManagedBean
@ViewScoped
public class ChartViewBarBean implements Serializable {
   private static final long serialVersionUID = 1L;
   
   private BarChartModel barModel;

    public BarChartModel getBarModel() {
        return barModel;
    }

    public void setBarModel(BarChartModel barModel) {
        this.barModel = barModel;
    }
   
  @PostConstruct
    public void init() {
        System.out.println("BarModel Established");
        createBarModel();
    }
    
    private void createBarModel(){
        barModel = new BarChartModel();
        ChartData data = new ChartData();
        
        BarChartDataSet barDataSet = new BarChartDataSet();
        barDataSet.setLabel("User Detail Gender Ratio Bar Graph");
        
        List<Number> values = new ArrayList<>();
        values.add(6);
        values.add(1);
        barDataSet.setData(values);
        
        List<String> bgColor = new ArrayList<>();
        bgColor.add("rgba(255, 99, 132, 0.2)");
        bgColor.add("rgba(255, 159, 64, 0.2)");
        barDataSet.setBackgroundColor(bgColor);
        
        List<String> borderColor = new ArrayList<>();
        borderColor.add("rgb(255, 99, 132)");
        borderColor.add("rgb(255, 159, 64)");
        barDataSet.setBorderColor(borderColor);
        barDataSet.setBorderWidth(1);
        
        data.addChartDataSet(barDataSet);

        List<String> labels = new ArrayList<>();
        labels.add("Male");
        labels.add("Female");
        data.setLabels(labels);
        barModel.setData(data);
    }
    }
   
