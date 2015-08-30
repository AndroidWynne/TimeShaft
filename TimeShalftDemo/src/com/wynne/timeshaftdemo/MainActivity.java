package com.wynne.timeshaftdemo;

import com.wynne.timeshaft.TimeShaftView;
import com.wynne.timeshaft.TimeShaftView.OnTimeChangeListener;
import com.wynne.timeshalftdemo.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity implements OnTimeChangeListener {

	private TimeShaftView mShaftView;
	private TextView mTip;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mShaftView = (TimeShaftView) findViewById(R.id.time_shalft);
		mTip = (TextView) findViewById(R.id.text);
		mShaftView.setOnValueChangeListener(this);
	}

	@Override
	public void onValueChanged(boolean isSlipStop, int topValue, int bottomValue) {
		//�����е�topValue��bottomValue��ȫ����ȥ����ҵ���е�һЩ���󡣱��簴��������ֵȥ���޻�ȡ��ʱ�������
		//�˴���־����ƶ�Ҫ����ҵ����ʱ��������������һ���б��б��еĵ�һ�����ݵ�ʱ�䣬���������������־����ƶ���
		mShaftView.setMarkDestion(topValue, bottomValue, 15);
		mTip.setText(topValue+"��"+bottomValue+"��"+15);
	}

}
