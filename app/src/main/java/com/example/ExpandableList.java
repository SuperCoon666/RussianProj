package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableList
{
    public static HashMap<String, List<String>> getData()
    {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> lfl = new ArrayList<String>();
        lfl.add("Омонимы и их употребление");
        lfl.add("Паронимы и их употребление");
        lfl.add("Синонимы и их употребление");
        lfl.add("Антонимы и их употребление");
        lfl.add("Пассивная лексика. Архаизмы и историзмы");

        List<String> fgo = new ArrayList<String>();
        fgo.add("Орфоэпия");

        List<String> mns = new ArrayList<String>();
        mns.add("Состав слова");
        mns.add("Словообразование и формообразование");

        List<String> orf = new ArrayList<String>();
        orf.add("Правописание гласных в корне"); 
        orf.add("Правописание гласных после шипящих и Ц");
        orf.add("Правописание согласных");
        orf.add("Правописание приставок");
        orf.add("Употребление Ъ и Ь");
        orf.add("Употребление прописных букв");

        List<String> mschr = new ArrayList<String>();
        mschr.add("Имя существительное как часть речи");
        mschr.add("Имя прилагательное как часть речи");
        mschr.add("Имя числительное как часть речи");
        mschr.add("Местоимение как часть речи");
        mschr.add("Глагол как часть речи");
        mschr.add("Причастие как глагольная форма");
        mschr.add("Правописание причастий, причастный оборот");
        mschr.add("Деепричастие как глагольная форма, деепричастный оборот");
        mschr.add("Наречие как часть речи");
        mschr.add("Слова категории состояния");

        List<String> mhr = new ArrayList<String>();
        mhr.add("Предлог как служебная часть речи");
        mhr.add("Правописание предлогов");
        mhr.add("Союз как служебная часть речи. Союзные слова");
        mhr.add("Частицы");
        mhr.add("Междометие как особый разряд слов. Звукоподражательные слова");

        expandableListDetail.put("Лексика. Фразеология. Лексикография", lfl);
        expandableListDetail.put("Фонетика. Графика. Орфоэпия", fgo);
        expandableListDetail.put("Морфемика и словообразование", mns);
        expandableListDetail.put("Орфография", orf);
        expandableListDetail.put("Морфология. Самостоятельные части речи", mschr);
        expandableListDetail.put("Морфология. Служебные части речи", mhr);


        return expandableListDetail;
    }
}
