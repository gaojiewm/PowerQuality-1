package com.cem.powerqualityanalyser.chart;

import android.content.Context;
import android.util.AttributeSet;

import com.github.mikephil.charting.components.YAxis;

public class InrushLineChart extends VoltsAmpsHertzLineChart{


    public InrushLineChart(Context context) {
        super(context);
    }

    public InrushLineChart(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public InrushLineChart(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }


    @Override
    protected void init() {
        super.init();
        mAxisLeft = new VoltsAmpsHertzYAxis(YAxis.AxisDependency.LEFT);
        mAxisRendererLeft = new VoltsAmpsHertzYAxisRenderer(mViewPortHandler, (VoltsAmpsHertzYAxis) mAxisLeft, mLeftAxisTransformer);
    }


    /*返回转型后的左右轴*/
    @Override
    public VoltsAmpsHertzYAxis getAxisLeft() {
        return (VoltsAmpsHertzYAxis) super.getAxisLeft();
    }

    @Override
    public VoltsAmpsHertzYAxisRenderer getRendererLeftYAxis() {
        return (VoltsAmpsHertzYAxisRenderer) super.getRendererLeftYAxis();
    }

    public void setDrawable(){

    }


}
