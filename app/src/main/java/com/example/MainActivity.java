package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<String> expandableListTitle;
    HashMap<String, List<String>> expandableListDetail;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        expandableListView = (ExpandableListView)findViewById(R.id.expandableListView);
        expandableListDetail = ExpandableList.getData();
        expandableListTitle = new ArrayList<String>(expandableListDetail.keySet());
        expandableListAdapter = new ExpandableAdapter(getApplicationContext(), expandableListTitle, expandableListDetail);
        expandableListView.setAdapter(expandableListAdapter);
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener()
        {
            @Override public void onGroupExpand(int groupPosition)
            {}
        });
        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener()
        {
            @Override public void onGroupCollapse(int groupPosition)
            {}
        });
        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener()
        {
            @Override public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id)
            {
                final String selected =(String)expandableListAdapter.getChild(groupPosition,childPosition);
                switch(selected)
                {
                    case"Омонимы и их употребление":
                        intent = new Intent(MainActivity.this, Rule.class);
                        intent.putExtra("title", "Омонимы_и_их_употребление.html");
                        startActivity(intent);
                        break;
                    case"Паронимы и их употребление":
                        intent = new Intent(MainActivity.this, Rule.class);
                        intent.putExtra("title", "Паронимы_и_их_употребление.html");
                        startActivity(intent);
                        break;
                    case"Синонимы и их употребление":
                        intent = new Intent(MainActivity.this, Rule.class);
                        intent.putExtra("title", "Синонимы_и_их_употребление.html");
                        startActivity(intent);
                        break;
                    case "Антонимы и их употребление":
                        intent = new Intent(MainActivity.this, Rule.class);
                        intent.putExtra("title", "Антонимы_и_их_употребление.html");
                        startActivity(intent);
                        break;
                    case "Пассивная лексика. Архаизмы и историзмы":
                        intent = new Intent(MainActivity.this, Rule.class);
                        intent.putExtra("title", "Пассивная лексика_Архаизмы_и_историзмы.html");
                        startActivity(intent);
                        break;
                    case"Состав слова":
                        intent = new Intent(MainActivity.this, Rule.class);
                        intent.putExtra("title", "Состав_слова.html");
                        startActivity(intent);
                        break;
                    case"Словообразование и формообразование":
                        intent = new Intent(MainActivity.this, Rule.class);
                        intent.putExtra("title", "Словообразование_и_формообразование.html");
                        startActivity(intent);
                        break;
                    case"Правописание гласных в корне":
                        intent = new Intent(MainActivity.this, Rule.class);
                        intent.putExtra("title", "Правописание_гласных_в_корне.html");
                        startActivity(intent);
                        break;
                    case"Правописание гласных после шипящих и Ц":
                        intent = new Intent(MainActivity.this, Rule.class);
                        intent.putExtra("title", "Правописание_гласных_после_шипящих_и_Ц.html");
                        startActivity(intent);
                        break;
                    case"Правописание согласных":
                        intent = new Intent(MainActivity.this, Rule.class);
                        intent.putExtra("title", "Правописание_согласных.html");
                        startActivity(intent);
                        break;
                    case"Правописание приставок":
                        intent = new Intent(MainActivity.this, Rule.class);
                        intent.putExtra("title", "Правописание_приставок.html");
                        startActivity(intent);
                        break;
                    case"Употребление Ъ и Ь":
                        intent = new Intent(MainActivity.this, Rule.class);
                        intent.putExtra("title", "Употребление_Ъ_и_Ь.html");
                        startActivity(intent);
                        break;
                    case"Употребление прописных букв":
                        intent = new Intent(MainActivity.this, Rule.class);
                        intent.putExtra("title", "Употребление_прописных_букв.html");
                        startActivity(intent);
                        break;
                    case"Имя существительное как часть речи":
                        intent = new Intent(MainActivity.this, Rule.class);
                        intent.putExtra("title", "Имя_существительное_как_часть_речи.html");
                        startActivity(intent);
                        break;
                    case"Имя прилагательное как часть речи":
                        intent = new Intent(MainActivity.this, Rule.class);
                        intent.putExtra("title", "Имя прилагательное как часть речи.html");
                        startActivity(intent);
                        break;
                    case"Имя числительное как часть речи":
                        intent = new Intent(MainActivity.this, Rule.class);
                        intent.putExtra("title", "Имя числительное как часть речи.html");
                        startActivity(intent);
                        break;
                    case"Местоимение как часть речи":
                        intent = new Intent(MainActivity.this, Rule.class);
                        intent.putExtra("title", "Местоимение как часть речи.html");
                        startActivity(intent);
                        break;
                    case"Глагол как часть речи":
                        intent = new Intent(MainActivity.this, Rule.class);
                        intent.putExtra("title", "Глагол как часть речи.html");
                        startActivity(intent);
                        break;
                    case"Причастие как глагольная форма":
                        intent = new Intent(MainActivity.this, Rule.class);
                        intent.putExtra("title", "Причастие как глагольная форма.html");
                        startActivity(intent);
                        break;
                    case"Правописание причастий, причастный оборот":
                        intent = new Intent(MainActivity.this, Rule.class);
                        intent.putExtra("title", "Правописание причастий, причастный оборот.html");
                        startActivity(intent);
                        break;
                    case"Деепричастие как глагольная форма, деепричастный оборот":
                        intent = new Intent(MainActivity.this, Rule.class);
                        intent.putExtra("title", "Деепричастие как глагольная форма, деепричастный оборот.html");
                        startActivity(intent);
                        break;
                    case"Наречие как часть речи":
                        intent = new Intent(MainActivity.this, Rule.class);
                        intent.putExtra("title", "Наречие как часть речи.html");
                        startActivity(intent);
                        break;
                    case"Слова категории состояния":
                        intent = new Intent(MainActivity.this, Rule.class);
                        intent.putExtra("title", "Слова категории состояния.html");
                        startActivity(intent);
                        break;
                    case"Предлог как служебная часть речи":
                        intent = new Intent(MainActivity.this, Rule.class);
                        intent.putExtra("title", "Предлог как служебная часть речи.html");
                        startActivity(intent);
                        break;
                    case"Правописание предлогов":
                        intent = new Intent(MainActivity.this, Rule.class);
                        intent.putExtra("title", "Правописание предлогов.html");
                        startActivity(intent);
                        break;
                    case"Союз как служебная часть речи. Союзные слова":
                        intent = new Intent(MainActivity.this, Rule.class);
                        intent.putExtra("title", "Союз как служебная часть речи. Союзные слова.html");
                        startActivity(intent);
                        break;
                    case"Частицы":
                        intent = new Intent(MainActivity.this, Rule.class);
                        intent.putExtra("title", "Частицы.html");
                        startActivity(intent);
                        break;
                    case"Междометие как особый разряд слов. Звукоподражательные слова":
                        intent = new Intent(MainActivity.this, Rule.class);
                        intent.putExtra("title", "Междометие как особый разряд слов. Звукоподражательные слова.html");
                        startActivity(intent);
                        break;
                    case"Лексика. Фразеология. Лексикография":
                        intent = new Intent(MainActivity.this, Rule.class);
                        intent.putExtra("title", "Лексика. Фразеология. Лексикография.html");
                        startActivity(intent);
                        break;
                    case"Фонетика. Графика. Орфоэпия":
                        intent = new Intent(MainActivity.this, Rule.class);
                        intent.putExtra("title", "Фонетика. Графика. Орфоэпия.html");
                        startActivity(intent);
                        break;
                    case"Морфемика и словообразование":
                        intent = new Intent(MainActivity.this, Rule.class);
                        intent.putExtra("title", "Морфемика и словообразование.html");
                        startActivity(intent);
                        break;
                    case"Орфография":
                        intent = new Intent(MainActivity.this, Rule.class);
                        intent.putExtra("title", "Орфография.html");
                        startActivity(intent);
                        break;
                    case"Морфология. Самостоятельные части речи":
                        intent = new Intent(MainActivity.this, Rule.class);
                        intent.putExtra("title", "Морфология. Самостоятельные части речи.html");
                        startActivity(intent);
                        break;
                    case"Морфология. Служебные части речи":
                        intent = new Intent(MainActivity.this, Rule.class);
                        intent.putExtra("title", "Морфология. Служебные части речи.html");
                        startActivity(intent);
                        break;
                    case"Орфоэпия":
                        intent = new Intent(MainActivity.this, Rule.class);
                        intent.putExtra("title", "Орфоэпия.html");
                        startActivity(intent);
                        break;
                }
                return false;

            }
        });
    }
}
