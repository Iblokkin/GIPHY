package com.example.giphy
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class GifAdapter: RecyclerView.Adapter<GifAdapter.GifHolder>() {
    class GifHolder(item: View): RecyclerView.ViewHolder (item){
            fun bind (gifs: Gifs) {}
    }
}