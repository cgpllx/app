package com.example.baidudemo;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends Activity {
	List<Obj> lists = new ArrayList<Obj>();
	LinearLayout scrollView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initdata();
		scrollView = (LinearLayout) findViewById(R.id.homeview);
		initview(lists);

	}

	private void initview(List<Obj> lists) {
		for (Obj obj : lists) {
			View view = LayoutInflater.from(this).inflate(R.layout.item, null, false);
			TextView lin1 = (TextView) view.findViewById(R.id.linearLayout1);
			LinearLayout lin2 = (LinearLayout) view.findViewById(R.id.linearLayout2);
			LinearLayout lin3 = (LinearLayout) view.findViewById(R.id.linearLayout3);
			lin1.setText(obj.getCategory());
			scrollView.addView(view, new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

			List<String> strings = obj.getItem();
			if(strings.size()%2!=0){
				strings.add("");
			}
			for (int i = 0; i < strings.size(); i++) {
				View view2 =  LayoutInflater.from(this).inflate(R.layout.iitem, null, false);
				TextView textView=(TextView) view2.findViewById(R.id.textview);
				textView.setGravity(Gravity.CENTER);
				textView.setHeight(50);
				textView.setText(strings.get(i));
				if (i % 2 == 0) {//lin2
					lin2.addView(view2);
				} else {//lin3
					lin3.addView(view2);
				}
			}

		}
	}

	private void initdata() {
		for (int i = 0; i <= 3; i++) {
			List<String> item1 = new ArrayList<String>();
			item1.add("����");
			item1.add("����");
			item1.add("����");
			item1.add("ȭ��");
			item1.add("ȭ��");
			item1.add("Ȥζ�˶�");
			Obj obj1 = new Obj("��������", item1);

			List<String> item2 = new ArrayList<String>();
			item2.add("����");
			item2.add("����");
			item2.add("����");
			item2.add("ȭ��");
			item2.add("Ȥζ�˶�");
			Obj obj2 = new Obj("��������", item2);

			List<String> item3 = new ArrayList<String>();
			item3.add("����");
			item3.add("����");
			item3.add("����");
			Obj obj3 = new Obj("��������", item3);
			lists.add(obj1);
			lists.add(obj2);
			lists.add(obj3);
		}

	}

}
