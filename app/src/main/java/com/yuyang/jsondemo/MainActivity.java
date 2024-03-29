package com.yuyang.jsondemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.gson.Gson;
import com.yuyang.jsondemo.bean.TestToJson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6;

    String jsonstr1, jsonstr2, jsonstr3, jsonstr4, jsonstr5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initValue();
        initListener();

    }

    private void initListener() {
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);

    }


    private void initValue() {
        jsonstr1 = "[\n" +
                "  {\n" +
                "    \"name\": \"zhangsan\",\n" +
                "    \"age\": \"10\",\n" +
                "    \"phone\": \"11111\",\n" +
                "    \"email\": \"11111@11.com\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"lisi\",\n" +
                "    \"age\": \"20\",\n" +
                "    \"phone\": \"22222\",\n" +
                "    \"email\": \"22222@22.com\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"wangwu\",\n" +
                "    \"age\": \"30\",\n" +
                "    \"phone\": \"33333\",\n" +
                "    \"email\": \"33333@33.com\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"qianliu\",\n" +
                "    \"age\": \"40\",\n" +
                "    \"phone\": \"44444\",\n" +
                "    \"email\": \"44444@44.com\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"zhaoqi\",\n" +
                "    \"age\": \"50\",\n" +
                "    \"phone\": \"55555\",\n" +
                "    \"email\": \"55555@55.com\"\n" +
                "  }\n" +
                "]" ;

        jsonstr2 = "{\n" +
                "  \"muser\": [\n" +
                "    {\n" +
                "      \"name\": \"zhangsan\",\n" +
                "      \"age\": \"10\",\n" +
                "      \"phone\": \"11111\",\n" +
                "      \"email\": \"11111@11.com\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"lisi\",\n" +
                "      \"age\": \"20\",\n" +
                "      \"phone\": \"22222\",\n" +
                "      \"email\": \"22222@22.com\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"wangwu\",\n" +
                "      \"age\": \"30\",\n" +
                "      \"phone\": \"33333\",\n" +
                "      \"email\": \"33333@33.com\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"qianliu\",\n" +
                "      \"age\": \"40\",\n" +
                "      \"phone\": \"44444\",\n" +
                "      \"email\": \"44444@44.com\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"zhaoqi\",\n" +
                "      \"age\": \"50\",\n" +
                "      \"phone\": \"55555\",\n" +
                "      \"email\": \"55555@55.com\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";

        jsonstr3 = "{\n" +
                "  \"code\": 200,\n" +
                "  \"msg\": \"OK\",\n" +
                "  \"student\": [\n" +
                "    {\n" +
                "      \"name\": \"zhangsan\",\n" +
                "      \"age\": \"10\",\n" +
                "      \"phone\": \"11111\",\n" +
                "      \"email\": \"11111@11.com\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"lisi\",\n" +
                "      \"age\": \"20\",\n" +
                "      \"phone\": \"22222\",\n" +
                "      \"email\": \"22222@22.com\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"wangwu\",\n" +
                "      \"age\": \"30\",\n" +
                "      \"phone\": \"33333\",\n" +
                "      \"email\": \"33333@33.com\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"qianliu\",\n" +
                "      \"age\": \"40\",\n" +
                "      \"phone\": \"44444\",\n" +
                "      \"email\": \"44444@44.com\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"zhaoqi\",\n" +
                "      \"age\": \"50\",\n" +
                "      \"phone\": \"55555\",\n" +
                "      \"email\": \"55555@55.com\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";


        jsonstr4 = "{\n" +
                "  \"code\": 200,\n" +
                "  \"msg\": \"OK\",\n" +
                "  \"child\": [\n" +
                "    {\n" +
                "      \"name\": \"zhangsan\",\n" +
                "      \"age\": \"10\",\n" +
                "      \"phone\": \"11111\",\n" +
                "      \"email\": \"11111@11.com\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"lisi\",\n" +
                "      \"age\": \"20\",\n" +
                "      \"phone\": \"22222\",\n" +
                "      \"email\": \"22222@22.com\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"wangwu\",\n" +
                "      \"age\": \"30\",\n" +
                "      \"phone\": \"33333\",\n" +
                "      \"email\": \"33333@33.com\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"qianliu\",\n" +
                "      \"age\": \"40\",\n" +
                "      \"phone\": \"44444\",\n" +
                "      \"email\": \"44444@44.com\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"zhaoqi\",\n" +
                "      \"age\": \"50\",\n" +
                "      \"phone\": \"55555\",\n" +
                "      \"email\": \"55555@55.com\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";


        jsonstr5 = "{\n" +
                "  \"group\": {\n" +
                "    \"user\": {\n" +
                "      \"name\": \"张三\",\n" +
                "      \"age\": \"10\",\n" +
                "      \"phone\": \"11111\",\n" +
                "      \"email\": \"11111@11.com\"\n" +
                "    },\n" +
                "    \"info\": {\n" +
                "      \"address\": \"北京\",\n" +
                "      \"work\": \"Android Dev\",\n" +
                "      \"pay\": \"10K\",\n" +
                "      \"motto\": \"先定一个小目标，比如我先赚一个亿\"\n" +
                "    }\n" +
                "  }\n" +
                "}";
    }

    private void initView() {
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_1:
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("jsonstr", jsonstr1);
                intent.putExtra("id",1);
                startActivity(intent);
                break;
            case R.id.btn_2:
                Intent intent1 = new Intent(MainActivity.this, Main2Activity.class);
                intent1.putExtra("jsonstr", jsonstr2);
                intent1.putExtra("id",2);
                startActivity(intent1);
                break;
            case R.id.btn_3:
                Intent intent2 = new Intent(MainActivity.this, Main2Activity.class);
                intent2.putExtra("jsonstr", jsonstr3);
                intent2.putExtra("id",3);
                startActivity(intent2);
                break;
            case R.id.btn_4:
                Intent intent3 = new Intent(MainActivity.this, Main2Activity.class);
                intent3.putExtra("jsonstr", jsonstr4);
                intent3.putExtra("id",4);
                startActivity(intent3);
                break;
            case R.id.btn_5:
                Intent intent4 = new Intent(MainActivity.this, Main2Activity.class);
                intent4.putExtra("jsonstr", jsonstr5);
                intent4.putExtra("id",5);
                startActivity(intent4);
                break;
            case R.id.btn_6:
                TestToJson testToJson = new TestToJson();
                testToJson.setId(2019);
                testToJson.setName("yuyang");
                TestToJson.InnerClass innerClass = new TestToJson().new InnerClass();
                innerClass.inId = 201906;
                innerClass.innerName = "yuyanghaha";
                List<TestToJson.InnerClass> innerClassList = new ArrayList<>();
                innerClassList.add(innerClass);
                testToJson.setInnerClassList(innerClassList);

                Gson gson = new Gson();
                String classTojson = gson.toJson(testToJson);
                System.out.println(classTojson);

                default:break;

        }

    }
}
