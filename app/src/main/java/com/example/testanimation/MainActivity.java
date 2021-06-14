package com.example.testanimation;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.testanimation.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    static boolean status = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this));
        setContentView(binding.getRoot());
        //Animation animation = AnimationUtils.loadAnimation(this,R.anim.alpha_demo);
        //Animation animation = AnimationUtils.loadAnimation(this,R.anim.rotation_demo);
        //Animation animation = AnimationUtils.loadAnimation(this,R.anim.scale_demo);
        //Animation animation = AnimationUtils.loadAnimation(this,R.anim.translate_demo);
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.alpha_rotate);
        binding.imageView.setAnimation(animation);

        binding.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(status){
                    binding.imageView.clearAnimation();
                    status = false;
                }
                else{
                    //binding.imageView.setAnimation(AnimationUtils.loadAnimation(MainActivity.this,R.anim.alpha_rotate));
                    binding.imageView.startAnimation(animation);
                    status=true;
                }
           }
        });
    }
}