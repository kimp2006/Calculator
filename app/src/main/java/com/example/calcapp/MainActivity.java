package com.example.calcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Объявляем переменные для простых чисел типа INT (пример: 10, 15 и тд.)
    int x,y, score;
    // Объявляем константу числа Пи
    double pi = 3.14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Объявляем текстовые поля для ввода значений
        EditText numOne = (EditText)findViewById(R.id.editTextNumber);
        EditText numTwo = (EditText)findViewById(R.id.editTextNumber2);

        // Объявляем текст для вывода результата
        TextView result = (TextView) findViewById(R.id.resultValue);

        // Объявляем кнопки для выполнения мат. операций
        // Кнопки простых операций
        Button btnPlus = (Button) findViewById(R.id.btnPlus);
        Button btnMinus = (Button) findViewById(R.id.btnMinus);
        Button btnSlash = (Button) findViewById(R.id.btnSlash);
        Button btnMultiply = (Button) findViewById(R.id.btnMultiply);
        // Кнопки сложных операций
        Button btnSqr = (Button) findViewById(R.id.btnSqr);
        Button btnProcent = (Button) findViewById(R.id.btnProcent);
        Button btnPythagoras = (Button) findViewById(R.id.btnPythagoras);
        Button btnCircle = (Button) findViewById(R.id.btnCircle);
        Button btnVolym = (Button) findViewById(R.id.btnVolym);

        // При нажатии на кнопку сложения
        btnPlus.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            public void onClick(View v) {
                // Проверяем заполненность полей для ввода
                if(numOne.length() > 0 & numTwo .length() > 0){
                    // Объявляем переменные для выполнения мат. операций
                    x = Integer.parseInt(numOne.getText().toString());
                    y = Integer.parseInt(numTwo.getText().toString());
                    // Вычисляем
                    score = x + y;
                    // Записываем результат
                    result.setText(score + "");
                } else {
                    // Если поля для ввода пустые, выводим "Введите числа"
                    result.setText("Ange siffror!");
                }
            }

        });

        // При нажатии на кнопку вычитания
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {
                // Проверяем заполненность полей для ввода
                if(numOne.length() > 0 & numTwo .length() > 0){
                    // Объявляем переменные для выполнения мат. операций
                    x = Integer.parseInt(numOne.getText().toString());
                    y = Integer.parseInt(numTwo.getText().toString());
                    // Вычисляем
                    score = x - y;
                    // Записываем результат
                    result.setText(score + "");
                } else {
                    // Если поля для ввода пустые, выводим "Введите числа"
                    result.setText("Ange siffror!");
                }
            }
        });

        // При нажатии на кнопку деления
        btnSlash.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {
                // Проверяем заполненность полей для ввода
                if(numOne.length() > 0 & numTwo .length() > 0){
                    // Объявляем переменные для выполнения мат. операций
                    double a = Integer.parseInt(numOne.getText().toString());
                    double b = Integer.parseInt(numTwo.getText().toString());
                    // Вычисляем
                    double score = a / b;
                    // Записываем результат
                    result.setText(score + "");

                } else {
                    // Если поля для ввода пустые, выводим "Введите числа"
                    result.setText("Ange siffror!");
                }
            }
        });

        // При нажатии на кнопку умножения
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {
                // Проверяем заполненность полей для ввода
                if(numOne.length() > 0 & numTwo .length() > 0){
                    // Объявляем переменные для выполнения мат. операций
                    x = Integer.parseInt(numOne.getText().toString());
                    y = Integer.parseInt(numTwo.getText().toString());
                    // Вычисляем
                    score = x * y;
                    // Записываем результат
                    result.setText(score + "");
                } else {
                    // Если поля для ввода пустые, выводим "Введите числа"
                    result.setText("Ange siffror!");
                }
            }
        });

        // При нажатии на кнопку квадратного корня
        btnSqr.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {
                // Проверяем заполненность полей для ввода
                if(numOne.length() > 0 & numTwo .length() == 0){
                    // Объявляем переменные для выполнения мат. операций
                    double a = Integer.parseInt(numOne.getText().toString());
                    // Вычисляем
                    double score = Math.sqrt(a);
                    result.setText(String.format("%.3f", score) + "^2");
                } else if (numOne.length() == 0 & numTwo .length() > 0) {
                    // Объявляем переменные для выполнения мат. операций
                    double b = Integer.parseInt(numTwo.getText().toString());
                    // Вычисляем
                    double score = Math.sqrt(b);
                    // Записываем результат
                    result.setText(String.format("%.3f", score) + " ^2");
                } else {
                    // Если поля для ввода пустые, выводим "Введите только одно число"
                    result.setText("Ange bara ett nummer!");
                }
            }
        });

        // При нажатии на кнопку вычисления процента
        btnProcent.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {
                // Проверяем заполненность полей для ввода
                if(numOne.length() > 0 & numTwo .length() > 0){
                    // Объявляем переменные для выполнения мат. операций
                    double a = Integer.parseInt(numOne.getText().toString());
                    double b = Integer.parseInt(numTwo.getText().toString());
                    // Вычисляем
                    // По формуле:
                    // A - большее число (100%)
                    // B - искомое число (число от 100%)
                    double score = (b / a) * 100;
                    // Записываем результат
                    result.setText(String.format("%.3f", score) + " %");
                }  else {
                    // Если поля для ввода пустые, выводим "Введите числа"
                    result.setText("Ange siffror!");
                }
            }
        });

        // При нажатии на кнопку вычисления теоремы Пифагора
        btnPythagoras.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {
                // Проверяем заполненность полей для ввода
                if(numOne.length() > 0 & numTwo .length() > 0){
                    // Объявляем переменные для выполнения мат. операций
                    double a = Integer.parseInt(numOne.getText().toString());
                    double b = Integer.parseInt(numTwo.getText().toString());
                    // Вычисляем
                    // По формуле:
                    // A - сторона треугольника
                    // B - сторона треугольника
                    double score = Math.sqrt((a * a) + (b * b));
                    // Записываем результат
                    result.setText("C^2= " + String.format("%.3f", score));
                }  else {
                    // Если поля для ввода пустые, выводим "Введите числа"
                    result.setText("Ange siffror!");
                }
            }
        });

        // При нажатии на кнопку вычисления площади круга
        btnCircle.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {
                // Проверяем заполненность полей для ввода
                if(numOne.length() > 0 & numTwo .length() == 0){
                    // Объявляем переменные для выполнения мат. операций
                    double a = Integer.parseInt(numOne.getText().toString());
                    // Вычисляем
                    // По формуле:
                    // A - радиус круга
                    double score = pi * (a * a);
                    // Записываем результат
                    result.setText("S= " + String.format("%.3f", score));
                } else if (numOne.length() == 0 & numTwo .length() > 0) {
                    // Объявляем переменные для выполнения мат. операций
                    double b = Integer.parseInt(numTwo.getText().toString());
                    // Вычисляем
                    // По формуле:
                    // B - радиус круга
                    double score = pi * (b * b);
                    // Записываем результат
                    result.setText("S= " + String.format("%.3f", score));
                } else {
                    // Если поля для ввода пустые, выводим "Введите только одно число"
                    result.setText("Ange bara ett nummer!");
                }
            }
        });

        // При нажатии на кнопку вычисления объема цилиндра
        btnVolym.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {
                // Проверяем заполненность полей для ввода
                if(numOne.length() > 0 & numTwo .length() > 0){
                    // Объявляем переменные для выполнения мат. операций
                    double a = Integer.parseInt(numOne.getText().toString());
                    double b = Integer.parseInt(numTwo.getText().toString());
                    // Вычисляем
                    // По формуле:
                    // A - радиус дна цилиндра
                    // B - высота цилиндра
                    double score = pi * (a * a) * b;
                    // Записываем результат
                    result.setText("V= " + String.format("%.3f", score));
                } else {
                    // Если поля для ввода пустые, выводим "Введите только одно число"
                    result.setText("Ange siffror!");
                }
            }
        });
    }
}