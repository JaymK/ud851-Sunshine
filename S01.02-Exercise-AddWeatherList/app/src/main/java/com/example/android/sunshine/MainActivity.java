/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO (COMPLETE) (1) Create a field to store the weather display TextView
    TextView mWeatherTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        // TODO (COMPLETE) (2) Use findViewById to get a reference to the weather display TextView
        mWeatherTextView = (TextView) findViewById(R.id.tv_weather_data);

        // TODO (COMPLETE) (3) Create an array of Strings that contain fake weather data
        String[] dummyWeatherData = {
                "Today, May 17 - Clear - 30°C / 26°C",
                "Tomorrow - Cloudy - 27°C / 24°C",
                "Friday - Thunderstorms - 24°C / 18°C",
                "Saturday - Thunderstorms - 21°C / 13°C",
                "Sunday - Rainy - 19°C / 11°C",
                "Monday - Partly Cloudy - 20°C / 14°C",
                "Tue, May 24 - Meatballs - 31°C / 26°C",
                "Wed, May 25 - Cloudy - 29°C / 22°C",
                "Thu, May 26 - Stormy - 27°C / 19°C",
                "Fri, May 27 - Hurricane - 24°C / 17°C",
                "Sat, May 28 - Meteors - 23°C / 14°C",
                "Sun, May 29 - Apocalypse - 26°C / 15°C",
                "Mon, May 30 - Post Apocalypse - 22°C / 20°C",

        };

        // TODO (COMPLETE) (4) Append each String from the fake weather data array to the TextView

        for (String dummyWeatherDay : dummyWeatherData) {
            mWeatherTextView.append(dummyWeatherDay + "\n\n\n");
        }
    }
}