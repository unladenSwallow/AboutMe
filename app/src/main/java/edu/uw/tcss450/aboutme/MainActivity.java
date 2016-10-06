package edu.uw.tcss450.aboutme;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "edu.uw.tcss450.aboutme.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user clicks the Text button */
    public void sendText(View view) {
        Intent intent = new Intent(this, TxtButtonActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    /** Called when the user clicks the Image button */
    public void sendImage(View view) {
        Intent intent = new Intent(this, ImgButtonActivity.class);
        startActivity(intent);
    }

    /** Called when the user clicks the Web button */
    public void sendWeb(View view) {
        Intent intent = new Intent(this, WebButtonActivity.class);
        startActivity(intent);
    }

    /** Called when the user clicks the Web button */
    public void sendToast(View view) {
        Intent intent = new Intent(this, ToastButtonActivity.class);
        startActivity(intent);
    }

    /** Called when the user clicks the Dialog button */
    public void sendDialog(View view) {
        Intent intent = new Intent(this, DialogButtonActivity.class);
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage("Hello.");
        builder1.setCancelable(true);

        builder1.setPositiveButton(
                "Yes",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        builder1.setNegativeButton(
                "No",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        AlertDialog alert11 = builder1.create();
        alert11.show();

    }
}
