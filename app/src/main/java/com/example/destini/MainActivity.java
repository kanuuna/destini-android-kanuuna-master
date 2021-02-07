package com.example.destini;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.londonappbrewery.destini.R;

public class MainActivity extends AppCompatActivity {

    //  Declare member variables here:
    Button mTopButton;
    Button mBottomButton;
    TextView mStoryTextView;
    int mStoryState = 0;


    //Creating story strings





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // Wire up the 3 views from the layout to the member variables:
        mTopButton = findViewById(R.id.buttonTop);
        mBottomButton = findViewById(R.id.buttonBottom);
        mStoryTextView = findViewById(R.id.storyTextView);



        //Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryState == 0) {
                    mStoryState = 2;
                    updateStory(2);

                } else if (mStoryState == 1) {
                    mStoryState = 3;
                    updateStory(2);

                } else if ((mStoryState) == 2 || (mStoryState == 3)) {
                    mStoryState = 6;
                    updateStory(5);

                }
            }
        });




        // Set a listener on the bottom button:
        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryState == 0) {
                    mStoryState = 1;
                    updateStory(1);
                }

                else if (mStoryState == 1) {
                    mStoryState = 4;
                    updateStory(3);
                }

                else if (mStoryState == 2) {
                    mStoryState = 5;
                    updateStory(4);
                }

                else if (mStoryState == 3) {
                    mStoryState = 5;
                    updateStory(4);
                }
            }
        });

    }

    //Create updateStory class
    private void updateStory(int var1) {
        /*if (var1 == 1) {
            mStoryTextView.setText(getString(R.string.T1_Story));
            mTopButton.setText(R.string.)
        }
        */

        if (var1 == 1) {
            mStoryTextView.setText(getString(R.string.T2_Story));
            mTopButton.setText(R.string.T2_Ans1);
            mBottomButton.setText(R.string.T2_Ans2);
        }

        if (var1 == 2) {
            mStoryTextView.setText(getString(R.string.T3_Story));
            mTopButton.setText(R.string.T3_Ans1);
            mBottomButton.setText(R.string.T3_Ans2);
        }

        if (var1 == 3) {
            mStoryTextView.setText(getString(R.string.T4_End));
            mTopButton.setText("Boring!");
            mBottomButton.setText("Boring!");
        }

        if (var1 == 4) {
            mStoryTextView.setText(getString(R.string.T5_End));
            mTopButton.setText("Smashing!");
            mBottomButton.setText("Smashing!");
        }

        if (var1 == 5) {
            mStoryTextView.setText(getString(R.string.T6_End));
            mTopButton.setText("Lovely!");
            mBottomButton.setText("Lovely!");
        }
    }


}
