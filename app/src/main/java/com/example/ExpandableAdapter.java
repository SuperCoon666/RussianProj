package com.example;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class ExpandableAdapter extends BaseExpandableListAdapter // базовый класс, от которого наследуемся
{
    private Context context; // асбрактный класс, позволяющий получить данные приложения
    List<String> expandableListTitle; // двухуровневый список
    HashMap<String, List<String>> expandableListDetail;
    public ExpandableAdapter(Context context, List<String> expandableListTitle, HashMap<String, List<String>> expandableListDetail) // адаптирует отображаемые данные
    {
        this.context = context;
        this.expandableListTitle = expandableListTitle;
        this.expandableListDetail = expandableListDetail;
    }
    @Override
    public Object getChild(int listPosition, int expandedListPosition)
    {
        return this.expandableListDetail.get(this.expandableListTitle.get(listPosition)).get(expandedListPosition);
    }
    @Override
    public long getChildId(int listPosition, int expandedListPosition)
    {
        return expandedListPosition;
    }
    @Override
    public View getChildView(int listPosition, final int expandedListPosition, boolean isLastChild, View convertView, ViewGroup parent)
    {
        final String expandedListText = (String) getChild(listPosition, expandedListPosition);
        if (convertView == null)
        {
            LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.expandablelist_item, null);
        }
        TextView expandadListTextView = (TextView) convertView.findViewById(R.id.ListItem_text);
        expandadListTextView.setText(expandedListText);
        return convertView;
    }
    @Override
    public int getChildrenCount(int listPosition)
    {
        return this.expandableListDetail.get(this.expandableListTitle.get(listPosition)).size();
    }
    @Override
    public Object getGroup(int listPosition)
    {
        return this.expandableListTitle.get(listPosition);
    }
    @Override
    public int getGroupCount()
    {
        return this.expandableListTitle.size();
    }
    @Override
    public long getGroupId(int listPosition)
    {
        return listPosition;
    }
    @Override public View getGroupView(int listPosition, boolean isExpanded, View convertView, ViewGroup parent)
    {
        String listTitle = (String) getGroup(listPosition);
        if (convertView == null)
        {
            LayoutInflater layoutInflater = (LayoutInflater) this.context. getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.expandable_listgroup, null);
        }
        TextView listTitleTextView = (TextView) convertView .findViewById(R.id.listTitle);
        listTitleTextView.setTypeface(null, Typeface.BOLD);
        listTitleTextView.setText(listTitle); return convertView;
    }
    @Override public boolean hasStableIds()
    {
        return false;
    }
    @Override public boolean isChildSelectable(int listPosition, int expandedListPosition)
    {
        return true;
    }
}