package edu.tacoma.uw.pham19.activitylifecycle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SavedInstanceActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText etFirstNumber;
    private EditText etSecondNumber;
    private TextView tvResult;
    private Button btnSum;
    private int firstNumber;
    private int secondNumber;
    private int result;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstNumber = (EditText)findViewById(R.id.et_firstNumber);
        etSecondNumber = (EditText)findViewById(R.id.et_secondNumber);
        tvResult = (TextView)findViewById(R.id.tv_result);
        if(savedInstanceState != null) {
            etFirstNumber.setText(String.valueOf(savedInstanceState.getInt("SO_THU_NHAT")));
            etSecondNumber.setText(String.valueOf(savedInstanceState.getInt("SO_THU_HAI")));
            tvResult.setText(String.valueOf(savedInstanceState.getInt("KET_QUA")));
        }
        btnSum = (Button)findViewById(R.id.btn_Sum);
        btnSum.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if(view == btnSum) {
            if(etFirstNumber.getText().toString().isEmpty() || etSecondNumber.getText().toString().isEmpty()) {
                Toast.makeText(this, "Vui lòng nhập đầy đủ số", Toast.LENGTH_SHORT).show();
            } else {
                firstNumber = Integer.parseInt(etFirstNumber.getText().toString());
                secondNumber = Integer.parseInt(etSecondNumber.getText().toString());
                result = firstNumber + secondNumber;
                tvResult.setText(String.valueOf(result));
            }
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (!tvResult.getText().toString().isEmpty()) {
            outState.putInt("SO_THU_NHAT", Integer.parseInt(etFirstNumber.getText().toString()));
            outState.putInt("SO_THU_HAI", Integer.parseInt(etSecondNumber.getText().toString()));
            outState.putInt("KET_QUA", Integer.parseInt(tvResult.getText().toString()));
        }
    }
}
