package com.example.ctf2;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.example.ctf2.a */
class C0000a implements OnClickListener {

    /* renamed from: a */
    final /* synthetic */ MainActivity f5a;

    C0000a(MainActivity mainActivity) {
        this.f5a = mainActivity;
    }

    public void onClick(View view) {
        new String(" ");
        String editable = this.f5a.f1b.getText().toString();
        Log.v("EditText", this.f5a.f1b.getText().toString());
        new String("");
        int processObjectArrayFromNative = this.f5a.processObjectArrayFromNative(editable);
        int IsCorrect = this.f5a.IsCorrect(editable);
        String sb = new StringBuilder(String.valueOf(this.f5a.f3d + processObjectArrayFromNative)).append(" ").toString();
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(sb.getBytes());
            byte[] digest = instance.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : digest) {
                stringBuffer.append(Integer.toString((b & 255) + 256, 16).substring(1));
            }
            if (IsCorrect == 1 && this.f5a.f4e != "unknown") {
                this.f5a.f2c.setText("Sharif_CTF(" + stringBuffer.toString() + ")");
            }
            if (IsCorrect == 1 && this.f5a.f4e == "unknown") {
                this.f5a.f2c.setText("Just keep Trying :-)");
            }
            if (IsCorrect == 0) {
                this.f5a.f2c.setText("Just keep Trying :-)");
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
