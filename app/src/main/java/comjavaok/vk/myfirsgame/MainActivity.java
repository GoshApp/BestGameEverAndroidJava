package comjavaok.vk.myfirsgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtText;
    TextView textInfo;
    TextView topText;
    Button bt;
    int idWord;
    final int ONE = 1, TWO = 2,THREE = 3,FOUR = 4, FIVE = 5; // количество слов для ввода


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtText = (EditText) findViewById(R.id.edtText);
        textInfo = (TextView) findViewById(R.id.textInfo);
        topText = (TextView) findViewById(R.id.topText);
        bt = (Button) findViewById(R.id.button);


        edtText.addTextChangedListener(new TextWatcher(){
            @Override
            public void afterTextChanged(Editable s) {
                switch (idWord){
                    case ONE:
                            textInfo.setText("Введите слово из 4 буквы");
                            topText.setText(edtText.getText());
                            edtText.setText("");
                        break;
                    case TWO:
                            textInfo.setText("Введите слово из 3 букв");
                            topText.setText(edtText.getText());
                            edtText.setText("");
                        break;
                    case THREE:
                            textInfo.setText("Введите слово из 2 букв");
                            topText.setText(edtText.getText());
                            edtText.setText("");
                        break;
                    case FOUR:
                            textInfo.setText("Введите слово из 1 букву");
                            topText.setText(edtText.getText());
                            edtText.setText("");
                        break;
                    case FIVE:
                            textInfo.setText("Введите слово из 0 букв");
                            topText.setText(edtText.getText());
                            edtText.setText("");
                        break;
                    }// switch
                // Выполнить после изменения текста
                if (edtText.getText().length() == 5) {
                    textInfo.setText("Введите слово из 4 буквы");
                    topText.setText(edtText.getText());
                    edtText.setText("");

                }
            }//afterTextChanged

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });
    }//onCreate

        public void onMyButtonClick(View view) {
                if (edtText.getText().length() >= 5) {
                    idWord = ONE;
                }
                if (edtText.getText().length() == 4) {
                    idWord = TWO;
                }
                if (edtText.getText().length() == 3) {
                    idWord = THREE;
                }
                if (edtText.getText().length() == 2) {
                    idWord = FOUR;
                }
            }
        };



}//MainActivity
