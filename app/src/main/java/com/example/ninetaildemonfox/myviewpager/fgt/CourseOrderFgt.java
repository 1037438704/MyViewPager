package com.example.ninetaildemonfox.myviewpager.fgt;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.ninetaildemonfox.myviewpager.GlideUtils;
import com.example.ninetaildemonfox.myviewpager.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CourseOrderFgt extends Fragment {

    private ImageView imageView;
    private String string = "";
    private int index;
    private TextView text;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fgt_course_order, container, false);
        imageView = inflate.findViewById(R.id.imageView);
        text = inflate.findViewById(R.id.text);
        index = getArguments().getInt("index");
        string = getArguments().getString("string");
        Log.d("zdl", "=====================" + string);
        text.setText(index + "");

        GlideUtils.glideOriginal(getContext(), string, imageView);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index == 7) {
                    getActivity().finish();
                }
            }
        });

        return inflate;
    }
}
