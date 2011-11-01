package com.spencerkohan.SectionList;

import com.spencerkohan.SectionList.SectionListAdapter.IndexPath;
import com.spencerkohan.SectionList.SectionListAdapter.SectionListAdapterAdapterDelegate;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SectionListActivity extends ListActivity implements SectionListAdapterAdapterDelegate {
    
	SectionListAdapter adapter;
	LayoutInflater inflater;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        inflater = LayoutInflater.from(this);
        
        adapter = new SectionListAdapter();
        adapter.delegate = this;
        getListView().setAdapter(adapter);
        getListView().setOnItemClickListener(adapter.itemClickListener);
        
        
    }


	@Override
	public int sectionCount() {
		
		return 3;
	}


	@Override
	public int rowsInSection(int section) {
		return 4;
	}


	@Override
	public View viewForRowAtIndexPath(IndexPath path) {

		View view = inflater.inflate(R.layout.row, null);
		TextView text = (TextView)view.findViewById(R.id.text);
		text.setText("Row " +  path.row);
		
		return view;
	}


	@Override
	public View viewForHeaderInSection(int section) {

		View view = inflater.inflate(R.layout.header, null);
		TextView text = (TextView)view.findViewById(R.id.text);
		
		text.setText("Section " +  section);
		
		return view;
	}


	@Override
	public void itemSelectedAtIndexPath(IndexPath path) {
		
		int duration = Toast.LENGTH_SHORT;
		Toast toast = Toast.makeText(this, "Row " + path.row + " in section " + path.section + " selected", duration);
		toast.show();
		
	}
}