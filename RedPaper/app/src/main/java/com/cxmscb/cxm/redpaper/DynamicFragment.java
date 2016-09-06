package com.cxmscb.cxm.redpaper;

import android.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class DynamicFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_dynamic, container, false);

        final Button button = (Button) v.findViewById(R.id.start);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplication(),"开始抢红包",Toast.LENGTH_SHORT).show();
            }
        });

        return v;
    }

}
