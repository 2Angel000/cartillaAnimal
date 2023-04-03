package com.itch.cartillaanimal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder>{

    private List<ListElement> mData;
    private LayoutInflater mInflater;
    private Context context;

    public  ListAdapter(List<ListElement> itemList,Context context){
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.mData = itemList;
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.list_element,null);
        return new ListAdapter.ViewHolder(view);
    };

    @Override
    public void onBindViewHolder(final ListAdapter.ViewHolder holder, final int position) {
        holder.binData(mData.get(position));
    }

    public void setItems(List<ListElement> items){mData = items;}

    public class ViewHolder extends RecyclerView.ViewHolder{
        //se declara cada elemento
        ImageView iconImage;
        TextView txtNombreMascota, txtTipoMascota, txtEdadMascota, txtPesoMascota;

        ViewHolder(View itemView) {
            super(itemView);
            //buscando con el xml
            iconImage = itemView.findViewById(R.id.iconImageView);
            txtNombreMascota = itemView.findViewById(R.id.txtNombreMascota);
            txtTipoMascota = itemView.findViewById(R.id.txtTipoMascota);
            txtEdadMascota = itemView.findViewById(R.id.txtEdadMascota);
            txtPesoMascota = itemView.findViewById(R.id.txtPesoMascota);
        }

        void binData(ListElement item){
            // Obtener la nueva imagen basada en el elemento actual
            //Drawable newImage = getNewImage(item);
            // Establecer la nueva imagen en el ImageView
            //iconImage.setImageDrawable(newImage);
            txtNombreMascota.setText(item.getNombreMascota());
            txtTipoMascota.setText(item.getTipoMascota());
            txtEdadMascota.setText(item.getEdadMascota());
            txtPesoMascota.setText(item.getPesoMascota());
        }
    }

//    private Drawable getNewImage(ListElement item) {
//        if (item.getType() == ListElement.TYPE_A) {
//            return ContextCompat.getDrawable(context, R.drawable.image_a);
//        } else if (item.getType() == ListElement.TYPE_B) {
//            return ContextCompat.getDrawable(context, R.drawable.image_b);
//        } else {
//            return ContextCompat.getDrawable(context, R.drawable.default_image);
//        }
//    }




}
