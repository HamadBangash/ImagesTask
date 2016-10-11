package com.example.bangash.imagestask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnClick;
    ImageView iv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvParagraph = (TextView) findViewById(R.id.tvParagraph);
        btnClick = (Button) findViewById(R.id.btnClick);
        iv2 = (ImageView) findViewById(R.id.iv2);
        StringBuffer sb = new StringBuffer();
        sb.append(getString(R.string.DummyText));
        sb.append(getString(R.string.DummyText));
        sb.append(getString(R.string.DummyText));
        sb.append(getString(R.string.DummyText));
        sb.append(getString(R.string.DummyText));
        sb.append(getString(R.string.DummyText));
        sb.append(getString(R.string.DummyText));
        sb.append(getString(R.string.DummyText));
        tvParagraph.setText(sb.toString());

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String imgName = "logo2";
                int res = getResources().getIdentifier(imgName, "drawable", getPackageName());
                iv2.setImageResource(res);
            }
        });
    }

}
