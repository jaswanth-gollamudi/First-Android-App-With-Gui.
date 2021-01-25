package motorcalc.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     EditText inedittext,inedittext1,inedittext2;
     TextView ouedittext;
     Button AddButton,DivButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inedittext = findViewById(R.id.input);
        inedittext1 = findViewById(R.id.input1);
        inedittext2 = findViewById(R.id.input2);
        ouedittext=findViewById(R.id.output);
        AddButton=findViewById(R.id.calc1);
        DivButton=findViewById(R.id.calc2);

    }
    public void addnumbers(View v){
        double n1,n2,n3,result;
        n1 = Double.parseDouble(inedittext.getText().toString());
        n2 = Double.parseDouble(inedittext1.getText().toString());
        result = n1+n2;
        ouedittext.setText(String.format("sum : %.2f", result));
    }
    public void Divnumbers(View v){
        double n1,n2,n3,result1;
        n3 = Double.parseDouble(inedittext2.getText().toString());
        n2 = Double.parseDouble(inedittext1.getText().toString());
        result1 = n2/n3;
        ouedittext.setText(String.format("Rem : %.2f", result1));
    }
}
