package com.sjl.itemdecoration;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.sjl.itemdecoration.adapter.StringAdapter;
import com.sjl.itemdecoration.decoration.GridViewItemDecoration;
import com.sjl.itemdecoration.util.Util;

public class GridItemDecorationActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_item_decoration);

        initView();
    }

    private void initView() {
        StringAdapter adapter = new StringAdapter(Util.buildList());
        RecyclerView recyclerViewGrid = findViewById(R.id.recycler_view_grid);
        recyclerViewGrid.setAdapter(adapter);
        recyclerViewGrid.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerViewGrid.addItemDecoration(new GridViewItemDecoration());
    }
}