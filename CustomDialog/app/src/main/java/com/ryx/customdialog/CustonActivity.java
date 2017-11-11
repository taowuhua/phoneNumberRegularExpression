package com.ryx.customdialog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CustonActivity extends AppCompatActivity {
private Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custon);
        bt = findViewById(R.id.bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflaterDl = LayoutInflater.from(CustonActivity.this);
                LinearLayout layout = (LinearLayout) inflaterDl.inflate(R.layout.activity_customdialog, null);
                TextView statusTv = (TextView) layout.findViewById(R.id.c_dialog_ok_status);
                TextView statustipTv = (TextView) layout.findViewById(R.id.c_dialog_ok_tip);
                statusTv.setText("当前有逾期状态的借款，");
                statustipTv.setText("成功还款后次日可激活和借款！");
                //对话框
                final android.app.Dialog dialog = new android.app.AlertDialog.Builder(CustonActivity.this).create();
                dialog.show();
                dialog.getWindow().setContentView(layout);
            }
        });

    }
}
