package com.zhuanghongji.mpchartexample.notimportant;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.github.mikephil.charting.utils.Utils;
import com.zhuanghongji.mpchartexample.AnotherBarActivity;
import com.zhuanghongji.mpchartexample.BarChartActivity;
import com.zhuanghongji.mpchartexample.BarChartActivityMultiDataset;
import com.zhuanghongji.mpchartexample.BarChartActivitySinus;
import com.zhuanghongji.mpchartexample.BarChartPositiveNegative;
import com.zhuanghongji.mpchartexample.BubbleChartActivity;
import com.zhuanghongji.mpchartexample.CandleStickChartActivity;
import com.zhuanghongji.mpchartexample.CombinedChartActivity;
import com.zhuanghongji.mpchartexample.CubicLineChartActivity;
import com.zhuanghongji.mpchartexample.DynamicalAddingActivity;
import com.zhuanghongji.mpchartexample.FilledLineActivity;
import com.zhuanghongji.mpchartexample.HalfPieChartActivity;
import com.zhuanghongji.mpchartexample.HorizontalBarChartActivity;
import com.zhuanghongji.mpchartexample.InvertedLineChartActivity;
import com.zhuanghongji.mpchartexample.LineChartActivity1;
import com.zhuanghongji.mpchartexample.LineChartActivity2;
import com.zhuanghongji.mpchartexample.LineChartActivityColored;
import com.zhuanghongji.mpchartexample.LineChartTime;
import com.zhuanghongji.mpchartexample.ListViewBarChartActivity;
import com.zhuanghongji.mpchartexample.ListViewMultiChartActivity;
import com.zhuanghongji.mpchartexample.MultiLineChartActivity;
import com.zhuanghongji.mpchartexample.PerformanceLineChart;
import com.zhuanghongji.mpchartexample.PieChartActivity;
import com.zhuanghongji.mpchartexample.PiePolylineChartActivity;
import com.zhuanghongji.mpchartexample.R;
import com.zhuanghongji.mpchartexample.RadarChartActivitry;
import com.zhuanghongji.mpchartexample.RealtimeLineChartActivity;
import com.zhuanghongji.mpchartexample.ScatterChartActivity;
import com.zhuanghongji.mpchartexample.ScrollViewActivity;
import com.zhuanghongji.mpchartexample.StackedBarActivity;
import com.zhuanghongji.mpchartexample.StackedBarActivityNegative;
import com.zhuanghongji.mpchartexample.fragments.SimpleChartDemo;
import com.zhuanghongji.mpchartexample.realm.RealmMainActivity;

import java.util.ArrayList;

import butterknife.BindView;

public class MainActivity extends BaseActivity implements OnItemClickListener {

    @BindView(R.id.listView1)
    ListView lv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initToolbar();
        mToolbar.setTitle("MPAndroidChart Example");

        // initialize the utilities
        Utils.init(this);

        ArrayList<ContentItem> objects = new ArrayList<>();

        objects.add(new ContentItem(
                getString(R.string.ci_0_name),
                getString(R.string.ci_0_desc)));
        objects.add(new ContentItem(
                getString(R.string.ci_1_name),
                getString(R.string.ci_1_desc)));
        objects.add(new ContentItem(
                getString(R.string.ci_2_name),
                getString(R.string.ci_2_desc)));
        objects.add(new ContentItem(
                getString(R.string.ci_3_name),
                getString(R.string.ci_3_desc)));
        objects.add(new ContentItem(
                getString(R.string.ci_4_name),
                getString(R.string.ci_4_desc)));
        objects.add(new ContentItem(
                getString(R.string.ci_5_name),
                getString(R.string.ci_5_desc)));
        objects.add(new ContentItem(
                getString(R.string.ci_6_name),
                getString(R.string.ci_6_desc)));
        objects.add(new ContentItem(
                getString(R.string.ci_7_name),
                getString(R.string.ci_7_desc)));
        objects.add(new ContentItem(
                getString(R.string.ci_8_name),
                getString(R.string.ci_8_desc)));
        objects.add(new ContentItem(
                getString(R.string.ci_9_name),
                getString(R.string.ci_9_desc)));
        objects.add(new ContentItem(
                getString(R.string.ci_10_name),
                getString(R.string.ci_10_desc)));
        objects.add(new ContentItem(
                getString(R.string.ci_11_name),
                getString(R.string.ci_11_desc)));
        objects.add(new ContentItem(
                getString(R.string.ci_12_name),
                getString(R.string.ci_12_desc)));
        objects.add(new ContentItem(
                getString(R.string.ci_13_name),
                getString(R.string.ci_13_desc)));
        objects.add(new ContentItem(
                getString(R.string.ci_14_name),
                getString(R.string.ci_14_desc)));
        objects.add(new ContentItem(
                getString(R.string.ci_15_name),
                getString(R.string.ci_15_desc)));
        objects.add(new ContentItem(
                getString(R.string.ci_16_name),
                getString(R.string.ci_16_desc)));
        objects.add(new ContentItem(
                getString(R.string.ci_17_name),
                getString(R.string.ci_17_desc)));
        objects.add(new ContentItem(
                getString(R.string.ci_18_name),
                getString(R.string.ci_18_desc)));
        objects.add(new ContentItem(
                getString(R.string.ci_19_name),
                getString(R.string.ci_19_desc)));
        objects.add(new ContentItem(
                getString(R.string.ci_20_name),
                getString(R.string.ci_20_desc)));
        objects.add(new ContentItem(
                getString(R.string.ci_21_name),
                getString(R.string.ci_21_desc)));
        objects.add(new ContentItem(
                getString(R.string.ci_22_name),
                getString(R.string.ci_22_desc)));
        objects.add(new ContentItem(
                getString(R.string.ci_23_name),
                getString(R.string.ci_23_desc)));
        objects.add(new ContentItem(
                getString(R.string.ci_24_name),
                getString(R.string.ci_24_desc)));
        objects.add(new ContentItem(
                getString(R.string.ci_25_name),
                getString(R.string.ci_25_desc)));
        objects.add(new ContentItem(
                getString(R.string.ci_26_name),
                getString(R.string.ci_26_desc)));
        objects.add(new ContentItem(
                getString(R.string.ci_27_name),
                getString(R.string.ci_27_desc)));

        ContentItem realm = new ContentItem(
                getString(R.string.ci_28_name),
                getString(R.string.ci_28_desc));
        objects.add(realm);

        ContentItem time = new ContentItem(
                getString(R.string.ci_29_name),
                getString(R.string.ci_29_desc));
        time.isNew = true;
        objects.add(time);
        objects.add(new ContentItem(
                getString(R.string.ci_30_name),
                getString(R.string.ci_30_desc)));
        objects.add(new ContentItem(
                getString(R.string.ci_31_name),
                getString(R.string.ci_31_desc)));

        MyAdapter adapter = new MyAdapter(this, objects);

        lv.setAdapter(adapter);

        lv.setOnItemClickListener(this);
    }

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_main;
    }

    @Override
    public void onItemClick(AdapterView<?> av, View v, int pos, long arg3) {

        Intent i;

        switch (pos) {
            case 0:
                i = new Intent(this, LineChartActivity1.class);
                startActivity(i);
                break;
            case 1:
                i = new Intent(this, LineChartActivity2.class);
                startActivity(i);
                break;
            case 2:
                i = new Intent(this, BarChartActivity.class);
                startActivity(i);
                break;
            case 3:
                i = new Intent(this, HorizontalBarChartActivity.class);
                startActivity(i);
                break;
            case 4:
                i = new Intent(this, CombinedChartActivity.class);
                startActivity(i);
                break;
            case 5:
                i = new Intent(this, PieChartActivity.class);
                startActivity(i);
                break;
            case 6:
                i = new Intent(this, PiePolylineChartActivity.class);
                startActivity(i);
                break;
            case 7:
                i = new Intent(this, ScatterChartActivity.class);
                startActivity(i);
                break;
            case 8:
                i = new Intent(this, BubbleChartActivity.class);
                startActivity(i);
                break;
            case 9:
                i = new Intent(this, StackedBarActivity.class);
                startActivity(i);
                break;
            case 10:
                i = new Intent(this, StackedBarActivityNegative.class);
                startActivity(i);
                break;
            case 11:
                i = new Intent(this, AnotherBarActivity.class);
                startActivity(i);
                break;
            case 12:
                i = new Intent(this, MultiLineChartActivity.class);
                startActivity(i);
                break;
            case 13:
                i = new Intent(this, BarChartActivityMultiDataset.class);
                startActivity(i);
                break;
            case 14:
                i = new Intent(this, SimpleChartDemo.class);
                startActivity(i);
                break;
            case 15:
                i = new Intent(this, ListViewBarChartActivity.class);
                startActivity(i);
                break;
            case 16:
                i = new Intent(this, ListViewMultiChartActivity.class);
                startActivity(i);
                break;
            case 17:
                i = new Intent(this, InvertedLineChartActivity.class);
                startActivity(i);
                break;
            case 18:
                i = new Intent(this, CandleStickChartActivity.class);
                startActivity(i);
                break;
            case 19:
                i = new Intent(this, CubicLineChartActivity.class);
                startActivity(i);
                break;
            case 20:
                i = new Intent(this, RadarChartActivitry.class);
                startActivity(i);
                break;
            case 21:
                i = new Intent(this, LineChartActivityColored.class);
                startActivity(i);
                break;
            case 22:
                i = new Intent(this, RealtimeLineChartActivity.class);
                startActivity(i);
                break;
            case 23:
                i = new Intent(this, DynamicalAddingActivity.class);
                startActivity(i);
                break;
            case 24:
                i = new Intent(this, PerformanceLineChart.class);
                startActivity(i);
                break;
            case 25:
                i = new Intent(this, BarChartActivitySinus.class);
                startActivity(i);
                break;
            case 26:
                i = new Intent(this, ScrollViewActivity.class);
                startActivity(i);
                break;
            case 27:
                i = new Intent(this, BarChartPositiveNegative.class);
                startActivity(i);
                break;
            case 28:
                i = new Intent(this, RealmMainActivity.class);
                startActivity(i);
                break;
            case 29:
                i = new Intent(this, LineChartTime.class);
                startActivity(i);
                break;
            case 30:
                i = new Intent(this, FilledLineActivity.class);
                startActivity(i);
                break;
            case 31:
                i = new Intent(this, HalfPieChartActivity.class);
                startActivity(i);
                break;

        }

        overridePendingTransition(R.anim.move_right_in_activity, R.anim.move_left_out_activity);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Intent i = null;

        switch (item.getItemId()) {
            case R.id.viewGithub:
                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://github.com/PhilJay/MPAndroidChart"));
                startActivity(i);
                break;
            case R.id.report:
                i = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "philjay.librarysup@gmail.com", null));
                i.putExtra(Intent.EXTRA_SUBJECT, "MPAndroidChart Issue");
                i.putExtra(Intent.EXTRA_TEXT, "Your error report here...");
                startActivity(Intent.createChooser(i, "Report Problem"));
                break;
            case R.id.blog:
                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("http://www.zhuanghongji.com"));
                startActivity(i);
                break;
            case R.id.website:
                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("http://at.linkedin.com/in/philippjahoda"));
                startActivity(i);
                break;
        }

        return true;
    }
}
