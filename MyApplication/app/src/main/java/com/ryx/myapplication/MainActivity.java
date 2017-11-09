package com.ryx.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    private String cm_regEx = "^1(3[4-9]|4[7]|5[0-27-9]|7[08]|8[2-478])\\d{8}$";//中国移动号段表达式
    private String cu_regEx = "^1(3[0-2]|4[5]|5[56]|7[0156]|8[56])\\d{8}$";//中国联通号段表达式
    private String ct_regEx = "^1(3[3]|4[9]|53|7[037]|8[019])\\d{8}$";//中国电信号段表达式式
    private TextView tv;
    private String str = "13552982091";
//    private String str1 = "18070151891";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv =findViewById(R.id.tv);
        if (checkPhoneNo(cm_regEx, "13552982091")) {
            tv.setText("中国移动");
        }else{
            Toast.makeText(getApplicationContext(),"nonon",Toast.LENGTH_LONG).show();
        }

}
    /**
    * 手机号运营商校验
    * */
    private boolean checkPhoneNo(String regEx, String phoneStr) {
        Pattern pattern = Pattern.compile(regEx);
        Matcher m = pattern.matcher(phoneStr);
        return m.matches();
    }
}