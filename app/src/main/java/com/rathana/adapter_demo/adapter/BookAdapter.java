package com.rathana.adapter_demo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.rathana.adapter_demo.R;
import com.rathana.adapter_demo.model.Book;

import java.util.List;

public class BookAdapter extends BaseAdapter {

    private List<Book>  books;
    private Context context;

    public BookAdapter(List<Book> books, Context context) {
        this.books = books;
        this.context = context;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getCount() {
        return this.books.size();
    }

    @Override
    public Object getItem(int position) {
        return this.books.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view=null;
        if(convertView==null)
            view= LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.book_item_layout,parent,false);

        else
            view = convertView;


        //bind data to listView
        ImageView image=view.findViewById(R.id.image);
        TextView title=view.findViewById(R.id.title);
        TextView viewCount= view.findViewById(R.id.viewsCount);
        ImageView btnFav=view.findViewById(R.id.btnFavorite);

        final Book book= books.get(position);

        image.setImageResource(book.getImage());
        title.setText(book.getTitle());
        viewCount.setText("views  "+book.getView());

        btnFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,book.getTitle(),Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
