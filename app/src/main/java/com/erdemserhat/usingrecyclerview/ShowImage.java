package com.erdemserhat.usingrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.erdemserhat.usingrecyclerview.databinding.ActivityShowImageBinding;

public class ShowImage extends AppCompatActivity {
    private ActivityShowImageBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityShowImageBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();
        ProgrammingLanguage language = (ProgrammingLanguage) intent.getSerializableExtra("language");
        binding.languageIcon.setImageResource(language.getImage());


    }
}