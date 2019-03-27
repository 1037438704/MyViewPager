package com.example.ninetaildemonfox.myviewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.example.ninetaildemonfox.myviewpager.fgt.CourseOrderFgt;
import com.example.ninetaildemonfox.myviewpager.map.JSONUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private String  aaa = "[\n" +
            "    {\n" +
            "        \"id\": \"0001\",\n" +
            "        \"name\": \"Abstract 3D\",\n" +
            "        \"urlWide\": \"https://github.com/804447885/ringtones/raw/master/Kaka%20Ringtones/wallpaper/Abstract/Abstract%203D-large.jpg\",\n" +
            "        \"urlFixed\": \"https://github.com/804447885/ringtones/raw/master/Kaka%20Ringtones/wallpaper/Abstract/Abstract%203D.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": \"0002\",\n" +
            "        \"name\": \"Aurora Borealis Rainbows\",\n" +
            "        \"urlWide\": \"https://github.com/804447885/ringtones/raw/master/Kaka%20Ringtones/wallpaper/Abstract/Aurora%20Borealis%20Rainbows-large.jpg\",\n" +
            "        \"urlFixed\": \"https://github.com/804447885/ringtones/raw/master/Kaka%20Ringtones/wallpaper/Abstract/Aurora%20Borealis%20Rainbows.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": \"0003\",\n" +
            "        \"name\": \"Blue Black\",\n" +
            "        \"urlWide\": \"https://github.com/804447885/ringtones/raw/master/Kaka%20Ringtones/wallpaper/Abstract/Blue%20Black-large.jpg\",\n" +
            "        \"urlFixed\": \"https://github.com/804447885/ringtones/raw/master/Kaka%20Ringtones/wallpaper/Abstract/Blue%20Black.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": \"0004\",\n" +
            "        \"name\": \"Digital Art\",\n" +
            "        \"urlWide\": \"https://github.com/804447885/ringtones/raw/master/Kaka%20Ringtones/wallpaper/Abstract/Digital%20Art-large.jpg\",\n" +
            "        \"urlFixed\": \"https://github.com/804447885/ringtones/raw/master/Kaka%20Ringtones/wallpaper/Abstract/Digital%20Art.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": \"0005\",\n" +
            "        \"name\": \"Nebulae\",\n" +
            "        \"urlWide\": \"https://github.com/804447885/ringtones/raw/master/Kaka%20Ringtones/wallpaper/Abstract/Nebulae-large.jpg\",\n" +
            "        \"urlFixed\": \"https://github.com/804447885/ringtones/raw/master/Kaka%20Ringtones/wallpaper/Abstract/Nebulae.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": \"0006\",\n" +
            "        \"name\": \"Planets\",\n" +
            "        \"urlWide\": \"https://github.com/804447885/ringtones/raw/master/Kaka%20Ringtones/wallpaper/Abstract/Planets-large.jpg\",\n" +
            "        \"urlFixed\": \"https://github.com/804447885/ringtones/raw/master/Kaka%20Ringtones/wallpaper/Abstract/Planets.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": \"0007\",\n" +
            "        \"name\": \"Star Trek\",\n" +
            "        \"urlWide\": \"https://github.com/804447885/ringtones/raw/master/Kaka%20Ringtones/wallpaper/Abstract/Star%20Trek-large.jpg\",\n" +
            "        \"urlFixed\": \"https://github.com/804447885/ringtones/raw/master/Kaka%20Ringtones/wallpaper/Abstract/Star%20Trek.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": \"0008\",\n" +
            "        \"name\": \"Windows\",\n" +
            "        \"urlWide\": \"https://github.com/804447885/ringtones/raw/master/Kaka%20Ringtones/wallpaper/Abstract/Windows-large.jpg\",\n" +
            "        \"urlFixed\": \"https://github.com/804447885/ringtones/raw/master/Kaka%20Ringtones/wallpaper/Abstract/Windows.jpg\"\n" +
            "    }\n" +
            "]";

    private ViewPager viewPager;
    private ViewPagerAdp viewPagerAdp;
    private List<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        fragments = new ArrayList<>();
        viewPager = findViewById(R.id.viewPager);
        ArrayList<Map<String, String>> maps = JSONUtils.parseKeyAndValueToMapList(aaa);
        for (int i = 0; i < maps.size(); i++) {
            CourseOrderFgt fgt = new CourseOrderFgt();
            Bundle bundle = new Bundle();
            bundle.putInt("index", i);
            bundle.putString("string", maps.get(i).get("urlWide"));
            fgt.setArguments(bundle);
            fragments.add(fgt);
        }
        viewPagerAdp = new ViewPagerAdp(getSupportFragmentManager(), fragments);
        viewPager.setAdapter(viewPagerAdp);

    }
}
