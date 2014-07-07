package khunglongteam.tracnghiem;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Cau2Activity extends Activity {
	Button btn_Chonlai;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cau2);
		btn_Chonlai = (Button) findViewById(R.id.btnChonlai);
		
		btn_Chonlai.setOnClickListener(new myClickEvent());
	}
	class myClickEvent implements OnClickListener{

		@Override
		public void onClick(View v) {
			if (v == btn_Chonlai){
				finish();
			}
		}
		
	}
}
