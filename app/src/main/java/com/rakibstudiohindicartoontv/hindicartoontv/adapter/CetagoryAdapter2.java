package com.rakibstudiohindicartoontv.hindicartoontv.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.rakibstudiohindicartoontv.hindicartoontv.R;
import com.rakibstudiohindicartoontv.hindicartoontv.model.ImageClass;

import java.util.List;

public class CetagoryAdapter2 extends RecyclerView.Adapter <CetagoryAdapter2.ImageViewHolder>{
    private Context mcontext;
    private List<ImageClass>mUpload;

    public CetagoryAdapter2(Context mcontext, List<ImageClass> mUpload) {
        this.mcontext = mcontext;
        this.mUpload = mUpload;
    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mcontext).inflate(R.layout.image_row2, parent, false);
        return new ImageViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final ImageViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        final ImageClass cureentUpload=mUpload.get(position);
      holder.title.setText(mUpload.get(position).getTitleimage());




        Glide.with(holder.itemView)
                .load(cureentUpload.getImageUrl())
                .fitCenter()
                .into(holder.imageView);

//        Picasso.get().load(cureentUpload.getImageUrl()).fit().into(holder.imageView);


holder.imageView.setOnClickListener(new View.OnClickListener() {


    @Override
    public void onClick(View v) {
        switch (position) {
            case 0: //first item in Recycler view
                Navigation.findNavController(v).navigate(R.id.hindiruplotha);
                break;
            case 1: //second item in Recycler view
                Navigation.findNavController(v).navigate(R.id.dragonball);
                break;
            case 2: //third item in Recycler view
                Navigation.findNavController(v).navigate(R.id.oggy);
                break;


            case 3: //first item in Recycler view
                Navigation.findNavController(v).navigate(R.id.larva);
                break;
            case 4: //second item in Recycler view
                Navigation.findNavController(v).navigate(R.id.banglarupkotha);
                break;
            case 5: //third item in Recycler view
                Navigation.findNavController(v).navigate(R.id.janCartoon);
                break;
            case 6: //first item in Recycler view
                Navigation.findNavController(v).navigate(R.id.doreamon);
                break;
            case 7: //second item in Recycler view
                Navigation.findNavController(v).navigate(R.id.pink);
                break;
            case 8: //third item in Recycler view
                Navigation.findNavController(v).navigate(R.id.simba);
                break;
            case 9: //first item in Recycler view
                Navigation.findNavController(v).navigate(R.id.moreOver);
                break;

            case 10: //third item in Recycler view
                Navigation.findNavController(v).navigate(R.id.cracke);
                break;
            case 11: //first item in Recycler view
                Navigation.findNavController(v).navigate(R.id.looney);
                break;

            case 12: //third item in Recycler view
                Navigation.findNavController(v).navigate(R.id.micky);
                break;
            case 13: //third item in Recycler view
                Navigation.findNavController(v).navigate(R.id.chottabheem);
                break;
            case 14: //third item in Recycler view
                Navigation.findNavController(v).navigate(R.id.joungleBook);
                break;
            case 15: //third item in Recycler view
                Navigation.findNavController(v).navigate(R.id.virHindi);
                break;

            case 16: //first item in Recycler view
                Navigation.findNavController(v).navigate(R.id.benteen);
                break;

            case 17: //third item in Recycler view
                Navigation.findNavController(v).navigate(R.id.pokemon);
                break;
            case 18: //third item in Recycler view
                Navigation.findNavController(v).navigate(R.id.hindistoris);
                break;
            case 19: //third item in Recycler view
                Navigation.findNavController(v).navigate(R.id.kisena);
                break;
            case 20: //third item in Recycler view
                Navigation.findNavController(v).navigate(R.id.motupatlu);
                break;


            case 21: //first item in Recycler view
                Navigation.findNavController(v).navigate(R.id.masha);
                break;

            case 22: //third item in Recycler view
                Navigation.findNavController(v).navigate(R.id.oscar);
                break;
            case 23: //third item in Recycler view
                Navigation.findNavController(v).navigate(R.id.virbangla);
                break;
            case 24: //third item in Recycler view
                Navigation.findNavController(v).navigate(R.id.tom);
                break;
            case 25: //third item in Recycler view
                Navigation.findNavController(v).navigate(R.id.babluDablu);
                break;
            case 26: //third item in Recycler view
                Navigation.findNavController(v).navigate(R.id.littlebheem);
                break;




        }






    }
});






    }


    @Override
    public int getItemCount() {
        return mUpload.size();
    }

    public static class ImageViewHolder extends RecyclerView.ViewHolder {


        public ImageView imageView;
        private TextView title;

        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);



            imageView=itemView.findViewById(R.id.imageselet);
            title=itemView.findViewById(R.id.textselet);

        }
    }
}
