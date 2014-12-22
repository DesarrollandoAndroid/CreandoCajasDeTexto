package desarrollandoandroid.creandocajasdetexto;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    EditText phone;
    EditText hexadecimal;

    TextView text;

    String phoneNumber, hexadecimalNumber, finalText;

    Button phoNum, hexNum, sText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phone = (EditText)findViewById(R.id.phoneNumber);
        hexadecimal = (EditText)findViewById(R.id.hexadecimalNumber);

        text = (TextView)findViewById(R.id.helloworld);

        phoNum = (Button)findViewById(R.id.phone);
        hexNum = (Button)findViewById(R.id.hexNumber);
        sText = (Button)findViewById(R.id.text);

        phoNum.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                phoneNumber = phone.getText().toString();
                Toast number = Toast.makeText(getBaseContext(), phoneNumber, Toast.LENGTH_SHORT);
                number.show();
            }
        });

        hexNum.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                hexadecimalNumber = hexadecimal.getText().toString();
                Toast HexNumber = Toast.makeText(getBaseContext(), hexadecimalNumber, Toast.LENGTH_SHORT);
                HexNumber.show();
            }
        });

        sText.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                phoneNumber = phone.getText().toString();
                hexadecimalNumber = hexadecimal.getText().toString();

                finalText = getResources().getString(R.string.hello_world);
                text.setText(finalText + phoneNumber + hexadecimalNumber);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
