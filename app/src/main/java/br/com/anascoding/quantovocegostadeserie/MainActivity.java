package br.com.anascoding.quantovocegostadeserie;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar = null;
    private ImageView imagemExibicao = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (SeekBar) findViewById(R.id.seekBar);
        imagemExibicao = (ImageView) findViewById(R.id.imagemExibicao);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                switch (i){
                    case 1:
                        imagemExibicao.setImageResource(R.drawable.pouco);
                        break;
                    case 2:
                        imagemExibicao.setImageResource(R.drawable.medio);
                        break;
                    case 3:
                        imagemExibicao.setImageResource(R.drawable.muito);
                        break;
                    case 4:
                        imagemExibicao.setImageResource(R.drawable.susto);
                    break;
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}