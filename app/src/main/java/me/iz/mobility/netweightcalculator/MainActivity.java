/*
 * Copyright 2016 Mobien Digital Pvt. Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 * @author basit
 * @date 24/12/16 5:47 PM
 * @modified 24/12/16 5:47 PM
 *
 */

package me.iz.mobility.netweightcalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  private EditText etVal1;
  private EditText etVal2;
  private EditText etVal3;

  private Button btnCalculate;

  private TextView tvTotal;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    etVal1 = (EditText) findViewById(R.id.etVal1);
    etVal2 = (EditText) findViewById(R.id.etVal2);
    etVal3 = (EditText) findViewById(R.id.etVal3);
    tvTotal = (TextView) findViewById(R.id.tvTotal);

    tvTotal.setText("0");

    btnCalculate = (Button) findViewById(R.id.btnCalculate);
    btnCalculate.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {

        String val1 = etVal1.getText().toString();
        if(val1.isEmpty()) {
          Toast.makeText(MainActivity.this, "Value 1 is empty", Toast.LENGTH_SHORT).show();
          return;
        }

        String val2 = etVal2.getText().toString();
        if(val2.isEmpty()) {
          Toast.makeText(MainActivity.this, "Value 2 is empty", Toast.LENGTH_SHORT).show();
          return;
        }

        String val3 = etVal3.getText().toString();
        if(val3.isEmpty()) {
          Toast.makeText(MainActivity.this, "Value 3 is empty", Toast.LENGTH_SHORT).show();
          return;
        }

        double total = 0d;
        double value2 = Double.parseDouble(val2);
        double value1 = Double.parseDouble(val1);
        double value3 = Double.parseDouble(val3);

        total = value2 - ((value1 * value3) + 0.2);

        tvTotal.setText(Double.toString(total));
      }
    });

  }
}
