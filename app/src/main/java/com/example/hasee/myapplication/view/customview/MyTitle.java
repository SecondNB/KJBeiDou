package com.example.hasee.myapplication.view.customview;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.hasee.myapplication.R;


/**
 * Created by caojun on 2018/5/15.
 */

public class MyTitle extends RelativeLayout implements View.OnClickListener{
    private Context context;
    private View view;

    public MyTitle(Context context) {
        this(context,null);
    }

    public MyTitle(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public MyTitle(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        initView();
    }

    private TextView textView;
    private ImageView back;
    private void initView() {
        LayoutParams lp = new LayoutParams(LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.addRule(RelativeLayout.CENTER_IN_PARENT);
        setBackgroundColor(getResources().getColor(R.color.colorAccent));

        textView = new TextView(context);
        textView.setId(R.id.titleBar_id);
        textView.setText("标题");
        textView.setTextSize(25);
        textView.setTextColor(Color.WHITE);
        //textView.setBackgroundColor(Color.BLUE);
        addView(textView,lp);
        textView.setOnClickListener(this);

        LayoutParams lp_img = new LayoutParams(100, 100);
        lp_img.addRule(RelativeLayout.ALIGN_LEFT);
        lp_img.addRule(RelativeLayout.CENTER_VERTICAL);
        lp_img.leftMargin = 20;
        back = new ImageView(context);
        back.setImageResource(R.mipmap.ic_launcher);
        back.setId(R.id.titleBar_back);
        addView(back,lp_img);

    }

    @Override
    public void onClick(View v) {

    }
}
