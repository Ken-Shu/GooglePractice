package com.ken_shu.app_u2_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.ken_shu.app_u2_recyclerview.adapter.ItemAdapter
import com.ken_shu.app_u2_recyclerview.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //創建的實例Datasource，然後loadAffirmations()在其上調用方法。將返回的確認列表存儲在valnamed中myDataset。
        //初始化數據
        val myDataset = Datasource().loadAffirmations()
        //創建一個名為的變量，recyclerView並用於在佈局中findViewById()查找對的引用RecyclerView。
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        //要告知，recyclerView以使用ItemAdapter您創建的類，請創建一個新ItemAdapter實例。
        // ItemAdapter需要兩個參數：this此活動的context（）和中的肯定 myDataset。
        //將ItemAdapter對象分配給的adapter屬性recyclerView。
        recyclerView.adapter = ItemAdapter(this,myDataset)
        //由於您的佈局尺寸RecyclerView在活動佈局中是固定的，
        // 因此您可以將的setHasFixedSize參數設置RecyclerView為true。
        // 僅在提高性能時才需要此設置。如果您知道內容的更改不會更改的佈局大小，請使用此設置RecyclerView。
        recyclerView.setHasFixedSize(true)
    }
}