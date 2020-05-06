package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Rule extends AppCompatActivity
{
    WebView rule_view; // отображает веб стр
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rule_activity);
        rule_view = (WebView) findViewById(R.id.webView);
        rule_view.loadUrl("file:///android_asset/rules/" + getIntent().getExtras().getString("title"));// загркзка html файла
        // с помощью intent мы запращиваем действие у другого компонента приложения
        // c помощью extras мы передаем доп информацию вместе с intent
    }
}
