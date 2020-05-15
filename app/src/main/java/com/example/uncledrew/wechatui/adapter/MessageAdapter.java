package com.example.uncledrew.wechatui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.uncledrew.wechatui.R;
import com.example.uncledrew.wechatui.pojo.Message;

import java.util.List;

public class MessageAdapter extends ArrayAdapter<Message> {

    private int resourceId;

    public MessageAdapter(Context context, int resource, List<Message> objects) {
        super(context, resource, objects);
        resourceId = resource;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Message message = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        TextView name = view.findViewById(R.id.name);
        TextView time = view.findViewById(R.id.time);
        TextView lastMessage = view.findViewById(R.id.last_message);
        ImageView img = view.findViewById(R.id.image);
        name.setText(message.getName());
        time.setText(message.getTime());
        lastMessage.setText(message.getLastMessage());
        img.setImageResource(message.getImg());
        return view;
    }
}
