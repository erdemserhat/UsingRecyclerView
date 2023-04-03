package com.erdemserhat.usingrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.erdemserhat.usingrecyclerview.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    ArrayList<ProgrammingLanguage> language_list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        ProgrammingLanguage java = new ProgrammingLanguage("Java", R.drawable.java);
        ProgrammingLanguage javaScript = new ProgrammingLanguage("Java Script",R.drawable.java_script);
        ProgrammingLanguage c_plus = new ProgrammingLanguage("C++",R.drawable.cplus);

        language_list.add((ProgrammingLanguage)java);
        language_list.add((ProgrammingLanguage)javaScript);
        language_list.add((ProgrammingLanguage)c_plus);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LanguageAdapter languageAdapter = new LanguageAdapter(language_list);
        binding.recyclerView.setAdapter(languageAdapter);


    }
}