package jp.ac.asojuku.st.twotouchmail;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;

public class NoDinnerActivity extends AppCompatActivity

    implements View.OnClickListener,View.OnLongClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_dinner);
        Button btnSend = (Button) this.findViewById(R.id.button);
        btnSend.setOnClickListener(this);
        btnSend.setOnLongClickListener(this);
    }
    @Override
    public  void onClick(View v) {
        EditText edit01 = (EditText)findViewById(R.id.editText);
    String title = edit01.getText().toString();
        Resources res = getResources();
        Uri uri = Uri.parse("mailto:" + res.getString(R.string.mail_to).toString());
        Intent intent=new Intent(Intent.ACTION_SENDTO, uri);
        intent.putExtra(Intent.EXTRA_SUBJECT,title);
        intent.putExtra(Intent.EXTRA_TEXT, "遅くなるのでご飯いりません");
        startActivity(intent);
    }
    @Override
    public boolean onClick(View v) {
        EditText edit01 = (EditText)findViewById(R.id.editText);
        String title = edit01.getText().toString();
        Resources res = getResources();
        Uri uri = Uri.parse("mailto:" + res.getString(R.string.mail_to).toString());
        intent.putExtra(Intent.EXTRA_TEXT,"遅くなるので食事いりません。" + "連絡が遅くなってごめんなさい。" + "いつものありがとう");
        startActivity(intent);
        return true;
    }


}