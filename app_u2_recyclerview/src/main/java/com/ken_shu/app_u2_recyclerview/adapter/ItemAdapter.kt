package com.ken_shu.app_u2_recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ken_shu.app_u2_recyclerview.R
import com.ken_shu.app_u2_recyclerview.model.Affirmation

//[MainActivity]中[RecyclerView]的適配器。 顯示[確認]數據對象。
class ItemAdapter(private val context: Context
                  , private val dataset: List<Affirmation>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    // 提供對每個數據項的視圖的引用
    // 複雜的數據項每個項可能需要一個以上的視圖，並且
    // 您可以訪問視圖持有者中數據項的所有視圖。
    // 每個數據項只是一個肯定對象。
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView : ImageView = view.findViewById(R.id.item_image)

    }
    //創建新視圖（由佈局管理器調用）
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return ItemViewHolder(adapterLayout)
    }
    //替換視圖的內容（由佈局管理器調用）
    override fun getItemCount() =dataset.size


    //返回數據集的大小（由佈局管理器調用）
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stingResourceId)
        holder.imageView.setImageResource(item.imageResoutrceId)
    }

}