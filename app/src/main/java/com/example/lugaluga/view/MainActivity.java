package com.example.lugaluga.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.example.lugaluga.R;
import com.example.lugaluga.RecyclerItemClickListener;
import com.example.lugaluga.model.Produto;
import com.example.lugaluga.view.adapter.AdapterProduto;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private AdapterProduto adapterProduto;
    private List<Produto> produtoList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.listaProdutos);

        CriarListaProdutos();

        adapterProduto = new AdapterProduto(produtoList);

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(this,LinearLayout.VERTICAL));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapterProduto);

        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(getApplicationContext(), recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Intent intent = new Intent(MainActivity.this, ProdutoActivity.class);
                intent.putExtra("produto", produtoList.get(position));
                startActivity(intent);
            }

            @Override
            public void onLongItemClick(View view, int position) {
                Toast.makeText(getApplicationContext(),produtoList.get(position).getStatus(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        }));

            }

            public void CriarListaProdutos(){

        Produto produto;

        produto = new Produto(
                "Iphone 13",
                200.00,
                "Iphone 13 64g",
                100,
                "Disponível");

        produtoList.add(produto);

                produto = new Produto(
                        "Iphone 13",
                        200.00,
                        "Iphone 13 64g",
                        100,
                        "Disponível");

                produtoList.add(produto);

                produto = new Produto(
                        "Iphone 12",
                        150.00,
                        "Iphone 12 64g",
                        100,
                        "Disponível");
                produtoList.add(produto);

                produto = new Produto(
                        "Airpods",
                        50.00,
                        "Airpods 2 geração",
                        100,
                        "Disponível");

                produtoList.add(produto);

                produto = new Produto(
                        "Airpods",
                        30.00,
                        "Airpods 1 geração",
                        100,
                        "Disponível");

                produtoList.add(produto);

                produto = new Produto(
                        "Iphone 14",
                        400.00,
                        "Iphone 14 256g",
                        100,
                        "Disponível");

                produtoList.add(produto);

                produto = new Produto(
                        "Fone Apple",
                        200.00,
                        "Fone Apple Vermelho",
                        100,
                        "Disponível");

                produtoList.add(produto);

                produto = new Produto(
                        "Fone Apple",
                        200.00,
                        "Fone Apple verde",
                        100,
                        "Disponível");

                produtoList.add(produto);

                produto = new Produto(
                        "Iphone 14",
                        300.00,
                        "Iphone 14 64g",
                        100,
                        "Disponível");

                produtoList.add(produto);

                produto = new Produto(
                        "Iphone X",
                        200.00,
                        "Iphone X 64g",
                        100,
                        "Disponível");

                produtoList.add(produto);

                produto = new Produto(
                        "Iphone 11",
                        50.00,
                        "Iphone 11 64g",
                        100,
                        "Disponível");


            }
}
