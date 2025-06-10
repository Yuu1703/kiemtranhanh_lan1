package com.example.test_nhanh_01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextKg;
    private TextView textViewResult;
    private Button buttonConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ các thành phần giao diện
        editTextKg = findViewById(R.id.editTextKg);
        textViewResult = findViewById(R.id.textViewResult);
        buttonConvert = findViewById(R.id.buttonConvert);

        // Xử lý sự kiện nhấn nút Convert
        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lấy giá trị từ EditText và chuyển đổi sang pound
                String kgText = editTextKg.getText().toString();
                if (!kgText.isEmpty()) {
                    double kg = Double.parseDouble(kgText);
                    double pounds = kg * 2.20462; // Công thức chuyển đổi kg -> pound
                    textViewResult.setText(String.format("Result: %.2f pounds", pounds));
                } else {
                    textViewResult.setText("Please enter a valid weight in kg.");
                }
            }
        });
    }
}