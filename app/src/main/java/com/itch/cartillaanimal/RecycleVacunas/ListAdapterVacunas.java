package com.itch.cartillaanimal.RecycleVacunas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.itch.cartillaanimal.ListAdapter;
import com.itch.cartillaanimal.R;
import java.util.List;

public class ListAdapterVacunas extends RecyclerView.Adapter<ListAdapterVacunas.ViewHolder>{
    private List<ListElementVacunas> mData;
    private LayoutInflater mInflater;
    private Context context;

    public  ListAdapterVacunas(List<ListElementVacunas> itemList,Context context){
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.mData = itemList;
    }



    public int getItemCount() {
        return mData.size();
    }


    public ListAdapterVacunas.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.list_element_vacuna,null);
        return new ListAdapterVacunas.ViewHolder(view);
    };

    @Override
    public void onBindViewHolder(final ListAdapterVacunas.ViewHolder holder, final int position) {
        holder.binData(mData.get(position));
    }

    public void setItems(List<ListElementVacunas> items){mData = items;}


    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtNombreMascota;
        ViewHolder(View itemView) {
            super(itemView);
            txtNombreMascota = itemView.findViewById(R.id.txtNombreMascota);
        }

        void binData(ListElementVacunas item){
            txtNombreMascota.setText(item.getNombreMascota());
        }
    }


}
