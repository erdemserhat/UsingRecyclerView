package com.erdemserhat.usingrecyclerview;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.erdemserhat.usingrecyclerview.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class LanguageAdapter extends RecyclerView.Adapter<LanguageAdapter.LanguageHolder>{

    private ArrayList<ProgrammingLanguage> language_list;

    public LanguageAdapter(ArrayList<ProgrammingLanguage> language_list) {
        this.language_list = language_list;
    }

    /**
     *xml connection process...
     * @param parent The ViewGroup into which the new View will be added after it is bound to
     *               an adapter position.
     * @param viewType The view type of the new View.
     *
     * @return
     */
    @NonNull
    @Override
    public LanguageHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
                return new LanguageHolder(recyclerRowBinding);
    }

    /**
     * this function will be called when LanguageHolder method connects.
     * Shortly, we are going to make the datas showable inside the layout (xml)
     * @param holder The ViewHolder which should be updated to represent the contents of the
     *        item at the given position in the data set.
     * @param position The position of the item within the adapter's data set.
     */
    @Override
    public void onBindViewHolder(@NonNull LanguageHolder holder, int position) {
        holder.binding.languageName.setText(language_list.get(position).getName());

        //setOnClickListeners

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Operations
                Intent intent = new Intent(holder.itemView.getContext(),ShowImage.class);
                intent.putExtra("language",language_list.get(position));
                holder.itemView.getContext().startActivity(intent);

            }
        });

    }

    /**
     * this function returns how many item our data set has
     * @return
     */
    @Override
    public int getItemCount() {
        return language_list.size();
    }


    /**
     * This is a helper class for holding views in the list
     */
    public class LanguageHolder extends RecyclerView.ViewHolder{

        private RecyclerRowBinding binding;

         public LanguageHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
