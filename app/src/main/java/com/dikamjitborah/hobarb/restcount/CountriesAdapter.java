package com.dikamjitborah.hobarb.restcount;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;


import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CountriesAdapter extends RecyclerView.Adapter<CountriesAdapter.ViewHolder> {
    List<Todo> countries_data;
    Context context;


    CountriesAdapter(List<Todo> countries_data) {
        this.countries_data = countries_data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {

        context = parent.getContext();
        //activity = (Activity) context;
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext()) ;
        View list_item = layoutInflater.inflate(R.layout.recycler_items_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(list_item);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Todo country = countries_data.get(position);
        holder.name.setText(country.getName());
        holder.capital.setText(country.getCapital());
        holder.region.setText(country.getRegion());
        holder.subregion.setText(country.getSubregion());
        holder.population.setText(country.getPopulation() + "");
        holder.borders.setText(country.getBorders() + "");

        String languages = "";
        List<Todo.LanguagesBean> lang = country.getLanguages();
        for (Todo.LanguagesBean languagesBean: lang)
        {
            languages = languagesBean.getName();
            holder.language.append(languages + " ");
        }


        Glide.with(context).load(country.getFlag()).placeholder(R.drawable.placeholder).into(holder.flag);

      //  Glide.with(context).load(country.getFlag()).placeholder(R.drawable.placeholder).into(holder.flag);

        //GlideToVectorYou.justLoadImage((Activity) context, Uri.parse(country.getFlag()), holder.flag);
       /* GlideToVectorYou
                .init()
                .with((Activity) context)
                .withListener(new GlideToVectorYouListener() {
                    @Override
                    public void onLoadFailed() {
                        Toast.makeText(context, "Load failed", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onResourceReady() {
                        Toast.makeText(context, "Image ready", Toast.LENGTH_SHORT).show();
                    }
                })
                //.setPlaceHolder(placeholderLoading, placeholderError)
                .load(Uri.parse(country.getFlag()), holder.flag);
*/
    }

    @Override
    public int getItemCount() {
        return countries_data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView flag;
        TextView name, capital, region, subregion, population, borders, language;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            this.flag = itemView.findViewById(R.id.flag_country);
            this.name = itemView.findViewById(R.id.name_country);
            this.capital = itemView.findViewById(R.id.capital_country);
            this.region = itemView.findViewById(R.id.region_country);
            this.subregion = itemView.findViewById(R.id.subregion_country);
            this.population = itemView.findViewById(R.id.population_country);
            this.borders = itemView.findViewById(R.id.borders_country);
            this.language = itemView.findViewById(R.id.languages_country);

        }
    }
}
