package com.rathana.adapter_demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.rathana.adapter_demo.adapter.BookAdapter;
import com.rathana.adapter_demo.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookActivity extends AppCompatActivity {


    private BookAdapter bookAdapter;
    private List<Book> books =new ArrayList<>();
    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        setUI();
        getBooks();

    }

    private void setUI(){
        gridView=findViewById(R.id.gridView);
        bookAdapter=new BookAdapter(books,this);
        gridView.setAdapter(bookAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(BookActivity.this,
                        BookDetailActivity.class));
            }
        });

    }

    private void getBooks(){
        for(int i=0;i<50;i++){
            books.add(new Book(
                    R.drawable.book_cover,
                    "Android development",
                    767
            ));
        }

        bookAdapter.notifyDataSetChanged();

    }

}

