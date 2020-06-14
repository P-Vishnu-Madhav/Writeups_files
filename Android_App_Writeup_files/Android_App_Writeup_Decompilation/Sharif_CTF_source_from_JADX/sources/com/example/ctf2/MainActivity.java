package com.example.ctf2;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    /* renamed from: a */
    Button f0a;

    /* renamed from: b */
    EditText f1b;

    /* renamed from: c */
    TextView f2c;

    /* renamed from: d */
    int f3d = 123;

    /* renamed from: e */
    String f4e = "Code";

    static {
        System.loadLibrary("adnjni");
    }

    public native int IsCorrect(String str);

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        this.f0a = (Button) findViewById(R.id.Btn);
        this.f1b = (EditText) findViewById(R.id.edit_message);
        this.f2c = (TextView) findViewById(R.id.text_id);
        this.f4e = Build.SERIAL;
        this.f3d = 114366;
        this.f0a.setOnClickListener(new C0000a(this));
    }

    public native int processObjectArrayFromNative(String str);
}
