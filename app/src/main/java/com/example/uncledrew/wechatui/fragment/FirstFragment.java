package com.example.uncledrew.wechatui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.uncledrew.wechatui.R;
import com.example.uncledrew.wechatui.adapter.MessageAdapter;
import com.example.uncledrew.wechatui.pojo.Message;

import java.util.ArrayList;
import java.util.List;


public class FirstFragment extends Fragment {

    public static final String TAG = "FirstFragment";
    private List<Message> msgList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first,container,false);
        MessageAdapter adapter = new MessageAdapter(getContext(),R.layout.message_item,init());
        ListView listView = view.findViewById(R.id.message_list);
        listView.setAdapter(adapter);
        return view;
    }

    private List<Message> init(){
        for(int i=0;i<5;i++){
            Message message1 = new Message();
            message1.setName("KOBE");
            message1.setTime("2-21");
            message1.setLastMessage("what's up bro");
            message1.setImg(R.drawable.face0);
            msgList.add(message1);
            Message message2 = new Message();
            message2.setName("Irving");
            message2.setTime("3-21");
            message2.setLastMessage("come on");
            message2.setImg(R.drawable.face1);
            msgList.add(message2);
            Message message3 = new Message();
            message3.setName("LBJ");
            message3.setTime("12:01");
            message3.setLastMessage("TACOTACO");
            message3.setImg(R.drawable.face2);
            msgList.add(message3);
        }
        return msgList;
    }

}
