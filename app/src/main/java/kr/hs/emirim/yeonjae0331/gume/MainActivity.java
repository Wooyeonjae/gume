package kr.hs.emirim.yeonjae0331.gume;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button main_but1, main_but2, set_but;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_but1=(Button)findViewById(R.id.main_but1);
        main_but2=(Button)findViewById(R.id.main_but2);
        set_but=(Button)findViewById(R.id.set_but);

        main_but1.setOnClickListener(this);
        main_but2.setOnClickListener(this);
        set_but.setOnClickListener(this);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.main_but1:
                break;
            case R.id.main_but2:
                break;
            case R.id.set_but:
                break;
        }
    }
}
