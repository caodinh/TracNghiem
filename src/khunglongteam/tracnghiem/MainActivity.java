package khunglongteam.tracnghiem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	Button btn_Start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_Start = (Button) findViewById(R.id.btnStart);
        
        
        btn_Start.setOnClickListener(new myEventClick());
    }
    
    class myEventClick implements OnClickListener {

		@Override
		public void onClick(View v) {
			if (v == btn_Start){
				Intent Cau1_Intent = new Intent(MainActivity.this,Cau1Activity.class);
				startActivity(Cau1_Intent);
			}
			
		}
    	
    }
}
