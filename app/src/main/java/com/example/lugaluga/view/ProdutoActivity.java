package com.example.lugaluga.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.lugaluga.R;
import com.example.lugaluga.model.Produto;

public class ProdutoActivity extends AppCompatActivity {

    private Produto produto;

    private TextView nomeProduto, qtdProduto, precoProduto, descProduto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);

        nomeProduto = findViewById(R.id.nomeProdutoTV);
        qtdProduto = findViewById(R.id.qtdProdutoTv);
        precoProduto = findViewById(R.id.precoProdutoTv);
        descProduto = findViewById(R.id.descricaoTv);

        produto = getIntent().getExtras().getParcelable("produto");

        nomeProduto.setText(produto.getNome());
        qtdProduto.setText(produto.getQuantidade());
        precoProduto.setText(String.valueOf(produto.getPreco());
        descProduto.setText(produto.getDescricao());

    }
}