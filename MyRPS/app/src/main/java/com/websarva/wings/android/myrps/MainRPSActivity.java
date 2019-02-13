package com.websarva.wings.android.myrps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.Random;

public class MainRPSActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_rps);





        Button bt_gu = findViewById(R.id.bt_gu);
        Button bt_ch = findViewById(R.id.bt_ch);
        Button bt_pa = findViewById(R.id.bt_pa);
        final TextView viewResult = findViewById(R.id.viewResult);
        final ImageView imgGu = findViewById(R.id.imgGu);
        final ImageView imgCh = findViewById(R.id.imgCh);
        final ImageView imgPa = findViewById(R.id.imgPa);






        // ボタンに OnClickListener インターフェースを実装する
        bt_gu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int comHand = random();
                int Battle=battle(1,comHand); //1:負け 2:勝ち 3:あいこ
                String result = resultHand(Battle);
                viewResult.setText(result);

                display(Battle);

                switch (Battle){
                    case 1:
                        imgGu.setVisibility(view.INVISIBLE);
                        imgCh.setVisibility(view.INVISIBLE);
                        imgPa.setVisibility(view.VISIBLE);
                        break;
                    case 2:
                        imgGu.setVisibility(view.INVISIBLE);
                        imgCh.setVisibility(view.VISIBLE);
                        imgPa.setVisibility(view.INVISIBLE);
                        break;
                    case 3:
                        imgGu.setVisibility(view.VISIBLE);
                        imgCh.setVisibility(view.INVISIBLE);
                        imgPa.setVisibility(view.INVISIBLE);
                        break;
                }
            }
        });
        bt_ch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int comHand = random();
                int Battle=battle(1,comHand);
                String result = resultHand(Battle);
                viewResult.setText(result);

                display(Battle);

                switch (Battle){
                    case 1:
                        imgGu.setVisibility(view.VISIBLE);
                        imgCh.setVisibility(view.INVISIBLE);
                        imgPa.setVisibility(view.INVISIBLE);
                        break;
                    case 2:
                        imgGu.setVisibility(view.INVISIBLE);
                        imgCh.setVisibility(view.INVISIBLE);
                        imgPa.setVisibility(view.VISIBLE);
                        break;
                    case 3:
                        imgGu.setVisibility(view.INVISIBLE);
                        imgCh.setVisibility(view.VISIBLE);
                        imgPa.setVisibility(view.INVISIBLE);
                        break;
                }
            }
        });
        bt_pa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int comHand = random();
                int Battle=battle(1,comHand);
                String result = resultHand(Battle);
                viewResult.setText(result);

                display(Battle);

                switch (Battle){
                    case 1:
                        imgGu.setVisibility(view.INVISIBLE);
                        imgCh.setVisibility(view.VISIBLE);
                        imgPa.setVisibility(view.INVISIBLE);
                        break;
                    case 2:
                        imgGu.setVisibility(view.VISIBLE);
                        imgCh.setVisibility(view.INVISIBLE);
                        imgPa.setVisibility(view.INVISIBLE);
                        break;
                    case 3:
                        imgGu.setVisibility(view.INVISIBLE);
                        imgCh.setVisibility(view.INVISIBLE);
                        imgPa.setVisibility(view.VISIBLE);
                        break;
                }
            }
        });


    }

    final int[] win_count = {0};
    final int[] count = {1};

    void display(int Battle){
        final TextView nmb_of_times = findViewById(R.id.nmb_of_times);
        final TextView probability = findViewById(R.id.probability);
        int value=count[0]++;
        nmb_of_times.setText("対戦回数:"+String.valueOf(value));
        if(resultHand(Battle)==resultHand(2)){
            win_count[0]++;}
        int winCount= win_count[0];
        float pro = ((float)winCount / (float)value)*100;
        String pro2=String.format( "%.2f", pro );
        probability.setText("勝率:"+String.valueOf(pro2)+"%");
    }



//    勝敗を文字化
        String resultHand(int Battle){
        String h_text = "";
        switch(Battle){
            case 1:
                h_text="負けです";
                break;
            case 2:
                h_text="勝ちです";
                break;
            case 3:
                h_text="あいこです";
                break;
        }
        return h_text;
        }

        int random() {
            //        1.2.3をランダム出力
            Random r = new Random();
            int comHand = r.nextInt(3) + 1;
            return comHand;
        }
//勝敗判定
        int battle(int p_hand, int comHand){
        int res=0;
        if((p_hand - comHand +3)%3 ==2){
            res=1;
//            負け
        }else if((p_hand - comHand +3)%3 ==1){
            res=2;
//            勝ち
        }else if((p_hand - comHand +3)%3 ==0){
            res=3;
//           あいこ
        }
            return res;
        }





}
