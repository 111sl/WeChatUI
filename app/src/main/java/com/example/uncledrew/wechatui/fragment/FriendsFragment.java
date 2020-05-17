package com.example.uncledrew.wechatui.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.uncledrew.wechatui.R;
import com.example.uncledrew.wechatui.adapter.FriendsAdapter;
import com.example.uncledrew.wechatui.adapter.ToolsAdapter;
import com.example.uncledrew.wechatui.pojo.Message;

import java.util.ArrayList;
import java.util.List;


public class FriendsFragment extends Fragment {

    private List<Message> msgList = new ArrayList<>();
    private List<Message> toolList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_friends,container,false);
        FriendsAdapter adapterFriend = new FriendsAdapter(getContext(),R.layout.friends_item,initFriends());
        ToolsAdapter adapterTool = new ToolsAdapter(getContext(),R.layout.friends_item,initTool());
        ListView toolsList = view.findViewById(R.id.tools_list);
        ListView friendsList = view.findViewById(R.id.friends_list);
        friendsList.setAdapter(adapterFriend);
        toolsList.setAdapter(adapterTool);
        return view;
    }

    private List<Message> initFriends(){
        for(int i=0;i<5;i++){
            Message message1 = new Message();
            message1.setName("KOBE");
            message1.setImg(R.drawable.face0);
            msgList.add(message1);
            Message message2 = new Message();
            message2.setName("Irving");
            message2.setImg(R.drawable.face1);
            msgList.add(message2);
            Message message3 = new Message();
            message3.setName("LBJ");
            message3.setImg(R.drawable.face2);
            msgList.add(message3);
        }
        return msgList;
    }

    private List<Message> initTool(){
        Message message1 = new Message();
        message1.setName("新的朋友");
        message1.setImg(R.drawable.icon_addperson);
        toolList.add(message1);
        Message message2 = new Message();
        message2.setName("群聊");
        message2.setImg(R.drawable.icon_group);
        toolList.add(message2);
        Message message3 = new Message();
        message3.setName("标签");
        message3.setImg(R.drawable.icon_label);
        toolList.add(message3);
        Message message4 = new Message();
        message1.setName("公众号");
        message1.setImg(R.drawable.icon_mine);
        toolList.add(message1);
        return toolList;
    }
}
