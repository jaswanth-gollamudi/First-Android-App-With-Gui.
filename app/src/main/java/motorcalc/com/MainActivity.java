package motorcalc.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     EditText inEdittext,inEdittext1,inEdittext2;
     TextView ouEdittext;
     Button addButton,divButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inEdittext = findViewById(R.id.input);
        inEdittext1 = findViewById(R.id.input1);
        inEdittext2 = findViewById(R.id.input2);
        ouEdittext=findViewById(R.id.output);
        addButton=findViewById(R.id.calc1);
        divButton=findViewById(R.id.calc2);

    }
    public void addNumbers(View v){
        double n1,n2,n3,result;
        n1 = Double.parseDouble(inEdittext.getText().toString());
        n2 = Double.parseDouble(inEdittext1.getText().toString());
        result = n1+n2;
        ouEdittext.setText(String.format("%.2f", result));
    }
    public void divNumbers(View v){
        double n1,n2,n3,result1;
        n3 = Double.parseDouble(inEdittext2.getText().toString());
        n2 = Double.parseDouble(inEdittext1.getText().toString());
        result1 = n2/n3;
        ouEdittext.setText(String.format("%.2f", result1));
    }
}
