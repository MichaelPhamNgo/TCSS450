package edu.tacoma.uw.pham19.recycleviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerDataAdapter extends RecyclerView.Adapter<RecyclerDataAdapter.DataViewHolder> {
    private List<Person> people;
    private Context context;

    public static class DataViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView tvName;
        public DataViewHolder(View itemView) {
            super(itemView);
            this.tvName = (TextView)itemView.findViewById(R.id.tv_name);
        }
    }
    public RecyclerDataAdapter(Context context, List<Person> people) {
        this.context = context;
        this.people = people;
    }

    @Override
    public int getItemCount() {
        return people == null ? 0 : people.size();
    }

    @Override
    public RecyclerDataAdapter.DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView;
        switch(viewType) {
            case 1:
                itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_names, parent, false);
                break;
            case 2:
                itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_name_female, parent, false);
                break;
            default:
                itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_names, parent, false);
                break;
        }
        return new DataViewHolder(itemView);
    }

    @Override
    public int getItemViewType(int position) {
        if(people.get(position).isMale()) {
            return 1;
        } else {
            return 2;
        }
    }

    @Override
    public void onBindViewHolder(RecyclerDataAdapter.DataViewHolder holder, int position) {
        String name = people.get(position).getName();
        holder.tvName.setText(name);
    }
}
