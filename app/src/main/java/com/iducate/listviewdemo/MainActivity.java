package com.iducate.listviewdemo;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {  

	private String[] countries = { "Albania", "Algeria", "Armenia", "Andora",
			"Angola", "Argentina", "Australia", "Bahrain", "Bangladesh",
			"Barbados", "Brazil", "China", "Denmark", "Egypt", "France",
			"Ghana", "Hong Kong", "India", "Italy", "United Kingdom",
			"United States", "United Arab Emirates" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
				android.R.layout.simple_list_item_checked, countries);

		ListView listView = getListView();
		listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

		setListAdapter(adapter);
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		Toast.makeText(this, "Item clicked: " + countries[position],
				Toast.LENGTH_SHORT).show();
	}

}
