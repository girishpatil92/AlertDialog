package com.example.android.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String m_text = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView editWalaImage = findViewById(R.id.image_edit);
        editWalaImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LayoutInflater factory = LayoutInflater.from(MainActivity.this);

                final View textEntryView = factory.inflate(R.layout.text_entry, null);

                final EditText input1 = (EditText) textEntryView.findViewById(R.id.first);
                final EditText input2 = (EditText) textEntryView.findViewById(R.id.second);

                input1.setText("DefaultValue", TextView.BufferType.EDITABLE);
                input2.setText("DefaultValue", TextView.BufferType.EDITABLE);

                final AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                alert.setIcon(R.drawable.ic_launcher_background).setTitle("Enter the Text:").setView(textEntryView).setPositiveButton("Save", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {


                        Log.d("LALALALALALALAL", "Text Entry 1 Entered " + input1.getText().toString());
                        Log.d("LALALALALALALAL", "Text Entry 2 Entered " + input2.getText().toString());


                    }
                }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();








            }
        });
    }
}
