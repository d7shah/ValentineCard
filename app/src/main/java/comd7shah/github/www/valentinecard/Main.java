package comd7shah.github.www.valentinecard;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;



public class Main extends ActionBarActivity implements View.OnClickListener {
    EditText editText;
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        editText = (EditText)findViewById(R.id.editText);
        imageButton = (ImageButton)findViewById(R.id.imageButton);
        imageButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, Card.class);
        intent.putExtra("name", editText.getText().toString());
        startActivity(intent);

    }
}
